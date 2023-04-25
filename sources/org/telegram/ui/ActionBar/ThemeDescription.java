package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.SpannedString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatBigEmptyView;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScamDrawable;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.TypefaceSpan;
public class ThemeDescription {
    public static int FLAG_AB_AM_BACKGROUND = 1048576;
    public static int FLAG_AB_AM_ITEMSCOLOR = 512;
    public static int FLAG_AB_AM_SELECTORCOLOR = 4194304;
    public static int FLAG_AB_AM_TOPBACKGROUND = 2097152;
    public static int FLAG_AB_ITEMSCOLOR = 64;
    public static int FLAG_AB_SEARCH = 134217728;
    public static int FLAG_AB_SEARCHPLACEHOLDER = 67108864;
    public static int FLAG_AB_SELECTORCOLOR = 256;
    public static int FLAG_AB_SUBMENUBACKGROUND = Integer.MIN_VALUE;
    public static int FLAG_AB_SUBMENUITEM = 1073741824;
    public static int FLAG_AB_SUBTITLECOLOR = 1024;
    public static int FLAG_AB_TITLECOLOR = 128;
    public static int FLAG_BACKGROUND = 1;
    public static int FLAG_BACKGROUNDFILTER = 32;
    public static int FLAG_CELLBACKGROUNDCOLOR = 16;
    public static int FLAG_CHECKBOX = 8192;
    public static int FLAG_CHECKBOXCHECK = 16384;
    public static int FLAG_CHECKTAG = 262144;
    public static int FLAG_CURSORCOLOR = 16777216;
    public static int FLAG_DRAWABLESELECTEDSTATE = 65536;
    public static int FLAG_FASTSCROLL = 33554432;
    public static int FLAG_HINTTEXTCOLOR = 8388608;
    public static int FLAG_IMAGECOLOR = 8;
    public static int FLAG_LINKCOLOR = 2;
    public static int FLAG_LISTGLOWCOLOR = 32768;
    public static int FLAG_PROGRESSBAR = 2048;
    public static int FLAG_SECTIONS = 524288;
    public static int FLAG_SELECTOR = 4096;
    public static int FLAG_SELECTORWHITE = 268435456;
    public static int FLAG_SERVICEBACKGROUND = 536870912;
    public static int FLAG_TEXTCOLOR = 4;
    public static int FLAG_USEBACKGROUNDDRAWABLE = 131072;
    private int alphaOverride;
    private HashMap<String, Field> cachedFields;
    private int changeFlags;
    private int currentColor;
    private int currentKey;
    private ThemeDescriptionDelegate delegate;
    private Drawable[] drawablesToUpdate;
    private Class[] listClasses;
    private String[] listClassesFieldName;
    private String lottieLayerName;
    private HashMap<String, Boolean> notFoundCachedFields;
    private Paint[] paintToUpdate;
    private int previousColor;
    private boolean[] previousIsDefault;
    public Theme.ResourcesProvider resourcesProvider;
    private View viewToInvalidate;

    public interface ThemeDescriptionDelegate {

        public final class CC {
            public static void $default$onAnimationProgress(ThemeDescriptionDelegate themeDescriptionDelegate, float f) {
            }
        }

        void didSetColor();

        void onAnimationProgress(float f);
    }

    public ThemeDescription(View view, int i, Class[] clsArr, Paint[] paintArr, Drawable[] drawableArr, ThemeDescriptionDelegate themeDescriptionDelegate, int i2, Object obj) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        this.paintToUpdate = paintArr;
        this.drawablesToUpdate = drawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.delegate = themeDescriptionDelegate;
        if (view instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view).getEditText();
        }
    }

    public ThemeDescription(View view, int i, Class[] clsArr, Paint paint, Drawable[] drawableArr, ThemeDescriptionDelegate themeDescriptionDelegate, int i2) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        if (paint != null) {
            this.paintToUpdate = new Paint[]{paint};
        }
        this.drawablesToUpdate = drawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.delegate = themeDescriptionDelegate;
        if (view instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view).getEditText();
        }
    }

    public ThemeDescription(View view, int i, Class[] clsArr, RLottieDrawable[] rLottieDrawableArr, String str, int i2) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        this.lottieLayerName = str;
        this.drawablesToUpdate = rLottieDrawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        if (view instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view).getEditText();
        }
    }

    public ThemeDescription(View view, int i, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, ThemeDescriptionDelegate themeDescriptionDelegate, int i2) {
        this(view, i, clsArr, strArr, paintArr, drawableArr, -1, themeDescriptionDelegate, i2);
    }

    public ThemeDescription(View view, int i, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i2, ThemeDescriptionDelegate themeDescriptionDelegate, int i3) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i3;
        this.paintToUpdate = paintArr;
        this.drawablesToUpdate = drawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.listClassesFieldName = strArr;
        this.alphaOverride = i2;
        this.delegate = themeDescriptionDelegate;
        this.cachedFields = new HashMap<>();
        this.notFoundCachedFields = new HashMap<>();
        View view2 = this.viewToInvalidate;
        if (view2 instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view2).getEditText();
        }
    }

    public ThemeDescription(View view, int i, Class[] clsArr, String[] strArr, String str, int i2) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        this.lottieLayerName = str;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.listClassesFieldName = strArr;
        this.cachedFields = new HashMap<>();
        this.notFoundCachedFields = new HashMap<>();
        View view2 = this.viewToInvalidate;
        if (view2 instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view2).getEditText();
        }
    }

    public ThemeDescriptionDelegate setDelegateDisabled() {
        ThemeDescriptionDelegate themeDescriptionDelegate = this.delegate;
        this.delegate = null;
        return themeDescriptionDelegate;
    }

    public void setColor(int i, boolean z) {
        setColor(i, z, true);
    }

    private boolean checkTag(int i, View view) {
        if (i < 0 || view == null) {
            return false;
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == i;
    }

    public void setColor(int i, boolean z, boolean z2) {
        Class[] clsArr;
        Drawable[] compoundDrawables;
        if (z2) {
            Theme.setColor(this.currentKey, i, z);
        }
        this.currentColor = i;
        int i2 = this.alphaOverride;
        if (i2 > 0) {
            i = Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
        }
        if (this.paintToUpdate != null) {
            int i3 = 0;
            while (true) {
                Paint[] paintArr = this.paintToUpdate;
                if (i3 >= paintArr.length) {
                    break;
                }
                if ((this.changeFlags & FLAG_LINKCOLOR) != 0 && (paintArr[i3] instanceof TextPaint)) {
                    ((TextPaint) paintArr[i3]).linkColor = i;
                } else {
                    paintArr[i3].setColor(i);
                }
                i3++;
            }
        }
        if (this.drawablesToUpdate != null) {
            int i4 = 0;
            while (true) {
                Drawable[] drawableArr = this.drawablesToUpdate;
                if (i4 >= drawableArr.length) {
                    break;
                }
                if (drawableArr[i4] != null) {
                    if (drawableArr[i4] instanceof BackDrawable) {
                        ((BackDrawable) drawableArr[i4]).setColor(i);
                    } else if (drawableArr[i4] instanceof ScamDrawable) {
                        ((ScamDrawable) drawableArr[i4]).setColor(i);
                    } else if (drawableArr[i4] instanceof RLottieDrawable) {
                        if (this.lottieLayerName != null) {
                            ((RLottieDrawable) drawableArr[i4]).setLayerColor(this.lottieLayerName + ".**", i);
                        }
                    } else if (drawableArr[i4] instanceof CombinedDrawable) {
                        if ((this.changeFlags & FLAG_BACKGROUNDFILTER) != 0) {
                            ((CombinedDrawable) drawableArr[i4]).getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((CombinedDrawable) drawableArr[i4]).getIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawableArr[i4] instanceof AvatarDrawable) {
                        ((AvatarDrawable) drawableArr[i4]).setColor(i);
                    } else if (drawableArr[i4] instanceof AnimatedArrowDrawable) {
                        ((AnimatedArrowDrawable) drawableArr[i4]).setColor(i);
                    } else {
                        drawableArr[i4].setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                }
                i4++;
            }
        }
        View view = this.viewToInvalidate;
        if (view != null && this.listClasses == null && this.listClassesFieldName == null && ((this.changeFlags & FLAG_CHECKTAG) == 0 || checkTag(this.currentKey, view))) {
            if ((this.changeFlags & FLAG_BACKGROUND) != 0) {
                Drawable background = this.viewToInvalidate.getBackground();
                if (background instanceof MessageBackgroundDrawable) {
                    MessageBackgroundDrawable messageBackgroundDrawable = (MessageBackgroundDrawable) background;
                    messageBackgroundDrawable.setColor(i);
                    messageBackgroundDrawable.setCustomPaint(null);
                } else {
                    this.viewToInvalidate.setBackgroundColor(i);
                }
            }
            int i5 = this.changeFlags;
            if ((FLAG_BACKGROUNDFILTER & i5) != 0) {
                if ((i5 & FLAG_PROGRESSBAR) != 0) {
                    View view2 = this.viewToInvalidate;
                    if (view2 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) view2).setErrorLineColor(i);
                    }
                } else {
                    Drawable background2 = this.viewToInvalidate.getBackground();
                    if (background2 instanceof CombinedDrawable) {
                        if ((this.changeFlags & FLAG_DRAWABLESELECTEDSTATE) != 0) {
                            background2 = ((CombinedDrawable) background2).getBackground();
                        } else {
                            background2 = ((CombinedDrawable) background2).getIcon();
                        }
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (Build.VERSION.SDK_INT >= 21 && (background2 instanceof RippleDrawable))) {
                            Theme.setSelectorDrawableColor(background2, i, (this.changeFlags & FLAG_DRAWABLESELECTEDSTATE) != 0);
                        } else if (background2 instanceof ShapeDrawable) {
                            ((ShapeDrawable) background2).getPaint().setColor(i);
                        } else {
                            background2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        View view3 = this.viewToInvalidate;
        if (view3 instanceof ActionBar) {
            if ((this.changeFlags & FLAG_AB_ITEMSCOLOR) != 0) {
                ((ActionBar) view3).setItemsColor(i, false);
            }
            if ((this.changeFlags & FLAG_AB_TITLECOLOR) != 0) {
                ((ActionBar) this.viewToInvalidate).setTitleColor(i);
            }
            if ((this.changeFlags & FLAG_AB_SELECTORCOLOR) != 0) {
                ((ActionBar) this.viewToInvalidate).setItemsBackgroundColor(i, false);
            }
            if ((this.changeFlags & FLAG_AB_AM_SELECTORCOLOR) != 0) {
                ((ActionBar) this.viewToInvalidate).setItemsBackgroundColor(i, true);
            }
            if ((this.changeFlags & FLAG_AB_AM_ITEMSCOLOR) != 0) {
                ((ActionBar) this.viewToInvalidate).setItemsColor(i, true);
            }
            if ((this.changeFlags & FLAG_AB_SUBTITLECOLOR) != 0) {
                ((ActionBar) this.viewToInvalidate).setSubtitleColor(i);
            }
            if ((this.changeFlags & FLAG_AB_AM_BACKGROUND) != 0) {
                ((ActionBar) this.viewToInvalidate).setActionModeColor(i);
            }
            if ((this.changeFlags & FLAG_AB_AM_TOPBACKGROUND) != 0) {
                ((ActionBar) this.viewToInvalidate).setActionModeTopColor(i);
            }
            if ((this.changeFlags & FLAG_AB_SEARCHPLACEHOLDER) != 0) {
                ((ActionBar) this.viewToInvalidate).setSearchTextColor(i, true);
            }
            if ((this.changeFlags & FLAG_AB_SEARCH) != 0) {
                ((ActionBar) this.viewToInvalidate).setSearchTextColor(i, false);
            }
            int i6 = this.changeFlags;
            if ((FLAG_AB_SUBMENUITEM & i6) != 0) {
                ((ActionBar) this.viewToInvalidate).setPopupItemsColor(i, (i6 & FLAG_IMAGECOLOR) != 0, false);
            }
            if ((this.changeFlags & FLAG_AB_SUBMENUBACKGROUND) != 0) {
                ((ActionBar) this.viewToInvalidate).setPopupBackgroundColor(i, false);
            }
        }
        View view4 = this.viewToInvalidate;
        if (view4 instanceof EmptyTextProgressView) {
            int i7 = this.changeFlags;
            if ((FLAG_TEXTCOLOR & i7) != 0) {
                ((EmptyTextProgressView) view4).setTextColor(i);
            } else if ((i7 & FLAG_PROGRESSBAR) != 0) {
                ((EmptyTextProgressView) view4).setProgressBarColor(i);
            }
        }
        View view5 = this.viewToInvalidate;
        if (view5 instanceof RadialProgressView) {
            ((RadialProgressView) view5).setProgressColor(i);
        } else if (view5 instanceof LineProgressView) {
            if ((this.changeFlags & FLAG_PROGRESSBAR) != 0) {
                ((LineProgressView) view5).setProgressColor(i);
            } else {
                ((LineProgressView) view5).setBackColor(i);
            }
        } else if (view5 instanceof ContextProgressView) {
            ((ContextProgressView) view5).updateColors();
        } else if ((view5 instanceof SeekBarView) && (this.changeFlags & FLAG_PROGRESSBAR) != 0) {
            ((SeekBarView) view5).setOuterColor(i);
        }
        int i8 = this.changeFlags;
        if ((FLAG_TEXTCOLOR & i8) != 0 && ((i8 & FLAG_CHECKTAG) == 0 || checkTag(this.currentKey, this.viewToInvalidate))) {
            View view6 = this.viewToInvalidate;
            if (view6 instanceof TextView) {
                ((TextView) view6).setTextColor(i);
            } else if (view6 instanceof NumberTextView) {
                ((NumberTextView) view6).setTextColor(i);
            } else if (view6 instanceof SimpleTextView) {
                ((SimpleTextView) view6).setTextColor(i);
            } else if (view6 instanceof ChatBigEmptyView) {
                ((ChatBigEmptyView) view6).setTextColor(i);
            }
        }
        if ((this.changeFlags & FLAG_CURSORCOLOR) != 0) {
            View view7 = this.viewToInvalidate;
            if (view7 instanceof EditTextBoldCursor) {
                ((EditTextBoldCursor) view7).setCursorColor(i);
            }
        }
        int i9 = this.changeFlags;
        if ((FLAG_HINTTEXTCOLOR & i9) != 0) {
            View view8 = this.viewToInvalidate;
            if (view8 instanceof EditTextBoldCursor) {
                if ((i9 & FLAG_PROGRESSBAR) != 0) {
                    ((EditTextBoldCursor) view8).setHeaderHintColor(i);
                } else {
                    ((EditTextBoldCursor) view8).setHintColor(i);
                }
            } else if (view8 instanceof EditText) {
                ((EditText) view8).setHintTextColor(i);
            }
        }
        View view9 = this.viewToInvalidate;
        int i10 = this.changeFlags;
        if ((FLAG_IMAGECOLOR & i10) != 0 && ((i10 & FLAG_CHECKTAG) == 0 || checkTag(this.currentKey, view9))) {
            View view10 = this.viewToInvalidate;
            if (view10 instanceof ImageView) {
                if ((this.changeFlags & FLAG_USEBACKGROUNDDRAWABLE) != 0) {
                    Drawable drawable = ((ImageView) view10).getDrawable();
                    if ((drawable instanceof StateListDrawable) || (Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable))) {
                        Theme.setSelectorDrawableColor(drawable, i, (this.changeFlags & FLAG_DRAWABLESELECTEDSTATE) != 0);
                    }
                } else {
                    ((ImageView) view10).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view10 instanceof BackupImageView)) {
                if (view10 instanceof SimpleTextView) {
                    ((SimpleTextView) view10).setSideDrawablesColor(i);
                } else if ((view10 instanceof TextView) && (compoundDrawables = ((TextView) view10).getCompoundDrawables()) != null) {
                    for (int i11 = 0; i11 < compoundDrawables.length; i11++) {
                        if (compoundDrawables[i11] != null) {
                            compoundDrawables[i11].setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        View view11 = this.viewToInvalidate;
        if ((view11 instanceof ScrollView) && (this.changeFlags & FLAG_LISTGLOWCOLOR) != 0) {
            AndroidUtilities.setScrollViewEdgeEffectColor((ScrollView) view11, i);
        }
        View view12 = this.viewToInvalidate;
        if ((view12 instanceof ViewPager) && (this.changeFlags & FLAG_LISTGLOWCOLOR) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((ViewPager) view12, i);
        }
        View view13 = this.viewToInvalidate;
        if (view13 instanceof RecyclerListView) {
            RecyclerListView recyclerListView = (RecyclerListView) view13;
            if ((this.changeFlags & FLAG_SELECTOR) != 0) {
                recyclerListView.setListSelectorColor(Integer.valueOf(i));
            }
            if ((this.changeFlags & FLAG_FASTSCROLL) != 0) {
                recyclerListView.updateFastScrollColors();
            }
            if ((this.changeFlags & FLAG_LISTGLOWCOLOR) != 0) {
                recyclerListView.setGlowColor(i);
            }
            if ((this.changeFlags & FLAG_SECTIONS) != 0) {
                ArrayList<View> headers = recyclerListView.getHeaders();
                if (headers != null) {
                    for (int i12 = 0; i12 < headers.size(); i12++) {
                        processViewColor(headers.get(i12), i);
                    }
                }
                ArrayList<View> headersCache = recyclerListView.getHeadersCache();
                if (headersCache != null) {
                    for (int i13 = 0; i13 < headersCache.size(); i13++) {
                        processViewColor(headersCache.get(i13), i);
                    }
                }
                View pinnedHeader = recyclerListView.getPinnedHeader();
                if (pinnedHeader != null) {
                    processViewColor(pinnedHeader, i);
                }
            }
        } else if (view13 != null && ((clsArr = this.listClasses) == null || clsArr.length == 0)) {
            int i14 = this.changeFlags;
            if ((FLAG_SELECTOR & i14) != 0) {
                view13.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            } else if ((i14 & FLAG_SELECTORWHITE) != 0) {
                view13.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            }
        }
        if (this.listClasses != null) {
            View view14 = this.viewToInvalidate;
            if (view14 instanceof RecyclerListView) {
                RecyclerListView recyclerListView2 = (RecyclerListView) view14;
                recyclerListView2.getRecycledViewPool().clear();
                int hiddenChildCount = recyclerListView2.getHiddenChildCount();
                for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                    processViewColor(recyclerListView2.getHiddenChildAt(i15), i);
                }
                int cachedChildCount = recyclerListView2.getCachedChildCount();
                for (int i16 = 0; i16 < cachedChildCount; i16++) {
                    processViewColor(recyclerListView2.getCachedChildAt(i16), i);
                }
                int attachedScrapChildCount = recyclerListView2.getAttachedScrapChildCount();
                for (int i17 = 0; i17 < attachedScrapChildCount; i17++) {
                    processViewColor(recyclerListView2.getAttachedScrapChildAt(i17), i);
                }
            }
            View view15 = this.viewToInvalidate;
            if (view15 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view15;
                int childCount = viewGroup.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    processViewColor(viewGroup.getChildAt(i18), i);
                }
            }
            processViewColor(this.viewToInvalidate, i);
        }
        ThemeDescriptionDelegate themeDescriptionDelegate = this.delegate;
        if (themeDescriptionDelegate != null) {
            themeDescriptionDelegate.didSetColor();
        }
        View view16 = this.viewToInvalidate;
        if (view16 != null) {
            view16.invalidate();
        }
    }

    private void processViewColor(View view, int i) {
        boolean z;
        Object obj;
        TypefaceSpan[] typefaceSpanArr;
        TypefaceSpan[] typefaceSpanArr2;
        TypefaceSpan[] typefaceSpanArr3;
        int i2 = 0;
        while (true) {
            Class[] clsArr = this.listClasses;
            if (i2 >= clsArr.length) {
                return;
            }
            if (clsArr[i2].isInstance(view)) {
                view.invalidate();
                boolean z2 = true;
                if ((this.changeFlags & FLAG_CHECKTAG) == 0 || checkTag(this.currentKey, view)) {
                    view.invalidate();
                    if (this.listClassesFieldName == null && (this.changeFlags & FLAG_BACKGROUNDFILTER) != 0) {
                        Drawable background = view.getBackground();
                        if (background != null) {
                            int i3 = this.changeFlags;
                            if ((FLAG_CELLBACKGROUNDCOLOR & i3) != 0) {
                                if (background instanceof CombinedDrawable) {
                                    Drawable background2 = ((CombinedDrawable) background).getBackground();
                                    if (background2 instanceof ColorDrawable) {
                                        ((ColorDrawable) background2).setColor(i);
                                    }
                                }
                            } else {
                                if (background instanceof CombinedDrawable) {
                                    background = ((CombinedDrawable) background).getIcon();
                                } else if ((background instanceof StateListDrawable) || (Build.VERSION.SDK_INT >= 21 && (background instanceof RippleDrawable))) {
                                    Theme.setSelectorDrawableColor(background, i, (i3 & FLAG_DRAWABLESELECTEDSTATE) != 0);
                                }
                                background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                            }
                        }
                    } else {
                        int i4 = this.changeFlags;
                        if ((FLAG_CELLBACKGROUNDCOLOR & i4) != 0) {
                            view.setBackgroundColor(i);
                        } else if ((FLAG_TEXTCOLOR & i4) != 0) {
                            if (view instanceof TextView) {
                                ((TextView) view).setTextColor(i);
                            } else if (view instanceof AudioPlayerAlert.ClippingTextViewSwitcher) {
                                int i5 = 0;
                                while (i5 < 2) {
                                    AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = (AudioPlayerAlert.ClippingTextViewSwitcher) view;
                                    TextView textView = i5 == 0 ? clippingTextViewSwitcher.getTextView() : clippingTextViewSwitcher.getNextTextView();
                                    if (textView != null) {
                                        textView.setTextColor(i);
                                    }
                                    i5++;
                                }
                            }
                        } else if ((FLAG_SERVICEBACKGROUND & i4) == 0) {
                            if ((FLAG_SELECTOR & i4) != 0) {
                                view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                            } else if ((i4 & FLAG_SELECTORWHITE) != 0) {
                                view.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                            }
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (this.listClassesFieldName != null) {
                    String str = this.listClasses[i2] + "_" + this.listClassesFieldName[i2];
                    HashMap<String, Boolean> hashMap = this.notFoundCachedFields;
                    if (hashMap == null || !hashMap.containsKey(str)) {
                        try {
                            Field field = this.cachedFields.get(str);
                            if (field == null && (field = this.listClasses[i2].getDeclaredField(this.listClassesFieldName[i2])) != null) {
                                field.setAccessible(true);
                                this.cachedFields.put(str, field);
                            }
                            if (field != null && (obj = field.get(view)) != null && (z || !(obj instanceof View) || checkTag(this.currentKey, (View) obj))) {
                                if (obj instanceof View) {
                                    ((View) obj).invalidate();
                                }
                                if (this.lottieLayerName != null && (obj instanceof RLottieImageView)) {
                                    ((RLottieImageView) obj).setLayerColor(this.lottieLayerName + ".**", i);
                                }
                                if ((this.changeFlags & FLAG_USEBACKGROUNDDRAWABLE) != 0 && (obj instanceof View)) {
                                    obj = ((View) obj).getBackground();
                                }
                                int i6 = this.changeFlags;
                                if ((FLAG_BACKGROUND & i6) != 0 && (obj instanceof View)) {
                                    View view2 = (View) obj;
                                    Drawable background3 = view2.getBackground();
                                    if (background3 instanceof MessageBackgroundDrawable) {
                                        ((MessageBackgroundDrawable) background3).setColor(i);
                                        ((MessageBackgroundDrawable) background3).setCustomPaint(null);
                                    } else {
                                        view2.setBackgroundColor(i);
                                    }
                                } else if (obj instanceof EditTextCaption) {
                                    if ((FLAG_HINTTEXTCOLOR & i6) != 0) {
                                        ((EditTextCaption) obj).setHintColor(i);
                                        ((EditTextCaption) obj).setHintTextColor(i);
                                    } else if ((i6 & FLAG_CURSORCOLOR) != 0) {
                                        ((EditTextCaption) obj).setCursorColor(i);
                                    } else {
                                        ((EditTextCaption) obj).setTextColor(i);
                                    }
                                } else if (obj instanceof SimpleTextView) {
                                    if ((i6 & FLAG_LINKCOLOR) != 0) {
                                        ((SimpleTextView) obj).setLinkTextColor(i);
                                    } else {
                                        ((SimpleTextView) obj).setTextColor(i);
                                    }
                                } else if (obj instanceof TextView) {
                                    TextView textView2 = (TextView) obj;
                                    if ((FLAG_IMAGECOLOR & i6) != 0) {
                                        Drawable[] compoundDrawables = textView2.getCompoundDrawables();
                                        if (compoundDrawables != null) {
                                            for (int i7 = 0; i7 < compoundDrawables.length; i7++) {
                                                if (compoundDrawables[i7] != null) {
                                                    compoundDrawables[i7].setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                                }
                                            }
                                        }
                                    } else if ((FLAG_LINKCOLOR & i6) != 0) {
                                        textView2.getPaint().linkColor = i;
                                        textView2.invalidate();
                                    } else if ((i6 & FLAG_FASTSCROLL) != 0) {
                                        CharSequence text = textView2.getText();
                                        if ((text instanceof SpannedString) && (typefaceSpanArr3 = (TypefaceSpan[]) ((SpannedString) text).getSpans(0, text.length(), TypefaceSpan.class)) != null && typefaceSpanArr3.length > 0) {
                                            for (TypefaceSpan typefaceSpan : typefaceSpanArr3) {
                                                typefaceSpan.setColor(i);
                                            }
                                        }
                                    } else {
                                        textView2.setTextColor(i);
                                    }
                                } else if (obj instanceof ImageView) {
                                    ImageView imageView = (ImageView) obj;
                                    Drawable drawable = imageView.getDrawable();
                                    if (drawable instanceof CombinedDrawable) {
                                        if ((this.changeFlags & FLAG_BACKGROUNDFILTER) != 0) {
                                            ((CombinedDrawable) drawable).getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((CombinedDrawable) drawable).getIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else {
                                        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (obj instanceof BackupImageView) {
                                    Drawable staticThumb = ((BackupImageView) obj).getImageReceiver().getStaticThumb();
                                    if (staticThumb instanceof CombinedDrawable) {
                                        if ((this.changeFlags & FLAG_BACKGROUNDFILTER) != 0) {
                                            ((CombinedDrawable) staticThumb).getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((CombinedDrawable) staticThumb).getIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (staticThumb != null) {
                                        staticThumb.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (obj instanceof Drawable) {
                                    if (obj instanceof LetterDrawable) {
                                        if ((i6 & FLAG_BACKGROUNDFILTER) != 0) {
                                            ((LetterDrawable) obj).setBackgroundColor(i);
                                        } else {
                                            ((LetterDrawable) obj).setColor(i);
                                        }
                                    } else if (obj instanceof CombinedDrawable) {
                                        if ((i6 & FLAG_BACKGROUNDFILTER) != 0) {
                                            ((CombinedDrawable) obj).getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((CombinedDrawable) obj).getIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else {
                                        if (!(obj instanceof StateListDrawable) && (Build.VERSION.SDK_INT < 21 || !(obj instanceof RippleDrawable))) {
                                            if (obj instanceof GradientDrawable) {
                                                ((GradientDrawable) obj).setColor(i);
                                            } else {
                                                ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                            }
                                        }
                                        Drawable drawable2 = (Drawable) obj;
                                        if ((i6 & FLAG_DRAWABLESELECTEDSTATE) == 0) {
                                            z2 = false;
                                        }
                                        Theme.setSelectorDrawableColor(drawable2, i, z2);
                                    }
                                } else if (obj instanceof CheckBox) {
                                    if ((FLAG_CHECKBOX & i6) != 0) {
                                        ((CheckBox) obj).setBackgroundColor(i);
                                    } else if ((i6 & FLAG_CHECKBOXCHECK) != 0) {
                                        ((CheckBox) obj).setCheckColor(i);
                                    }
                                } else if (obj instanceof GroupCreateCheckBox) {
                                    ((GroupCreateCheckBox) obj).updateColors();
                                } else if (obj instanceof Integer) {
                                    field.set(view, Integer.valueOf(i));
                                } else if (obj instanceof RadioButton) {
                                    if ((FLAG_CHECKBOX & i6) != 0) {
                                        ((RadioButton) obj).setBackgroundColor(i);
                                        ((RadioButton) obj).invalidate();
                                    } else if ((i6 & FLAG_CHECKBOXCHECK) != 0) {
                                        ((RadioButton) obj).setCheckedColor(i);
                                        ((RadioButton) obj).invalidate();
                                    }
                                } else if (obj instanceof TextPaint) {
                                    if ((i6 & FLAG_LINKCOLOR) != 0) {
                                        ((TextPaint) obj).linkColor = i;
                                    } else {
                                        ((TextPaint) obj).setColor(i);
                                    }
                                } else if (obj instanceof LineProgressView) {
                                    if ((i6 & FLAG_PROGRESSBAR) != 0) {
                                        ((LineProgressView) obj).setProgressColor(i);
                                    } else {
                                        ((LineProgressView) obj).setBackColor(i);
                                    }
                                } else if (obj instanceof RadialProgressView) {
                                    ((RadialProgressView) obj).setProgressColor(i);
                                } else if (obj instanceof Paint) {
                                    ((Paint) obj).setColor(i);
                                    view.invalidate();
                                } else if (obj instanceof SeekBarView) {
                                    if ((i6 & FLAG_PROGRESSBAR) != 0) {
                                        ((SeekBarView) obj).setOuterColor(i);
                                    } else {
                                        ((SeekBarView) obj).setInnerColor(i);
                                    }
                                } else if (obj instanceof AudioPlayerAlert.ClippingTextViewSwitcher) {
                                    if ((FLAG_FASTSCROLL & i6) != 0) {
                                        int i8 = 0;
                                        while (i8 < 2) {
                                            TextView textView3 = i8 == 0 ? ((AudioPlayerAlert.ClippingTextViewSwitcher) obj).getTextView() : ((AudioPlayerAlert.ClippingTextViewSwitcher) obj).getNextTextView();
                                            if (textView3 != null) {
                                                CharSequence text2 = textView3.getText();
                                                if ((text2 instanceof SpannedString) && (typefaceSpanArr2 = (TypefaceSpan[]) ((SpannedString) text2).getSpans(0, text2.length(), TypefaceSpan.class)) != null && typefaceSpanArr2.length > 0) {
                                                    for (TypefaceSpan typefaceSpan2 : typefaceSpanArr2) {
                                                        typefaceSpan2.setColor(i);
                                                    }
                                                }
                                            }
                                            i8++;
                                        }
                                    } else if ((FLAG_TEXTCOLOR & i6) != 0 && ((i6 & FLAG_CHECKTAG) == 0 || checkTag(this.currentKey, obj))) {
                                        int i9 = 0;
                                        while (i9 < 2) {
                                            TextView textView4 = i9 == 0 ? ((AudioPlayerAlert.ClippingTextViewSwitcher) obj).getTextView() : ((AudioPlayerAlert.ClippingTextViewSwitcher) obj).getNextTextView();
                                            if (textView4 != null) {
                                                textView4.setTextColor(i);
                                                CharSequence text3 = textView4.getText();
                                                if ((text3 instanceof SpannedString) && (typefaceSpanArr = (TypefaceSpan[]) ((SpannedString) text3).getSpans(0, text3.length(), TypefaceSpan.class)) != null && typefaceSpanArr.length > 0) {
                                                    for (TypefaceSpan typefaceSpan3 : typefaceSpanArr) {
                                                        typefaceSpan3.setColor(i);
                                                    }
                                                }
                                            }
                                            i9++;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                            this.notFoundCachedFields.put(str, Boolean.TRUE);
                        }
                    }
                } else if (view instanceof GroupCreateSpan) {
                    ((GroupCreateSpan) view).updateColors();
                }
            }
            i2++;
        }
    }

    public int getCurrentKey() {
        return this.currentKey;
    }

    public void startEditing() {
        int color = Theme.getColor(this.currentKey, this.previousIsDefault);
        this.previousColor = color;
        this.currentColor = color;
    }

    public int getCurrentColor() {
        return this.currentColor;
    }

    public int getSetColor() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer valueOf = resourcesProvider != null ? Integer.valueOf(resourcesProvider.getColor(this.currentKey)) : null;
        return valueOf != null ? valueOf.intValue() : Theme.getColor(this.currentKey);
    }

    public void setAnimatedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.setAnimatedColor(getCurrentKey(), i);
        } else {
            Theme.setAnimatedColor(getCurrentKey(), i);
        }
    }

    public void setDefaultColor() {
        setColor(Theme.getDefaultColor(this.currentKey), true);
    }

    public void setPreviousColor() {
        setColor(this.previousColor, this.previousIsDefault[0]);
    }

    public String getTitle() {
        return ThemeColors.getStringName(this.currentKey);
    }
}
