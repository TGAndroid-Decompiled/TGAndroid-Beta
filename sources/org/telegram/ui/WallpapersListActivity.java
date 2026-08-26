package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.WallpaperCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ChatAttachAlertColorsLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.WallpaperUpdater;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class WallpapersListActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList actionModeViews;
    public ColorWallpaper addedColorWallpaper;
    public FileWallpaper addedFileWallpaper;
    public final ArrayList allWallPapers;
    public final HashMap allWallPapersDict;
    public ColorWallpaper catsWallpaper;
    public Paint colorFramePaint;
    public Paint colorPaint;
    public int columnsCount;
    public final int currentType;
    public int galleryHintRow;
    public int galleryRow;
    public PhotoViewer.AnonymousClass36 layoutManager;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public final HashMap localDict;
    public final ArrayList localWallPapers;
    public ArrayList patterns;
    public final HashMap patternsDict;
    public AlertDialog progressDialog;
    public int resetInfoRow;
    public int resetRow;
    public int resetSectionRow;
    public int rowCount;
    public boolean scrolling;
    public SearchAdapter searchAdapter;
    public EmptyTextProgressView searchEmptyView;
    public ActionBarMenuItem searchItem;
    public int sectionRow;
    public boolean selectedBackgroundBlurred;
    public boolean selectedBackgroundMotion;
    public String selectedBackgroundSlug;
    public int selectedColor;
    public int selectedGradientColor1;
    public int selectedGradientColor2;
    public int selectedGradientColor3;
    public int selectedGradientRotation;
    public float selectedIntensity;
    public NumberTextView selectedMessagesCountTextView;
    public final LongSparseArray selectedWallPapers;
    public int setColorRow;
    public FileWallpaper themeWallpaper;
    public int totalWallpaperRows;
    public WallpaperUpdater updater;
    public int uploadImageRow;
    public int wallPaperStartRow;
    public final ArrayList wallPapers;
    public static final int[][] defaultColorsLight = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] defaultColorsDark = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] searchColors = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] searchColorsNames = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] searchColorsNamesR = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};

    public final class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass2() {
        }

        @Override
        public final void onItemClick(int i) {
            WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
            LongSparseArray longSparseArray = wallpapersListActivity.selectedWallPapers;
            if (i == -1) {
                if (!((BaseFragment) wallpapersListActivity).actionBar.isActionModeShowed()) {
                    wallpapersListActivity.finishFragment();
                    return;
                }
                longSparseArray.clear();
                ((BaseFragment) wallpapersListActivity).actionBar.hideActionMode$1();
                wallpapersListActivity.updateRowsSelection();
                return;
            }
            if (i != 4) {
                if (i == 3) {
                    DialogsActivity dialogsActivity = new DialogsActivity(TelegramMediaSession$$ExternalSyntheticOutline0.m(3, "onlySelect", "dialogsType", true));
                    dialogsActivity.delegate = new WallpapersListActivity$2$$ExternalSyntheticLambda0(this);
                    wallpapersListActivity.presentFragment(dialogsActivity);
                    return;
                }
                return;
            }
            if (wallpapersListActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(wallpapersListActivity.getParentActivity(), 0, null);
            String pluralString = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = pluralString;
            alertDialog.message = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new WallpapersListActivity$2$$ExternalSyntheticLambda0(this));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            wallpapersListActivity.showDialog(alertDialog);
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public final class AnonymousClass6 extends ThemePreviewActivity {
        public final int $r8$classId;

        public AnonymousClass6(boolean z, Object obj, Bitmap bitmap, int i) {
            super(z, obj, bitmap);
            this.$r8$classId = i;
        }

        @Override
        public final boolean insideBottomSheet() {
            switch (this.$r8$classId) {
            }
            return true;
        }
    }

    public final class ColorCell extends View {
        public int color;

        public ColorCell(Context context) {
            super(context);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
            wallpapersListActivity.colorPaint.setColor(this.color);
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.colorPaint);
            if (this.color == Theme.getColor(null, Theme.key_windowBackgroundWhite, false)) {
                canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.colorFramePaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public final class AnonymousClass1 extends WallpaperCell {
            public final int $r8$classId;
            public final RecyclerListView.SelectionAdapter this$1;

            public AnonymousClass1(RecyclerListView.SelectionAdapter selectionAdapter, Context context, int i) {
                super(context, 5);
                this.$r8$classId = i;
                this.this$1 = selectionAdapter;
            }

            @Override
            public final void onWallpaperClick(int i, Object obj) {
                RecyclerListView.SelectionAdapter selectionAdapter = this.this$1;
                switch (this.$r8$classId) {
                    case 0:
                        WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
                        int[][] iArr = WallpapersListActivity.defaultColorsLight;
                        wallpapersListActivity.onItemClick(this, obj, i);
                        break;
                    case 1:
                        Consumer consumer = ((ChatAttachAlertColorsLayout) ((BottomSheetWithRecyclerListView.AnonymousClass8) selectionAdapter).this$0).wallpaperConsumer;
                        if (consumer != null) {
                            consumer.accept(obj);
                        }
                        break;
                    default:
                        WallpapersListActivity.this.presentFragment(new ThemePreviewActivity(true, obj, null));
                        break;
                }
            }

            @Override
            public boolean onWallpaperLongClick(int i, Object obj) {
                switch (this.$r8$classId) {
                    case 0:
                        return WallpapersListActivity.access$5400(WallpapersListActivity.this, this, obj, i);
                    default:
                        return super.onWallpaperLongClick(i, obj);
                }
            }

            public AnonymousClass1(BottomSheetWithRecyclerListView.AnonymousClass8 anonymousClass8, Context context) {
                super(context, 1);
                this.$r8$classId = 1;
                this.this$1 = anonymousClass8;
            }
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return WallpapersListActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
            if (i == wallpapersListActivity.uploadImageRow || i == wallpapersListActivity.galleryRow || i == wallpapersListActivity.setColorRow || i == wallpapersListActivity.resetRow) {
                return 0;
            }
            if (i == wallpapersListActivity.sectionRow || i == wallpapersListActivity.resetSectionRow) {
                return 1;
            }
            return (i == wallpapersListActivity.resetInfoRow || i == wallpapersListActivity.galleryHintRow) ? 3 : 2;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            int i2;
            String str;
            TLRPC.WallPaperSettings wallPaperSettings;
            int i3 = viewHolder.mItemViewType;
            WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
            View view = viewHolder.itemView;
            if (i3 == 0) {
                TextCell textCell = (TextCell) view;
                if (i == wallpapersListActivity.uploadImageRow) {
                    textCell.setTextAndIcon(R.drawable.msg_photos, (CharSequence) LocaleController.getString(R.string.SelectFromGallery), true);
                    return;
                }
                if (i == wallpapersListActivity.setColorRow) {
                    textCell.setTextAndIcon(R.drawable.msg_palette, (CharSequence) LocaleController.getString(R.string.SetColor), true);
                    return;
                }
                if (i == wallpapersListActivity.resetRow) {
                    textCell.setText(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                    return;
                } else {
                    if (i == wallpapersListActivity.galleryRow) {
                        textCell.setTextAndIcon(R.drawable.msg_background, (CharSequence) "Choose from gallery", false);
                        SimpleTextView simpleTextView = textCell.textView;
                        simpleTextView.setRightDrawable(new PeerColorActivity.LevelLock(10, textCell.getContext(), textCell.resourcesProvider, false));
                        simpleTextView.setDrawablePadding(AndroidUtilities.dp(6.0f));
                        return;
                    }
                    return;
                }
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == wallpapersListActivity.resetInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                    return;
                } else {
                    if (i == wallpapersListActivity.galleryHintRow) {
                        textInfoPrivacyCell.setText("Upload your own background for the channel.");
                        return;
                    }
                    return;
                }
            }
            WallpaperCell wallpaperCell = (WallpaperCell) view;
            int i4 = i - wallpapersListActivity.wallPaperStartRow;
            int i5 = wallpapersListActivity.columnsCount;
            int i6 = i4 * i5;
            wallpaperCell.setParams(i5, i6 == 0, i6 / i5 == wallpapersListActivity.totalWallpaperRows - 1);
            for (int i7 = 0; i7 < wallpapersListActivity.columnsCount; i7++) {
                int i8 = i6 + i7;
                ArrayList arrayList = wallpapersListActivity.wallPapers;
                Object obj = null;
                Object obj2 = i8 < arrayList.size() ? arrayList.get(i8) : null;
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.currentTheme.overrideWallpaper;
                    if (wallpapersListActivity.selectedBackgroundSlug.equals(tL_wallPaper.slug)) {
                        if (!wallpapersListActivity.selectedBackgroundSlug.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null) {
                            obj = tL_wallPaper;
                        } else if (wallpapersListActivity.selectedColor == Theme.getWallpaperColor(wallPaperSettings.background_color) && wallpapersListActivity.selectedGradientColor1 == Theme.getWallpaperColor(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.selectedGradientColor2 == Theme.getWallpaperColor(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.selectedGradientColor3 == Theme.getWallpaperColor(tL_wallPaper.settings.fourth_background_color)) {
                            if (wallpapersListActivity.selectedGradientColor1 == 0 || wallpapersListActivity.selectedGradientColor2 != 0 || wallpapersListActivity.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern) {
                                obj = tL_wallPaper;
                            } else {
                                float f = tL_wallPaper.settings.intensity / 100.0f;
                                if (f < 0.0f && !Theme.currentTheme.isDark()) {
                                    f = -f;
                                }
                                if (Math.abs(f - wallpapersListActivity.selectedIntensity) <= 0.001f) {
                                    obj = tL_wallPaper;
                                }
                            }
                        }
                    }
                    j = tL_wallPaper.id;
                } else {
                    if (obj2 instanceof ColorWallpaper) {
                        ColorWallpaper colorWallpaper = (ColorWallpaper) obj2;
                        if ("d".equals(colorWallpaper.slug) && (str = wallpapersListActivity.selectedBackgroundSlug) != null && str.equals(colorWallpaper.slug)) {
                            obj = obj2;
                        } else if (colorWallpaper.color == wallpapersListActivity.selectedColor && colorWallpaper.gradientColor1 == (i2 = wallpapersListActivity.selectedGradientColor1) && colorWallpaper.gradientColor2 == wallpapersListActivity.selectedGradientColor2 && colorWallpaper.gradientColor3 == wallpapersListActivity.selectedGradientColor3 && ((i2 == 0 || colorWallpaper.gradientRotation == wallpapersListActivity.selectedGradientRotation) && ((!"c".equals(wallpapersListActivity.selectedBackgroundSlug) || colorWallpaper.slug == null) && ("c".equals(wallpapersListActivity.selectedBackgroundSlug) || (TextUtils.equals(wallpapersListActivity.selectedBackgroundSlug, colorWallpaper.slug) && ((int) (colorWallpaper.intensity * 100.0f)) == ((int) (wallpapersListActivity.selectedIntensity * 100.0f))))))) {
                            obj = obj2;
                        }
                        TLRPC.WallPaper wallPaper = colorWallpaper.parentWallpaper;
                        if (wallPaper != null) {
                            j = wallPaper.id;
                        }
                    } else if ((obj2 instanceof FileWallpaper) && wallpapersListActivity.selectedBackgroundSlug.equals(((FileWallpaper) obj2).slug)) {
                        obj = obj2;
                    }
                    j = 0;
                }
                wallpaperCell.setWallpaper(wallpapersListActivity.currentType, obj2, obj, i7);
                boolean zIsActionModeShowed = ((BaseFragment) wallpapersListActivity).actionBar.isActionModeShowed();
                WallpaperCell.WallpaperView[] wallpaperViewArr = wallpaperCell.wallpaperViews;
                if (zIsActionModeShowed) {
                    wallpaperViewArr[i7].setChecked(wallpapersListActivity.selectedWallPapers.indexOfKey(j) >= 0, !wallpapersListActivity.scrolling);
                } else {
                    wallpaperViewArr[i7].setChecked(false, !wallpapersListActivity.scrolling);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCell;
            Context context = this.mContext;
            if (i == 0) {
                textCell = new TextCell(context);
            } else if (i != 1) {
                textCell = i != 3 ? new AnonymousClass1(this, context, 0) : new TextInfoPrivacyCell(context, 24, null);
            } else {
                textCell = new ShadowSectionCell(context, (Object) null);
            }
            return new RecyclerListView.Holder(textCell);
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public int imageReqId;
        public String lastSearchImageString;
        public String lastSearchString;
        public int lastSearchToken;
        public final Context mContext;
        public String nextImagesSearchOffset;
        public TodoItemMenu$$ExternalSyntheticLambda9 searchRunnable;
        public boolean searchingUser;
        public String selectedColor;
        public final ArrayList searchResult = new ArrayList();
        public final HashMap searchResultKeys = new HashMap();
        public boolean bingSearchEndReached = true;

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            if (TextUtils.isEmpty(this.lastSearchString)) {
                return 2;
            }
            return (int) Math.ceil(this.searchResult.size() / WallpapersListActivity.this.columnsCount);
        }

        @Override
        public final int getItemViewType(int i) {
            if (TextUtils.isEmpty(this.lastSearchString)) {
                return i == 0 ? 2 : 1;
            }
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 2;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 2) {
                    return;
                }
                ((GraySectionCell) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            WallpaperCell wallpaperCell = (WallpaperCell) view;
            WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
            int i3 = i * wallpapersListActivity.columnsCount;
            ArrayList arrayList = this.searchResult;
            int iCeil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.columnsCount);
            int i4 = wallpapersListActivity.columnsCount;
            wallpaperCell.setParams(i4, i3 == 0, i3 / i4 == iCeil - 1);
            for (int i5 = 0; i5 < wallpapersListActivity.columnsCount; i5++) {
                int i6 = i3 + i5;
                wallpaperCell.setWallpaper(wallpapersListActivity.currentType, i6 < arrayList.size() ? arrayList.get(i6) : null, "", i5);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View anonymousClass1;
            View graySectionCell;
            Context context = this.mContext;
            int i2 = 1;
            if (i != 0) {
                anonymousClass1 = null;
                boolean z = false;
                if (i == 1) {
                    MessageSeenView.AnonymousClass1 anonymousClass2 = new MessageSeenView.AnonymousClass1(context, 13, z ? 1 : 0);
                    anonymousClass2.setItemAnimator(null);
                    anonymousClass2.setLayoutAnimation(null);
                    PhotoViewer.AnonymousClass36 anonymousClass36 = new PhotoViewer.AnonymousClass36(i2, 19, false);
                    anonymousClass2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                    anonymousClass2.setClipToPadding(false);
                    anonymousClass36.setOrientation(0);
                    anonymousClass2.setLayoutManager(anonymousClass36);
                    anonymousClass2.setAdapter(new MessageSeenView.AnonymousClass3(this, 6));
                    anonymousClass2.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 26));
                    graySectionCell = anonymousClass2;
                } else if (i == 2) {
                    graySectionCell = new GraySectionCell(context, 16, null);
                }
                anonymousClass1 = graySectionCell;
            } else {
                anonymousClass1 = new ListAdapter.AnonymousClass1(this, context, 2);
            }
            if (i == 1) {
                anonymousClass1.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(60.0f)));
            } else {
                anonymousClass1.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            }
            return new RecyclerListView.Holder(anonymousClass1);
        }

        public final void processSearch(String str, boolean z) {
            if (str != null && this.selectedColor != null) {
                str = SurfaceContainer$$ExternalSyntheticOutline0.m(this.selectedColor, " ", str, new StringBuilder("#color"));
            }
            TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda9 = this.searchRunnable;
            if (todoItemMenu$$ExternalSyntheticLambda9 != null) {
                AndroidUtilities.cancelRunOnUIThread(todoItemMenu$$ExternalSyntheticLambda9);
                this.searchRunnable = null;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            HashMap map = this.searchResultKeys;
            ArrayList arrayList = this.searchResult;
            WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
            if (zIsEmpty) {
                arrayList.clear();
                map.clear();
                this.bingSearchEndReached = true;
                this.lastSearchString = null;
                if (this.imageReqId != 0) {
                    ConnectionsManager.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).cancelRequest(this.imageReqId, true);
                    this.imageReqId = 0;
                }
                wallpapersListActivity.searchEmptyView.showTextView();
            } else {
                wallpapersListActivity.searchEmptyView.showProgress();
                if (z) {
                    arrayList.clear();
                    map.clear();
                    this.bingSearchEndReached = true;
                    searchImages(str, "", true);
                    this.lastSearchString = str;
                    notifyDataSetChanged();
                } else {
                    TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda10 = new TodoItemMenu$$ExternalSyntheticLambda9(26, this, str);
                    this.searchRunnable = todoItemMenu$$ExternalSyntheticLambda10;
                    AndroidUtilities.runOnUIThread(todoItemMenu$$ExternalSyntheticLambda10, 500L);
                }
            }
            this.mObservable.notifyChanged();
        }

        public final void searchImages(String str, String str2, boolean z) {
            int i = this.imageReqId;
            WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
            if (i != 0) {
                ConnectionsManager.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).cancelRequest(this.imageReqId, true);
                this.imageReqId = 0;
            }
            this.lastSearchImageString = str;
            TLObject userOrChat = MessagesController.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).getUserOrChat(MessagesController.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).imageSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                if (!z || this.searchingUser) {
                    return;
                }
                this.searchingUser = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = MessagesController.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).imageSearchBot;
                ConnectionsManager.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).sendRequest(tL_contacts_resolveUsername, new RichMediaUploader$$ExternalSyntheticLambda0(this, 12));
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.query = zzil.m("#wallpaper ", str);
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            int i2 = this.lastSearchToken + 1;
            this.lastSearchToken = i2;
            this.imageReqId = ConnectionsManager.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).sendRequest(tL_messages_getInlineBotResults, new LaunchActivity$$ExternalSyntheticLambda63(this, i2, 8));
            ConnectionsManager.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).bindRequestToGuid(this.imageReqId, ((BaseFragment) wallpapersListActivity).classGuid);
        }
    }

    public WallpapersListActivity(int i) {
        super(null);
        this.actionModeViews = new ArrayList();
        this.columnsCount = 3;
        this.selectedBackgroundSlug = "";
        this.allWallPapers = new ArrayList();
        this.allWallPapersDict = new HashMap();
        this.localDict = new HashMap();
        this.wallPapers = new ArrayList();
        this.localWallPapers = new ArrayList();
        this.patterns = new ArrayList();
        this.patternsDict = new HashMap();
        this.selectedWallPapers = new LongSparseArray();
        this.currentType = i;
    }

    public static boolean access$5400(WallpapersListActivity wallpapersListActivity, ListAdapter.AnonymousClass1 anonymousClass1, Object obj, int i) {
        int i2 = wallpapersListActivity.currentType;
        if (i2 != 2 && i2 != 3) {
            Object obj2 = obj instanceof ColorWallpaper ? ((ColorWallpaper) obj).parentWallpaper : obj;
            if (!wallpapersListActivity.actionBar.isActionModeShowed() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.selectedWallPapers.put(((TLRPC.WallPaper) obj2).id, obj);
                wallpapersListActivity.selectedMessagesCountTextView.setNumber(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = wallpapersListActivity.actionModeViews;
                    if (i3 >= arrayList2.size()) {
                        animatorSet.playTogether(arrayList);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        wallpapersListActivity.scrolling = false;
                        wallpapersListActivity.actionBar.showActionMode(null, null);
                        anonymousClass1.wallpaperViews[i].setChecked(true, true);
                        return true;
                    }
                    View view = (View) arrayList2.get(i3);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i3++;
                }
            }
        }
        return false;
    }

    public static void fillDefaultColors(ArrayList arrayList, boolean z) {
        for (int[] iArr : z ? defaultColorsDark : defaultColorsLight) {
            if (iArr.length == 1) {
                arrayList.add(new ColorWallpaper(iArr[0], 0, "c", 45));
            } else {
                arrayList.add(new ColorWallpaper("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i = 1;
        this.colorPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.colorFramePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.colorFramePaint.setStyle(Paint.Style.STROKE);
        this.colorFramePaint.setColor(855638016);
        this.updater = new WallpaperUpdater(getParentActivity(), this, new WallpaperUpdater.WallpaperUpdaterDelegate() {
            @Override
            public final void didSelectWallpaper(File file, Bitmap bitmap, boolean z) {
                ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(false, new FileWallpaper(file, file, ""), bitmap);
                themePreviewActivity.setDialogId(0L);
                WallpapersListActivity.this.presentFragment(themePreviewActivity, z);
            }

            @Override
            public final void needOpenColorPicker() {
            }
        });
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i2 = this.currentType;
        if (i2 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i2 == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i2 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2());
        boolean z = false;
        if (i2 == 0) {
            ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
            actionBarMenuItemAddItem.setIsSearchField$1();
            actionBarMenuItemAddItem.listener = new OKLCH() {
                @Override
                public final void onCaptionCleared() {
                    WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
                    SearchAdapter searchAdapter = wallpapersListActivity.searchAdapter;
                    searchAdapter.selectedColor = null;
                    searchAdapter.processSearch(null, true);
                    wallpapersListActivity.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
                }

                @Override
                public final void onSearchCollapse() {
                    WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
                    wallpapersListActivity.listView.setAdapter(wallpapersListActivity.listAdapter);
                    wallpapersListActivity.listView.invalidate();
                    wallpapersListActivity.searchAdapter.processSearch(null, true);
                    wallpapersListActivity.searchItem.setSearchFieldCaption(null);
                    onCaptionCleared();
                }

                @Override
                public final void onSearchExpand() {
                    WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
                    wallpapersListActivity.listView.setAdapter(wallpapersListActivity.searchAdapter);
                    wallpapersListActivity.listView.invalidate();
                }

                @Override
                public final void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
                    WallpapersListActivity.this.searchAdapter.processSearch(editTextBoldCursor.getText().toString(), false);
                }
            };
            this.searchItem = actionBarMenuItemAddItem;
            actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
            anonymousClass1CreateActionMode.setBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefault, false));
            ActionBar actionBar = this.actionBar;
            int i3 = Theme.key_actionBarDefaultIcon;
            actionBar.setItemsColor(Theme.getColor(null, i3, false), true);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefaultSelector, false), true);
            NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
            this.selectedMessagesCountTextView = numberTextView;
            numberTextView.setTextSize(18);
            this.selectedMessagesCountTextView.setTypeface(AndroidUtilities.bold());
            this.selectedMessagesCountTextView.setTextColor(Theme.getColor(null, i3, false));
            this.selectedMessagesCountTextView.setOnTouchListener(new TopicsFragment$$ExternalSyntheticLambda21(1));
            anonymousClass1CreateActionMode.addView(this.selectedMessagesCountTextView, LayoutHelper.createLinear(1.0f, 0, -1, 65, 0, 0));
            ArrayList arrayList = this.actionModeViews;
            arrayList.add(anonymousClass1CreateActionMode.addItemWithWidth(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f)));
            arrayList.add(anonymousClass1CreateActionMode.addItemWithWidth(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.selectedWallPapers.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        int i4 = Theme.key_windowBackgroundGray;
        recyclerListView2.setBackgroundColor(getThemedColor(i4));
        this.listView.setClipToPadding(false);
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView3 = this.listView;
        PhotoViewer.AnonymousClass36 anonymousClass36 = new PhotoViewer.AnonymousClass36(i, 18, z);
        this.layoutManager = anonymousClass36;
        recyclerListView3.setLayoutManager(anonymousClass36);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView4 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView4.setAdapter(listAdapter);
        this.searchAdapter = new SearchAdapter(context);
        this.listView.setGlowColor(Theme.getColor(null, Theme.key_avatar_backgroundActionBarBlue, false));
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 25));
        this.listView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 20));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.searchEmptyView = emptyTextProgressView;
        emptyTextProgressView.setVisibility(8);
        this.searchEmptyView.setShowAtCenter(true);
        this.searchEmptyView.setBackgroundColor(Theme.getColor(null, i4, false));
        this.searchEmptyView.setText(LocaleController.getString(R.string.NoResult));
        this.listView.setEmptyView(this.searchEmptyView);
        frameLayout.addView(this.searchEmptyView, LayoutHelper.createFrame(-1.0f, -1));
        updateRows$19();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i4;
        int i5;
        ColorWallpaper colorWallpaper;
        TLRPC.WallPaperSettings wallPaperSettings2;
        String str;
        String strMD5;
        int i6;
        boolean z;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.WallPaperSettings wallPaperSettings4;
        int i7 = 1;
        if (i != NotificationCenter.wallpapersDidLoad) {
            if (i != NotificationCenter.didSetNewWallpapper) {
                if (i == NotificationCenter.wallpapersNeedReload) {
                    getMessagesStorage().getWallpapers();
                    return;
                }
                return;
            }
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null) {
                recyclerListView.invalidateViews();
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField(true);
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.patterns.clear();
        HashMap map = this.patternsDict;
        map.clear();
        HashMap map2 = this.allWallPapersDict;
        ArrayList arrayList2 = this.localWallPapers;
        HashMap map3 = this.localDict;
        ArrayList arrayList3 = this.wallPapers;
        int i8 = this.currentType;
        if (i8 != 1 && i8 != 2) {
            arrayList3.clear();
            arrayList2.clear();
            map3.clear();
            ArrayList arrayList4 = this.allWallPapers;
            arrayList4.clear();
            map2.clear();
            arrayList4.addAll(arrayList);
        }
        int size = arrayList.size();
        int i9 = 0;
        ArrayList arrayList5 = null;
        while (i9 < size) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i9);
            if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                i3 = i8;
            } else {
                if (wallPaper instanceof TLRPC.TL_wallPaper) {
                    TLRPC.Document document = wallPaper.document;
                    if (document instanceof TLRPC.TL_documentEmpty) {
                        i3 = i8;
                        wallPaperSettings = wallPaper.settings;
                        i4 = wallPaperSettings.background_color;
                        if (i4 != 0) {
                            i5 = wallPaperSettings.second_background_color;
                            if (i5 != 0 || (i6 = wallPaperSettings.third_background_color) == 0) {
                                colorWallpaper = new ColorWallpaper(i4, i5, null, wallPaperSettings.rotation);
                            } else {
                                colorWallpaper = new ColorWallpaper(null, i4, i5, i6, wallPaperSettings.fourth_background_color);
                            }
                            colorWallpaper.slug = wallPaper.slug;
                            colorWallpaper.intensity = wallPaperSettings.intensity / 100.0f;
                            colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                            colorWallpaper.parentWallpaper = wallPaper;
                            if (wallPaper.id < 0) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(String.valueOf(colorWallpaper.color));
                                sb.append(colorWallpaper.gradientColor1);
                                sb.append(colorWallpaper.gradientColor2);
                                sb.append(colorWallpaper.gradientColor3);
                                sb.append(colorWallpaper.gradientRotation);
                                sb.append(colorWallpaper.intensity);
                                str = colorWallpaper.slug;
                                if (str == null) {
                                    str = "";
                                }
                                sb.append(str);
                                strMD5 = Utilities.MD5(sb.toString());
                                if (map3.containsKey(strMD5)) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(wallPaper);
                                } else {
                                    arrayList2.add(colorWallpaper);
                                    map3.put(strMD5, colorWallpaper);
                                    if (Theme.currentTheme.isDark() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0) {
                                        arrayList3.add(colorWallpaper);
                                    }
                                }
                            } else if (Theme.currentTheme.isDark()) {
                                arrayList3.add(colorWallpaper);
                            } else {
                                arrayList3.add(colorWallpaper);
                            }
                        }
                    } else {
                        if (!wallPaper.pattern || document == null) {
                            i3 = i8;
                        } else {
                            i3 = i8;
                            if (!map.containsKey(Long.valueOf(document.id))) {
                                this.patterns.add(wallPaper);
                                map.put(Long.valueOf(wallPaper.document.id), wallPaper);
                            }
                        }
                        map2.put(wallPaper.slug, wallPaper);
                        if (i3 != i7 && ((!(z = wallPaper.pattern) || ((wallPaperSettings4 = wallPaper.settings) != null && wallPaperSettings4.background_color != 0)) && ((i3 != 2 || z) && (Theme.currentTheme.isDark() || (wallPaperSettings3 = wallPaper.settings) == null || wallPaperSettings3.intensity >= 0)))) {
                            arrayList3.add(wallPaper);
                        }
                    }
                } else {
                    i3 = i8;
                    wallPaperSettings = wallPaper.settings;
                    i4 = wallPaperSettings.background_color;
                    if (i4 != 0) {
                        i5 = wallPaperSettings.second_background_color;
                        if (i5 != 0) {
                            colorWallpaper = new ColorWallpaper(i4, i5, null, wallPaperSettings.rotation);
                        } else {
                            colorWallpaper = new ColorWallpaper(i4, i5, null, wallPaperSettings.rotation);
                        }
                        colorWallpaper.slug = wallPaper.slug;
                        colorWallpaper.intensity = wallPaperSettings.intensity / 100.0f;
                        colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                        colorWallpaper.parentWallpaper = wallPaper;
                        if (wallPaper.id < 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(String.valueOf(colorWallpaper.color));
                            sb2.append(colorWallpaper.gradientColor1);
                            sb2.append(colorWallpaper.gradientColor2);
                            sb2.append(colorWallpaper.gradientColor3);
                            sb2.append(colorWallpaper.gradientRotation);
                            sb2.append(colorWallpaper.intensity);
                            str = colorWallpaper.slug;
                            if (str == null) {
                                str = "";
                            }
                            sb2.append(str);
                            strMD5 = Utilities.MD5(sb2.toString());
                            if (map3.containsKey(strMD5)) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(wallPaper);
                            } else {
                                arrayList2.add(colorWallpaper);
                                map3.put(strMD5, colorWallpaper);
                                if (Theme.currentTheme.isDark()) {
                                    arrayList3.add(colorWallpaper);
                                } else {
                                    arrayList3.add(colorWallpaper);
                                }
                            }
                        } else if (Theme.currentTheme.isDark()) {
                            arrayList3.add(colorWallpaper);
                        } else {
                            arrayList3.add(colorWallpaper);
                        }
                    }
                }
                i9++;
                i8 = i3;
                map = map;
                arrayList = arrayList;
                i7 = 1;
            }
            i9++;
            i8 = i3;
            map = map;
            arrayList = arrayList;
            i7 = 1;
        }
        if (arrayList5 != null) {
            int size2 = arrayList5.size();
            for (int i10 = 0; i10 < size2; i10++) {
                getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList5.get(i10)).id);
            }
        }
        this.selectedBackgroundSlug = Theme.getSelectedBackgroundSlug();
        fillWallpapersWithCustom();
        loadWallpapers(false);
    }

    public final void fillWallpapersWithCustom() {
        HashMap map;
        ?? r11;
        final String str;
        final long j;
        ?? r12;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.WallPaper wallPaper;
        int i;
        int i2;
        int i3;
        int i4;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        ?? r13;
        int i5;
        String str3;
        int i6 = this.currentType;
        if (i6 == 0 || i6 == 2) {
            MessagesController.getGlobalMainSettings();
            ColorWallpaper colorWallpaper = this.addedColorWallpaper;
            ArrayList arrayList = this.wallPapers;
            if (colorWallpaper != null) {
                arrayList.remove(colorWallpaper);
                this.addedColorWallpaper = null;
            }
            FileWallpaper fileWallpaper = this.addedFileWallpaper;
            if (fileWallpaper != null) {
                arrayList.remove(fileWallpaper);
                this.addedFileWallpaper = null;
            }
            ColorWallpaper colorWallpaper2 = this.catsWallpaper;
            if (colorWallpaper2 == null) {
                ColorWallpaper colorWallpaper3 = new ColorWallpaper("d", -2368069, -9722489, -2762611, -7817084);
                this.catsWallpaper = colorWallpaper3;
                colorWallpaper3.intensity = 0.34f;
            } else {
                arrayList.remove(colorWallpaper2);
            }
            FileWallpaper fileWallpaper2 = this.themeWallpaper;
            if (fileWallpaper2 != null) {
                arrayList.remove(fileWallpaper2);
            }
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                map = this.allWallPapersDict;
                if (i7 >= size) {
                    r11 = 0;
                    break;
                }
                Object obj = arrayList.get(i7);
                if (obj instanceof ColorWallpaper) {
                    r11 = (ColorWallpaper) obj;
                    String str4 = r11.slug;
                    if (str4 != null) {
                        r11.pattern = (TLRPC.TL_wallPaper) map.get(str4);
                    }
                    if (("c".equals(r11.slug) || (str3 = r11.slug) == null || TextUtils.equals(this.selectedBackgroundSlug, str3)) && this.selectedColor == r11.color && (i5 = this.selectedGradientColor1) == r11.gradientColor1 && this.selectedGradientColor2 == r11.gradientColor2 && this.selectedGradientColor3 == r11.gradientColor3 && (i5 == 0 || this.selectedGradientRotation == r11.gradientRotation)) {
                        break;
                    } else {
                        i7++;
                    }
                } else {
                    if (obj instanceof TLRPC.TL_wallPaper) {
                        r11 = (TLRPC.TL_wallPaper) obj;
                        if (r11.settings != null && TextUtils.equals(this.selectedBackgroundSlug, r11.slug) && this.selectedColor == Theme.getWallpaperColor(r11.settings.background_color) && this.selectedGradientColor1 == Theme.getWallpaperColor(r11.settings.second_background_color) && this.selectedGradientColor2 == Theme.getWallpaperColor(r11.settings.third_background_color) && this.selectedGradientColor3 == Theme.getWallpaperColor(r11.settings.fourth_background_color) && (this.selectedGradientColor1 == 0 || this.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(r11.settings.rotation, false))) {
                            float f = r11.settings.intensity / 100.0f;
                            if (f < 0.0f && !Theme.currentTheme.isDark()) {
                                f = -f;
                            }
                            if (Math.abs(f - this.selectedIntensity) <= 0.001f) {
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                    i7++;
                }
            }
            if (r11 instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) r11;
                Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.currentTheme.overrideWallpaper;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
                if (wallPaperSettings != null && this.selectedColor == Theme.getWallpaperColor(wallPaperSettings.background_color) && this.selectedGradientColor1 == Theme.getWallpaperColor(tL_wallPaper3.settings.second_background_color) && this.selectedGradientColor2 == Theme.getWallpaperColor(tL_wallPaper3.settings.third_background_color) && this.selectedGradientColor3 == Theme.getWallpaperColor(tL_wallPaper3.settings.fourth_background_color)) {
                    if (this.selectedGradientColor1 != 0 && this.selectedGradientColor2 == 0 && this.selectedGradientRotation != AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false)) {
                        float f2 = tL_wallPaper3.settings.intensity / 100.0f;
                        if (f2 < 0.0f && !Theme.currentTheme.isDark()) {
                            f2 = -f2;
                        }
                        if (Math.abs(f2 - this.selectedIntensity) > 0.001f) {
                            str2 = "";
                            tL_wallPaper2 = tL_wallPaper3;
                            r13 = 0;
                        }
                    }
                    str2 = this.selectedBackgroundSlug;
                    tL_wallPaper2 = null;
                    r13 = r11;
                } else {
                    str2 = "";
                    tL_wallPaper2 = tL_wallPaper3;
                    r13 = 0;
                }
                r12 = r13;
                tL_wallPaper = tL_wallPaper2;
                str = str2;
                j = tL_wallPaper3.id;
            } else {
                str = this.selectedBackgroundSlug;
                j = (!(r11 instanceof ColorWallpaper) || (wallPaper = ((ColorWallpaper) r11).parentWallpaper) == null) ? 0L : wallPaper.id;
                r12 = r11;
                tL_wallPaper = null;
            }
            Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
            final boolean zIsDark = themeInfo.isDark();
            try {
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public final int compare(Object obj2, Object obj3) {
                        WallpapersListActivity wallpapersListActivity = this.f$0;
                        wallpapersListActivity.getClass();
                        if (obj2 instanceof WallpapersListActivity.ColorWallpaper) {
                            obj2 = ((WallpapersListActivity.ColorWallpaper) obj2).parentWallpaper;
                        }
                        if (obj3 instanceof WallpapersListActivity.ColorWallpaper) {
                            obj3 = ((WallpapersListActivity.ColorWallpaper) obj3).parentWallpaper;
                        }
                        if (!(obj2 instanceof TLRPC.WallPaper) || !(obj3 instanceof TLRPC.WallPaper)) {
                            return 0;
                        }
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj2;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj3;
                        long j2 = j;
                        if (j2 == 0) {
                            String str5 = wallPaper2.slug;
                            String str6 = str;
                            if (str6.equals(str5)) {
                                return -1;
                            }
                            if (str6.equals(wallPaper3.slug)) {
                                return 1;
                            }
                        } else {
                            if (wallPaper2.id == j2) {
                                return -1;
                            }
                            if (wallPaper3.id == j2) {
                                return 1;
                            }
                        }
                        boolean z = zIsDark;
                        if (!z) {
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper2.slug)) {
                                return -1;
                            }
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper3.slug)) {
                                return 1;
                            }
                        }
                        ArrayList arrayList2 = wallpapersListActivity.allWallPapers;
                        int iIndexOf = arrayList2.indexOf(wallPaper2);
                        int iIndexOf2 = arrayList2.indexOf(wallPaper3);
                        boolean z2 = wallPaper2.dark;
                        if ((z2 && wallPaper3.dark) || (!z2 && !wallPaper3.dark)) {
                            if (iIndexOf > iIndexOf2) {
                                return 1;
                            }
                            return iIndexOf < iIndexOf2 ? -1 : 0;
                        }
                        if (!z2 || wallPaper3.dark) {
                            return z ? 1 : -1;
                        }
                        return z ? -1 : 1;
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (Theme.hasWallpaperFromTheme() && TextUtils.isEmpty(Theme.themedWallpaperLink)) {
                if (this.themeWallpaper == null) {
                    this.themeWallpaper = new FileWallpaper();
                }
                arrayList.add(0, this.themeWallpaper);
            } else {
                this.themeWallpaper = null;
            }
            Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
            if (TextUtils.isEmpty(this.selectedBackgroundSlug) || (!"d".equals(this.selectedBackgroundSlug) && r12 == 0)) {
                if ("c".equals(this.selectedBackgroundSlug) || (i2 = this.selectedColor) == 0) {
                    int i8 = this.selectedColor;
                    if (i8 != 0) {
                        int i9 = this.selectedGradientColor1;
                        if (i9 == 0 || (i = this.selectedGradientColor2) == 0) {
                            this.addedColorWallpaper = new ColorWallpaper(i8, i9, this.selectedBackgroundSlug, this.selectedGradientRotation);
                        } else {
                            ColorWallpaper colorWallpaper4 = new ColorWallpaper(this.selectedBackgroundSlug, i8, i9, i, this.selectedGradientColor3);
                            this.addedColorWallpaper = colorWallpaper4;
                            colorWallpaper4.gradientRotation = this.selectedGradientRotation;
                        }
                        arrayList.add(0, this.addedColorWallpaper);
                    } else if (themeInfo2.overrideWallpaper != null && !map.containsKey(this.selectedBackgroundSlug)) {
                        FileWallpaper fileWallpaper3 = new FileWallpaper(new File(ApplicationLoader.getFilesDirFixed(), themeInfo2.overrideWallpaper.fileName), new File(ApplicationLoader.getFilesDirFixed(), themeInfo2.overrideWallpaper.originalFileName), this.selectedBackgroundSlug);
                        this.addedFileWallpaper = fileWallpaper3;
                        arrayList.add(this.themeWallpaper != null ? 1 : 0, fileWallpaper3);
                    }
                } else if (themeInfo2.overrideWallpaper != null) {
                    ColorWallpaper colorWallpaper5 = new ColorWallpaper(this.selectedBackgroundSlug, i2, this.selectedGradientColor1, this.selectedGradientColor2, this.selectedGradientColor3, this.selectedGradientRotation, this.selectedIntensity, this.selectedBackgroundMotion, new File(ApplicationLoader.getFilesDirFixed(), themeInfo2.overrideWallpaper.fileName));
                    this.addedColorWallpaper = colorWallpaper5;
                    colorWallpaper5.pattern = tL_wallPaper;
                    arrayList.add(0, colorWallpaper5);
                }
            } else if (r12 == 0 && this.selectedColor != 0 && "c".equals(this.selectedBackgroundSlug)) {
                int i10 = this.selectedGradientColor1;
                if (i10 == 0 || (i3 = this.selectedGradientColor2) == 0 || (i4 = this.selectedGradientColor3) == 0) {
                    this.addedColorWallpaper = new ColorWallpaper(this.selectedColor, i10, this.selectedBackgroundSlug, this.selectedGradientRotation);
                } else {
                    ColorWallpaper colorWallpaper6 = new ColorWallpaper(this.selectedBackgroundSlug, this.selectedColor, i10, i3, i4);
                    this.addedColorWallpaper = colorWallpaper6;
                    colorWallpaper6.gradientRotation = this.selectedGradientRotation;
                }
                arrayList.add(0, this.addedColorWallpaper);
            }
            if ("d".equals(this.selectedBackgroundSlug) || arrayList.isEmpty()) {
                arrayList.add(0, this.catsWallpaper);
            } else {
                arrayList.add(1, this.catsWallpaper);
            }
            updateRows$19();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 0, null, null, null, null, i));
        View view2 = this.fragmentView;
        int i2 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(view2, 0, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.searchEmptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.searchEmptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.searchEmptyView, 1, null, null, null, null, i));
        return arrayList;
    }

    public final void lambda$createView$3$21() {
        if (this.actionBar.isActionModeShowed()) {
            this.selectedWallPapers.clear();
            this.actionBar.hideActionMode$1();
            updateRowsSelection();
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        this.progressDialog = alertDialog;
        alertDialog.canCacnel = false;
        alertDialog.show();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWallPapers(), new RichMediaUploader$$ExternalSyntheticLambda0(this, 11));
    }

    public final void loadWallpapers(boolean z) {
        long j = 0;
        if (!z) {
            ArrayList arrayList = this.allWallPapers;
            int size = arrayList.size();
            long jCalcHash = 0;
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof TLRPC.WallPaper) {
                    long j2 = ((TLRPC.WallPaper) obj).id;
                    if (j2 >= 0) {
                        jCalcHash = MediaDataController.calcHash(jCalcHash, j2);
                    }
                }
            }
            j = jCalcHash;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new CallLogActivity$$ExternalSyntheticLambda31(13, this, z)), this.classGuid);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.updater.onActivityResult(i, i2, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 11));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i = this.currentType;
        if (i == 0 || i == 2) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        } else {
            fillDefaultColors(this.wallPapers, Theme.currentTheme.isDark());
            if (i == 1 && this.patterns.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        int i = this.currentType;
        if (i == 0 || i == 2) {
            SearchAdapter searchAdapter = this.searchAdapter;
            if (searchAdapter.imageReqId != 0) {
                ConnectionsManager.getInstance(WallpapersListActivity.this.currentAccount).cancelRequest(searchAdapter.imageReqId, true);
                searchAdapter.imageReqId = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        } else if (i == 1) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        this.updater.getClass();
        super.onFragmentDestroy();
    }

    public final void onItemClick(ListAdapter.AnonymousClass1 anonymousClass1, Object obj, int i) {
        String str;
        Object obj2 = obj;
        boolean z = true;
        if (this.actionBar.isActionModeShowed()) {
            Object obj3 = obj2 instanceof ColorWallpaper ? ((ColorWallpaper) obj2).parentWallpaper : obj2;
            if (obj3 instanceof TLRPC.WallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj3;
                LongSparseArray longSparseArray = this.selectedWallPapers;
                if (longSparseArray.indexOfKey(wallPaper.id) >= 0) {
                    longSparseArray.remove(wallPaper.id);
                } else {
                    longSparseArray.put(wallPaper.id, obj2);
                }
                if (longSparseArray.size() == 0) {
                    this.actionBar.hideActionMode$1();
                } else {
                    this.selectedMessagesCountTextView.setNumber(longSparseArray.size(), true);
                }
                this.scrolling = false;
                anonymousClass1.wallpaperViews[i].setChecked(longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z2 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        if (z2) {
            str = ((TLRPC.TL_wallPaper) obj2).slug;
        } else if (obj2 instanceof ColorWallpaper) {
            str = ((ColorWallpaper) obj2).slug;
        } else {
            str = obj2 instanceof FileWallpaper ? ((FileWallpaper) obj2).slug : null;
        }
        if (z2) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                int i2 = wallPaperSettings.background_color;
                int i3 = wallPaperSettings.second_background_color;
                int i4 = wallPaperSettings.third_background_color;
                int i5 = wallPaperSettings.fourth_background_color;
                int wallpaperRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                ColorWallpaper colorWallpaper = new ColorWallpaper(str2, i2, i3, i4, i5, wallpaperRotation, wallPaperSettings2.intensity / 100.0f, wallPaperSettings2.motion, null);
                colorWallpaper.pattern = tL_wallPaper;
                colorWallpaper.parentWallpaper = tL_wallPaper;
                obj2 = colorWallpaper;
            }
        }
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(z, obj2, bitmap, 0);
        if (this.currentType == 1) {
            anonymousClass6.delegate = new WallpapersListActivity$$ExternalSyntheticLambda5(this);
        }
        if (this.selectedBackgroundSlug.equals(str)) {
            boolean z3 = this.selectedBackgroundBlurred;
            boolean z4 = this.selectedBackgroundMotion;
            float f = this.selectedIntensity;
            anonymousClass6.isBlurred = z3;
            anonymousClass6.isMotion = z4;
            anonymousClass6.dimAmount = f;
        }
        anonymousClass6.patterns = this.patterns;
        if (anonymousClass6.screenType == 1 || (anonymousClass6.currentWallpaper instanceof ColorWallpaper)) {
            ((ColorWallpaper) anonymousClass6.currentWallpaper).getClass();
        }
        anonymousClass6.setDialogId(0L);
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        anonymousClass6.themeDelegate.parentProvider = this.resourceProvider;
        bottomSheetParams.onOpenAnimationFinished = new VoIPFragment$$ExternalSyntheticLambda31(10);
        bottomSheetParams.occupyNavigationBar = true;
        showAsSheet(anonymousClass6, bottomSheetParams);
    }

    @Override
    public final void onResume() {
        super.onResume();
        MessagesController.getGlobalMainSettings();
        Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.currentTheme.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            String str = overrideWallpaperInfo.slug;
            this.selectedBackgroundSlug = str;
            if (str == null) {
                this.selectedBackgroundSlug = "";
            }
            this.selectedColor = overrideWallpaperInfo.color;
            this.selectedGradientColor1 = overrideWallpaperInfo.gradientColor1;
            this.selectedGradientColor2 = overrideWallpaperInfo.gradientColor2;
            this.selectedGradientColor3 = overrideWallpaperInfo.gradientColor3;
            this.selectedGradientRotation = overrideWallpaperInfo.rotation;
            this.selectedIntensity = overrideWallpaperInfo.intensity;
            this.selectedBackgroundMotion = overrideWallpaperInfo.isMotion;
            this.selectedBackgroundBlurred = overrideWallpaperInfo.isBlurred;
        } else {
            this.selectedBackgroundSlug = Theme.hasWallpaperFromTheme() ? "t" : "d";
            this.selectedColor = 0;
            this.selectedGradientColor1 = 0;
            this.selectedGradientColor2 = 0;
            this.selectedGradientColor3 = 0;
            this.selectedGradientRotation = 45;
            this.selectedIntensity = 1.0f;
            this.selectedBackgroundMotion = false;
            this.selectedBackgroundBlurred = false;
        }
        fillWallpapersWithCustom();
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 11));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.updater.currentPicturePath = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.updater.currentPicturePath;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void updateRows$19() {
        this.rowCount = 0;
        int i = this.currentType;
        if (i == 0) {
            this.uploadImageRow = 0;
            this.setColorRow = 1;
            this.rowCount = 3;
            this.sectionRow = 2;
            this.galleryRow = -1;
            this.galleryHintRow = -1;
        } else if (i == 2) {
            this.uploadImageRow = -1;
            this.setColorRow = -1;
            this.sectionRow = -1;
            this.galleryRow = 0;
            this.rowCount = 2;
            this.galleryHintRow = 1;
        } else {
            this.uploadImageRow = -1;
            this.setColorRow = -1;
            this.sectionRow = -1;
            this.galleryRow = -1;
            this.galleryHintRow = -1;
        }
        ArrayList arrayList = this.wallPapers;
        if (arrayList.isEmpty()) {
            this.wallPaperStartRow = -1;
        } else {
            int iCeil = (int) Math.ceil(arrayList.size() / this.columnsCount);
            this.totalWallpaperRows = iCeil;
            int i2 = this.rowCount;
            this.wallPaperStartRow = i2;
            this.rowCount = i2 + iCeil;
        }
        if (i == 0) {
            int i3 = this.rowCount;
            this.resetSectionRow = i3;
            this.resetRow = i3 + 1;
            this.rowCount = i3 + 3;
            this.resetInfoRow = i3 + 2;
        } else {
            this.resetSectionRow = -1;
            this.resetRow = -1;
            this.resetInfoRow = -1;
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            this.scrolling = true;
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void updateRowsSelection() {
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof WallpaperCell) {
                WallpaperCell wallpaperCell = (WallpaperCell) childAt;
                for (int i2 = 0; i2 < 5; i2++) {
                    wallpaperCell.wallpaperViews[i2].setChecked(false, true);
                }
            }
        }
    }

    public final class FileWallpaper {
        public final File originalPath;
        public File path;
        public final int resId;
        public String slug;
        public final int thumbResId;

        public FileWallpaper(File file, File file2, String str) {
            this.slug = str;
            this.path = file;
            this.originalPath = file2;
        }

        public FileWallpaper() {
            this.slug = "t";
            this.resId = -2;
            this.thumbResId = -2;
        }
    }

    public final class ColorWallpaper {
        public final int color;
        public Bitmap defaultCache;
        public final int gradientColor1;
        public final int gradientColor2;
        public final int gradientColor3;
        public int gradientRotation;
        public float intensity;
        public final boolean isGradient;
        public final boolean motion;
        public TLRPC.WallPaper parentWallpaper;
        public final File path;
        public TLRPC.TL_wallPaper pattern;
        public String slug;

        public ColorWallpaper(int i, int i2, String str, int i3) {
            this.slug = str;
            this.color = i | (-16777216);
            int i4 = i2 == 0 ? 0 : i2 | (-16777216);
            this.gradientColor1 = i4;
            this.gradientRotation = i4 == 0 ? 0 : i3;
            this.intensity = 1.0f;
        }

        public final String getUrl() {
            int i = this.gradientColor1;
            String lowerCase = i != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i >> 16)) & 255), Integer.valueOf(((byte) (i >> 8)) & 255), Byte.valueOf((byte) (i & 255))).toLowerCase() : null;
            int i2 = this.color;
            String lowerCase2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i2 >> 16)) & 255), Integer.valueOf(((byte) (i2 >> 8)) & 255), Byte.valueOf((byte) (i2 & 255))).toLowerCase();
            int i3 = this.gradientColor2;
            String lowerCase3 = i3 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i3 >> 16)) & 255), Integer.valueOf(((byte) (i3 >> 8)) & 255), Byte.valueOf((byte) (i3 & 255))).toLowerCase() : null;
            int i4 = this.gradientColor3;
            String lowerCase4 = i4 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i4 >> 16)) & 255), Integer.valueOf(((byte) (i4 >> 8)) & 255), Byte.valueOf((byte) (i4 & 255))).toLowerCase() : null;
            if (lowerCase == null || lowerCase3 == null) {
                if (lowerCase != null) {
                    String strM = zzit.m(lowerCase2, "-", lowerCase);
                    if (this.pattern != null) {
                        StringBuilder sbM = Log.m(strM, "&rotation=");
                        sbM.append(AndroidUtilities.getWallpaperRotation(this.gradientRotation, true));
                        lowerCase2 = sbM.toString();
                    } else {
                        StringBuilder sbM2 = Log.m(strM, "?rotation=");
                        sbM2.append(AndroidUtilities.getWallpaperRotation(this.gradientRotation, true));
                        lowerCase2 = sbM2.toString();
                    }
                }
            } else if (lowerCase4 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(lowerCase2);
                sb.append("~");
                sb.append(lowerCase);
                sb.append("~");
                sb.append(lowerCase3);
                lowerCase2 = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, "~", lowerCase4);
            } else {
                lowerCase2 = lowerCase2 + "~" + lowerCase + "~" + lowerCase3;
            }
            if (this.pattern == null) {
                return SurfaceContainer$$ExternalSyntheticOutline0.m(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase2, new StringBuilder("https://"));
            }
            String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.pattern.slug + "?intensity=" + ((int) (this.intensity * 100.0f)) + "&bg_color=" + lowerCase2;
            return this.motion ? zzhr.m(str, "&mode=motion") : str;
        }

        public ColorWallpaper(String str, int i, int i2, int i3, int i4) {
            this.slug = str;
            this.color = i | (-16777216);
            this.gradientColor1 = i2 == 0 ? 0 : i2 | (-16777216);
            this.gradientColor2 = i3 == 0 ? 0 : i3 | (-16777216);
            this.gradientColor3 = i4 != 0 ? i4 | (-16777216) : 0;
            this.intensity = 1.0f;
            this.isGradient = true;
        }

        public ColorWallpaper(String str, int i, int i2, int i3, int i4, int i5, float f, boolean z, File file) {
            this.slug = str;
            this.color = i | (-16777216);
            int i6 = i2 == 0 ? 0 : i2 | (-16777216);
            this.gradientColor1 = i6;
            this.gradientColor2 = i3 == 0 ? 0 : i3 | (-16777216);
            this.gradientColor3 = i4 != 0 ? i4 | (-16777216) : 0;
            this.gradientRotation = i6 == 0 ? 45 : i5;
            this.intensity = f;
            this.path = file;
            this.motion = z;
        }
    }
}
