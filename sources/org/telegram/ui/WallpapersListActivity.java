package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildConfig;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_account_getWallPapers;
import org.telegram.tgnet.TLRPC$TL_account_saveWallPaper;
import org.telegram.tgnet.TLRPC$TL_account_wallPapers;
import org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_inputWallPaper;
import org.telegram.tgnet.TLRPC$TL_inputWallPaperNoFile;
import org.telegram.tgnet.TLRPC$TL_messages_getInlineBotResults;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$TL_wallPaperNoFile;
import org.telegram.tgnet.TLRPC$TL_wallPaperSettings;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.TLRPC$WallPaperSettings;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.tgnet.TLRPC$messages_BotResults;
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
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.WallpaperUpdater;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.WallpapersListActivity;
public class WallpapersListActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
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

    public static class EmojiWallpaper {
        public final String emoticon;
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
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
        public TLRPC$WallPaper parentWallpaper;
        public File path;
        public TLRPC$TL_wallPaper pattern;
        public long patternId;
        public String slug;

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
                str = BuildConfig.APP_CENTER_HASH;
            }
            sb.append(str);
            return Utilities.MD5(sb.toString());
        }

        public ColorWallpaper(String str, int i, int i2, int i3) {
            this.slug = str;
            this.color = i | (-16777216);
            int i4 = i2 == 0 ? 0 : (-16777216) | i2;
            this.gradientColor1 = i4;
            this.gradientRotation = i4 == 0 ? 0 : i3;
            this.intensity = 1.0f;
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
                    String str = lowerCase2 + "-" + lowerCase;
                    if (this.pattern != null) {
                        lowerCase2 = str + "&rotation=" + AndroidUtilities.getWallpaperRotation(this.gradientRotation, true);
                    } else {
                        lowerCase2 = str + "?rotation=" + AndroidUtilities.getWallpaperRotation(this.gradientRotation, true);
                    }
                }
            } else if (lowerCase4 != null) {
                lowerCase2 = lowerCase2 + "~" + lowerCase + "~" + lowerCase3 + "~" + lowerCase4;
            } else {
                lowerCase2 = lowerCase2 + "~" + lowerCase + "~" + lowerCase3;
            }
            if (this.pattern != null) {
                String str2 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.pattern.slug + "?intensity=" + ((int) (this.intensity * 100.0f)) + "&bg_color=" + lowerCase2;
                if (this.motion) {
                    return str2 + "&mode=motion";
                }
                return str2;
            }
            return "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + lowerCase2;
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

        public FileWallpaper(String str, int i, int i2) {
            this.slug = str;
            this.resId = i;
            this.thumbResId = i2;
        }
    }

    public WallpapersListActivity(int i) {
        this(i, 0L);
    }

    public WallpapersListActivity(int i, long j) {
        this.actionModeViews = new ArrayList<>();
        this.columnsCount = 3;
        this.selectedBackgroundSlug = BuildConfig.APP_CENTER_HASH;
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

    @Override
    public boolean onFragmentCreate() {
        int i = this.currentType;
        if (i == 0 || i == 2) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        } else {
            fillDefaultColors(this.wallPapers, Theme.isCurrentThemeDark());
            if (this.currentType == 1 && this.patterns.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    public static void fillDefaultColors(ArrayList<Object> arrayList, boolean z) {
        int[][] iArr = z ? defaultColorsDark : defaultColorsLight;
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i].length == 1) {
                arrayList.add(new ColorWallpaper("c", iArr[i][0], 0, 45));
            } else {
                arrayList.add(new ColorWallpaper("c", iArr[i][0], iArr[i][1], iArr[i][2], iArr[i][3]));
            }
        }
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
    public View createView(Context context) {
        this.colorPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.colorFramePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.colorFramePaint.setStyle(Paint.Style.STROKE);
        this.colorFramePaint.setColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
        this.updater = new WallpaperUpdater(getParentActivity(), this, new AnonymousClass1());
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2());
        if (this.currentType == 0) {
            ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onSearchExpand() {
                    WallpapersListActivity.this.listView.setAdapter(WallpapersListActivity.this.searchAdapter);
                    WallpapersListActivity.this.listView.invalidate();
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
                public void onTextChanged(EditText editText) {
                    WallpapersListActivity.this.searchAdapter.processSearch(editText.getText().toString(), false);
                }

                @Override
                public void onCaptionCleared() {
                    WallpapersListActivity.this.searchAdapter.clearColor();
                    WallpapersListActivity.this.searchItem.setSearchFieldHint(LocaleController.getString("SearchBackgrounds", R.string.SearchBackgrounds));
                }
            });
            this.searchItem = actionBarMenuItemSearchListener;
            actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("SearchBackgrounds", R.string.SearchBackgrounds));
            ActionBarMenu createActionMode = this.actionBar.createActionMode(false, null);
            createActionMode.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefault));
            ActionBar actionBar = this.actionBar;
            int i2 = Theme.key_actionBarDefaultIcon;
            actionBar.setItemsColor(Theme.getColor(i2), true);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSelector), true);
            NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
            this.selectedMessagesCountTextView = numberTextView;
            numberTextView.setTextSize(18);
            this.selectedMessagesCountTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.selectedMessagesCountTextView.setTextColor(Theme.getColor(i2));
            this.selectedMessagesCountTextView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$createView$0;
                    lambda$createView$0 = WallpapersListActivity.lambda$createView$0(view, motionEvent);
                    return lambda$createView$0;
                }
            });
            createActionMode.addView(this.selectedMessagesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 65, 0, 0, 0));
            this.actionModeViews.add(createActionMode.addItemWithWidth(3, R.drawable.msg_forward, AndroidUtilities.dp(54.0f), LocaleController.getString("Forward", R.string.Forward)));
            this.actionModeViews.add(createActionMode.addItemWithWidth(4, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString("Delete", R.string.Delete)));
            this.selectedWallPapers.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            private Paint paint = new Paint();

            @Override
            public boolean hasOverlappingRendering() {
                return false;
            }

            @Override
            public void onDraw(android.graphics.Canvas r15) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.WallpapersListActivity.AnonymousClass4.onDraw(android.graphics.Canvas):void");
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipToPadding(false);
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, context, 1, false) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.searchAdapter = new SearchAdapter(context);
        this.listView.setGlowColor(Theme.getColor(Theme.key_avatar_backgroundActionBarBlue));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                WallpapersListActivity.this.lambda$createView$4(view, i3);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                if (i3 == 1) {
                    AndroidUtilities.hideKeyboard(WallpapersListActivity.this.getParentActivity().getCurrentFocus());
                }
                WallpapersListActivity.this.scrolling = i3 != 0;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                if (WallpapersListActivity.this.listView.getAdapter() == WallpapersListActivity.this.searchAdapter) {
                    int findFirstVisibleItemPosition = WallpapersListActivity.this.layoutManager.findFirstVisibleItemPosition();
                    int abs = findFirstVisibleItemPosition == -1 ? 0 : Math.abs(WallpapersListActivity.this.layoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1;
                    if (abs > 0) {
                        int itemCount = WallpapersListActivity.this.layoutManager.getItemCount();
                        if (abs == 0 || findFirstVisibleItemPosition + abs <= itemCount - 2) {
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
        this.searchEmptyView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.searchEmptyView.setText(LocaleController.getString("NoResult", R.string.NoResult));
        this.listView.setEmptyView(this.searchEmptyView);
        frameLayout2.addView(this.searchEmptyView, LayoutHelper.createFrame(-1, -1.0f));
        updateRows();
        return this.fragmentView;
    }

    public class AnonymousClass1 implements WallpaperUpdater.WallpaperUpdaterDelegate {
        @Override
        public void needOpenColorPicker() {
        }

        AnonymousClass1() {
        }

        @Override
        public void didSelectWallpaper(File file, Bitmap bitmap, boolean z) {
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(new FileWallpaper(BuildConfig.APP_CENTER_HASH, file, file), bitmap);
            themePreviewActivity.setDialogId(WallpapersListActivity.this.dialogId);
            if (WallpapersListActivity.this.dialogId != 0) {
                themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                    @Override
                    public final void didSetNewBackground(TLRPC$WallPaper tLRPC$WallPaper) {
                        WallpapersListActivity.AnonymousClass1.this.lambda$didSelectWallpaper$0(tLRPC$WallPaper);
                    }
                });
            }
            WallpapersListActivity.this.presentFragment(themePreviewActivity, z);
        }

        public void lambda$didSelectWallpaper$0(TLRPC$WallPaper tLRPC$WallPaper) {
            WallpapersListActivity.this.removeSelfFromStack();
        }
    }

    public class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass2() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (((BaseFragment) WallpapersListActivity.this).actionBar.isActionModeShowed()) {
                    WallpapersListActivity.this.selectedWallPapers.clear();
                    ((BaseFragment) WallpapersListActivity.this).actionBar.hideActionMode();
                    WallpapersListActivity.this.updateRowsSelection();
                    return;
                }
                WallpapersListActivity.this.finishFragment();
            } else if (i != 4) {
                if (i == 3) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putInt("dialogsType", 3);
                    DialogsActivity dialogsActivity = new DialogsActivity(bundle);
                    dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                        @Override
                        public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
                            boolean lambda$onItemClick$3;
                            lambda$onItemClick$3 = WallpapersListActivity.AnonymousClass2.this.lambda$onItemClick$3(dialogsActivity2, arrayList, charSequence, z, topicsFragment);
                            return lambda$onItemClick$3;
                        }
                    });
                    WallpapersListActivity.this.presentFragment(dialogsActivity);
                }
            } else if (WallpapersListActivity.this.getParentActivity() == null) {
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(WallpapersListActivity.this.getParentActivity());
                builder.setTitle(LocaleController.formatPluralString("DeleteBackground", WallpapersListActivity.this.selectedWallPapers.size(), new Object[0]));
                builder.setMessage(LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]));
                builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        WallpapersListActivity.AnonymousClass2.this.lambda$onItemClick$2(dialogInterface, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog create = builder.create();
                WallpapersListActivity.this.showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                }
            }
        }

        public void lambda$onItemClick$2(DialogInterface dialogInterface, int i) {
            WallpapersListActivity.this.progressDialog = new AlertDialog(WallpapersListActivity.this.getParentActivity(), 3);
            WallpapersListActivity.this.progressDialog.setCanCancel(false);
            WallpapersListActivity.this.progressDialog.show();
            new ArrayList();
            final int[] iArr = {0};
            for (int i2 = 0; i2 < WallpapersListActivity.this.selectedWallPapers.size(); i2++) {
                Object valueAt = WallpapersListActivity.this.selectedWallPapers.valueAt(i2);
                if (valueAt instanceof ColorWallpaper) {
                    ColorWallpaper colorWallpaper = (ColorWallpaper) valueAt;
                    TLRPC$WallPaper tLRPC$WallPaper = colorWallpaper.parentWallpaper;
                    if (tLRPC$WallPaper == null || tLRPC$WallPaper.id >= 0) {
                        valueAt = tLRPC$WallPaper;
                    } else {
                        WallpapersListActivity.this.getMessagesStorage().deleteWallpaper(colorWallpaper.parentWallpaper.id);
                        WallpapersListActivity.this.localWallPapers.remove(colorWallpaper);
                        WallpapersListActivity.this.localDict.remove(colorWallpaper.getHash());
                    }
                }
                if (valueAt instanceof TLRPC$WallPaper) {
                    iArr[0] = iArr[0] + 1;
                    TLRPC$WallPaper tLRPC$WallPaper2 = (TLRPC$WallPaper) valueAt;
                    TLRPC$TL_account_saveWallPaper tLRPC$TL_account_saveWallPaper = new TLRPC$TL_account_saveWallPaper();
                    tLRPC$TL_account_saveWallPaper.settings = new TLRPC$TL_wallPaperSettings();
                    tLRPC$TL_account_saveWallPaper.unsave = true;
                    if (valueAt instanceof TLRPC$TL_wallPaperNoFile) {
                        TLRPC$TL_inputWallPaperNoFile tLRPC$TL_inputWallPaperNoFile = new TLRPC$TL_inputWallPaperNoFile();
                        tLRPC$TL_inputWallPaperNoFile.id = tLRPC$WallPaper2.id;
                        tLRPC$TL_account_saveWallPaper.wallpaper = tLRPC$TL_inputWallPaperNoFile;
                    } else {
                        TLRPC$TL_inputWallPaper tLRPC$TL_inputWallPaper = new TLRPC$TL_inputWallPaper();
                        tLRPC$TL_inputWallPaper.id = tLRPC$WallPaper2.id;
                        tLRPC$TL_inputWallPaper.access_hash = tLRPC$WallPaper2.access_hash;
                        tLRPC$TL_account_saveWallPaper.wallpaper = tLRPC$TL_inputWallPaper;
                    }
                    String str = tLRPC$WallPaper2.slug;
                    if (str != null && str.equals(WallpapersListActivity.this.selectedBackgroundSlug)) {
                        WallpapersListActivity.this.selectedBackgroundSlug = Theme.hasWallpaperFromTheme() ? "t" : "d";
                        Theme.getActiveTheme().setOverrideWallpaper(null);
                        Theme.reloadWallpaper(true);
                    }
                    ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(tLRPC$TL_account_saveWallPaper, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            WallpapersListActivity.AnonymousClass2.this.lambda$onItemClick$1(iArr, tLObject, tLRPC$TL_error);
                        }
                    });
                }
            }
            if (iArr[0] == 0) {
                WallpapersListActivity.this.loadWallpapers(true);
            }
            WallpapersListActivity.this.selectedWallPapers.clear();
            ((BaseFragment) WallpapersListActivity.this).actionBar.hideActionMode();
            ((BaseFragment) WallpapersListActivity.this).actionBar.closeSearchField();
        }

        public void lambda$onItemClick$1(final int[] iArr, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    WallpapersListActivity.AnonymousClass2.this.lambda$onItemClick$0(iArr);
                }
            });
        }

        public void lambda$onItemClick$0(int[] iArr) {
            iArr[0] = iArr[0] - 1;
            if (iArr[0] == 0) {
                WallpapersListActivity.this.loadWallpapers(true);
            }
        }

        public boolean lambda$onItemClick$3(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
            long j;
            String url;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < WallpapersListActivity.this.selectedWallPapers.size(); i++) {
                Object valueAt = WallpapersListActivity.this.selectedWallPapers.valueAt(i);
                if (valueAt instanceof TLRPC$TL_wallPaper) {
                    url = AndroidUtilities.getWallPaperUrl(valueAt);
                } else if (valueAt instanceof ColorWallpaper) {
                    url = ((ColorWallpaper) valueAt).getUrl();
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
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    long j2 = ((MessagesStorage.TopicKey) arrayList.get(i2)).dialogId;
                    if (charSequence != null) {
                        j = j2;
                        SendMessagesHelper.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, null, false));
                    } else {
                        j = j2;
                    }
                    if (!TextUtils.isEmpty(sb)) {
                        SendMessagesHelper.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j, null, null, null, true, null, null, null, true, 0, null, false));
                    }
                }
                dialogsActivity.finishFragment();
            } else {
                long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j3)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
                } else {
                    if (DialogObject.isUserDialog(j3)) {
                        bundle.putLong("user_id", j3);
                    } else if (DialogObject.isChatDialog(j3)) {
                        bundle.putLong("chat_id", -j3);
                    }
                    if (!MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).checkCanOpenChat(bundle, dialogsActivity)) {
                        return true;
                    }
                }
                NotificationCenter.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                WallpapersListActivity.this.presentFragment(new ChatActivity(bundle), true);
                SendMessagesHelper.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j3, null, null, null, true, null, null, null, true, 0, null, false));
            }
            return true;
        }
    }

    public void lambda$createView$4(View view, int i) {
        if (getParentActivity() == null || this.listView.getAdapter() == this.searchAdapter) {
            return;
        }
        if (i == this.uploadImageRow) {
            this.updater.openGallery();
        } else if (i == this.setColorRow) {
            WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(1);
            wallpapersListActivity.patterns = this.patterns;
            presentFragment(wallpapersListActivity);
        } else if (i == this.resetRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("ResetChatBackgroundsAlertTitle", R.string.ResetChatBackgroundsAlertTitle));
            builder.setMessage(LocaleController.getString("ResetChatBackgroundsAlert", R.string.ResetChatBackgroundsAlert));
            builder.setPositiveButton(LocaleController.getString("Reset", R.string.Reset), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    WallpapersListActivity.this.lambda$createView$3(dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create = builder.create();
            showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
    }

    public void lambda$createView$3(DialogInterface dialogInterface, int i) {
        if (this.actionBar.isActionModeShowed()) {
            this.selectedWallPapers.clear();
            this.actionBar.hideActionMode();
            updateRowsSelection();
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
        this.progressDialog = alertDialog;
        alertDialog.setCanCancel(false);
        this.progressDialog.show();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i2, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1153722364);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                WallpapersListActivity.this.lambda$createView$2(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$1() {
        loadWallpapers(false);
    }

    public void lambda$createView$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WallpapersListActivity.this.lambda$createView$1();
            }
        });
    }

    @Override
    public void onResume() {
        TLRPC$WallPaper tLRPC$WallPaper;
        super.onResume();
        MessagesController.getGlobalMainSettings();
        Theme.ThemeInfo activeTheme = Theme.getActiveTheme();
        if (this.dialogId != 0) {
            TLRPC$UserFull userFull = getMessagesController().getUserFull(this.dialogId);
            if (userFull != null && (tLRPC$WallPaper = userFull.wallpaper) != null) {
                String str = tLRPC$WallPaper.slug;
                this.selectedBackgroundSlug = str;
                if (str == null) {
                    this.selectedBackgroundSlug = BuildConfig.APP_CENTER_HASH;
                }
                TLRPC$WallPaperSettings tLRPC$WallPaperSettings = tLRPC$WallPaper.settings;
                if (tLRPC$WallPaperSettings != null) {
                    this.selectedColor = tLRPC$WallPaperSettings.background_color;
                    this.selectedGradientColor1 = tLRPC$WallPaperSettings.second_background_color;
                    this.selectedGradientColor2 = tLRPC$WallPaperSettings.third_background_color;
                    this.selectedGradientColor3 = tLRPC$WallPaperSettings.fourth_background_color;
                    this.selectedGradientRotation = tLRPC$WallPaperSettings.rotation;
                    this.selectedIntensity = tLRPC$WallPaperSettings.intensity;
                    this.selectedBackgroundMotion = tLRPC$WallPaperSettings.motion;
                    this.selectedBackgroundBlurred = tLRPC$WallPaperSettings.blur;
                }
            }
        } else {
            Theme.OverrideWallpaperInfo overrideWallpaperInfo = activeTheme.overrideWallpaper;
            if (overrideWallpaperInfo != null) {
                String str2 = overrideWallpaperInfo.slug;
                this.selectedBackgroundSlug = str2;
                if (str2 == null) {
                    this.selectedBackgroundSlug = BuildConfig.APP_CENTER_HASH;
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
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fixLayout();
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        this.updater.onActivityResult(i, i2, intent);
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        String currentPicturePath = this.updater.getCurrentPicturePath();
        if (currentPicturePath != null) {
            bundle.putString("path", currentPicturePath);
        }
    }

    public void restoreSelfArgs(Bundle bundle) {
        this.updater.setCurrentPicturePath(bundle.getString("path"));
    }

    public boolean onItemLongClick(WallpaperCell wallpaperCell, Object obj, int i) {
        int i2 = this.currentType;
        if (i2 != 2 && i2 != 3) {
            Object obj2 = obj instanceof ColorWallpaper ? ((ColorWallpaper) obj).parentWallpaper : obj;
            if (!this.actionBar.isActionModeShowed() && getParentActivity() != null && (obj2 instanceof TLRPC$WallPaper)) {
                AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                this.selectedWallPapers.put(((TLRPC$WallPaper) obj2).id, obj);
                this.selectedMessagesCountTextView.setNumber(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < this.actionModeViews.size(); i3++) {
                    View view = this.actionModeViews.get(i3);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
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

    public void onItemClick(WallpaperCell wallpaperCell, Object obj, int i) {
        WallpaperCell wallpaperCell2;
        int i2;
        Object obj2 = obj;
        boolean z = false;
        if (this.actionBar.isActionModeShowed()) {
            Object obj3 = obj2 instanceof ColorWallpaper ? ((ColorWallpaper) obj2).parentWallpaper : obj2;
            if (obj3 instanceof TLRPC$WallPaper) {
                TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) obj3;
                if (this.selectedWallPapers.indexOfKey(tLRPC$WallPaper.id) >= 0) {
                    this.selectedWallPapers.remove(tLRPC$WallPaper.id);
                } else {
                    this.selectedWallPapers.put(tLRPC$WallPaper.id, obj2);
                }
                if (this.selectedWallPapers.size() == 0) {
                    this.actionBar.hideActionMode();
                } else {
                    this.selectedMessagesCountTextView.setNumber(this.selectedWallPapers.size(), true);
                }
                this.scrolling = false;
                if (this.selectedWallPapers.indexOfKey(tLRPC$WallPaper.id) >= 0) {
                    wallpaperCell2 = wallpaperCell;
                    i2 = i;
                    z = true;
                } else {
                    wallpaperCell2 = wallpaperCell;
                    i2 = i;
                }
                wallpaperCell2.setChecked(i2, z, true);
                return;
            }
            return;
        }
        String wallPaperSlug = getWallPaperSlug(obj2);
        boolean z2 = obj2 instanceof TLRPC$TL_wallPaper;
        ColorWallpaper colorWallpaper = obj2;
        if (z2) {
            TLRPC$TL_wallPaper tLRPC$TL_wallPaper = (TLRPC$TL_wallPaper) obj2;
            colorWallpaper = obj2;
            if (tLRPC$TL_wallPaper.pattern) {
                String str = tLRPC$TL_wallPaper.slug;
                TLRPC$WallPaperSettings tLRPC$WallPaperSettings = tLRPC$TL_wallPaper.settings;
                int i3 = tLRPC$WallPaperSettings.background_color;
                int i4 = tLRPC$WallPaperSettings.second_background_color;
                int i5 = tLRPC$WallPaperSettings.third_background_color;
                int i6 = tLRPC$WallPaperSettings.fourth_background_color;
                int wallpaperRotation = AndroidUtilities.getWallpaperRotation(tLRPC$WallPaperSettings.rotation, false);
                TLRPC$WallPaperSettings tLRPC$WallPaperSettings2 = tLRPC$TL_wallPaper.settings;
                ColorWallpaper colorWallpaper2 = new ColorWallpaper(str, i3, i4, i5, i6, wallpaperRotation, tLRPC$WallPaperSettings2.intensity / 100.0f, tLRPC$WallPaperSettings2.motion, null);
                colorWallpaper2.pattern = tLRPC$TL_wallPaper;
                colorWallpaper2.parentWallpaper = tLRPC$TL_wallPaper;
                colorWallpaper = colorWallpaper2;
            }
        }
        ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(this, colorWallpaper, null, true, false) {
            @Override
            public boolean insideBottomSheet() {
                return true;
            }
        };
        if (this.currentType == 1 || this.dialogId != 0) {
            themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                @Override
                public final void didSetNewBackground(TLRPC$WallPaper tLRPC$WallPaper2) {
                    WallpapersListActivity.this.lambda$onItemClick$5(tLRPC$WallPaper2);
                }
            });
        }
        if (this.selectedBackgroundSlug.equals(wallPaperSlug)) {
            themePreviewActivity.setInitialModes(this.selectedBackgroundBlurred, this.selectedBackgroundMotion, this.selectedIntensity);
        }
        themePreviewActivity.setPatterns(this.patterns);
        themePreviewActivity.setDialogId(this.dialogId);
        showAsSheet(themePreviewActivity);
    }

    public void lambda$onItemClick$5(TLRPC$WallPaper tLRPC$WallPaper) {
        removeSelfFromStack();
    }

    private void showAsSheet(ThemePreviewActivity themePreviewActivity) {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        themePreviewActivity.setResourceProvider(this.resourceProvider);
        bottomSheetParams.onOpenAnimationFinished = new Runnable() {
            @Override
            public final void run() {
                WallpapersListActivity.lambda$showAsSheet$6();
            }
        };
        bottomSheetParams.occupyNavigationBar = true;
        showAsSheet(themePreviewActivity, bottomSheetParams);
    }

    public static void lambda$showAsSheet$6() {
        PhotoViewer.getInstance().closePhoto(false, false);
    }

    private String getWallPaperSlug(Object obj) {
        if (obj instanceof TLRPC$TL_wallPaper) {
            return ((TLRPC$TL_wallPaper) obj).slug;
        }
        if (obj instanceof ColorWallpaper) {
            return ((ColorWallpaper) obj).slug;
        }
        if (obj instanceof FileWallpaper) {
            return ((FileWallpaper) obj).slug;
        }
        return null;
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
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ColorWallpaper colorWallpaper;
        TLRPC$WallPaperSettings tLRPC$WallPaperSettings;
        int i3;
        boolean z;
        TLRPC$WallPaperSettings tLRPC$WallPaperSettings2;
        TLRPC$WallPaperSettings tLRPC$WallPaperSettings3;
        if (i == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList = (ArrayList) objArr[0];
            this.patterns.clear();
            this.patternsDict.clear();
            int i4 = this.currentType;
            if (i4 != 1 && i4 != 2) {
                this.wallPapers.clear();
                this.localWallPapers.clear();
                this.localDict.clear();
                this.allWallPapers.clear();
                this.allWallPapersDict.clear();
                this.allWallPapers.addAll(arrayList);
            }
            int size = arrayList.size();
            ArrayList arrayList2 = null;
            for (int i5 = 0; i5 < size; i5++) {
                TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) arrayList.get(i5);
                if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(tLRPC$WallPaper.slug)) {
                    if (tLRPC$WallPaper instanceof TLRPC$TL_wallPaper) {
                        TLRPC$Document tLRPC$Document = tLRPC$WallPaper.document;
                        if (!(tLRPC$Document instanceof TLRPC$TL_documentEmpty)) {
                            if (tLRPC$WallPaper.pattern && tLRPC$Document != null && !this.patternsDict.containsKey(Long.valueOf(tLRPC$Document.id))) {
                                this.patterns.add(tLRPC$WallPaper);
                                this.patternsDict.put(Long.valueOf(tLRPC$WallPaper.document.id), tLRPC$WallPaper);
                            }
                            this.allWallPapersDict.put(tLRPC$WallPaper.slug, tLRPC$WallPaper);
                            int i6 = this.currentType;
                            if (i6 != 1 && ((!(z = tLRPC$WallPaper.pattern) || ((tLRPC$WallPaperSettings3 = tLRPC$WallPaper.settings) != null && tLRPC$WallPaperSettings3.background_color != 0)) && ((i6 != 2 || z) && (Theme.isCurrentThemeDark() || (tLRPC$WallPaperSettings2 = tLRPC$WallPaper.settings) == null || tLRPC$WallPaperSettings2.intensity >= 0)))) {
                                this.wallPapers.add(tLRPC$WallPaper);
                            }
                        }
                    }
                    TLRPC$WallPaperSettings tLRPC$WallPaperSettings4 = tLRPC$WallPaper.settings;
                    int i7 = tLRPC$WallPaperSettings4.background_color;
                    if (i7 != 0) {
                        int i8 = tLRPC$WallPaperSettings4.second_background_color;
                        if (i8 != 0 && (i3 = tLRPC$WallPaperSettings4.third_background_color) != 0) {
                            colorWallpaper = new ColorWallpaper(null, i7, i8, i3, tLRPC$WallPaperSettings4.fourth_background_color);
                        } else {
                            colorWallpaper = new ColorWallpaper(null, i7, i8, tLRPC$WallPaperSettings4.rotation);
                        }
                        colorWallpaper.slug = tLRPC$WallPaper.slug;
                        TLRPC$WallPaperSettings tLRPC$WallPaperSettings5 = tLRPC$WallPaper.settings;
                        colorWallpaper.intensity = tLRPC$WallPaperSettings5.intensity / 100.0f;
                        colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(tLRPC$WallPaperSettings5.rotation, false);
                        colorWallpaper.parentWallpaper = tLRPC$WallPaper;
                        if (tLRPC$WallPaper.id < 0) {
                            String hash = colorWallpaper.getHash();
                            if (this.localDict.containsKey(hash)) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(tLRPC$WallPaper);
                            } else {
                                this.localWallPapers.add(colorWallpaper);
                                this.localDict.put(hash, colorWallpaper);
                            }
                        }
                        if (Theme.isCurrentThemeDark() || (tLRPC$WallPaperSettings = tLRPC$WallPaper.settings) == null || tLRPC$WallPaperSettings.intensity >= 0) {
                            this.wallPapers.add(colorWallpaper);
                        }
                    }
                }
            }
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    getMessagesStorage().deleteWallpaper(((TLRPC$WallPaper) arrayList2.get(i9)).id);
                }
            }
            if (this.dialogId == 0) {
                this.selectedBackgroundSlug = Theme.getSelectedBackgroundSlug();
            }
            fillWallpapersWithCustom();
            loadWallpapers(false);
        } else if (i == NotificationCenter.didSetNewWallpapper) {
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null) {
                recyclerListView.invalidateViews();
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField();
            }
        } else if (i == NotificationCenter.wallpapersNeedReload) {
            getMessagesStorage().getWallpapers();
        }
    }

    public void loadWallpapers(final boolean z) {
        long j = 0;
        if (!z) {
            int size = this.allWallPapers.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                Object obj = this.allWallPapers.get(i);
                if (obj instanceof TLRPC$WallPaper) {
                    long j3 = ((TLRPC$WallPaper) obj).id;
                    if (j3 >= 0) {
                        j2 = MediaDataController.calcHash(j2, j3);
                    }
                }
            }
            j = j2;
        }
        TLRPC$TL_account_getWallPapers tLRPC$TL_account_getWallPapers = new TLRPC$TL_account_getWallPapers();
        tLRPC$TL_account_getWallPapers.hash = j;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_getWallPapers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                WallpapersListActivity.this.lambda$loadWallpapers$8(z, tLObject, tLRPC$TL_error);
            }
        }), this.classGuid);
    }

    public void lambda$loadWallpapers$8(final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WallpapersListActivity.this.lambda$loadWallpapers$7(tLObject, z);
            }
        });
    }

    public void lambda$loadWallpapers$7(TLObject tLObject, boolean z) {
        ColorWallpaper colorWallpaper;
        int i;
        TLRPC$WallPaperSettings tLRPC$WallPaperSettings;
        boolean z2;
        TLRPC$WallPaperSettings tLRPC$WallPaperSettings2;
        TLRPC$WallPaperSettings tLRPC$WallPaperSettings3;
        TLRPC$Document tLRPC$Document;
        if (tLObject instanceof TLRPC$TL_account_wallPapers) {
            TLRPC$TL_account_wallPapers tLRPC$TL_account_wallPapers = (TLRPC$TL_account_wallPapers) tLObject;
            this.patterns.clear();
            this.patternsDict.clear();
            int i2 = this.currentType;
            if (i2 != 1 && i2 != 2) {
                this.wallPapers.clear();
                this.allWallPapersDict.clear();
                this.allWallPapers.clear();
                this.allWallPapers.addAll(tLRPC$TL_account_wallPapers.wallpapers);
                this.wallPapers.addAll(this.localWallPapers);
            }
            int size = tLRPC$TL_account_wallPapers.wallpapers.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC$WallPaper tLRPC$WallPaper = tLRPC$TL_account_wallPapers.wallpapers.get(i3);
                if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(tLRPC$WallPaper.slug)) {
                    if ((tLRPC$WallPaper instanceof TLRPC$TL_wallPaper) && !(tLRPC$WallPaper.document instanceof TLRPC$TL_documentEmpty)) {
                        this.allWallPapersDict.put(tLRPC$WallPaper.slug, tLRPC$WallPaper);
                        if (tLRPC$WallPaper.pattern && (tLRPC$Document = tLRPC$WallPaper.document) != null && !this.patternsDict.containsKey(Long.valueOf(tLRPC$Document.id))) {
                            this.patterns.add(tLRPC$WallPaper);
                            this.patternsDict.put(Long.valueOf(tLRPC$WallPaper.document.id), tLRPC$WallPaper);
                        }
                        int i4 = this.currentType;
                        if (i4 != 1 && ((!(z2 = tLRPC$WallPaper.pattern) || ((tLRPC$WallPaperSettings3 = tLRPC$WallPaper.settings) != null && tLRPC$WallPaperSettings3.background_color != 0)) && ((i4 != 2 || z2) && (Theme.isCurrentThemeDark() || (tLRPC$WallPaperSettings2 = tLRPC$WallPaper.settings) == null || tLRPC$WallPaperSettings2.intensity >= 0)))) {
                            this.wallPapers.add(tLRPC$WallPaper);
                        }
                    } else if (tLRPC$WallPaper.settings.background_color != 0 && (Theme.isCurrentThemeDark() || (tLRPC$WallPaperSettings = tLRPC$WallPaper.settings) == null || tLRPC$WallPaperSettings.intensity >= 0)) {
                        TLRPC$WallPaperSettings tLRPC$WallPaperSettings4 = tLRPC$WallPaper.settings;
                        int i5 = tLRPC$WallPaperSettings4.second_background_color;
                        if (i5 != 0 && (i = tLRPC$WallPaperSettings4.third_background_color) != 0) {
                            colorWallpaper = new ColorWallpaper(null, tLRPC$WallPaperSettings4.background_color, i5, i, tLRPC$WallPaperSettings4.fourth_background_color);
                        } else {
                            colorWallpaper = new ColorWallpaper(null, tLRPC$WallPaperSettings4.background_color, i5, tLRPC$WallPaperSettings4.rotation);
                        }
                        colorWallpaper.slug = tLRPC$WallPaper.slug;
                        TLRPC$WallPaperSettings tLRPC$WallPaperSettings5 = tLRPC$WallPaper.settings;
                        colorWallpaper.intensity = tLRPC$WallPaperSettings5.intensity / 100.0f;
                        colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(tLRPC$WallPaperSettings5.rotation, false);
                        colorWallpaper.parentWallpaper = tLRPC$WallPaper;
                        this.wallPapers.add(colorWallpaper);
                    }
                }
            }
            fillWallpapersWithCustom();
            getMessagesStorage().putWallpapers(tLRPC$TL_account_wallPapers.wallpapers, 1);
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

    private void fillWallpapersWithCustom() {
        int i;
        ?? r4;
        final String str;
        Object obj;
        TLRPC$TL_wallPaper tLRPC$TL_wallPaper;
        final long j;
        TLRPC$WallPaper tLRPC$WallPaper;
        int i2;
        int i3;
        int i4;
        int i5;
        String str2;
        TLRPC$TL_wallPaper tLRPC$TL_wallPaper2;
        Object obj2;
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
            while (true) {
                if (i >= size) {
                    r4 = 0;
                    break;
                }
                Object obj3 = this.wallPapers.get(i);
                if (obj3 instanceof ColorWallpaper) {
                    r4 = (ColorWallpaper) obj3;
                    String str3 = r4.slug;
                    if (str3 != null) {
                        r4.pattern = (TLRPC$TL_wallPaper) this.allWallPapersDict.get(str3);
                    }
                    if (!"c".equals(r4.slug)) {
                        String str4 = r4.slug;
                        i = (str4 == null || TextUtils.equals(this.selectedBackgroundSlug, str4)) ? 0 : i + 1;
                    }
                    if (this.selectedColor == r4.color) {
                        int i7 = this.selectedGradientColor1;
                        if (i7 != r4.gradientColor1) {
                            continue;
                        } else if (this.selectedGradientColor2 != r4.gradientColor2) {
                            continue;
                        } else if (this.selectedGradientColor3 != r4.gradientColor3) {
                            continue;
                        } else if (i7 == 0 || this.selectedGradientRotation == r4.gradientRotation) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (obj3 instanceof TLRPC$TL_wallPaper) {
                        r4 = (TLRPC$TL_wallPaper) obj3;
                        if (r4.settings != null && TextUtils.equals(this.selectedBackgroundSlug, r4.slug) && this.selectedColor == Theme.getWallpaperColor(r4.settings.background_color) && this.selectedGradientColor1 == Theme.getWallpaperColor(r4.settings.second_background_color) && this.selectedGradientColor2 == Theme.getWallpaperColor(r4.settings.third_background_color) && this.selectedGradientColor3 == Theme.getWallpaperColor(r4.settings.fourth_background_color) && ((this.selectedGradientColor1 == 0 || this.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(r4.settings.rotation, false)) && Math.abs(Theme.getThemeIntensity(r4.settings.intensity / 100.0f) - this.selectedIntensity) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (r4 instanceof TLRPC$WallPaper) {
                TLRPC$TL_wallPaper tLRPC$TL_wallPaper3 = r4;
                Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.getActiveTheme().overrideWallpaper;
                TLRPC$WallPaperSettings tLRPC$WallPaperSettings = tLRPC$TL_wallPaper3.settings;
                if (tLRPC$WallPaperSettings == null || !(tLRPC$WallPaperSettings == null || (this.selectedColor == Theme.getWallpaperColor(tLRPC$WallPaperSettings.background_color) && this.selectedGradientColor1 == Theme.getWallpaperColor(tLRPC$TL_wallPaper3.settings.second_background_color) && this.selectedGradientColor2 == Theme.getWallpaperColor(tLRPC$TL_wallPaper3.settings.third_background_color) && this.selectedGradientColor3 == Theme.getWallpaperColor(tLRPC$TL_wallPaper3.settings.fourth_background_color) && (this.selectedGradientColor1 == 0 || this.selectedGradientColor2 != 0 || this.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(tLRPC$TL_wallPaper3.settings.rotation, false) || Math.abs(Theme.getThemeIntensity(tLRPC$TL_wallPaper3.settings.intensity / 100.0f) - this.selectedIntensity) <= 0.001f)))) {
                    str2 = BuildConfig.APP_CENTER_HASH;
                    tLRPC$TL_wallPaper2 = tLRPC$TL_wallPaper3;
                    obj2 = null;
                } else {
                    str2 = this.selectedBackgroundSlug;
                    tLRPC$TL_wallPaper2 = null;
                    obj2 = r4;
                }
                tLRPC$TL_wallPaper = tLRPC$TL_wallPaper2;
                obj = obj2;
                j = tLRPC$TL_wallPaper3.id;
                str = str2;
            } else {
                str = this.selectedBackgroundSlug;
                obj = r4;
                tLRPC$TL_wallPaper = null;
                j = (!(r4 instanceof ColorWallpaper) || (tLRPC$WallPaper = r4.parentWallpaper) == null) ? 0L : tLRPC$WallPaper.id;
            }
            final boolean isDark = Theme.getCurrentTheme().isDark();
            try {
                Collections.sort(this.wallPapers, new Comparator() {
                    @Override
                    public final int compare(Object obj4, Object obj5) {
                        int lambda$fillWallpapersWithCustom$9;
                        lambda$fillWallpapersWithCustom$9 = WallpapersListActivity.this.lambda$fillWallpapersWithCustom$9(j, str, isDark, obj4, obj5);
                        return lambda$fillWallpapersWithCustom$9;
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (Theme.hasWallpaperFromTheme() && !Theme.isThemeWallpaperPublic()) {
                if (this.themeWallpaper == null) {
                    this.themeWallpaper = new FileWallpaper("t", -2, -2);
                }
                this.wallPapers.add(0, this.themeWallpaper);
            } else {
                this.themeWallpaper = null;
            }
            Theme.ThemeInfo activeTheme = Theme.getActiveTheme();
            if (TextUtils.isEmpty(this.selectedBackgroundSlug) || (!"d".equals(this.selectedBackgroundSlug) && obj == null)) {
                if (!"c".equals(this.selectedBackgroundSlug) && (i3 = this.selectedColor) != 0) {
                    if (activeTheme.overrideWallpaper != null) {
                        ColorWallpaper colorWallpaper4 = new ColorWallpaper(this.selectedBackgroundSlug, i3, this.selectedGradientColor1, this.selectedGradientColor2, this.selectedGradientColor3, this.selectedGradientRotation, this.selectedIntensity, this.selectedBackgroundMotion, new File(ApplicationLoader.getFilesDirFixed(), activeTheme.overrideWallpaper.fileName));
                        this.addedColorWallpaper = colorWallpaper4;
                        colorWallpaper4.pattern = tLRPC$TL_wallPaper;
                        this.wallPapers.add(0, colorWallpaper4);
                    }
                } else {
                    int i8 = this.selectedColor;
                    if (i8 != 0) {
                        int i9 = this.selectedGradientColor1;
                        if (i9 != 0 && (i2 = this.selectedGradientColor2) != 0) {
                            ColorWallpaper colorWallpaper5 = new ColorWallpaper(this.selectedBackgroundSlug, i8, i9, i2, this.selectedGradientColor3);
                            this.addedColorWallpaper = colorWallpaper5;
                            colorWallpaper5.gradientRotation = this.selectedGradientRotation;
                        } else {
                            this.addedColorWallpaper = new ColorWallpaper(this.selectedBackgroundSlug, i8, i9, this.selectedGradientRotation);
                        }
                        this.wallPapers.add(0, this.addedColorWallpaper);
                    } else if (activeTheme.overrideWallpaper != null && !this.allWallPapersDict.containsKey(this.selectedBackgroundSlug)) {
                        FileWallpaper fileWallpaper3 = new FileWallpaper(this.selectedBackgroundSlug, new File(ApplicationLoader.getFilesDirFixed(), activeTheme.overrideWallpaper.fileName), new File(ApplicationLoader.getFilesDirFixed(), activeTheme.overrideWallpaper.originalFileName));
                        this.addedFileWallpaper = fileWallpaper3;
                        this.wallPapers.add(this.themeWallpaper != null ? 1 : 0, fileWallpaper3);
                    }
                }
            } else if (obj == null && this.selectedColor != 0 && "c".equals(this.selectedBackgroundSlug)) {
                int i10 = this.selectedGradientColor1;
                if (i10 != 0 && (i4 = this.selectedGradientColor2) != 0 && (i5 = this.selectedGradientColor3) != 0) {
                    ColorWallpaper colorWallpaper6 = new ColorWallpaper(this.selectedBackgroundSlug, this.selectedColor, i10, i4, i5);
                    this.addedColorWallpaper = colorWallpaper6;
                    colorWallpaper6.gradientRotation = this.selectedGradientRotation;
                } else {
                    this.addedColorWallpaper = new ColorWallpaper(this.selectedBackgroundSlug, this.selectedColor, i10, this.selectedGradientRotation);
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

    public int lambda$fillWallpapersWithCustom$9(long j, String str, boolean z, Object obj, Object obj2) {
        if (obj instanceof ColorWallpaper) {
            obj = ((ColorWallpaper) obj).parentWallpaper;
        }
        if (obj2 instanceof ColorWallpaper) {
            obj2 = ((ColorWallpaper) obj2).parentWallpaper;
        }
        if ((obj instanceof TLRPC$WallPaper) && (obj2 instanceof TLRPC$WallPaper)) {
            TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) obj;
            TLRPC$WallPaper tLRPC$WallPaper2 = (TLRPC$WallPaper) obj2;
            if (j != 0) {
                if (tLRPC$WallPaper.id == j) {
                    return -1;
                }
                if (tLRPC$WallPaper2.id == j) {
                    return 1;
                }
            } else if (str.equals(tLRPC$WallPaper.slug)) {
                return -1;
            } else {
                if (str.equals(tLRPC$WallPaper2.slug)) {
                    return 1;
                }
            }
            if (!z) {
                if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(tLRPC$WallPaper.slug)) {
                    return -1;
                }
                if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(tLRPC$WallPaper2.slug)) {
                    return 1;
                }
            }
            int indexOf = this.allWallPapers.indexOf(tLRPC$WallPaper);
            int indexOf2 = this.allWallPapers.indexOf(tLRPC$WallPaper2);
            boolean z2 = tLRPC$WallPaper.dark;
            if (!(z2 && tLRPC$WallPaper2.dark) && (z2 || tLRPC$WallPaper2.dark)) {
                return (!z2 || tLRPC$WallPaper2.dark) ? z ? 1 : -1 : z ? -1 : 1;
            } else if (indexOf > indexOf2) {
                return 1;
            } else {
                return indexOf < indexOf2 ? -1 : 0;
            }
        }
        return 0;
    }

    private void updateRows() {
        this.rowCount = 0;
        int i = this.currentType;
        if (i == 0) {
            int i2 = 0 + 1;
            this.rowCount = i2;
            this.uploadImageRow = 0;
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.setColorRow = i2;
            this.rowCount = i3 + 1;
            this.sectionRow = i3;
            this.galleryRow = -1;
            this.galleryHintRow = -1;
        } else if (i == 2) {
            this.uploadImageRow = -1;
            this.setColorRow = -1;
            this.sectionRow = -1;
            int i4 = 0 + 1;
            this.rowCount = i4;
            this.galleryRow = 0;
            this.rowCount = i4 + 1;
            this.galleryHintRow = i4;
        } else {
            this.uploadImageRow = -1;
            this.setColorRow = -1;
            this.sectionRow = -1;
            this.galleryRow = -1;
            this.galleryHintRow = -1;
        }
        if (!this.wallPapers.isEmpty()) {
            int ceil = (int) Math.ceil(this.wallPapers.size() / this.columnsCount);
            this.totalWallpaperRows = ceil;
            int i5 = this.rowCount;
            this.wallPaperStartRow = i5;
            this.rowCount = i5 + ceil;
        } else {
            this.wallPaperStartRow = -1;
        }
        if (this.currentType == 0) {
            int i6 = this.rowCount;
            int i7 = i6 + 1;
            this.rowCount = i7;
            this.resetSectionRow = i6;
            int i8 = i7 + 1;
            this.rowCount = i8;
            this.resetRow = i7;
            this.rowCount = i8 + 1;
            this.resetInfoRow = i8;
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

    private void fixLayout() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    WallpapersListActivity.this.fixLayoutInternal();
                    if (WallpapersListActivity.this.listView != null) {
                        WallpapersListActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
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

    private class ColorCell extends View {
        private int color;

        public ColorCell(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
        }

        public void setColor(int i) {
            this.color = i;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            WallpapersListActivity.this.colorPaint.setColor(this.color);
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), WallpapersListActivity.this.colorPaint);
            if (this.color == Theme.getColor(Theme.key_windowBackgroundWhite)) {
                canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), WallpapersListActivity.this.colorFramePaint);
            }
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private int imageReqId;
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

        private class CategoryAdapterRecycler extends RecyclerListView.SelectionAdapter {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            private CategoryAdapterRecycler() {
            }

            CategoryAdapterRecycler(SearchAdapter searchAdapter, AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                SearchAdapter searchAdapter = SearchAdapter.this;
                return new RecyclerListView.Holder(new ColorCell(searchAdapter.mContext));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ((ColorCell) viewHolder.itemView).setColor(WallpapersListActivity.searchColors[i]);
            }

            @Override
            public int getItemCount() {
                return WallpapersListActivity.searchColors.length;
            }
        }

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        public void onDestroy() {
            if (this.imageReqId != 0) {
                ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).cancelRequest(this.imageReqId, true);
                this.imageReqId = 0;
            }
        }

        public void clearColor() {
            this.selectedColor = null;
            processSearch(null, true);
        }

        public void processSearch(final String str, boolean z) {
            if (str != null && this.selectedColor != null) {
                str = "#color" + this.selectedColor + " " + str;
            }
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.searchRunnable = null;
            }
            if (!TextUtils.isEmpty(str)) {
                WallpapersListActivity.this.searchEmptyView.showProgress();
                if (z) {
                    doSearch(str);
                } else {
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            WallpapersListActivity.SearchAdapter.this.lambda$processSearch$0(str);
                        }
                    };
                    this.searchRunnable = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 500L);
                }
            } else {
                this.searchResult.clear();
                this.searchResultKeys.clear();
                this.bingSearchEndReached = true;
                this.lastSearchString = null;
                if (this.imageReqId != 0) {
                    ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).cancelRequest(this.imageReqId, true);
                    this.imageReqId = 0;
                }
                WallpapersListActivity.this.searchEmptyView.showTextView();
            }
            notifyDataSetChanged();
        }

        public void lambda$processSearch$0(String str) {
            doSearch(str);
            this.searchRunnable = null;
        }

        private void doSearch(String str) {
            this.searchResult.clear();
            this.searchResultKeys.clear();
            this.bingSearchEndReached = true;
            searchImages(str, BuildConfig.APP_CENTER_HASH, true);
            this.lastSearchString = str;
            notifyDataSetChanged();
        }

        private void searchBotUser() {
            if (this.searchingUser) {
                return;
            }
            this.searchingUser = true;
            TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
            tLRPC$TL_contacts_resolveUsername.username = MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).imageSearchBot;
            ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    WallpapersListActivity.SearchAdapter.this.lambda$searchBotUser$2(tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$searchBotUser$2(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        WallpapersListActivity.SearchAdapter.this.lambda$searchBotUser$1(tLObject);
                    }
                });
            }
        }

        public void lambda$searchBotUser$1(TLObject tLObject) {
            TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).putChats(tLRPC$TL_contacts_resolvedPeer.chats, false);
            WallpapersListActivity.this.getMessagesStorage().putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, true, true);
            String str = this.lastSearchImageString;
            this.lastSearchImageString = null;
            searchImages(str, BuildConfig.APP_CENTER_HASH, false);
        }

        public void loadMoreResults() {
            if (this.bingSearchEndReached || this.imageReqId != 0) {
                return;
            }
            searchImages(this.lastSearchString, this.nextImagesSearchOffset, true);
        }

        private void searchImages(String str, String str2, boolean z) {
            if (this.imageReqId != 0) {
                ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).cancelRequest(this.imageReqId, true);
                this.imageReqId = 0;
            }
            this.lastSearchImageString = str;
            TLObject userOrChat = MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).getUserOrChat(MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).imageSearchBot);
            if (!(userOrChat instanceof TLRPC$User)) {
                if (z) {
                    searchBotUser();
                    return;
                }
                return;
            }
            TLRPC$TL_messages_getInlineBotResults tLRPC$TL_messages_getInlineBotResults = new TLRPC$TL_messages_getInlineBotResults();
            tLRPC$TL_messages_getInlineBotResults.query = "#wallpaper " + str;
            tLRPC$TL_messages_getInlineBotResults.bot = MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).getInputUser((TLRPC$User) userOrChat);
            tLRPC$TL_messages_getInlineBotResults.offset = str2;
            tLRPC$TL_messages_getInlineBotResults.peer = new TLRPC$TL_inputPeerEmpty();
            final int i = this.lastSearchToken + 1;
            this.lastSearchToken = i;
            this.imageReqId = ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(tLRPC$TL_messages_getInlineBotResults, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    WallpapersListActivity.SearchAdapter.this.lambda$searchImages$4(i, tLObject, tLRPC$TL_error);
                }
            });
            ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).bindRequestToGuid(this.imageReqId, ((BaseFragment) WallpapersListActivity.this).classGuid);
        }

        public void lambda$searchImages$4(final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    WallpapersListActivity.SearchAdapter.this.lambda$searchImages$3(i, tLObject);
                }
            });
        }

        public void lambda$searchImages$3(int i, TLObject tLObject) {
            if (i != this.lastSearchToken) {
                return;
            }
            boolean z = false;
            this.imageReqId = 0;
            int size = this.searchResult.size();
            if (tLObject != null) {
                TLRPC$messages_BotResults tLRPC$messages_BotResults = (TLRPC$messages_BotResults) tLObject;
                this.nextImagesSearchOffset = tLRPC$messages_BotResults.next_offset;
                int size2 = tLRPC$messages_BotResults.results.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC$BotInlineResult tLRPC$BotInlineResult = tLRPC$messages_BotResults.results.get(i2);
                    if ("photo".equals(tLRPC$BotInlineResult.type) && !this.searchResultKeys.containsKey(tLRPC$BotInlineResult.id)) {
                        MediaController.SearchImage searchImage = new MediaController.SearchImage();
                        TLRPC$Photo tLRPC$Photo = tLRPC$BotInlineResult.photo;
                        if (tLRPC$Photo != null) {
                            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, AndroidUtilities.getPhotoSize());
                            TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$BotInlineResult.photo.sizes, 320);
                            if (closestPhotoSizeWithSize != null) {
                                searchImage.width = closestPhotoSizeWithSize.w;
                                searchImage.height = closestPhotoSizeWithSize.h;
                                searchImage.photoSize = closestPhotoSizeWithSize;
                                searchImage.photo = tLRPC$BotInlineResult.photo;
                                searchImage.size = closestPhotoSizeWithSize.size;
                                searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                searchImage.id = tLRPC$BotInlineResult.id;
                                searchImage.type = 0;
                                this.searchResult.add(searchImage);
                                this.searchResultKeys.put(searchImage.id, searchImage);
                            }
                        } else if (tLRPC$BotInlineResult.content != null) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= tLRPC$BotInlineResult.content.attributes.size()) {
                                    break;
                                }
                                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$BotInlineResult.content.attributes.get(i3);
                                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) {
                                    searchImage.width = tLRPC$DocumentAttribute.w;
                                    searchImage.height = tLRPC$DocumentAttribute.h;
                                    break;
                                }
                                i3++;
                            }
                            TLRPC$WebDocument tLRPC$WebDocument = tLRPC$BotInlineResult.thumb;
                            if (tLRPC$WebDocument != null) {
                                searchImage.thumbUrl = tLRPC$WebDocument.url;
                            } else {
                                searchImage.thumbUrl = null;
                            }
                            TLRPC$WebDocument tLRPC$WebDocument2 = tLRPC$BotInlineResult.content;
                            searchImage.imageUrl = tLRPC$WebDocument2.url;
                            searchImage.size = tLRPC$WebDocument2.size;
                            searchImage.id = tLRPC$BotInlineResult.id;
                            searchImage.type = 0;
                            this.searchResult.add(searchImage);
                            this.searchResultKeys.put(searchImage.id, searchImage);
                        }
                    }
                }
                this.bingSearchEndReached = (size == this.searchResult.size() || this.nextImagesSearchOffset == null) ? true : true;
            }
            if (size != this.searchResult.size()) {
                int i4 = size % WallpapersListActivity.this.columnsCount;
                float f = size;
                int ceil = (int) Math.ceil(f / WallpapersListActivity.this.columnsCount);
                if (i4 != 0) {
                    notifyItemChanged(((int) Math.ceil(f / WallpapersListActivity.this.columnsCount)) - 1);
                }
                WallpapersListActivity.this.searchAdapter.notifyItemRangeInserted(ceil, ((int) Math.ceil(this.searchResult.size() / WallpapersListActivity.this.columnsCount)) - ceil);
            }
            WallpapersListActivity.this.searchEmptyView.showTextView();
        }

        @Override
        public int getItemCount() {
            if (TextUtils.isEmpty(this.lastSearchString)) {
                return 2;
            }
            return (int) Math.ceil(this.searchResult.size() / WallpapersListActivity.this.columnsCount);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 2;
        }

        public void lambda$onCreateViewHolder$5(View view, int i) {
            String string = LocaleController.getString("BackgroundSearchColor", R.string.BackgroundSearchColor);
            SpannableString spannableString = new SpannableString(string + " " + LocaleController.getString(WallpapersListActivity.searchColorsNames[i], WallpapersListActivity.searchColorsNamesR[i]));
            spannableString.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_actionBarDefaultSubtitle)), string.length(), spannableString.length(), 33);
            WallpapersListActivity.this.searchItem.setSearchFieldCaption(spannableString);
            WallpapersListActivity.this.searchItem.setSearchFieldHint(null);
            WallpapersListActivity.this.searchItem.setSearchFieldText(BuildConfig.APP_CENTER_HASH, true);
            this.selectedColor = WallpapersListActivity.searchColorsNames[i];
            processSearch(BuildConfig.APP_CENTER_HASH, true);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = null;
            if (i == 0) {
                view = new WallpaperCell(this.mContext) {
                    @Override
                    protected void onWallpaperClick(Object obj, int i2) {
                        WallpapersListActivity.this.presentFragment(new ThemePreviewActivity(obj, null, true, false));
                    }
                };
            } else if (i == 1) {
                RecyclerListView recyclerListView = new RecyclerListView(this, this.mContext) {
                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (getParent() != null && getParent().getParent() != null) {
                            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                };
                recyclerListView.setItemAnimator(null);
                recyclerListView.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, this.mContext) {
                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                recyclerListView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                recyclerListView.setClipToPadding(false);
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                recyclerListView.setAdapter(new CategoryAdapterRecycler(this, null));
                recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view2, int i2) {
                        WallpapersListActivity.SearchAdapter.this.lambda$onCreateViewHolder$5(view2, i2);
                    }
                });
                view = recyclerListView;
            } else if (i == 2) {
                view = new GraySectionCell(this.mContext);
            }
            if (i == 1) {
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(60.0f)));
            } else {
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 2) {
                    return;
                }
                ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString("SearchByColor", R.string.SearchByColor));
                return;
            }
            WallpaperCell wallpaperCell = (WallpaperCell) viewHolder.itemView;
            int i2 = i * WallpapersListActivity.this.columnsCount;
            wallpaperCell.setParams(WallpapersListActivity.this.columnsCount, i2 == 0, i2 / WallpapersListActivity.this.columnsCount == ((int) Math.ceil((double) (((float) this.searchResult.size()) / ((float) WallpapersListActivity.this.columnsCount)))) - 1);
            for (int i3 = 0; i3 < WallpapersListActivity.this.columnsCount; i3++) {
                int i4 = i2 + i3;
                wallpaperCell.setWallpaper(WallpapersListActivity.this.currentType, i3, i4 < this.searchResult.size() ? this.searchResult.get(i4) : null, BuildConfig.APP_CENTER_HASH, null, false);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (TextUtils.isEmpty(this.lastSearchString)) {
                return i == 0 ? 2 : 1;
            }
            return 0;
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public int getItemCount() {
            return WallpapersListActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCell;
            View shadowSectionCell;
            if (i != 0) {
                if (i == 1) {
                    shadowSectionCell = new ShadowSectionCell(this.mContext);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, WallpapersListActivity.this.wallPaperStartRow == -1 ? R.drawable.greydivider_bottom : R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable.setFullsize(true);
                    shadowSectionCell.setBackgroundDrawable(combinedDrawable);
                } else if (i == 3) {
                    shadowSectionCell = new TextInfoPrivacyCell(this.mContext);
                    CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable2.setFullsize(true);
                    shadowSectionCell.setBackgroundDrawable(combinedDrawable2);
                } else {
                    textCell = new WallpaperCell(this.mContext) {
                        @Override
                        protected void onWallpaperClick(Object obj, int i2) {
                            WallpapersListActivity.this.onItemClick(this, obj, i2);
                        }

                        @Override
                        protected boolean onWallpaperLongClick(Object obj, int i2) {
                            return WallpapersListActivity.this.onItemLongClick(this, obj, i2);
                        }
                    };
                }
                textCell = shadowSectionCell;
            } else {
                textCell = new TextCell(this.mContext);
            }
            return new RecyclerListView.Holder(textCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (i != WallpapersListActivity.this.uploadImageRow) {
                    if (i != WallpapersListActivity.this.setColorRow) {
                        if (i != WallpapersListActivity.this.resetRow) {
                            if (i == WallpapersListActivity.this.galleryRow) {
                                textCell.setTextAndIcon((CharSequence) "Choose from gallery", R.drawable.msg_background, false);
                                textCell.setLockLevel(false, 10);
                                return;
                            }
                            return;
                        }
                        textCell.setText(LocaleController.getString("ResetChatBackgrounds", R.string.ResetChatBackgrounds), false);
                        return;
                    }
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString("SetColor", R.string.SetColor), R.drawable.msg_palette, true);
                    return;
                }
                textCell.setTextAndIcon((CharSequence) LocaleController.getString("SelectFromGallery", R.string.SelectFromGallery), R.drawable.msg_photos, true);
            } else if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i != WallpapersListActivity.this.resetInfoRow) {
                    if (i == WallpapersListActivity.this.galleryHintRow) {
                        textInfoPrivacyCell.setText("Upload your own background for the channel.");
                        return;
                    }
                    return;
                }
                textInfoPrivacyCell.setText(LocaleController.getString("ResetChatBackgroundsInfo", R.string.ResetChatBackgroundsInfo));
            } else {
                WallpaperCell wallpaperCell = (WallpaperCell) viewHolder.itemView;
                int i2 = (i - WallpapersListActivity.this.wallPaperStartRow) * WallpapersListActivity.this.columnsCount;
                wallpaperCell.setParams(WallpapersListActivity.this.columnsCount, i2 == 0, i2 / WallpapersListActivity.this.columnsCount == WallpapersListActivity.this.totalWallpaperRows - 1);
                for (int i3 = 0; i3 < WallpapersListActivity.this.columnsCount; i3++) {
                    int i4 = i2 + i3;
                    FileWallpaper fileWallpaper = null;
                    ColorWallpaper colorWallpaper = i4 < WallpapersListActivity.this.wallPapers.size() ? WallpapersListActivity.this.wallPapers.get(i4) : null;
                    long j = 0;
                    if (colorWallpaper instanceof TLRPC$TL_wallPaper) {
                        ?? r3 = (TLRPC$TL_wallPaper) colorWallpaper;
                        Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.getActiveTheme().overrideWallpaper;
                        if (WallpapersListActivity.this.selectedBackgroundSlug.equals(r3.slug) && (!WallpapersListActivity.this.selectedBackgroundSlug.equals(r3.slug) || r3.settings == null || (WallpapersListActivity.this.selectedColor == Theme.getWallpaperColor(r3.settings.background_color) && WallpapersListActivity.this.selectedGradientColor1 == Theme.getWallpaperColor(r3.settings.second_background_color) && WallpapersListActivity.this.selectedGradientColor2 == Theme.getWallpaperColor(r3.settings.third_background_color) && WallpapersListActivity.this.selectedGradientColor3 == Theme.getWallpaperColor(r3.settings.fourth_background_color) && (WallpapersListActivity.this.selectedGradientColor1 == 0 || WallpapersListActivity.this.selectedGradientColor2 != 0 || WallpapersListActivity.this.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(r3.settings.rotation, false) || !r3.pattern || Math.abs(Theme.getThemeIntensity(r3.settings.intensity / 100.0f) - WallpapersListActivity.this.selectedIntensity) <= 0.001f)))) {
                            fileWallpaper = r3;
                        }
                        j = r3.id;
                    } else if (colorWallpaper instanceof ColorWallpaper) {
                        ColorWallpaper colorWallpaper2 = colorWallpaper;
                        if (("d".equals(colorWallpaper2.slug) && WallpapersListActivity.this.selectedBackgroundSlug != null && WallpapersListActivity.this.selectedBackgroundSlug.equals(colorWallpaper2.slug)) || (colorWallpaper2.color == WallpapersListActivity.this.selectedColor && colorWallpaper2.gradientColor1 == WallpapersListActivity.this.selectedGradientColor1 && colorWallpaper2.gradientColor2 == WallpapersListActivity.this.selectedGradientColor2 && colorWallpaper2.gradientColor3 == WallpapersListActivity.this.selectedGradientColor3 && ((WallpapersListActivity.this.selectedGradientColor1 == 0 || colorWallpaper2.gradientRotation == WallpapersListActivity.this.selectedGradientRotation) && ((!"c".equals(WallpapersListActivity.this.selectedBackgroundSlug) || colorWallpaper2.slug == null) && ("c".equals(WallpapersListActivity.this.selectedBackgroundSlug) || (TextUtils.equals(WallpapersListActivity.this.selectedBackgroundSlug, colorWallpaper2.slug) && ((int) (colorWallpaper2.intensity * 100.0f)) == ((int) (WallpapersListActivity.this.selectedIntensity * 100.0f)))))))) {
                            fileWallpaper = colorWallpaper;
                        }
                        TLRPC$WallPaper tLRPC$WallPaper = colorWallpaper2.parentWallpaper;
                        if (tLRPC$WallPaper != null) {
                            j = tLRPC$WallPaper.id;
                        }
                    } else if ((colorWallpaper instanceof FileWallpaper) && WallpapersListActivity.this.selectedBackgroundSlug.equals(colorWallpaper.slug)) {
                        fileWallpaper = colorWallpaper;
                    }
                    long j2 = j;
                    wallpaperCell.setWallpaper(WallpapersListActivity.this.currentType, i3, colorWallpaper, fileWallpaper, null, false);
                    if (((BaseFragment) WallpapersListActivity.this).actionBar.isActionModeShowed()) {
                        wallpaperCell.setChecked(i3, WallpapersListActivity.this.selectedWallPapers.indexOfKey(j2) >= 0, !WallpapersListActivity.this.scrolling);
                    } else {
                        wallpaperCell.setChecked(i3, false, !WallpapersListActivity.this.scrolling);
                    }
                }
            }
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
        ActionBar actionBar = this.actionBar;
        int i3 = ThemeDescription.FLAG_BACKGROUND;
        int i4 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i3, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        int i5 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.searchEmptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.searchEmptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.searchEmptyView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i));
        return arrayList;
    }
}
