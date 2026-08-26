package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.WallpaperCell;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.WallpaperUpdater;

public class WallpapersListActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int TYPE_ALL = 0;
    public static final int TYPE_CHANNEL_CUSTOM = 3;
    public static final int TYPE_CHANNEL_PATTERNS = 2;
    public static final int TYPE_COLOR = 1;
    private static final int delete = 4;
    private static final int forward = 3;
    private ArrayList<View> actionModeViews;
    private ColorWallpaper addedColorWallpaper;
    private FileWallpaper addedFileWallpaper;
    private ArrayList<Object> allWallPapers;
    private HashMap<String, Object> allWallPapersDict;
    private ColorWallpaper catsWallpaper;
    private Paint colorFramePaint;
    private Paint colorPaint;
    private int columnsCount;
    private int currentType;
    private final long dialogId;
    private int galleryHintRow;
    private int galleryRow;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean loadingWallpapers;
    private HashMap<String, Object> localDict;
    private ArrayList<ColorWallpaper> localWallPapers;
    private ArrayList<Object> patterns;
    private HashMap<Long, Object> patternsDict;
    private AlertDialog progressDialog;
    private int resetInfoRow;
    private int resetRow;
    private int resetSectionRow;
    private int rowCount;
    private boolean scrolling;
    private SearchAdapter searchAdapter;
    private EmptyTextProgressView searchEmptyView;
    private ActionBarMenuItem searchItem;
    private int sectionRow;
    private boolean selectedBackgroundBlurred;
    private boolean selectedBackgroundMotion;
    private String selectedBackgroundSlug;
    private int selectedColor;
    private int selectedGradientColor1;
    private int selectedGradientColor2;
    private int selectedGradientColor3;
    private int selectedGradientRotation;
    private float selectedIntensity;
    private NumberTextView selectedMessagesCountTextView;
    private final LongSparseArray<Object> selectedWallPapers;
    private int setColorRow;
    private FileWallpaper themeWallpaper;
    private int totalWallpaperRows;
    private WallpaperUpdater updater;
    private int uploadImageRow;
    private int wallPaperStartRow;
    private ArrayList<Object> wallPapers;
    private static final int[][] defaultColorsLight = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    private static final int[][] defaultColorsDark = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    private static final int[] searchColors = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    private static final String[] searchColorsNames = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    private static final int[] searchColorsNamesR = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};

    public class AnonymousClass1 implements WallpaperUpdater.WallpaperUpdaterDelegate {
        public AnonymousClass1() {
        }

        public void lambda$didSelectWallpaper$0(TLRPC.WallPaper wallPaper) {
            WallpapersListActivity.this.removeSelfFromStack();
        }

        @Override
        public void didSelectWallpaper(File file, Bitmap bitmap, boolean z) {
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(new FileWallpaper("", file, file), bitmap);
            themePreviewActivity.setDialogId(WallpapersListActivity.this.dialogId);
            if (WallpapersListActivity.this.dialogId != 0) {
                themePreviewActivity.setDelegate(new PhotoViewer$55$$ExternalSyntheticLambda2(this, 26));
            }
            WallpapersListActivity.this.presentFragment(themePreviewActivity, z);
        }

        @Override
        public void needOpenColorPicker() {
        }
    }

    public class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass2() {
        }

        public void lambda$onItemClick$0(int[] iArr) {
            int i = iArr[0] - 1;
            iArr[0] = i;
            if (i == 0) {
                WallpapersListActivity.this.loadWallpapers(true);
            }
        }

        public void lambda$onItemClick$1(int[] iArr, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(12, this, iArr));
        }

        public void lambda$onItemClick$2(AlertDialog alertDialog, int i) {
            WallpapersListActivity.this.progressDialog = new AlertDialog(WallpapersListActivity.this.getParentActivity(), 3, null);
            WallpapersListActivity.this.progressDialog.canCacnel = false;
            WallpapersListActivity.this.progressDialog.show();
            new ArrayList();
            int[] iArr = {0};
            for (int i2 = 0; i2 < WallpapersListActivity.this.selectedWallPapers.size(); i2++) {
                Object objValueAt = WallpapersListActivity.this.selectedWallPapers.valueAt(i2);
                if (objValueAt instanceof ColorWallpaper) {
                    ColorWallpaper colorWallpaper = (ColorWallpaper) objValueAt;
                    TLRPC.WallPaper wallPaper = colorWallpaper.parentWallpaper;
                    if (wallPaper == null || wallPaper.id >= 0) {
                        objValueAt = wallPaper;
                    } else {
                        WallpapersListActivity.this.getMessagesStorage().deleteWallpaper(colorWallpaper.parentWallpaper.id);
                        WallpapersListActivity.this.localWallPapers.remove(colorWallpaper);
                        WallpapersListActivity.this.localDict.remove(colorWallpaper.getHash());
                    }
                }
                if (objValueAt instanceof TLRPC.WallPaper) {
                    iArr[0] = iArr[0] + 1;
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) objValueAt;
                    TL_account.saveWallPaper savewallpaper = new TL_account.saveWallPaper();
                    savewallpaper.settings = new TLRPC.TL_wallPaperSettings();
                    savewallpaper.unsave = true;
                    if (objValueAt instanceof TLRPC.TL_wallPaperNoFile) {
                        TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                        tL_inputWallPaperNoFile.id = wallPaper2.id;
                        savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                    } else {
                        TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                        tL_inputWallPaper.id = wallPaper2.id;
                        tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                        savewallpaper.wallpaper = tL_inputWallPaper;
                    }
                    String str = wallPaper2.slug;
                    if (str != null && str.equals(WallpapersListActivity.this.selectedBackgroundSlug)) {
                        WallpapersListActivity.this.selectedBackgroundSlug = Theme.hasWallpaperFromTheme() ? "t" : "d";
                        Theme.currentTheme.setOverrideWallpaper(null);
                        Theme.reloadWallpaper(true);
                    }
                    ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(savewallpaper, new IntroActivity$$ExternalSyntheticLambda6(14, this, iArr));
                }
            }
            if (iArr[0] == 0) {
                WallpapersListActivity.this.loadWallpapers(true);
            }
            WallpapersListActivity.this.selectedWallPapers.clear();
            ((BaseFragment) WallpapersListActivity.this).actionBar.hideActionMode();
            ((BaseFragment) WallpapersListActivity.this).actionBar.closeSearchField();
        }

        public boolean lambda$onItemClick$3(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
            String url;
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < WallpapersListActivity.this.selectedWallPapers.size(); i3++) {
                Object objValueAt = WallpapersListActivity.this.selectedWallPapers.valueAt(i3);
                if (objValueAt instanceof TLRPC.TL_wallPaper) {
                    url = AndroidUtilities.getWallPaperUrl(objValueAt);
                } else {
                    if (objValueAt instanceof ColorWallpaper) {
                        url = ((ColorWallpaper) objValueAt).getUrl();
                    }
                }
                if (!TextUtils.isEmpty(url)) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(url);
                }
            }
            WallpapersListActivity.this.selectedWallPapers.clear();
            ((BaseFragment) WallpapersListActivity.this).actionBar.hideActionMode();
            ((BaseFragment) WallpapersListActivity.this).actionBar.closeSearchField();
            if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).getClientUserId() || charSequence != null) {
                WallpapersListActivity.this.updateRowsSelection();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    long j = ((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId;
                    if (charSequence != null) {
                        SendMessagesHelper.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    }
                    if (!TextUtils.isEmpty(sb)) {
                        SendMessagesHelper.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    }
                }
                dialogsActivity.finishFragment();
            } else {
                long j2 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j2)) {
                    bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j2));
                } else {
                    if (DialogObject.isUserDialog(j2)) {
                        bundleM.putLong("user_id", j2);
                    } else if (DialogObject.isChatDialog(j2)) {
                        bundleM.putLong("chat_id", -j2);
                    }
                    if (!MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).checkCanOpenChat(bundleM, dialogsActivity)) {
                        return true;
                    }
                }
                NotificationCenter.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                WallpapersListActivity.this.presentFragment(new ChatActivity(bundleM), true);
                SendMessagesHelper.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            return true;
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (!((BaseFragment) WallpapersListActivity.this).actionBar.isActionModeShowed()) {
                    WallpapersListActivity.this.finishFragment();
                    return;
                }
                WallpapersListActivity.this.selectedWallPapers.clear();
                ((BaseFragment) WallpapersListActivity.this).actionBar.hideActionMode();
                WallpapersListActivity.this.updateRowsSelection();
                return;
            }
            if (i != 4) {
                if (i == 3) {
                    DialogsActivity dialogsActivity = new DialogsActivity(TelegramMediaSession$$ExternalSyntheticOutline0.m("onlySelect", "dialogsType", 3, true));
                    dialogsActivity.setDelegate(new PhotoViewer$$ExternalSyntheticLambda96(this, 1));
                    WallpapersListActivity.this.presentFragment(dialogsActivity);
                    return;
                }
                return;
            }
            if (WallpapersListActivity.this.getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(WallpapersListActivity.this.getParentActivity(), 0, null);
            builder.setTitle(LocaleController.formatPluralString("DeleteBackground", WallpapersListActivity.this.selectedWallPapers.size(), new Object[0]));
            builder.setMessage(LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]));
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new PhotoViewer$55$$ExternalSyntheticLambda2(this, 27));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            WallpapersListActivity.this.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public class ColorCell extends View {
        private int color;

        public ColorCell(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            WallpapersListActivity.this.colorPaint.setColor(this.color);
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), WallpapersListActivity.this.colorPaint);
            if (this.color == Theme.getColor(null, Theme.key_windowBackgroundWhite, false)) {
                canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), WallpapersListActivity.this.colorFramePaint);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
        }

        public void setColor(int i) {
            this.color = i;
        }
    }

    public static class EmojiWallpaper {
        public final String emoticon;

        public EmojiWallpaper(String str) {
            this.emoticon = str;
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return WallpapersListActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == WallpapersListActivity.this.uploadImageRow || i == WallpapersListActivity.this.galleryRow || i == WallpapersListActivity.this.setColorRow || i == WallpapersListActivity.this.resetRow) {
                return 0;
            }
            if (i == WallpapersListActivity.this.sectionRow || i == WallpapersListActivity.this.resetSectionRow) {
                return 1;
            }
            return (i == WallpapersListActivity.this.resetInfoRow || i == WallpapersListActivity.this.galleryHintRow) ? 3 : 2;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (i == WallpapersListActivity.this.uploadImageRow) {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SelectFromGallery), R.drawable.msg_photos, true);
                    return;
                }
                if (i == WallpapersListActivity.this.setColorRow) {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SetColor), R.drawable.msg_palette, true);
                    return;
                }
                if (i == WallpapersListActivity.this.resetRow) {
                    textCell.setText(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                    return;
                } else {
                    if (i == WallpapersListActivity.this.galleryRow) {
                        textCell.setTextAndIcon((CharSequence) "Choose from gallery", R.drawable.msg_background, false);
                        textCell.setLockLevel(false, 10);
                        return;
                    }
                    return;
                }
            }
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == WallpapersListActivity.this.resetInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                    return;
                } else {
                    if (i == WallpapersListActivity.this.galleryHintRow) {
                        textInfoPrivacyCell.setText("Upload your own background for the channel.");
                        return;
                    }
                    return;
                }
            }
            WallpaperCell wallpaperCell = (WallpaperCell) viewHolder.itemView;
            int i2 = WallpapersListActivity.this.columnsCount * (i - WallpapersListActivity.this.wallPaperStartRow);
            wallpaperCell.setParams(WallpapersListActivity.this.columnsCount, i2 == 0, i2 / WallpapersListActivity.this.columnsCount == WallpapersListActivity.this.totalWallpaperRows - 1);
            for (int i3 = 0; i3 < WallpapersListActivity.this.columnsCount; i3++) {
                int i4 = i2 + i3;
                Object obj = null;
                Object obj2 = i4 < WallpapersListActivity.this.wallPapers.size() ? WallpapersListActivity.this.wallPapers.get(i4) : null;
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.currentTheme.overrideWallpaper;
                    if (WallpapersListActivity.this.selectedBackgroundSlug.equals(tL_wallPaper.slug)) {
                        if (!WallpapersListActivity.this.selectedBackgroundSlug.equals(tL_wallPaper.slug) || tL_wallPaper.settings == null) {
                            obj = tL_wallPaper;
                        } else if (WallpapersListActivity.this.selectedColor == Theme.getWallpaperColor(tL_wallPaper.settings.background_color) && WallpapersListActivity.this.selectedGradientColor1 == Theme.getWallpaperColor(tL_wallPaper.settings.second_background_color) && WallpapersListActivity.this.selectedGradientColor2 == Theme.getWallpaperColor(tL_wallPaper.settings.third_background_color) && WallpapersListActivity.this.selectedGradientColor3 == Theme.getWallpaperColor(tL_wallPaper.settings.fourth_background_color)) {
                            if (WallpapersListActivity.this.selectedGradientColor1 == 0 || WallpapersListActivity.this.selectedGradientColor2 != 0 || WallpapersListActivity.this.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern) {
                                obj = tL_wallPaper;
                            } else {
                                float f = tL_wallPaper.settings.intensity / 100.0f;
                                if (f < 0.0f && !Theme.currentTheme.isDark()) {
                                    f = -f;
                                }
                                if (Math.abs(f - WallpapersListActivity.this.selectedIntensity) <= 0.001f) {
                                    obj = tL_wallPaper;
                                }
                            }
                        }
                    }
                    j = tL_wallPaper.id;
                } else {
                    j = 0;
                    if (obj2 instanceof ColorWallpaper) {
                        ColorWallpaper colorWallpaper = (ColorWallpaper) obj2;
                        if (("d".equals(colorWallpaper.slug) && WallpapersListActivity.this.selectedBackgroundSlug != null && WallpapersListActivity.this.selectedBackgroundSlug.equals(colorWallpaper.slug)) || (colorWallpaper.color == WallpapersListActivity.this.selectedColor && colorWallpaper.gradientColor1 == WallpapersListActivity.this.selectedGradientColor1 && colorWallpaper.gradientColor2 == WallpapersListActivity.this.selectedGradientColor2 && colorWallpaper.gradientColor3 == WallpapersListActivity.this.selectedGradientColor3 && ((WallpapersListActivity.this.selectedGradientColor1 == 0 || colorWallpaper.gradientRotation == WallpapersListActivity.this.selectedGradientRotation) && ((!"c".equals(WallpapersListActivity.this.selectedBackgroundSlug) || colorWallpaper.slug == null) && ("c".equals(WallpapersListActivity.this.selectedBackgroundSlug) || (TextUtils.equals(WallpapersListActivity.this.selectedBackgroundSlug, colorWallpaper.slug) && ((int) (colorWallpaper.intensity * 100.0f)) == ((int) (WallpapersListActivity.this.selectedIntensity * 100.0f)))))))) {
                            obj = obj2;
                        }
                        TLRPC.WallPaper wallPaper = colorWallpaper.parentWallpaper;
                        if (wallPaper != null) {
                            j = wallPaper.id;
                        }
                    } else if ((obj2 instanceof FileWallpaper) && WallpapersListActivity.this.selectedBackgroundSlug.equals(((FileWallpaper) obj2).slug)) {
                        obj = obj2;
                    }
                }
                long j2 = j;
                wallpaperCell.setWallpaper(WallpapersListActivity.this.currentType, i3, obj2, obj, null, false);
                if (((BaseFragment) WallpapersListActivity.this).actionBar.isActionModeShowed()) {
                    wallpaperCell.setChecked(i3, WallpapersListActivity.this.selectedWallPapers.indexOfKey(j2) >= 0, !WallpapersListActivity.this.scrolling);
                } else {
                    wallpaperCell.setChecked(i3, false, !WallpapersListActivity.this.scrolling);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCell;
            if (i == 0) {
                textCell = new TextCell(this.mContext);
            } else if (i != 1) {
                textCell = i != 3 ? new WallpaperCell(this.mContext) {
                    @Override
                    public void onWallpaperClick(Object obj, int i2) {
                        WallpapersListActivity.this.onItemClick(this, obj, i2);
                    }

                    @Override
                    public boolean onWallpaperLongClick(Object obj, int i2) {
                        return WallpapersListActivity.this.onItemLongClick(this, obj, i2);
                    }
                } : new TextInfoPrivacyCell(this.mContext, 24, null);
            } else {
                textCell = new ShadowSectionCell(this.mContext, null, 0);
            }
            return new RecyclerListView.Holder(textCell);
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private int imageReqId;
        private RecyclerListView innerListView;
        private String lastSearchImageString;
        private String lastSearchString;
        private int lastSearchToken;
        private Context mContext;
        private String nextImagesSearchOffset;
        private Runnable searchRunnable;
        private boolean searchingUser;
        private String selectedColor;
        private ArrayList<MediaController.SearchImage> searchResult = new ArrayList<>();
        private HashMap<String, MediaController.SearchImage> searchResultKeys = new HashMap<>();
        private boolean bingSearchEndReached = true;

        public class CategoryAdapterRecycler extends RecyclerListView.SelectionAdapter {
            private CategoryAdapterRecycler() {
            }

            @Override
            public int getItemCount() {
                return WallpapersListActivity.searchColors.length;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ((ColorCell) viewHolder.itemView).setColor(WallpapersListActivity.searchColors[i]);
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                SearchAdapter searchAdapter = SearchAdapter.this;
                return new RecyclerListView.Holder(WallpapersListActivity.this.new ColorCell(searchAdapter.mContext));
            }

            public CategoryAdapterRecycler(SearchAdapter searchAdapter, AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        private void doSearch(String str) {
            this.searchResult.clear();
            this.searchResultKeys.clear();
            this.bingSearchEndReached = true;
            searchImages(str, "", true);
            this.lastSearchString = str;
            notifyDataSetChanged();
        }

        public void lambda$onCreateViewHolder$5(View view, int i) {
            String string = LocaleController.getString(R.string.BackgroundSearchColor);
            StringBuilder sbM = Log.m(string, " ");
            sbM.append(LocaleController.getString(WallpapersListActivity.searchColorsNames[i], WallpapersListActivity.searchColorsNamesR[i]));
            SpannableString spannableString = new SpannableString(sbM.toString());
            spannableString.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_actionBarDefaultSubtitle, false)), string.length(), spannableString.length(), 33);
            WallpapersListActivity.this.searchItem.setSearchFieldCaption(spannableString);
            WallpapersListActivity.this.searchItem.setSearchFieldHint(null);
            WallpapersListActivity.this.searchItem.setSearchFieldText("", true);
            this.selectedColor = WallpapersListActivity.searchColorsNames[i];
            processSearch("", true);
        }

        public void lambda$processSearch$0(String str) {
            doSearch(str);
            this.searchRunnable = null;
        }

        public void lambda$searchBotUser$1(TLObject tLObject) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            WallpapersListActivity.this.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
            String str = this.lastSearchImageString;
            this.lastSearchImageString = null;
            searchImages(str, "", false);
        }

        public void lambda$searchBotUser$2(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(14, this, tLObject));
            }
        }

        public void lambda$searchImages$3(int i, TLObject tLObject) {
            if (i != this.lastSearchToken) {
                return;
            }
            this.imageReqId = 0;
            int size = this.searchResult.size();
            if (tLObject != null) {
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                this.nextImagesSearchOffset = messages_botresults.next_offset;
                int size2 = messages_botresults.results.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i2);
                    if ("photo".equals(botInlineResult.type) && !this.searchResultKeys.containsKey(botInlineResult.id)) {
                        MediaController.SearchImage searchImage = new MediaController.SearchImage();
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                            if (closestPhotoSizeWithSize != null) {
                                searchImage.width = closestPhotoSizeWithSize.w;
                                searchImage.height = closestPhotoSizeWithSize.h;
                                searchImage.photoSize = closestPhotoSizeWithSize;
                                searchImage.photo = botInlineResult.photo;
                                searchImage.size = closestPhotoSizeWithSize.size;
                                searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                searchImage.id = botInlineResult.id;
                                searchImage.type = 0;
                                this.searchResult.add(searchImage);
                                this.searchResultKeys.put(searchImage.id, searchImage);
                            }
                        } else if (botInlineResult.content != null) {
                            for (int i3 = 0; i3 < botInlineResult.content.attributes.size(); i3++) {
                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i3);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                    searchImage.width = documentAttribute.w;
                                    searchImage.height = documentAttribute.h;
                                    break;
                                }
                            }
                            TLRPC.WebDocument webDocument = botInlineResult.thumb;
                            if (webDocument != null) {
                                searchImage.thumbUrl = webDocument.url;
                            } else {
                                searchImage.thumbUrl = null;
                            }
                            TLRPC.WebDocument webDocument2 = botInlineResult.content;
                            searchImage.imageUrl = webDocument2.url;
                            searchImage.size = webDocument2.size;
                            searchImage.id = botInlineResult.id;
                            searchImage.type = 0;
                            this.searchResult.add(searchImage);
                            this.searchResultKeys.put(searchImage.id, searchImage);
                        }
                    }
                }
                this.bingSearchEndReached = size == this.searchResult.size() || this.nextImagesSearchOffset == null;
            }
            if (size != this.searchResult.size()) {
                int i4 = size % WallpapersListActivity.this.columnsCount;
                float f = size;
                int iCeil = (int) Math.ceil(f / WallpapersListActivity.this.columnsCount);
                if (i4 != 0) {
                    lambda$onBindViewHolder$31(((int) Math.ceil(f / WallpapersListActivity.this.columnsCount)) - 1);
                }
                WallpapersListActivity.this.searchAdapter.notifyItemRangeInserted(iCeil, ((int) Math.ceil(this.searchResult.size() / WallpapersListActivity.this.columnsCount)) - iCeil);
            }
            WallpapersListActivity.this.searchEmptyView.showTextView();
        }

        public void lambda$searchImages$4(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(this, i, tLObject, 10));
        }

        public void processSearch(String str, boolean z) {
            if (str != null && this.selectedColor != null) {
                str = Fragment$$ExternalSyntheticOutline0.m(this.selectedColor, " ", str, new StringBuilder("#color"));
            }
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.searchRunnable = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchResult.clear();
                this.searchResultKeys.clear();
                this.bingSearchEndReached = true;
                this.lastSearchString = null;
                if (this.imageReqId != 0) {
                    ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).cancelRequest(this.imageReqId, true);
                    this.imageReqId = 0;
                }
                WallpapersListActivity.this.searchEmptyView.showTextView();
            } else {
                WallpapersListActivity.this.searchEmptyView.showProgress();
                if (z) {
                    doSearch(str);
                } else {
                    PhotoViewer$7$$ExternalSyntheticLambda0 photoViewer$7$$ExternalSyntheticLambda0 = new PhotoViewer$7$$ExternalSyntheticLambda0(13, this, str);
                    this.searchRunnable = photoViewer$7$$ExternalSyntheticLambda0;
                    AndroidUtilities.runOnUIThread(photoViewer$7$$ExternalSyntheticLambda0, 500L);
                }
            }
            notifyDataSetChanged();
        }

        private void searchBotUser() {
            if (this.searchingUser) {
                return;
            }
            this.searchingUser = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).imageSearchBot;
            ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(tL_contacts_resolveUsername, new LinkManager$$ExternalSyntheticLambda10(this, 4));
        }

        private void searchImages(String str, String str2, boolean z) {
            if (this.imageReqId != 0) {
                ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).cancelRequest(this.imageReqId, true);
                this.imageReqId = 0;
            }
            this.lastSearchImageString = str;
            TLObject userOrChat = MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).getUserOrChat(MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).imageSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                if (z) {
                    searchBotUser();
                    return;
                }
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.query = zzii.m("#wallpaper ", str);
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            int i = this.lastSearchToken + 1;
            this.lastSearchToken = i;
            this.imageReqId = ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(tL_messages_getInlineBotResults, new MessageAuthorView$$ExternalSyntheticLambda1(this, i, 1));
            ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).bindRequestToGuid(this.imageReqId, ((BaseFragment) WallpapersListActivity.this).classGuid);
        }

        public void clearColor() {
            this.selectedColor = null;
            processSearch(null, true);
        }

        public RecyclerListView getInnerListView() {
            return this.innerListView;
        }

        @Override
        public int getItemCount() {
            if (TextUtils.isEmpty(this.lastSearchString)) {
                return 2;
            }
            return (int) Math.ceil(this.searchResult.size() / WallpapersListActivity.this.columnsCount);
        }

        @Override
        public int getItemViewType(int i) {
            if (TextUtils.isEmpty(this.lastSearchString)) {
                return i == 0 ? 2 : 1;
            }
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 2;
        }

        public void loadMoreResults() {
            if (this.bingSearchEndReached || this.imageReqId != 0) {
                return;
            }
            searchImages(this.lastSearchString, this.nextImagesSearchOffset, true);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 2) {
                    return;
                }
                ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            WallpaperCell wallpaperCell = (WallpaperCell) viewHolder.itemView;
            int i2 = WallpapersListActivity.this.columnsCount * i;
            wallpaperCell.setParams(WallpapersListActivity.this.columnsCount, i2 == 0, i2 / WallpapersListActivity.this.columnsCount == ((int) Math.ceil((double) (((float) this.searchResult.size()) / ((float) WallpapersListActivity.this.columnsCount)))) - 1);
            for (int i3 = 0; i3 < WallpapersListActivity.this.columnsCount; i3++) {
                int i4 = i2 + i3;
                wallpaperCell.setWallpaper(WallpapersListActivity.this.currentType, i3, i4 < this.searchResult.size() ? this.searchResult.get(i4) : null, "", null, false);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View graySectionCell;
            if (i != 0) {
                view = null;
                boolean z = false;
                if (i == 1) {
                    RecyclerListView recyclerListView = new RecyclerListView(this.mContext) {
                        @Override
                        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                            if (getParent() != null && getParent().getParent() != null) {
                                getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                            }
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                    };
                    recyclerListView.lambda$onCellEnter$52(null);
                    recyclerListView.setLayoutAnimation(null);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext) {
                        {
                            super(1, false);
                        }

                        @Override
                        public boolean supportsPredictiveItemAnimations() {
                            return false;
                        }
                    };
                    recyclerListView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                    recyclerListView.setClipToPadding(false);
                    linearLayoutManager.setOrientation(0);
                    recyclerListView.setLayoutManager(linearLayoutManager);
                    recyclerListView.setAdapter(new CategoryAdapterRecycler(this, z ? 1 : 0));
                    recyclerListView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 6));
                    this.innerListView = recyclerListView;
                    graySectionCell = recyclerListView;
                } else if (i == 2) {
                    graySectionCell = new GraySectionCell(this.mContext, 16, null);
                }
                view = graySectionCell;
            } else {
                view = new WallpaperCell(this.mContext) {
                    @Override
                    public void onWallpaperClick(Object obj, int i2) {
                        WallpapersListActivity.this.presentFragment(new ThemePreviewActivity(obj, null, true, false));
                    }
                };
            }
            if (i == 1) {
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(60.0f)));
            } else {
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            }
            return new RecyclerListView.Holder(view);
        }

        public void onDestroy() {
            if (this.imageReqId != 0) {
                ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).cancelRequest(this.imageReqId, true);
                this.imageReqId = 0;
            }
        }
    }

    public WallpapersListActivity(int i, long j) {
        super(null);
        this.actionModeViews = new ArrayList<>();
        this.columnsCount = 3;
        this.selectedBackgroundSlug = "";
        this.allWallPapers = new ArrayList<>();
        this.allWallPapersDict = new HashMap<>();
        this.localDict = new HashMap<>();
        this.wallPapers = new ArrayList<>();
        this.localWallPapers = new ArrayList<>();
        this.patterns = new ArrayList<>();
        this.patternsDict = new HashMap<>();
        this.selectedWallPapers = new LongSparseArray<>();
        this.currentType = i;
        this.dialogId = j;
    }

    public static void fillDefaultColors(ArrayList<Object> arrayList, boolean z) {
        for (int[] iArr : z ? defaultColorsDark : defaultColorsLight) {
            if (iArr.length == 1) {
                arrayList.add(new ColorWallpaper("c", iArr[0], 0, 45));
            } else {
                arrayList.add(new ColorWallpaper("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    private void fillWallpapersWithCustom() {
        ?? r9;
        final String str;
        final long j;
        ?? r10;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.WallPaper wallPaper;
        int i;
        int i2;
        int i3;
        int i4;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        ?? r11;
        int i5;
        String str3;
        int i6 = this.currentType;
        if (i6 == 0 || i6 == 2) {
            MessagesController.getGlobalMainSettings();
            ColorWallpaper colorWallpaper = this.addedColorWallpaper;
            if (colorWallpaper != null) {
                this.wallPapers.remove(colorWallpaper);
                this.addedColorWallpaper = null;
            }
            FileWallpaper fileWallpaper = this.addedFileWallpaper;
            if (fileWallpaper != null) {
                this.wallPapers.remove(fileWallpaper);
                this.addedFileWallpaper = null;
            }
            ColorWallpaper colorWallpaper2 = this.catsWallpaper;
            if (colorWallpaper2 == null) {
                ColorWallpaper colorWallpaper3 = new ColorWallpaper("d", -2368069, -9722489, -2762611, -7817084);
                this.catsWallpaper = colorWallpaper3;
                colorWallpaper3.intensity = 0.34f;
            } else {
                this.wallPapers.remove(colorWallpaper2);
            }
            FileWallpaper fileWallpaper2 = this.themeWallpaper;
            if (fileWallpaper2 != null) {
                this.wallPapers.remove(fileWallpaper2);
            }
            int size = this.wallPapers.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    r9 = 0;
                    break;
                }
                Object obj = this.wallPapers.get(i7);
                if (obj instanceof ColorWallpaper) {
                    r9 = (ColorWallpaper) obj;
                    String str4 = r9.slug;
                    if (str4 != null) {
                        r9.pattern = (TLRPC.TL_wallPaper) this.allWallPapersDict.get(str4);
                    }
                    if (("c".equals(r9.slug) || (str3 = r9.slug) == null || TextUtils.equals(this.selectedBackgroundSlug, str3)) && this.selectedColor == r9.color && (i5 = this.selectedGradientColor1) == r9.gradientColor1 && this.selectedGradientColor2 == r9.gradientColor2 && this.selectedGradientColor3 == r9.gradientColor3 && (i5 == 0 || this.selectedGradientRotation == r9.gradientRotation)) {
                        break;
                    } else {
                        i7++;
                    }
                } else {
                    if (obj instanceof TLRPC.TL_wallPaper) {
                        r9 = (TLRPC.TL_wallPaper) obj;
                        if (r9.settings != null && TextUtils.equals(this.selectedBackgroundSlug, r9.slug) && this.selectedColor == Theme.getWallpaperColor(r9.settings.background_color) && this.selectedGradientColor1 == Theme.getWallpaperColor(r9.settings.second_background_color) && this.selectedGradientColor2 == Theme.getWallpaperColor(r9.settings.third_background_color) && this.selectedGradientColor3 == Theme.getWallpaperColor(r9.settings.fourth_background_color) && (this.selectedGradientColor1 == 0 || this.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(r9.settings.rotation, false))) {
                            float f = r9.settings.intensity / 100.0f;
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
            if (r9 instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) r9;
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
                            r11 = 0;
                        }
                    }
                    str2 = this.selectedBackgroundSlug;
                    tL_wallPaper2 = null;
                    r11 = r9;
                } else {
                    str2 = "";
                    tL_wallPaper2 = tL_wallPaper3;
                    r11 = 0;
                }
                r10 = r11;
                tL_wallPaper = tL_wallPaper2;
                str = str2;
                j = tL_wallPaper3.id;
            } else {
                str = this.selectedBackgroundSlug;
                j = (!(r9 instanceof ColorWallpaper) || (wallPaper = ((ColorWallpaper) r9).parentWallpaper) == null) ? 0L : wallPaper.id;
                r10 = r9;
                tL_wallPaper = null;
            }
            Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
            final boolean zIsDark = themeInfo.isDark();
            try {
                Collections.sort(this.wallPapers, new Comparator() {
                    @Override
                    public final int compare(Object obj2, Object obj3) {
                        return this.f$0.lambda$fillWallpapersWithCustom$9(j, str, zIsDark, obj2, obj3);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (Theme.hasWallpaperFromTheme() && TextUtils.isEmpty(Theme.themedWallpaperLink)) {
                if (this.themeWallpaper == null) {
                    this.themeWallpaper = new FileWallpaper("t", -2, -2);
                }
                this.wallPapers.add(0, this.themeWallpaper);
            } else {
                this.themeWallpaper = null;
            }
            Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
            if (TextUtils.isEmpty(this.selectedBackgroundSlug) || (!"d".equals(this.selectedBackgroundSlug) && r10 == 0)) {
                if ("c".equals(this.selectedBackgroundSlug) || (i2 = this.selectedColor) == 0) {
                    int i8 = this.selectedColor;
                    if (i8 != 0) {
                        int i9 = this.selectedGradientColor1;
                        if (i9 == 0 || (i = this.selectedGradientColor2) == 0) {
                            this.addedColorWallpaper = new ColorWallpaper(this.selectedBackgroundSlug, i8, i9, this.selectedGradientRotation);
                        } else {
                            ColorWallpaper colorWallpaper4 = new ColorWallpaper(this.selectedBackgroundSlug, i8, i9, i, this.selectedGradientColor3);
                            this.addedColorWallpaper = colorWallpaper4;
                            colorWallpaper4.gradientRotation = this.selectedGradientRotation;
                        }
                        this.wallPapers.add(0, this.addedColorWallpaper);
                    } else if (themeInfo2.overrideWallpaper != null && !this.allWallPapersDict.containsKey(this.selectedBackgroundSlug)) {
                        FileWallpaper fileWallpaper3 = new FileWallpaper(this.selectedBackgroundSlug, new File(ApplicationLoader.getFilesDirFixed(), themeInfo2.overrideWallpaper.fileName), new File(ApplicationLoader.getFilesDirFixed(), themeInfo2.overrideWallpaper.originalFileName));
                        this.addedFileWallpaper = fileWallpaper3;
                        this.wallPapers.add(this.themeWallpaper != null ? 1 : 0, fileWallpaper3);
                    }
                } else if (themeInfo2.overrideWallpaper != null) {
                    ColorWallpaper colorWallpaper5 = new ColorWallpaper(this.selectedBackgroundSlug, i2, this.selectedGradientColor1, this.selectedGradientColor2, this.selectedGradientColor3, this.selectedGradientRotation, this.selectedIntensity, this.selectedBackgroundMotion, new File(ApplicationLoader.getFilesDirFixed(), themeInfo2.overrideWallpaper.fileName));
                    this.addedColorWallpaper = colorWallpaper5;
                    colorWallpaper5.pattern = tL_wallPaper;
                    this.wallPapers.add(0, colorWallpaper5);
                }
            } else if (r10 == 0 && this.selectedColor != 0 && "c".equals(this.selectedBackgroundSlug)) {
                int i10 = this.selectedGradientColor1;
                if (i10 == 0 || (i3 = this.selectedGradientColor2) == 0 || (i4 = this.selectedGradientColor3) == 0) {
                    this.addedColorWallpaper = new ColorWallpaper(this.selectedBackgroundSlug, this.selectedColor, i10, this.selectedGradientRotation);
                } else {
                    ColorWallpaper colorWallpaper6 = new ColorWallpaper(this.selectedBackgroundSlug, this.selectedColor, i10, i3, i4);
                    this.addedColorWallpaper = colorWallpaper6;
                    colorWallpaper6.gradientRotation = this.selectedGradientRotation;
                }
                this.wallPapers.add(0, this.addedColorWallpaper);
            }
            if ("d".equals(this.selectedBackgroundSlug) || this.wallPapers.isEmpty()) {
                this.wallPapers.add(0, this.catsWallpaper);
            } else {
                this.wallPapers.add(1, this.catsWallpaper);
            }
            updateRows();
        }
    }

    private void fixLayout() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    WallpapersListActivity.this.fixLayoutInternal();
                    if (WallpapersListActivity.this.listView == null) {
                        return true;
                    }
                    WallpapersListActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        }
    }

    public void fixLayoutInternal() {
        if (getParentActivity() == null) {
            return;
        }
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (AndroidUtilities.isTablet()) {
            this.columnsCount = 3;
        } else if (rotation == 3 || rotation == 1) {
            this.columnsCount = 5;
        } else {
            this.columnsCount = 3;
        }
        updateRows();
    }

    private String getWallPaperSlug(Object obj) {
        if (obj instanceof TLRPC.TL_wallPaper) {
            return ((TLRPC.TL_wallPaper) obj).slug;
        }
        if (obj instanceof ColorWallpaper) {
            return ((ColorWallpaper) obj).slug;
        }
        if (obj instanceof FileWallpaper) {
            return ((FileWallpaper) obj).slug;
        }
        return null;
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$1() {
        loadWallpapers(false);
    }

    public void lambda$createView$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LaunchActivity$12$$ExternalSyntheticLambda0(this, 1));
    }

    public void lambda$createView$3(AlertDialog alertDialog, int i) {
        if (this.actionBar.isActionModeShowed()) {
            this.selectedWallPapers.clear();
            this.actionBar.hideActionMode();
            updateRowsSelection();
        }
        AlertDialog alertDialog2 = new AlertDialog(getParentActivity(), 3, null);
        this.progressDialog = alertDialog2;
        alertDialog2.canCacnel = false;
        alertDialog2.show();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWallPapers(), new LinkManager$$ExternalSyntheticLambda10(this, 25));
    }

    public void lambda$createView$4(View view, int i) {
        if (getParentActivity() == null || this.listView.getAdapter() == this.searchAdapter) {
            return;
        }
        if (i == this.uploadImageRow) {
            this.updater.openGallery();
            return;
        }
        if (i == this.setColorRow) {
            WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(1);
            wallpapersListActivity.patterns = this.patterns;
            presentFragment(wallpapersListActivity);
        } else if (i == this.resetRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.ResetChatBackgroundsAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.Reset), new WallpapersListActivity$$ExternalSyntheticLambda0(this));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public int lambda$fillWallpapersWithCustom$9(long j, String str, boolean z, Object obj, Object obj2) {
        if (obj instanceof ColorWallpaper) {
            obj = ((ColorWallpaper) obj).parentWallpaper;
        }
        if (obj2 instanceof ColorWallpaper) {
            obj2 = ((ColorWallpaper) obj2).parentWallpaper;
        }
        if (!(obj instanceof TLRPC.WallPaper) || !(obj2 instanceof TLRPC.WallPaper)) {
            return 0;
        }
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj2;
        if (j != 0) {
            if (wallPaper.id == j) {
                return -1;
            }
            if (wallPaper2.id == j) {
                return 1;
            }
        } else {
            if (str.equals(wallPaper.slug)) {
                return -1;
            }
            if (str.equals(wallPaper2.slug)) {
                return 1;
            }
        }
        if (!z) {
            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper.slug)) {
                return -1;
            }
            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper2.slug)) {
                return 1;
            }
        }
        int iIndexOf = this.allWallPapers.indexOf(wallPaper);
        int iIndexOf2 = this.allWallPapers.indexOf(wallPaper2);
        boolean z2 = wallPaper.dark;
        if ((z2 && wallPaper2.dark) || (!z2 && !wallPaper2.dark)) {
            if (iIndexOf > iIndexOf2) {
                return 1;
            }
            return iIndexOf < iIndexOf2 ? -1 : 0;
        }
        if (!z2 || wallPaper2.dark) {
            return z ? 1 : -1;
        }
        return z ? -1 : 1;
    }

    public void lambda$loadWallpapers$7(TLObject tLObject, boolean z) {
        int i;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z2;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            this.patterns.clear();
            this.patternsDict.clear();
            int i2 = this.currentType;
            if (i2 != 1 && i2 != 2) {
                this.wallPapers.clear();
                this.allWallPapersDict.clear();
                this.allWallPapers.clear();
                this.allWallPapers.addAll(tL_wallPapers.wallpapers);
                this.wallPapers.addAll(this.localWallPapers);
            }
            int size = tL_wallPapers.wallpapers.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i3);
                if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                        this.allWallPapersDict.put(wallPaper.slug, wallPaper);
                        if (wallPaper.pattern && (document = wallPaper.document) != null && !this.patternsDict.containsKey(Long.valueOf(document.id))) {
                            this.patterns.add(wallPaper);
                            this.patternsDict.put(Long.valueOf(wallPaper.document.id), wallPaper);
                        }
                        int i4 = this.currentType;
                        if (i4 != 1 && ((!(z2 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i4 != 2 || z2) && (Theme.currentTheme.isDark() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                            this.wallPapers.add(wallPaper);
                        }
                    } else if (wallPaper.settings.background_color != 0 && (Theme.currentTheme.isDark() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                        TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                        int i5 = wallPaperSettings4.second_background_color;
                        ColorWallpaper colorWallpaper = (i5 == 0 || (i = wallPaperSettings4.third_background_color) == 0) ? new ColorWallpaper(null, wallPaperSettings4.background_color, i5, wallPaperSettings4.rotation) : new ColorWallpaper(null, wallPaperSettings4.background_color, i5, i, wallPaperSettings4.fourth_background_color);
                        colorWallpaper.slug = wallPaper.slug;
                        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper.settings;
                        colorWallpaper.intensity = wallPaperSettings5.intensity / 100.0f;
                        colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings5.rotation, false);
                        colorWallpaper.parentWallpaper = wallPaper;
                        this.wallPapers.add(colorWallpaper);
                    }
                }
            }
            fillWallpapersWithCustom();
            getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            if (z) {
                return;
            }
            this.listView.smoothScrollToPosition(0);
        }
    }

    public void lambda$loadWallpapers$8(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda28(this, tLObject, z, 21));
    }

    public void lambda$onItemClick$5(TLRPC.WallPaper wallPaper) {
        removeSelfFromStack();
    }

    public static void lambda$showAsSheet$6() throws FileNotFoundException {
        PhotoViewer.getInstance().closePhoto(false, false);
    }

    public void loadWallpapers(boolean z) {
        long j = 0;
        if (!z) {
            int size = this.allWallPapers.size();
            long jCalcHash = 0;
            for (int i = 0; i < size; i++) {
                Object obj = this.allWallPapers.get(i);
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new CallLogActivity$$ExternalSyntheticLambda31(this, z, 9)), this.classGuid);
    }

    public void onItemClick(WallpaperCell wallpaperCell, Object obj, int i) {
        Object obj2;
        if (this.actionBar.isActionModeShowed()) {
            Object obj3 = obj instanceof ColorWallpaper ? ((ColorWallpaper) obj).parentWallpaper : obj;
            if (obj3 instanceof TLRPC.WallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj3;
                if (this.selectedWallPapers.indexOfKey(wallPaper.id) >= 0) {
                    this.selectedWallPapers.remove(wallPaper.id);
                } else {
                    this.selectedWallPapers.put(wallPaper.id, obj);
                }
                if (this.selectedWallPapers.size() == 0) {
                    this.actionBar.hideActionMode();
                } else {
                    this.selectedMessagesCountTextView.setNumber(this.selectedWallPapers.size(), true);
                }
                this.scrolling = false;
                wallpaperCell.setChecked(i, this.selectedWallPapers.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        String wallPaperSlug = getWallPaperSlug(obj);
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            if (tL_wallPaper.pattern) {
                String str = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                int i2 = wallPaperSettings.background_color;
                int i3 = wallPaperSettings.second_background_color;
                int i4 = wallPaperSettings.third_background_color;
                int i5 = wallPaperSettings.fourth_background_color;
                int wallpaperRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                ColorWallpaper colorWallpaper = new ColorWallpaper(str, i2, i3, i4, i5, wallpaperRotation, wallPaperSettings2.intensity / 100.0f, wallPaperSettings2.motion, null);
                colorWallpaper.pattern = tL_wallPaper;
                colorWallpaper.parentWallpaper = tL_wallPaper;
                obj2 = colorWallpaper;
            } else {
                obj2 = obj;
            }
        } else {
            obj2 = obj;
        }
        ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(obj2, null, true, false) {
            @Override
            public boolean insideBottomSheet() {
                return true;
            }
        };
        if (this.currentType == 1 || this.dialogId != 0) {
            themePreviewActivity.setDelegate(new WallpapersListActivity$$ExternalSyntheticLambda0(this));
        }
        if (this.selectedBackgroundSlug.equals(wallPaperSlug)) {
            themePreviewActivity.setInitialModes(this.selectedBackgroundBlurred, this.selectedBackgroundMotion, this.selectedIntensity);
        }
        themePreviewActivity.setPatterns(this.patterns);
        themePreviewActivity.setDialogId(this.dialogId);
        showAsSheet(themePreviewActivity);
    }

    public boolean onItemLongClick(WallpaperCell wallpaperCell, Object obj, int i) {
        int i2 = this.currentType;
        if (i2 != 2 && i2 != 3) {
            Object obj2 = obj instanceof ColorWallpaper ? ((ColorWallpaper) obj).parentWallpaper : obj;
            if (!this.actionBar.isActionModeShowed() && getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                this.selectedWallPapers.put(((TLRPC.WallPaper) obj2).id, obj);
                this.selectedMessagesCountTextView.setNumber(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < this.actionModeViews.size(); i3++) {
                    View view = this.actionModeViews.get(i3);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.scrolling = false;
                this.actionBar.showActionMode();
                wallpaperCell.setChecked(i, true, true);
                return true;
            }
        }
        return false;
    }

    private void showAsSheet(ThemePreviewActivity themePreviewActivity) {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        themePreviewActivity.setResourceProvider(this.resourceProvider);
        bottomSheetParams.onOpenAnimationFinished = new OAuthSheet$$ExternalSyntheticLambda5(28);
        bottomSheetParams.occupyNavigationBar = true;
        showAsSheet(themePreviewActivity, bottomSheetParams);
    }

    private void updateRows() {
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
        if (this.wallPapers.isEmpty()) {
            this.wallPaperStartRow = -1;
        } else {
            int iCeil = (int) Math.ceil(this.wallPapers.size() / this.columnsCount);
            this.totalWallpaperRows = iCeil;
            int i2 = this.rowCount;
            this.wallPaperStartRow = i2;
            this.rowCount = i2 + iCeil;
        }
        if (this.currentType == 0) {
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
            listAdapter.notifyDataSetChanged();
        }
    }

    public void updateRowsSelection() {
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof WallpaperCell) {
                WallpaperCell wallpaperCell = (WallpaperCell) childAt;
                for (int i2 = 0; i2 < 5; i2++) {
                    wallpaperCell.setChecked(i2, false, true);
                }
            }
        }
    }

    @Override
    public View createView(Context context) {
        int i = 1;
        this.colorPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.colorFramePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.colorFramePaint.setStyle(Paint.Style.STROKE);
        this.colorFramePaint.setColor(855638016);
        this.updater = new WallpaperUpdater(getParentActivity(), this, new AnonymousClass1());
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
        if (this.currentType == 0) {
            ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onCaptionCleared() {
                    WallpapersListActivity.this.searchAdapter.clearColor();
                    WallpapersListActivity.this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
                }

                @Override
                public void onSearchCollapse() {
                    WallpapersListActivity.this.listView.setAdapter(WallpapersListActivity.this.listAdapter);
                    WallpapersListActivity.this.listView.invalidate();
                    WallpapersListActivity.this.searchAdapter.processSearch(null, true);
                    WallpapersListActivity.this.searchItem.setSearchFieldCaption(null);
                    onCaptionCleared();
                }

                @Override
                public void onSearchExpand() {
                    WallpapersListActivity.this.listView.setAdapter(WallpapersListActivity.this.searchAdapter);
                    WallpapersListActivity.this.listView.invalidate();
                }

                @Override
                public void onTextChanged(EditText editText) {
                    WallpapersListActivity.this.searchAdapter.processSearch(editText.getText().toString(), false);
                }
            });
            this.searchItem = actionBarMenuItemSearchListener;
            actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode(false, null);
            actionBarMenuCreateActionMode.setBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefault, false));
            ActionBar actionBar = this.actionBar;
            int i3 = Theme.key_actionBarDefaultIcon;
            actionBar.setItemsColor(Theme.getColor(null, i3, false), true);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefaultSelector, false), true);
            NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
            this.selectedMessagesCountTextView = numberTextView;
            numberTextView.setTextSize(18);
            this.selectedMessagesCountTextView.setTypeface(AndroidUtilities.bold());
            this.selectedMessagesCountTextView.setTextColor(Theme.getColor(null, i3, false));
            this.selectedMessagesCountTextView.setOnTouchListener(new TopicsFragment$$ExternalSyntheticLambda27(4));
            actionBarMenuCreateActionMode.addView(this.selectedMessagesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 65, 0, 0, 0));
            this.actionModeViews.add(actionBarMenuCreateActionMode.addItemWithWidth(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f)));
            this.actionModeViews.add(actionBarMenuCreateActionMode.addItemWithWidth(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.selectedWallPapers.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        int i4 = Theme.key_windowBackgroundGray;
        recyclerListView2.setBackgroundColor(getThemedColor(i4));
        this.listView.setClipToPadding(false);
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.lambda$onCellEnter$52(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView3 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, z) {
            {
                super(i, z);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView3.setLayoutManager(linearLayoutManager);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView4 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView4.setAdapter(listAdapter);
        this.searchAdapter = new SearchAdapter(context);
        this.listView.setGlowColor(Theme.getColor(null, Theme.key_avatar_backgroundActionBarBlue, false));
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda11(this, 13));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
                if (i5 == 1) {
                    AndroidUtilities.hideKeyboard(WallpapersListActivity.this.getParentActivity().getCurrentFocus());
                }
                WallpapersListActivity.this.scrolling = i5 != 0;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                if (WallpapersListActivity.this.listView.getAdapter() == WallpapersListActivity.this.searchAdapter) {
                    int iFindFirstVisibleItemPosition = WallpapersListActivity.this.layoutManager.findFirstVisibleItemPosition();
                    int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(WallpapersListActivity.this.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                    if (iAbs > 0) {
                        int itemCount = WallpapersListActivity.this.layoutManager.getItemCount();
                        if (iAbs == 0 || iFindFirstVisibleItemPosition + iAbs <= itemCount - 2) {
                            return;
                        }
                        WallpapersListActivity.this.searchAdapter.loadMoreResults();
                    }
                }
            }
        });
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.searchEmptyView = emptyTextProgressView;
        emptyTextProgressView.setVisibility(8);
        this.searchEmptyView.setShowAtCenter(true);
        this.searchEmptyView.setBackgroundColor(Theme.getColor(null, i4, false));
        this.searchEmptyView.setText(LocaleController.getString(R.string.NoResult));
        this.listView.setEmptyView(this.searchEmptyView);
        frameLayout.addView(this.searchEmptyView, LayoutHelper.createFrame(-1, -1.0f));
        updateRows();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.WallPaperSettings wallPaperSettings;
        int i3;
        int i4;
        ColorWallpaper colorWallpaper;
        TLRPC.WallPaperSettings wallPaperSettings2;
        String hash;
        int i5;
        boolean z;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.WallPaperSettings wallPaperSettings4;
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
                actionBar.closeSearchField();
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.patterns.clear();
        this.patternsDict.clear();
        int i6 = this.currentType;
        if (i6 != 1 && i6 != 2) {
            this.wallPapers.clear();
            this.localWallPapers.clear();
            this.localDict.clear();
            this.allWallPapers.clear();
            this.allWallPapersDict.clear();
            this.allWallPapers.addAll(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i7);
            if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                if (wallPaper instanceof TLRPC.TL_wallPaper) {
                    TLRPC.Document document = wallPaper.document;
                    if (document instanceof TLRPC.TL_documentEmpty) {
                        wallPaperSettings = wallPaper.settings;
                        i3 = wallPaperSettings.background_color;
                        if (i3 == 0) {
                            i4 = wallPaperSettings.second_background_color;
                            if (i4 != 0 || (i5 = wallPaperSettings.third_background_color) == 0) {
                                colorWallpaper = new ColorWallpaper(null, i3, i4, wallPaperSettings.rotation);
                            } else {
                                colorWallpaper = new ColorWallpaper(null, i3, i4, i5, wallPaperSettings.fourth_background_color);
                            }
                            colorWallpaper.slug = wallPaper.slug;
                            TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper.settings;
                            colorWallpaper.intensity = wallPaperSettings5.intensity / 100.0f;
                            colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings5.rotation, false);
                            colorWallpaper.parentWallpaper = wallPaper;
                            if (wallPaper.id < 0) {
                                hash = colorWallpaper.getHash();
                                if (this.localDict.containsKey(hash)) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(wallPaper);
                                } else {
                                    this.localWallPapers.add(colorWallpaper);
                                    this.localDict.put(hash, colorWallpaper);
                                    if (Theme.currentTheme.isDark() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0) {
                                        this.wallPapers.add(colorWallpaper);
                                    }
                                }
                            } else if (Theme.currentTheme.isDark()) {
                                this.wallPapers.add(colorWallpaper);
                            } else {
                                this.wallPapers.add(colorWallpaper);
                            }
                        }
                    } else {
                        if (wallPaper.pattern && document != null && !this.patternsDict.containsKey(Long.valueOf(document.id))) {
                            this.patterns.add(wallPaper);
                            this.patternsDict.put(Long.valueOf(wallPaper.document.id), wallPaper);
                        }
                        this.allWallPapersDict.put(wallPaper.slug, wallPaper);
                        int i8 = this.currentType;
                        if (i8 != 1 && ((!(z = wallPaper.pattern) || ((wallPaperSettings4 = wallPaper.settings) != null && wallPaperSettings4.background_color != 0)) && ((i8 != 2 || z) && (Theme.currentTheme.isDark() || (wallPaperSettings3 = wallPaper.settings) == null || wallPaperSettings3.intensity >= 0)))) {
                            this.wallPapers.add(wallPaper);
                        }
                    }
                } else {
                    wallPaperSettings = wallPaper.settings;
                    i3 = wallPaperSettings.background_color;
                    if (i3 == 0) {
                        i4 = wallPaperSettings.second_background_color;
                        if (i4 != 0) {
                            colorWallpaper = new ColorWallpaper(null, i3, i4, wallPaperSettings.rotation);
                        } else {
                            colorWallpaper = new ColorWallpaper(null, i3, i4, wallPaperSettings.rotation);
                        }
                        colorWallpaper.slug = wallPaper.slug;
                        TLRPC.WallPaperSettings wallPaperSettings6 = wallPaper.settings;
                        colorWallpaper.intensity = wallPaperSettings6.intensity / 100.0f;
                        colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings6.rotation, false);
                        colorWallpaper.parentWallpaper = wallPaper;
                        if (wallPaper.id < 0) {
                            hash = colorWallpaper.getHash();
                            if (this.localDict.containsKey(hash)) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(wallPaper);
                            } else {
                                this.localWallPapers.add(colorWallpaper);
                                this.localDict.put(hash, colorWallpaper);
                                if (Theme.currentTheme.isDark()) {
                                    this.wallPapers.add(colorWallpaper);
                                } else {
                                    this.wallPapers.add(colorWallpaper);
                                }
                            }
                        } else if (Theme.currentTheme.isDark()) {
                            this.wallPapers.add(colorWallpaper);
                        } else {
                            this.wallPapers.add(colorWallpaper);
                        }
                    }
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList2.get(i9)).id);
            }
        }
        if (this.dialogId == 0) {
            this.selectedBackgroundSlug = Theme.getSelectedBackgroundSlug();
        }
        fillWallpapersWithCustom();
        loadWallpapers(false);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        this.updater.onActivityResult(i, i2, intent);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fixLayout();
    }

    @Override
    public boolean onFragmentCreate() {
        int i = this.currentType;
        if (i == 0 || i == 2) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        } else {
            fillDefaultColors(this.wallPapers, Theme.currentTheme.isDark());
            if (this.currentType == 1 && this.patterns.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        int i = this.currentType;
        if (i == 0 || i == 2) {
            this.searchAdapter.onDestroy();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        } else if (i == 1) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        this.updater.cleanup();
        super.onFragmentDestroy();
    }

    @Override
    public void onResume() {
        TLRPC.WallPaper wallPaper;
        super.onResume();
        MessagesController.getGlobalMainSettings();
        Theme.ThemeInfo themeInfo = Theme.currentTheme;
        if (this.dialogId != 0) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.dialogId);
            if (userFull != null && (wallPaper = userFull.wallpaper) != null) {
                String str = wallPaper.slug;
                this.selectedBackgroundSlug = str;
                if (str == null) {
                    this.selectedBackgroundSlug = "";
                }
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null) {
                    this.selectedColor = wallPaperSettings.background_color;
                    this.selectedGradientColor1 = wallPaperSettings.second_background_color;
                    this.selectedGradientColor2 = wallPaperSettings.third_background_color;
                    this.selectedGradientColor3 = wallPaperSettings.fourth_background_color;
                    this.selectedGradientRotation = wallPaperSettings.rotation;
                    this.selectedIntensity = wallPaperSettings.intensity;
                    this.selectedBackgroundMotion = wallPaperSettings.motion;
                    this.selectedBackgroundBlurred = wallPaperSettings.blur;
                }
            }
        } else {
            Theme.OverrideWallpaperInfo overrideWallpaperInfo = themeInfo.overrideWallpaper;
            if (overrideWallpaperInfo != null) {
                String str2 = overrideWallpaperInfo.slug;
                this.selectedBackgroundSlug = str2;
                if (str2 == null) {
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
        }
        fillWallpapersWithCustom();
        fixLayout();
    }

    @Override
    public void restoreSelfArgs(Bundle bundle) {
        this.updater.setCurrentPicturePath(bundle.getString("path"));
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        String currentPicturePath = this.updater.getCurrentPicturePath();
        if (currentPicturePath != null) {
            bundle.putString("path", currentPicturePath);
        }
    }

    public static class FileWallpaper {
        public File originalPath;
        public File path;
        public int resId;
        public String slug;
        public int thumbResId;

        public FileWallpaper(String str, File file, File file2) {
            this.slug = str;
            this.path = file;
            this.originalPath = file2;
        }

        public FileWallpaper(String str, String str2) {
            this.slug = str;
            this.path = new File(str2);
        }

        public FileWallpaper(String str, int i, int i2) {
            this.slug = str;
            this.resId = i;
            this.thumbResId = i2;
        }
    }

    public static class ColorWallpaper {
        public int color;
        public Bitmap defaultCache;
        public int gradientColor1;
        public int gradientColor2;
        public int gradientColor3;
        public int gradientRotation;
        public float intensity;
        public boolean isGradient;
        public boolean motion;
        public TLRPC.WallPaper parentWallpaper;
        public File path;
        public TLRPC.TL_wallPaper pattern;
        public long patternId;
        public String slug;

        public ColorWallpaper(String str, int i, int i2, int i3) {
            this.slug = str;
            this.color = i | (-16777216);
            int i4 = i2 == 0 ? 0 : (-16777216) | i2;
            this.gradientColor1 = i4;
            this.gradientRotation = i4 == 0 ? 0 : i3;
            this.intensity = 1.0f;
        }

        public String getHash() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.color));
            sb.append(this.gradientColor1);
            sb.append(this.gradientColor2);
            sb.append(this.gradientColor3);
            sb.append(this.gradientRotation);
            sb.append(this.intensity);
            String str = this.slug;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return Utilities.MD5(sb.toString());
        }

        public String getUrl() {
            int i = this.gradientColor1;
            String lowerCase = i != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i >> 16)) & 255), Integer.valueOf(((byte) (this.gradientColor1 >> 8)) & 255), Byte.valueOf((byte) (this.gradientColor1 & 255))).toLowerCase() : null;
            String lowerCase2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (this.color >> 16)) & 255), Integer.valueOf(((byte) (this.color >> 8)) & 255), Byte.valueOf((byte) (this.color & 255))).toLowerCase();
            int i2 = this.gradientColor2;
            String lowerCase3 = i2 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i2 >> 16)) & 255), Integer.valueOf(((byte) (this.gradientColor2 >> 8)) & 255), Byte.valueOf((byte) (this.gradientColor2 & 255))).toLowerCase() : null;
            int i3 = this.gradientColor3;
            String lowerCase4 = i3 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i3 >> 16)) & 255), Integer.valueOf(((byte) (this.gradientColor3 >> 8)) & 255), Byte.valueOf((byte) (this.gradientColor3 & 255))).toLowerCase() : null;
            if (lowerCase == null || lowerCase3 == null) {
                if (lowerCase != null) {
                    String strM = zziq.m(lowerCase2, "-", lowerCase);
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
                return Fragment$$ExternalSyntheticOutline0.m(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase2, new StringBuilder("https://"));
            }
            String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.pattern.slug + "?intensity=" + ((int) (this.intensity * 100.0f)) + "&bg_color=" + lowerCase2;
            return this.motion ? zzhp.m(str, "&mode=motion") : str;
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

        public ColorWallpaper(String str, int i) {
            this.slug = str;
            int i2 = (-16777216) | i;
            this.color = i2;
            float[] fArr = new float[3];
            Color.colorToHSV(i2, fArr);
            float f = fArr[0];
            if (f > 180.0f) {
                fArr[0] = f - 60.0f;
            } else {
                fArr[0] = f + 60.0f;
            }
            this.gradientColor1 = Color.HSVToColor(255, fArr);
            this.gradientColor2 = ColorPicker.generateGradientColors(this.color);
            this.gradientColor3 = ColorPicker.generateGradientColors(this.gradientColor1);
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

    public WallpapersListActivity(int i) {
        this(i, 0L);
    }
}
