package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
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
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.WallpaperUpdater;

public class WallpapersListActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ArrayList actionModeViews;
    private ColorWallpaper addedColorWallpaper;
    private FileWallpaper addedFileWallpaper;
    private ArrayList allWallPapers;
    private HashMap allWallPapersDict;
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
    private HashMap localDict;
    private ArrayList localWallPapers;
    private ArrayList patterns;
    private HashMap patternsDict;
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
    private final LongSparseArray selectedWallPapers;
    private int setColorRow;
    private FileWallpaper themeWallpaper;
    private int totalWallpaperRows;
    private WallpaperUpdater updater;
    private int uploadImageRow;
    private int wallPaperStartRow;
    private ArrayList wallPapers;
    private static final int[][] defaultColorsLight = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    private static final int[][] defaultColorsDark = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    private static final int[] searchColors = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    private static final String[] searchColorsNames = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    private static final int[] searchColorsNamesR = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};

    public static boolean $r8$lambda$wfA44qyGaX_B4XNajFoxnQYt0RQ(View view, MotionEvent motionEvent) {
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
        public TLRPC.WallPaper parentWallpaper;
        public File path;
        public TLRPC.TL_wallPaper pattern;
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
                str = "";
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
                if (!this.motion) {
                    return str2;
                }
                return str2 + "&mode=motion";
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

    public static void fillDefaultColors(ArrayList arrayList, boolean z) {
        for (int[] iArr : z ? defaultColorsDark : defaultColorsLight) {
            if (iArr.length == 1) {
                arrayList.add(new ColorWallpaper("c", iArr[0], 0, 45));
            } else {
                arrayList.add(new ColorWallpaper("c", iArr[0], iArr[1], iArr[2], iArr[3]));
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
                    WallpapersListActivity.this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
                }
            });
            this.searchItem = actionBarMenuItemSearchListener;
            actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode(false, null);
            actionBarMenuCreateActionMode.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefault));
            ActionBar actionBar = this.actionBar;
            int i3 = Theme.key_actionBarDefaultIcon;
            actionBar.setItemsColor(Theme.getColor(i3), true);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSelector), true);
            NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
            this.selectedMessagesCountTextView = numberTextView;
            numberTextView.setTextSize(18);
            this.selectedMessagesCountTextView.setTypeface(AndroidUtilities.bold());
            this.selectedMessagesCountTextView.setTextColor(Theme.getColor(i3));
            this.selectedMessagesCountTextView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return WallpapersListActivity.$r8$lambda$wfA44qyGaX_B4XNajFoxnQYt0RQ(view, motionEvent);
                }
            });
            actionBarMenuCreateActionMode.addView(this.selectedMessagesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 65, 0, 0, 0));
            this.actionModeViews.add(actionBarMenuCreateActionMode.addItemWithWidth(3, R.drawable.msg_forward, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Forward)));
            this.actionModeViews.add(actionBarMenuCreateActionMode.addItemWithWidth(4, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete)));
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
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView3 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, z) {
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
        this.listView.setGlowColor(Theme.getColor(Theme.key_avatar_backgroundActionBarBlue));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                WallpapersListActivity.$r8$lambda$_FEgVfGtf1hLJu7KHYnxW2pib9k(this.f$0, view, i5);
            }
        });
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
        this.searchEmptyView.setBackgroundColor(Theme.getColor(i4));
        this.searchEmptyView.setText(LocaleController.getString(R.string.NoResult));
        this.listView.setEmptyView(this.searchEmptyView);
        frameLayout.addView(this.searchEmptyView, LayoutHelper.createFrame(-1, -1.0f));
        updateRows();
        return this.fragmentView;
    }

    class AnonymousClass1 implements WallpaperUpdater.WallpaperUpdaterDelegate {
        @Override
        public void needOpenColorPicker() {
        }

        AnonymousClass1() {
        }

        @Override
        public void didSelectWallpaper(File file, Bitmap bitmap, boolean z) {
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(new FileWallpaper("", file, file), bitmap);
            themePreviewActivity.setDialogId(WallpapersListActivity.this.dialogId);
            if (WallpapersListActivity.this.dialogId != 0) {
                themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                    @Override
                    public final void didSetNewBackground(TLRPC.WallPaper wallPaper) {
                        WallpapersListActivity.this.removeSelfFromStack();
                    }
                });
            }
            WallpapersListActivity.this.presentFragment(themePreviewActivity, z);
        }
    }

    class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
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
                return;
            }
            if (i != 4) {
                if (i == 3) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putInt("dialogsType", 3);
                    DialogsActivity dialogsActivity = new DialogsActivity(bundle);
                    dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                        @Override
                        public boolean canSelectStories() {
                            return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                        }

                        @Override
                        public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
                            return WallpapersListActivity.AnonymousClass2.$r8$lambda$_ur62TRHQSp77Km64BUW0w3cEcg(this.f$0, dialogsActivity2, arrayList, charSequence, z, z2, i2, i3, topicsFragment);
                        }

                        @Override
                        public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                            return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
                        }
                    });
                    WallpapersListActivity.this.presentFragment(dialogsActivity);
                    return;
                }
                return;
            }
            if (WallpapersListActivity.this.getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(WallpapersListActivity.this.getParentActivity());
            builder.setTitle(LocaleController.formatPluralString("DeleteBackground", WallpapersListActivity.this.selectedWallPapers.size(), new Object[0]));
            builder.setMessage(LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]));
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    WallpapersListActivity.AnonymousClass2.m4788$r8$lambda$1B7jWEpv3usY6_kIDMcq9VHHkY(this.f$0, alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            WallpapersListActivity.this.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }

        public static void m4788$r8$lambda$1B7jWEpv3usY6_kIDMcq9VHHkY(final AnonymousClass2 anonymousClass2, AlertDialog alertDialog, int i) {
            WallpapersListActivity.this.progressDialog = new AlertDialog(WallpapersListActivity.this.getParentActivity(), 3);
            WallpapersListActivity.this.progressDialog.setCanCancel(false);
            WallpapersListActivity.this.progressDialog.show();
            new ArrayList();
            final int[] iArr = {0};
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
                        Theme.getActiveTheme().setOverrideWallpaper(null);
                        Theme.reloadWallpaper(true);
                    }
                    ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(savewallpaper, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            WallpapersListActivity.AnonymousClass2.$r8$lambda$7bcQSne_XncLXIUcqvemE0C7fis(this.f$0, iArr, tLObject, tL_error);
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

        public static void $r8$lambda$7bcQSne_XncLXIUcqvemE0C7fis(final AnonymousClass2 anonymousClass2, final int[] iArr, TLObject tLObject, TLRPC.TL_error tL_error) {
            anonymousClass2.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    WallpapersListActivity.AnonymousClass2.$r8$lambda$R7DTo3dz5xWdm0ymifJARzSBdC8(this.f$0, iArr);
                }
            });
        }

        public static void $r8$lambda$R7DTo3dz5xWdm0ymifJARzSBdC8(AnonymousClass2 anonymousClass2, int[] iArr) {
            anonymousClass2.getClass();
            int i = iArr[0] - 1;
            iArr[0] = i;
            if (i == 0) {
                WallpapersListActivity.this.loadWallpapers(true);
            }
        }

        public static boolean $r8$lambda$_ur62TRHQSp77Km64BUW0w3cEcg(AnonymousClass2 anonymousClass2, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
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
                return true;
            }
            long j2 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundle = new Bundle();
            bundle.putBoolean("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j2)) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j2));
            } else {
                if (DialogObject.isUserDialog(j2)) {
                    bundle.putLong("user_id", j2);
                } else if (DialogObject.isChatDialog(j2)) {
                    bundle.putLong("chat_id", -j2);
                }
                if (!MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).checkCanOpenChat(bundle, dialogsActivity)) {
                    return true;
                }
            }
            NotificationCenter.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).postNotificationName(NotificationCenter.closeChats, new Object[0]);
            WallpapersListActivity.this.presentFragment(new ChatActivity(bundle), true);
            SendMessagesHelper.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
            return true;
        }
    }

    public static void $r8$lambda$_FEgVfGtf1hLJu7KHYnxW2pib9k(final WallpapersListActivity wallpapersListActivity, View view, int i) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.listView.getAdapter() == wallpapersListActivity.searchAdapter) {
            return;
        }
        if (i == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.updater.openGallery();
            return;
        }
        if (i == wallpapersListActivity.setColorRow) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.patterns = wallpapersListActivity.patterns;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i == wallpapersListActivity.resetRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(wallpapersListActivity.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.ResetChatBackgroundsAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.Reset), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    WallpapersListActivity.$r8$lambda$JlAJDvoRMyNONTBfaWEXLLIPrAk(this.f$0, alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            wallpapersListActivity.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
    }

    public static void $r8$lambda$JlAJDvoRMyNONTBfaWEXLLIPrAk(final WallpapersListActivity wallpapersListActivity, AlertDialog alertDialog, int i) {
        if (wallpapersListActivity.actionBar.isActionModeShowed()) {
            wallpapersListActivity.selectedWallPapers.clear();
            wallpapersListActivity.actionBar.hideActionMode();
            wallpapersListActivity.updateRowsSelection();
        }
        AlertDialog alertDialog2 = new AlertDialog(wallpapersListActivity.getParentActivity(), 3);
        wallpapersListActivity.progressDialog = alertDialog2;
        alertDialog2.setCanCancel(false);
        wallpapersListActivity.progressDialog.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                WallpapersListActivity.m4786$r8$lambda$plnluGjWCIUIIl9iDWFWVAy0Y(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m4786$r8$lambda$plnluGjWCIUIIl9iDWFWVAy0Y(final WallpapersListActivity wallpapersListActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        wallpapersListActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadWallpapers(false);
            }
        });
    }

    @Override
    public void onResume() {
        TLRPC.WallPaper wallPaper;
        super.onResume();
        MessagesController.getGlobalMainSettings();
        Theme.ThemeInfo activeTheme = Theme.getActiveTheme();
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
            Theme.OverrideWallpaperInfo overrideWallpaperInfo = activeTheme.overrideWallpaper;
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

    @Override
    public void restoreSelfArgs(Bundle bundle) {
        this.updater.setCurrentPicturePath(bundle.getString("path"));
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
                    View view = (View) this.actionModeViews.get(i3);
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
            themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                @Override
                public final void didSetNewBackground(TLRPC.WallPaper wallPaper2) {
                    this.f$0.removeSelfFromStack();
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

    private void showAsSheet(ThemePreviewActivity themePreviewActivity) {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        themePreviewActivity.setResourceProvider(this.resourceProvider);
        bottomSheetParams.onOpenAnimationFinished = new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.getInstance().closePhoto(false, false);
            }
        };
        bottomSheetParams.occupyNavigationBar = true;
        showAsSheet(themePreviewActivity, bottomSheetParams);
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
        if (i == NotificationCenter.wallpapersDidLoad) {
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
                        if (!(document instanceof TLRPC.TL_documentEmpty)) {
                            if (wallPaper.pattern && document != null && !this.patternsDict.containsKey(Long.valueOf(document.id))) {
                                this.patterns.add(wallPaper);
                                this.patternsDict.put(Long.valueOf(wallPaper.document.id), wallPaper);
                            }
                            this.allWallPapersDict.put(wallPaper.slug, wallPaper);
                            int i8 = this.currentType;
                            if (i8 != 1 && ((!(z = wallPaper.pattern) || ((wallPaperSettings4 = wallPaper.settings) != null && wallPaperSettings4.background_color != 0)) && ((i8 != 2 || z) && (Theme.isCurrentThemeDark() || (wallPaperSettings3 = wallPaper.settings) == null || wallPaperSettings3.intensity >= 0)))) {
                                this.wallPapers.add(wallPaper);
                            }
                        } else {
                            wallPaperSettings = wallPaper.settings;
                            i3 = wallPaperSettings.background_color;
                            if (i3 == 0) {
                                i4 = wallPaperSettings.second_background_color;
                                if (i4 == 0 && (i5 = wallPaperSettings.third_background_color) != 0) {
                                    colorWallpaper = new ColorWallpaper(null, i3, i4, i5, wallPaperSettings.fourth_background_color);
                                } else {
                                    colorWallpaper = new ColorWallpaper(null, i3, i4, wallPaperSettings.rotation);
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
                                        if (!Theme.isCurrentThemeDark() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0) {
                                            this.wallPapers.add(colorWallpaper);
                                        }
                                    }
                                } else if (!Theme.isCurrentThemeDark()) {
                                    this.wallPapers.add(colorWallpaper);
                                } else {
                                    this.wallPapers.add(colorWallpaper);
                                }
                            }
                        }
                    } else {
                        wallPaperSettings = wallPaper.settings;
                        i3 = wallPaperSettings.background_color;
                        if (i3 == 0) {
                            i4 = wallPaperSettings.second_background_color;
                            if (i4 == 0) {
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
                                    if (!Theme.isCurrentThemeDark()) {
                                        this.wallPapers.add(colorWallpaper);
                                    } else {
                                        this.wallPapers.add(colorWallpaper);
                                    }
                                }
                            } else if (!Theme.isCurrentThemeDark()) {
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
            return;
        }
        if (i == NotificationCenter.didSetNewWallpapper) {
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
        if (i == NotificationCenter.wallpapersNeedReload) {
            getMessagesStorage().getWallpapers();
        }
    }

    public void loadWallpapers(final boolean z) {
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                WallpapersListActivity.m4783$r8$lambda$7zYtv6K0xW92C4pSJLixru3o7g(this.f$0, z, tLObject, tL_error);
            }
        }), this.classGuid);
    }

    public static void m4783$r8$lambda$7zYtv6K0xW92C4pSJLixru3o7g(final WallpapersListActivity wallpapersListActivity, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        wallpapersListActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WallpapersListActivity.$r8$lambda$cjY_gCgr2yKcfIZuawwfbh97W9k(this.f$0, tLObject, z);
            }
        });
    }

    public static void $r8$lambda$cjY_gCgr2yKcfIZuawwfbh97W9k(WallpapersListActivity wallpapersListActivity, TLObject tLObject, boolean z) {
        ColorWallpaper colorWallpaper;
        int i;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z2;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        wallpapersListActivity.getClass();
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            wallpapersListActivity.patterns.clear();
            wallpapersListActivity.patternsDict.clear();
            int i2 = wallpapersListActivity.currentType;
            if (i2 != 1 && i2 != 2) {
                wallpapersListActivity.wallPapers.clear();
                wallpapersListActivity.allWallPapersDict.clear();
                wallpapersListActivity.allWallPapers.clear();
                wallpapersListActivity.allWallPapers.addAll(tL_wallPapers.wallpapers);
                wallpapersListActivity.wallPapers.addAll(wallpapersListActivity.localWallPapers);
            }
            int size = tL_wallPapers.wallpapers.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i3);
                if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                        wallpapersListActivity.allWallPapersDict.put(wallPaper.slug, wallPaper);
                        if (wallPaper.pattern && (document = wallPaper.document) != null && !wallpapersListActivity.patternsDict.containsKey(Long.valueOf(document.id))) {
                            wallpapersListActivity.patterns.add(wallPaper);
                            wallpapersListActivity.patternsDict.put(Long.valueOf(wallPaper.document.id), wallPaper);
                        }
                        int i4 = wallpapersListActivity.currentType;
                        if (i4 != 1 && ((!(z2 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i4 != 2 || z2) && (Theme.isCurrentThemeDark() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                            wallpapersListActivity.wallPapers.add(wallPaper);
                        }
                    } else if (wallPaper.settings.background_color != 0 && (Theme.isCurrentThemeDark() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                        TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                        int i5 = wallPaperSettings4.second_background_color;
                        if (i5 != 0 && (i = wallPaperSettings4.third_background_color) != 0) {
                            colorWallpaper = new ColorWallpaper(null, wallPaperSettings4.background_color, i5, i, wallPaperSettings4.fourth_background_color);
                        } else {
                            colorWallpaper = new ColorWallpaper(null, wallPaperSettings4.background_color, i5, wallPaperSettings4.rotation);
                        }
                        colorWallpaper.slug = wallPaper.slug;
                        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper.settings;
                        colorWallpaper.intensity = wallPaperSettings5.intensity / 100.0f;
                        colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings5.rotation, false);
                        colorWallpaper.parentWallpaper = wallPaper;
                        wallpapersListActivity.wallPapers.add(colorWallpaper);
                    }
                }
            }
            wallpapersListActivity.fillWallpapersWithCustom();
            wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        AlertDialog alertDialog = wallpapersListActivity.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            if (z) {
                return;
            }
            wallpapersListActivity.listView.smoothScrollToPosition(0);
        }
    }

    private void fillWallpapersWithCustom() {
        ?? r5;
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
        ?? r6;
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
                    r5 = 0;
                    break;
                }
                Object obj = this.wallPapers.get(i7);
                if (obj instanceof ColorWallpaper) {
                    r5 = (ColorWallpaper) obj;
                    String str4 = r5.slug;
                    if (str4 != null) {
                        r5.pattern = (TLRPC.TL_wallPaper) this.allWallPapersDict.get(str4);
                    }
                    if (("c".equals(r5.slug) || (str3 = r5.slug) == null || TextUtils.equals(this.selectedBackgroundSlug, str3)) && this.selectedColor == r5.color && (i5 = this.selectedGradientColor1) == r5.gradientColor1 && this.selectedGradientColor2 == r5.gradientColor2 && this.selectedGradientColor3 == r5.gradientColor3 && (i5 == 0 || this.selectedGradientRotation == r5.gradientRotation)) {
                        break;
                    } else {
                        i7++;
                    }
                } else {
                    if (obj instanceof TLRPC.TL_wallPaper) {
                        r5 = (TLRPC.TL_wallPaper) obj;
                        if (r5.settings != null && TextUtils.equals(this.selectedBackgroundSlug, r5.slug) && this.selectedColor == Theme.getWallpaperColor(r5.settings.background_color) && this.selectedGradientColor1 == Theme.getWallpaperColor(r5.settings.second_background_color) && this.selectedGradientColor2 == Theme.getWallpaperColor(r5.settings.third_background_color) && this.selectedGradientColor3 == Theme.getWallpaperColor(r5.settings.fourth_background_color) && ((this.selectedGradientColor1 == 0 || this.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(r5.settings.rotation, false)) && Math.abs(Theme.getThemeIntensity(r5.settings.intensity / 100.0f) - this.selectedIntensity) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i7++;
                }
            }
            if (r5 instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) r5;
                Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.getActiveTheme().overrideWallpaper;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
                if (wallPaperSettings == null || this.selectedColor != Theme.getWallpaperColor(wallPaperSettings.background_color) || this.selectedGradientColor1 != Theme.getWallpaperColor(tL_wallPaper3.settings.second_background_color) || this.selectedGradientColor2 != Theme.getWallpaperColor(tL_wallPaper3.settings.third_background_color) || this.selectedGradientColor3 != Theme.getWallpaperColor(tL_wallPaper3.settings.fourth_background_color) || (this.selectedGradientColor1 != 0 && this.selectedGradientColor2 == 0 && this.selectedGradientRotation != AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) && Math.abs(Theme.getThemeIntensity(tL_wallPaper3.settings.intensity / 100.0f) - this.selectedIntensity) > 0.001f)) {
                    str2 = "";
                    tL_wallPaper2 = tL_wallPaper3;
                    r6 = 0;
                } else {
                    str2 = this.selectedBackgroundSlug;
                    tL_wallPaper2 = null;
                    r6 = r5;
                }
                str = str2;
                tL_wallPaper = tL_wallPaper2;
                r10 = r6;
                j = tL_wallPaper3.id;
            } else {
                str = this.selectedBackgroundSlug;
                j = (!(r5 instanceof ColorWallpaper) || (wallPaper = ((ColorWallpaper) r5).parentWallpaper) == null) ? 0L : wallPaper.id;
                r10 = r5;
                tL_wallPaper = null;
            }
            final boolean zIsDark = Theme.getCurrentTheme().isDark();
            try {
                Collections.sort(this.wallPapers, new Comparator() {
                    @Override
                    public final int compare(Object obj2, Object obj3) {
                        return WallpapersListActivity.m4785$r8$lambda$X3yZjldfwBnZ8wMqTasT2ktGL8(this.f$0, j, str, zIsDark, obj2, obj3);
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
            if (TextUtils.isEmpty(this.selectedBackgroundSlug) || (!"d".equals(this.selectedBackgroundSlug) && r10 == 0)) {
                if (!"c".equals(this.selectedBackgroundSlug) && (i2 = this.selectedColor) != 0) {
                    if (activeTheme.overrideWallpaper != null) {
                        ColorWallpaper colorWallpaper4 = new ColorWallpaper(this.selectedBackgroundSlug, i2, this.selectedGradientColor1, this.selectedGradientColor2, this.selectedGradientColor3, this.selectedGradientRotation, this.selectedIntensity, this.selectedBackgroundMotion, new File(ApplicationLoader.getFilesDirFixed(), activeTheme.overrideWallpaper.fileName));
                        this.addedColorWallpaper = colorWallpaper4;
                        colorWallpaper4.pattern = tL_wallPaper;
                        this.wallPapers.add(0, colorWallpaper4);
                    }
                } else {
                    int i8 = this.selectedColor;
                    if (i8 != 0) {
                        int i9 = this.selectedGradientColor1;
                        if (i9 != 0 && (i = this.selectedGradientColor2) != 0) {
                            ColorWallpaper colorWallpaper5 = new ColorWallpaper(this.selectedBackgroundSlug, i8, i9, i, this.selectedGradientColor3);
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
            } else if (r10 == 0 && this.selectedColor != 0 && "c".equals(this.selectedBackgroundSlug)) {
                int i10 = this.selectedGradientColor1;
                if (i10 != 0 && (i3 = this.selectedGradientColor2) != 0 && (i4 = this.selectedGradientColor3) != 0) {
                    ColorWallpaper colorWallpaper6 = new ColorWallpaper(this.selectedBackgroundSlug, this.selectedColor, i10, i3, i4);
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

    public static int m4785$r8$lambda$X3yZjldfwBnZ8wMqTasT2ktGL8(WallpapersListActivity wallpapersListActivity, long j, String str, boolean z, Object obj, Object obj2) {
        wallpapersListActivity.getClass();
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
        int iIndexOf = wallpapersListActivity.allWallPapers.indexOf(wallPaper);
        int iIndexOf2 = wallpapersListActivity.allWallPapers.indexOf(wallPaper2);
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
        if (!this.wallPapers.isEmpty()) {
            int iCeil = (int) Math.ceil(this.wallPapers.size() / this.columnsCount);
            this.totalWallpaperRows = iCeil;
            int i2 = this.rowCount;
            this.wallPaperStartRow = i2;
            this.rowCount = i2 + iCeil;
        } else {
            this.wallPaperStartRow = -1;
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

    class SearchAdapter extends RecyclerListView.SelectionAdapter {
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
        private ArrayList searchResult = new ArrayList();
        private HashMap searchResultKeys = new HashMap();
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
                return new RecyclerListView.Holder(WallpapersListActivity.this.new ColorCell(searchAdapter.mContext));
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
                            WallpapersListActivity.SearchAdapter.$r8$lambda$rJ9qX6XYeRwO8WGB3mOpdASh3rA(this.f$0, str);
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

        public static void $r8$lambda$rJ9qX6XYeRwO8WGB3mOpdASh3rA(SearchAdapter searchAdapter, String str) {
            searchAdapter.doSearch(str);
            searchAdapter.searchRunnable = null;
        }

        private void doSearch(String str) {
            this.searchResult.clear();
            this.searchResultKeys.clear();
            this.bingSearchEndReached = true;
            searchImages(str, "", true);
            this.lastSearchString = str;
            notifyDataSetChanged();
        }

        private void searchBotUser() {
            if (this.searchingUser) {
                return;
            }
            this.searchingUser = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).imageSearchBot;
            ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    WallpapersListActivity.SearchAdapter.m4790$r8$lambda$aFh6x1UW2_LzlIvxZPBj40akb4(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void m4790$r8$lambda$aFh6x1UW2_LzlIvxZPBj40akb4(final SearchAdapter searchAdapter, final TLObject tLObject, TLRPC.TL_error tL_error) {
            searchAdapter.getClass();
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        WallpapersListActivity.SearchAdapter.$r8$lambda$8XQWcWqYXGOj9myOZ3ul4jXwsEM(this.f$0, tLObject);
                    }
                });
            }
        }

        public static void $r8$lambda$8XQWcWqYXGOj9myOZ3ul4jXwsEM(SearchAdapter searchAdapter, TLObject tLObject) {
            searchAdapter.getClass();
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            WallpapersListActivity.this.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
            String str = searchAdapter.lastSearchImageString;
            searchAdapter.lastSearchImageString = null;
            searchAdapter.searchImages(str, "", false);
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
            if (!(userOrChat instanceof TLRPC.User)) {
                if (z) {
                    searchBotUser();
                    return;
                }
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.query = "#wallpaper " + str;
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            final int i = this.lastSearchToken + 1;
            this.lastSearchToken = i;
            this.imageReqId = ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    WallpapersListActivity.SearchAdapter.m4789$r8$lambda$20W4i7ifNTaxs1i3t5ioKSjUFo(this.f$0, i, tLObject, tL_error);
                }
            });
            ConnectionsManager.getInstance(((BaseFragment) WallpapersListActivity.this).currentAccount).bindRequestToGuid(this.imageReqId, ((BaseFragment) WallpapersListActivity.this).classGuid);
        }

        public static void m4789$r8$lambda$20W4i7ifNTaxs1i3t5ioKSjUFo(final SearchAdapter searchAdapter, final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
            searchAdapter.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    WallpapersListActivity.SearchAdapter.$r8$lambda$VnyBTM75juEbDBeOSTkWv0NUVT8(this.f$0, i, tLObject);
                }
            });
        }

        public static void $r8$lambda$VnyBTM75juEbDBeOSTkWv0NUVT8(SearchAdapter searchAdapter, int i, TLObject tLObject) {
            if (i != searchAdapter.lastSearchToken) {
                return;
            }
            searchAdapter.imageReqId = 0;
            int size = searchAdapter.searchResult.size();
            if (tLObject != null) {
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                searchAdapter.nextImagesSearchOffset = messages_botresults.next_offset;
                int size2 = messages_botresults.results.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i2);
                    if ("photo".equals(botInlineResult.type) && !searchAdapter.searchResultKeys.containsKey(botInlineResult.id)) {
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
                                searchAdapter.searchResult.add(searchImage);
                                searchAdapter.searchResultKeys.put(searchImage.id, searchImage);
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
                            searchAdapter.searchResult.add(searchImage);
                            searchAdapter.searchResultKeys.put(searchImage.id, searchImage);
                        }
                    }
                }
                searchAdapter.bingSearchEndReached = size == searchAdapter.searchResult.size() || searchAdapter.nextImagesSearchOffset == null;
            }
            if (size != searchAdapter.searchResult.size()) {
                int i4 = size % WallpapersListActivity.this.columnsCount;
                float f = size;
                int iCeil = (int) Math.ceil(f / WallpapersListActivity.this.columnsCount);
                if (i4 != 0) {
                    searchAdapter.notifyItemChanged(((int) Math.ceil(f / WallpapersListActivity.this.columnsCount)) - 1);
                }
                WallpapersListActivity.this.searchAdapter.notifyItemRangeInserted(iCeil, ((int) Math.ceil(searchAdapter.searchResult.size() / WallpapersListActivity.this.columnsCount)) - iCeil);
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

        public static void $r8$lambda$AZ3eBseOQMUD9ozugNA6g5McQ_c(SearchAdapter searchAdapter, View view, int i) {
            searchAdapter.getClass();
            String string = LocaleController.getString(R.string.BackgroundSearchColor);
            SpannableString spannableString = new SpannableString(string + " " + LocaleController.getString(WallpapersListActivity.searchColorsNames[i], WallpapersListActivity.searchColorsNamesR[i]));
            spannableString.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_actionBarDefaultSubtitle)), string.length(), spannableString.length(), 33);
            WallpapersListActivity.this.searchItem.setSearchFieldCaption(spannableString);
            WallpapersListActivity.this.searchItem.setSearchFieldHint(null);
            WallpapersListActivity.this.searchItem.setSearchFieldText("", true);
            searchAdapter.selectedColor = WallpapersListActivity.searchColorsNames[i];
            searchAdapter.processSearch("", true);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            if (i != 0) {
                graySectionCell = null;
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
                    recyclerListView.setItemAnimator(null);
                    recyclerListView.setLayoutAnimation(null);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext) {
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
                    recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                        @Override
                        public final void onItemClick(View view, int i2) {
                            WallpapersListActivity.SearchAdapter.$r8$lambda$AZ3eBseOQMUD9ozugNA6g5McQ_c(this.f$0, view, i2);
                        }
                    });
                    this.innerListView = recyclerListView;
                    graySectionCell = recyclerListView;
                } else if (i == 2) {
                    graySectionCell = new GraySectionCell(this.mContext);
                }
            } else {
                graySectionCell = new WallpaperCell(this.mContext) {
                    @Override
                    protected void onWallpaperClick(Object obj, int i2) {
                        WallpapersListActivity.this.presentFragment(new ThemePreviewActivity(obj, null, true, false));
                    }
                };
            }
            if (i == 1) {
                graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(60.0f)));
            } else {
                graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            }
            return new RecyclerListView.Holder(graySectionCell);
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
            int i2 = i * WallpapersListActivity.this.columnsCount;
            wallpaperCell.setParams(WallpapersListActivity.this.columnsCount, i2 == 0, i2 / WallpapersListActivity.this.columnsCount == ((int) Math.ceil((double) (((float) this.searchResult.size()) / ((float) WallpapersListActivity.this.columnsCount)))) - 1);
            for (int i3 = 0; i3 < WallpapersListActivity.this.columnsCount; i3++) {
                int i4 = i2 + i3;
                wallpaperCell.setWallpaper(WallpapersListActivity.this.currentType, i3, i4 < this.searchResult.size() ? this.searchResult.get(i4) : null, "", null, false);
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

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
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
            if (i == 0) {
                textCell = new TextCell(this.mContext);
            } else if (i == 1) {
                textCell = new ShadowSectionCell(this.mContext);
            } else if (i == 3) {
                textCell = new TextInfoPrivacyCell(this.mContext);
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
            return new RecyclerListView.Holder(textCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
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
                        textCell.setText(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                        return;
                    }
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SetColor), R.drawable.msg_palette, true);
                    return;
                }
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SelectFromGallery), R.drawable.msg_photos, true);
                return;
            }
            if (itemViewType != 2) {
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
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                return;
            }
            WallpaperCell wallpaperCell = (WallpaperCell) viewHolder.itemView;
            int i2 = (i - WallpapersListActivity.this.wallPaperStartRow) * WallpapersListActivity.this.columnsCount;
            wallpaperCell.setParams(WallpapersListActivity.this.columnsCount, i2 == 0, i2 / WallpapersListActivity.this.columnsCount == WallpapersListActivity.this.totalWallpaperRows - 1);
            for (int i3 = 0; i3 < WallpapersListActivity.this.columnsCount; i3++) {
                int i4 = i2 + i3;
                Object obj = null;
                Object obj2 = i4 < WallpapersListActivity.this.wallPapers.size() ? WallpapersListActivity.this.wallPapers.get(i4) : null;
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.getActiveTheme().overrideWallpaper;
                    if (WallpapersListActivity.this.selectedBackgroundSlug.equals(tL_wallPaper.slug) && (!WallpapersListActivity.this.selectedBackgroundSlug.equals(tL_wallPaper.slug) || tL_wallPaper.settings == null || (WallpapersListActivity.this.selectedColor == Theme.getWallpaperColor(tL_wallPaper.settings.background_color) && WallpapersListActivity.this.selectedGradientColor1 == Theme.getWallpaperColor(tL_wallPaper.settings.second_background_color) && WallpapersListActivity.this.selectedGradientColor2 == Theme.getWallpaperColor(tL_wallPaper.settings.third_background_color) && WallpapersListActivity.this.selectedGradientColor3 == Theme.getWallpaperColor(tL_wallPaper.settings.fourth_background_color) && (WallpapersListActivity.this.selectedGradientColor1 == 0 || WallpapersListActivity.this.selectedGradientColor2 != 0 || WallpapersListActivity.this.selectedGradientRotation == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(Theme.getThemeIntensity(tL_wallPaper.settings.intensity / 100.0f) - WallpapersListActivity.this.selectedIntensity) <= 0.001f)))) {
                        obj = tL_wallPaper;
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
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 0, null, null, null, null, i));
        View view2 = this.fragmentView;
        int i2 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(view2, 0, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
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
