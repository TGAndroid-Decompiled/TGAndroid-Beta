package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.TextColorThemeCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.KeepMediaPopupView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda11;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda61;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.SettingsActivity$$ExternalSyntheticLambda21;
import org.telegram.ui.UsersSelectActivity;

public final class ThemeEditorView {
    public static volatile ThemeEditorView Instance;
    public ArrayList currentThemeDesription;
    public int currentThemeDesriptionPosition;
    public DecelerateInterpolator decelerateInterpolator;
    public EditorAlert editorAlert;
    public Activity parentActivity;
    public SharedPreferences preferences;
    public Theme.ThemeInfo themeInfo;
    public WallpaperUpdater wallpaperUpdater;
    public WindowManager.LayoutParams windowLayoutParams;
    public WindowManager windowManager;
    public AnonymousClass1 windowView;
    public final int editorWidth = AndroidUtilities.dp(54.0f);
    public final int editorHeight = AndroidUtilities.dp(54.0f);

    public final class AnonymousClass1 extends FrameLayout {
        public static final int $r8$clinit = 0;
        public boolean dragging;
        public float startX;
        public float startY;

        public AnonymousClass1(Activity activity) {
            super(activity);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            ?? actionBarLayout;
            ArrayList<ThemeDescription> themeDescriptions;
            int sideCoord;
            int sideCoord2;
            SharedPreferences.Editor editorEdit;
            int iDp;
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z;
            ArrayList arrayList3;
            AnimatorSet animatorSet;
            boolean z2;
            ArrayList arrayList4;
            int i;
            char c;
            WindowManager.LayoutParams layoutParams;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            float fM;
            WindowManager.LayoutParams layoutParams2;
            int i9;
            int i10;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            Property property = View.ALPHA;
            final int i11 = 0;
            final ThemeEditorView themeEditorView = ThemeEditorView.this;
            if (action == 0) {
                this.startX = rawX;
                this.startY = rawY;
            } else {
                if (motionEvent.getAction() != 2 || this.dragging) {
                    if (motionEvent.getAction() == 1 && !this.dragging && themeEditorView.editorAlert == null) {
                        LaunchActivity launchActivity = (LaunchActivity) themeEditorView.parentActivity;
                        if (AndroidUtilities.isTablet()) {
                            ActionBarLayout actionBarLayout2 = launchActivity.layersActionBarLayout;
                            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().isEmpty()) {
                                actionBarLayout = actionBarLayout2;
                                actionBarLayout = actionBarLayout2;
                                actionBarLayout = 0;
                            }
                            if (actionBarLayout == 0 && (actionBarLayout = launchActivity.rightActionBarLayout) != 0 && actionBarLayout.getFragmentStack().isEmpty()) {
                                actionBarLayout = 0;
                            }
                        } else {
                            actionBarLayout = 0;
                        }
                        if (actionBarLayout == 0) {
                            actionBarLayout = launchActivity.getActionBarLayout();
                        }
                        if (actionBarLayout != 0) {
                            ActionBarLayout actionBarLayout3 = (ActionBarLayout) actionBarLayout;
                            BaseFragment baseFragment = !actionBarLayout3.getFragmentStack().isEmpty() ? (BaseFragment) ArticleViewer.IBlock.CC.m(actionBarLayout3, 1, actionBarLayout3.getFragmentStack()) : null;
                            if (baseFragment != null && (themeDescriptions = baseFragment.getThemeDescriptions()) != null) {
                                EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.parentActivity, themeDescriptions);
                                themeEditorView.editorAlert = editorAlert;
                                editorAlert.setOnDismissListener(new SettingsActivity$$ExternalSyntheticLambda21(5));
                                themeEditorView.editorAlert.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 19));
                                themeEditorView.editorAlert.show();
                                if (themeEditorView.parentActivity != null) {
                                    try {
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        try {
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) View.SCALE_Y, 1.0f, 0.0f));
                                            animatorSet2.setInterpolator(themeEditorView.decelerateInterpolator);
                                            animatorSet2.setDuration(150L);
                                            animatorSet2.addListener(new AnimatorListenerAdapter() {
                                                @Override
                                                public final void onAnimationEnd(Animator animator) {
                                                    switch (i11) {
                                                        case 0:
                                                            ThemeEditorView themeEditorView2 = themeEditorView;
                                                            AnonymousClass1 anonymousClass1 = themeEditorView2.windowView;
                                                            if (anonymousClass1 != null) {
                                                                anonymousClass1.setBackground(null);
                                                                themeEditorView2.windowManager.removeView(themeEditorView2.windowView);
                                                            }
                                                            break;
                                                        default:
                                                            ThemeEditorView themeEditorView3 = themeEditorView;
                                                            Theme.saveCurrentTheme(themeEditorView3.themeInfo, true, false, false);
                                                            themeEditorView3.destroy();
                                                            break;
                                                    }
                                                }
                                            });
                                            animatorSet2.start();
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        }
                    }
                    if (this.dragging) {
                        if (motionEvent.getAction() == 2) {
                            float f = rawX - this.startX;
                            float f2 = rawY - this.startY;
                            layoutParams = themeEditorView.windowLayoutParams;
                            i2 = (int) (layoutParams.x + f);
                            layoutParams.x = i2;
                            layoutParams.y = (int) (layoutParams.y + f2);
                            i3 = themeEditorView.editorWidth / 2;
                            i4 = -i3;
                            if (i2 < i4) {
                                layoutParams.x = i4;
                            } else {
                                i5 = (AndroidUtilities.displaySize.x - layoutParams.width) + i3;
                                if (i2 > i5) {
                                    layoutParams.x = i5;
                                }
                            }
                            i6 = layoutParams.x;
                            if (i6 < 0) {
                                fM = zzjd.m(i6, i3, 0.5f, 1.0f);
                            } else {
                                i7 = AndroidUtilities.displaySize.x;
                                i8 = layoutParams.width;
                                if (i6 > i7 - i8) {
                                    fM = TextureRenderer$$ExternalSyntheticOutline0.m((i6 - i7) + i8, i3, 0.5f, 1.0f);
                                } else {
                                    fM = 1.0f;
                                }
                            }
                            if (themeEditorView.windowView.getAlpha() != fM) {
                                themeEditorView.windowView.setAlpha(fM);
                            }
                            layoutParams2 = themeEditorView.windowLayoutParams;
                            i9 = layoutParams2.y;
                            if (i9 < 0) {
                                layoutParams2.y = 0;
                            } else {
                                i10 = AndroidUtilities.displaySize.y - layoutParams2.height;
                                if (i9 > i10) {
                                    layoutParams2.y = i10;
                                }
                            }
                            themeEditorView.windowManager.updateViewLayout(themeEditorView.windowView, layoutParams2);
                            this.startX = rawX;
                            this.startY = rawY;
                        } else if (motionEvent.getAction() == 1) {
                            this.dragging = false;
                            sideCoord = ThemeEditorView.getSideCoord(true, 0, 0.0f, themeEditorView.editorWidth);
                            int i12 = themeEditorView.editorWidth;
                            int sideCoord3 = ThemeEditorView.getSideCoord(true, 1, 0.0f, i12);
                            int i13 = themeEditorView.editorHeight;
                            sideCoord2 = ThemeEditorView.getSideCoord(false, 0, 0.0f, i13);
                            int sideCoord4 = ThemeEditorView.getSideCoord(false, 1, 0.0f, i13);
                            editorEdit = themeEditorView.preferences.edit();
                            iDp = AndroidUtilities.dp(20.0f);
                            if (Math.abs(sideCoord - themeEditorView.windowLayoutParams.x) > iDp || ((i = themeEditorView.windowLayoutParams.x) < 0 && i > (-i12) / 4)) {
                                arrayList = new ArrayList();
                                editorEdit.putInt("sidex", 0);
                                if (themeEditorView.windowView.getAlpha() != 1.0f) {
                                    arrayList.add(ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) property, 1.0f));
                                }
                                arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", sideCoord));
                                arrayList2 = arrayList;
                            } else {
                                if (Math.abs(sideCoord3 - i) > iDp) {
                                    int i14 = themeEditorView.windowLayoutParams.x;
                                    int i15 = AndroidUtilities.displaySize.x;
                                    c = 0;
                                    if (i14 <= i15 - i12 || i14 >= i15 - ((i12 / 4) * 3)) {
                                        if (themeEditorView.windowView.getAlpha() != 1.0f) {
                                            ArrayList arrayList5 = new ArrayList();
                                            if (themeEditorView.windowLayoutParams.x < 0) {
                                                arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", -i12));
                                            } else {
                                                arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", AndroidUtilities.displaySize.x));
                                            }
                                            arrayList2 = arrayList5;
                                            z = true;
                                        } else {
                                            editorEdit.putFloat("px", (themeEditorView.windowLayoutParams.x - sideCoord) / (sideCoord3 - sideCoord));
                                            editorEdit.putInt("sidex", 2);
                                            z = false;
                                            arrayList2 = null;
                                        }
                                    }
                                    if (!z) {
                                        if (Math.abs(sideCoord2 - themeEditorView.windowLayoutParams.y) > iDp || themeEditorView.windowLayoutParams.y <= ActionBar.getCurrentActionBarHeight()) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList4 = arrayList2;
                                            editorEdit.putInt("sidey", 0);
                                            arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", sideCoord2));
                                        } else {
                                            if (Math.abs(sideCoord4 - themeEditorView.windowLayoutParams.y) <= iDp) {
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList4 = arrayList2;
                                                editorEdit.putInt("sidey", 1);
                                                arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", sideCoord4));
                                            } else {
                                                editorEdit.putFloat("py", (themeEditorView.windowLayoutParams.y - sideCoord2) / (sideCoord4 - sideCoord2));
                                                editorEdit.putInt("sidey", 2);
                                            }
                                            editorEdit.commit();
                                        }
                                        arrayList2 = arrayList4;
                                        editorEdit.commit();
                                    }
                                    arrayList3 = arrayList2;
                                    if (arrayList3 != null) {
                                        if (themeEditorView.decelerateInterpolator == null) {
                                            themeEditorView.decelerateInterpolator = new DecelerateInterpolator();
                                        }
                                        animatorSet = new AnimatorSet();
                                        animatorSet.setInterpolator(themeEditorView.decelerateInterpolator);
                                        animatorSet.setDuration(150L);
                                        if (z) {
                                            z2 = true;
                                            arrayList3.add(ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) property, 0.0f));
                                            final boolean z3 = true ? 1 : 0;
                                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                                @Override
                                                public final void onAnimationEnd(Animator animator) {
                                                    switch (z3) {
                                                        case 0:
                                                            ThemeEditorView themeEditorView2 = themeEditorView;
                                                            AnonymousClass1 anonymousClass1 = themeEditorView2.windowView;
                                                            if (anonymousClass1 != null) {
                                                                anonymousClass1.setBackground(null);
                                                                themeEditorView2.windowManager.removeView(themeEditorView2.windowView);
                                                            }
                                                            break;
                                                        default:
                                                            ThemeEditorView themeEditorView3 = themeEditorView;
                                                            Theme.saveCurrentTheme(themeEditorView3.themeInfo, true, false, false);
                                                            themeEditorView3.destroy();
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            z2 = true;
                                        }
                                        animatorSet.playTogether(arrayList3);
                                        animatorSet.start();
                                        return z2;
                                    }
                                } else {
                                    c = 0;
                                }
                                ArrayList arrayList6 = new ArrayList();
                                editorEdit.putInt("sidex", 1);
                                if (themeEditorView.windowView.getAlpha() != 1.0f) {
                                    AnonymousClass1 anonymousClass1 = themeEditorView.windowView;
                                    float[] fArr = new float[1];
                                    fArr[c] = 1.0f;
                                    arrayList6.add(ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) property, fArr));
                                }
                                arrayList6.add(ObjectAnimator.ofInt(themeEditorView, "x", sideCoord3));
                                arrayList2 = arrayList6;
                            }
                            z = false;
                            if (!z) {
                                if (Math.abs(sideCoord2 - themeEditorView.windowLayoutParams.y) > iDp) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList4 = arrayList2;
                                    editorEdit.putInt("sidey", 0);
                                    arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", sideCoord2));
                                    arrayList2 = arrayList4;
                                } else {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList4 = arrayList2;
                                    editorEdit.putInt("sidey", 0);
                                    arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", sideCoord2));
                                    arrayList2 = arrayList4;
                                }
                                editorEdit.commit();
                            }
                            arrayList3 = arrayList2;
                            if (arrayList3 != null) {
                                if (themeEditorView.decelerateInterpolator == null) {
                                    themeEditorView.decelerateInterpolator = new DecelerateInterpolator();
                                }
                                animatorSet = new AnimatorSet();
                                animatorSet.setInterpolator(themeEditorView.decelerateInterpolator);
                                animatorSet.setDuration(150L);
                                if (z) {
                                    z2 = true;
                                    arrayList3.add(ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) property, 0.0f));
                                    final int z4 = true ? 1 : 0;
                                    animatorSet.addListener(new AnimatorListenerAdapter() {
                                        @Override
                                        public final void onAnimationEnd(Animator animator) {
                                            switch (z4) {
                                                case 0:
                                                    ThemeEditorView themeEditorView2 = themeEditorView;
                                                    AnonymousClass1 anonymousClass2 = themeEditorView2.windowView;
                                                    if (anonymousClass2 != null) {
                                                        anonymousClass2.setBackground(null);
                                                        themeEditorView2.windowManager.removeView(themeEditorView2.windowView);
                                                    }
                                                    break;
                                                default:
                                                    ThemeEditorView themeEditorView3 = themeEditorView;
                                                    Theme.saveCurrentTheme(themeEditorView3.themeInfo, true, false, false);
                                                    themeEditorView3.destroy();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    z2 = true;
                                }
                                animatorSet.playTogether(arrayList3);
                                animatorSet.start();
                                return z2;
                            }
                        }
                    }
                    return true;
                }
                if (Math.abs(this.startX - rawX) >= AndroidUtilities.getPixelsInCM(0.3f, true) || Math.abs(this.startY - rawY) >= AndroidUtilities.getPixelsInCM(0.3f, false)) {
                    this.dragging = true;
                    this.startX = rawX;
                    this.startY = rawY;
                }
            }
            if (this.dragging) {
                if (motionEvent.getAction() == 2) {
                    float f3 = rawX - this.startX;
                    float f4 = rawY - this.startY;
                    layoutParams = themeEditorView.windowLayoutParams;
                    i2 = (int) (layoutParams.x + f3);
                    layoutParams.x = i2;
                    layoutParams.y = (int) (layoutParams.y + f4);
                    i3 = themeEditorView.editorWidth / 2;
                    i4 = -i3;
                    if (i2 < i4) {
                        layoutParams.x = i4;
                    } else {
                        i5 = (AndroidUtilities.displaySize.x - layoutParams.width) + i3;
                        if (i2 > i5) {
                            layoutParams.x = i5;
                        }
                    }
                    i6 = layoutParams.x;
                    if (i6 < 0) {
                        fM = zzjd.m(i6, i3, 0.5f, 1.0f);
                    } else {
                        i7 = AndroidUtilities.displaySize.x;
                        i8 = layoutParams.width;
                        if (i6 > i7 - i8) {
                            fM = TextureRenderer$$ExternalSyntheticOutline0.m((i6 - i7) + i8, i3, 0.5f, 1.0f);
                        } else {
                            fM = 1.0f;
                        }
                    }
                    if (themeEditorView.windowView.getAlpha() != fM) {
                        themeEditorView.windowView.setAlpha(fM);
                    }
                    layoutParams2 = themeEditorView.windowLayoutParams;
                    i9 = layoutParams2.y;
                    if (i9 < 0) {
                        layoutParams2.y = 0;
                    } else {
                        i10 = AndroidUtilities.displaySize.y - layoutParams2.height;
                        if (i9 > i10) {
                            layoutParams2.y = i10;
                        }
                    }
                    themeEditorView.windowManager.updateViewLayout(themeEditorView.windowView, layoutParams2);
                    this.startX = rawX;
                    this.startY = rawY;
                } else if (motionEvent.getAction() == 1) {
                    this.dragging = false;
                    sideCoord = ThemeEditorView.getSideCoord(true, 0, 0.0f, themeEditorView.editorWidth);
                    int i16 = themeEditorView.editorWidth;
                    int sideCoord5 = ThemeEditorView.getSideCoord(true, 1, 0.0f, i16);
                    int i17 = themeEditorView.editorHeight;
                    sideCoord2 = ThemeEditorView.getSideCoord(false, 0, 0.0f, i17);
                    int sideCoord6 = ThemeEditorView.getSideCoord(false, 1, 0.0f, i17);
                    editorEdit = themeEditorView.preferences.edit();
                    iDp = AndroidUtilities.dp(20.0f);
                    if (Math.abs(sideCoord - themeEditorView.windowLayoutParams.x) > iDp) {
                        arrayList = new ArrayList();
                        editorEdit.putInt("sidex", 0);
                        if (themeEditorView.windowView.getAlpha() != 1.0f) {
                            arrayList.add(ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) property, 1.0f));
                        }
                        arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", sideCoord));
                        arrayList2 = arrayList;
                        z = false;
                    } else {
                        arrayList = new ArrayList();
                        editorEdit.putInt("sidex", 0);
                        if (themeEditorView.windowView.getAlpha() != 1.0f) {
                            arrayList.add(ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) property, 1.0f));
                        }
                        arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", sideCoord));
                        arrayList2 = arrayList;
                        z = false;
                    }
                    if (!z) {
                        if (Math.abs(sideCoord2 - themeEditorView.windowLayoutParams.y) > iDp) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList4 = arrayList2;
                            editorEdit.putInt("sidey", 0);
                            arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", sideCoord2));
                            arrayList2 = arrayList4;
                        } else {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList4 = arrayList2;
                            editorEdit.putInt("sidey", 0);
                            arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", sideCoord2));
                            arrayList2 = arrayList4;
                        }
                        editorEdit.commit();
                    }
                    arrayList3 = arrayList2;
                    if (arrayList3 != null) {
                        if (themeEditorView.decelerateInterpolator == null) {
                            themeEditorView.decelerateInterpolator = new DecelerateInterpolator();
                        }
                        animatorSet = new AnimatorSet();
                        animatorSet.setInterpolator(themeEditorView.decelerateInterpolator);
                        animatorSet.setDuration(150L);
                        if (z) {
                            z2 = true;
                            arrayList3.add(ObjectAnimator.ofFloat(themeEditorView.windowView, (Property<AnonymousClass1, Float>) property, 0.0f));
                            final int z5 = true ? 1 : 0;
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    switch (z5) {
                                        case 0:
                                            ThemeEditorView themeEditorView2 = themeEditorView;
                                            AnonymousClass1 anonymousClass2 = themeEditorView2.windowView;
                                            if (anonymousClass2 != null) {
                                                anonymousClass2.setBackground(null);
                                                themeEditorView2.windowManager.removeView(themeEditorView2.windowView);
                                            }
                                            break;
                                        default:
                                            ThemeEditorView themeEditorView3 = themeEditorView;
                                            Theme.saveCurrentTheme(themeEditorView3.themeInfo, true, false, false);
                                            themeEditorView3.destroy();
                                            break;
                                    }
                                }
                            });
                        } else {
                            z2 = true;
                        }
                        animatorSet.playTogether(arrayList3);
                        animatorSet.start();
                        return z2;
                    }
                }
            }
            return true;
        }
    }

    public final class EditorAlert extends BottomSheet {
        public static final int $r8$clinit = 0;
        public boolean animationInProgress;
        public final FrameLayout bottomLayout;
        public final FrameLayout bottomSaveLayout;
        public AnimatorSet colorChangeAnimation;
        public final ColorPicker colorPicker;
        public final FrameLayout frameLayout;
        public boolean ignoreTextChange;
        public final LinearLayoutManager layoutManager;
        public final FloatingDebugView.AnonymousClass3 listAdapter;
        public final ChatActivity.AnonymousClass34 listView;
        public int previousScrollPosition;
        public int scrollOffsetY;
        public final SearchAdapter searchAdapter;
        public final EmptyTextProgressView searchEmptyView;
        public final SearchField searchField;
        public final View[] shadow;
        public final AnimatorSet[] shadowAnimation;
        public final Drawable shadowDrawable;
        public boolean startedColorChange;
        public int topBeforeSwitch;

        public final class ColorPicker extends FrameLayout {
            public float alpha;
            public LinearGradient alphaGradient;
            public boolean alphaPressed;
            public final Drawable circleDrawable;
            public final Paint circlePaint;
            public boolean circlePressed;
            public final EditTextBoldCursor[] colorEditText;
            public LinearGradient colorGradient;
            public final float[] colorHSV;
            public boolean colorPressed;
            public Bitmap colorWheelBitmap;
            public final Paint colorWheelPaint;
            public int colorWheelRadius;
            public final DecelerateInterpolator decelerateInterpolator;
            public final float[] hsvTemp;
            public final LinearLayout linearLayout;
            public final int paramValueSliderWidth;
            public final EditorAlert this$1;
            public final Paint valueSliderPaint;

            public ColorPicker(EditorAlert editorAlert, Context context) {
                super(context);
                int i = 5;
                int i2 = 2;
                this.this$1 = editorAlert;
                this.paramValueSliderWidth = AndroidUtilities.dp(20.0f);
                this.colorEditText = new EditTextBoldCursor[4];
                this.colorHSV = new float[]{0.0f, 0.0f, 1.0f};
                this.alpha = 1.0f;
                this.hsvTemp = new float[3];
                this.decelerateInterpolator = new DecelerateInterpolator();
                setWillNotDraw(false);
                this.circlePaint = new Paint(1);
                this.circleDrawable = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
                Paint paint = new Paint();
                this.colorWheelPaint = paint;
                paint.setAntiAlias(true);
                paint.setDither(true);
                Paint paint2 = new Paint();
                this.valueSliderPaint = paint2;
                paint2.setAntiAlias(true);
                paint2.setDither(true);
                LinearLayout linearLayout = new LinearLayout(context);
                this.linearLayout = linearLayout;
                linearLayout.setOrientation(0);
                addView(linearLayout, LayoutHelper.createFrame(-2, -2, 49));
                int i3 = 0;
                while (i3 < 4) {
                    this.colorEditText[i3] = new EditTextBoldCursor(context);
                    this.colorEditText[i3].setInputType(2);
                    this.colorEditText[i3].setTextColor(-14606047);
                    this.colorEditText[i3].setCursorColor(-14606047);
                    this.colorEditText[i3].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.colorEditText[i3].setCursorWidth(1.5f);
                    this.colorEditText[i3].setTextSize(1, 18.0f);
                    this.colorEditText[i3].setBackground(null);
                    this.colorEditText[i3].setLineColors(Theme.getColor(null, Theme.key_dialogInputField, false), Theme.getColor(null, Theme.key_dialogInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedBold, false));
                    this.colorEditText[i3].setMaxLines(1);
                    this.colorEditText[i3].setTag(Integer.valueOf(i3));
                    this.colorEditText[i3].setGravity(17);
                    if (i3 == 0) {
                        this.colorEditText[i3].setHint("red");
                    } else if (i3 == 1) {
                        this.colorEditText[i3].setHint("green");
                    } else if (i3 == 2) {
                        this.colorEditText[i3].setHint("blue");
                    } else if (i3 == 3) {
                        this.colorEditText[i3].setHint("alpha");
                    }
                    this.colorEditText[i3].setImeOptions((i3 == 3 ? 6 : 5) | 268435456);
                    this.colorEditText[i3].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                    this.linearLayout.addView(this.colorEditText[i3], LayoutHelper.createLinear(0.0f, 0.0f, i3 != 3 ? 16.0f : 0.0f, 0.0f, 55, 36));
                    this.colorEditText[i3].addTextChangedListener(new org.telegram.ui.Components.ColorPicker.AnonymousClass4(this, i3, i2));
                    this.colorEditText[i3].setOnEditorActionListener(new PaymentFormActivity$$ExternalSyntheticLambda11(i));
                    i3++;
                }
            }

            public final void drawPointerArrow(Canvas canvas, int i, int i2, int i3) {
                int iDp = AndroidUtilities.dp(13.0f);
                Drawable drawable = this.circleDrawable;
                drawable.setBounds(i - iDp, i2 - iDp, i + iDp, iDp + i2);
                drawable.draw(canvas);
                Paint paint = this.circlePaint;
                paint.setColor(-1);
                float f = i;
                float f2 = i2;
                canvas.drawCircle(f, f2, AndroidUtilities.dp(11.0f), paint);
                paint.setColor(i3);
                canvas.drawCircle(f, f2, AndroidUtilities.dp(9.0f), paint);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                char c;
                int width = getWidth() / 2;
                int i = this.paramValueSliderWidth;
                int i2 = width - (i * 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
                Bitmap bitmap = this.colorWheelBitmap;
                int i3 = this.colorWheelRadius;
                canvas.drawBitmap(bitmap, i2 - i3, height - i3, (Paint) null);
                float[] fArr = this.colorHSV;
                double radians = (float) Math.toRadians(fArr[0]);
                int i4 = ((int) ((-Math.cos(radians)) * ((double) fArr[1]) * ((double) this.colorWheelRadius))) + i2;
                double d = -Math.sin(radians);
                float f = fArr[1];
                int i5 = ((int) (d * ((double) f) * ((double) this.colorWheelRadius))) + height;
                float f2 = fArr[0];
                float[] fArr2 = this.hsvTemp;
                fArr2[0] = f2;
                fArr2[1] = f;
                fArr2[2] = 1.0f;
                drawPointerArrow(canvas, i4, i5, Color.HSVToColor(fArr2));
                int i6 = this.colorWheelRadius;
                int i7 = i2 + i6 + i;
                int i8 = height - i6;
                int iDp = AndroidUtilities.dp(9.0f);
                int i9 = this.colorWheelRadius * 2;
                if (this.colorGradient == null) {
                    c = 2;
                    this.colorGradient = new LinearGradient(i7, i8, i7 + iDp, i8 + i9, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    c = 2;
                }
                Paint paint = this.valueSliderPaint;
                paint.setShader(this.colorGradient);
                float f3 = i8;
                float f4 = i8 + i9;
                canvas.drawRect(i7, f3, i7 + iDp, f4, paint);
                int i10 = iDp / 2;
                float f5 = i9;
                drawPointerArrow(canvas, i7 + i10, (int) ((fArr[c] * f5) + f3), Color.HSVToColor(fArr));
                int i11 = (i * 2) + i7;
                if (this.alphaGradient == null) {
                    int iHSVToColor = Color.HSVToColor(fArr2);
                    this.alphaGradient = new LinearGradient(i11, f3, i11 + iDp, f4, new int[]{iHSVToColor, iHSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                }
                paint.setShader(this.alphaGradient);
                canvas.drawRect(i11, f3, iDp + i11, f4, paint);
                drawPointerArrow(canvas, i11 + i10, (int) DiffUtil.m(1.0f, this.alpha, f5, f3), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.alpha * 255.0f)) << 24));
            }

            @Override
            public final void onMeasure(int i, int i2) {
                int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                measureChild(this.linearLayout, i, i2);
                setMeasuredDimension(iMin, iMin);
            }

            @Override
            public final void onSizeChanged(int i, int i2, int i3, int i4) {
                int iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m((i / 2) - (this.paramValueSliderWidth * 2), 20.0f, 1);
                this.colorWheelRadius = iM;
                int i5 = iM * 2;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[13];
                float[] fArr = {0.0f, 1.0f, 1.0f};
                for (int i6 = 0; i6 < 13; i6++) {
                    fArr[0] = ((i6 * 30) + 180) % 360;
                    iArr[i6] = Color.HSVToColor(fArr);
                }
                iArr[12] = iArr[0];
                float f = i5 / 2;
                ComposeShader composeShader = new ComposeShader(new SweepGradient(f, f, iArr, (float[]) null), new RadialGradient(f, f, this.colorWheelRadius, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
                Paint paint = this.colorWheelPaint;
                paint.setShader(composeShader);
                new Canvas(bitmapCreateBitmap).drawCircle(f, f, this.colorWheelRadius, paint);
                this.colorWheelBitmap = bitmapCreateBitmap;
                this.colorGradient = null;
                this.alphaGradient = null;
            }

            @Override
            public final boolean onTouchEvent(android.view.MotionEvent r20) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ThemeEditorView.EditorAlert.ColorPicker.onTouchEvent(android.view.MotionEvent):boolean");
            }

            public final void setColor(int i) {
                int iRed = Color.red(i);
                int iGreen = Color.green(i);
                int iBlue = Color.blue(i);
                int iAlpha = Color.alpha(i);
                EditorAlert editorAlert = this.this$1;
                if (!editorAlert.ignoreTextChange) {
                    editorAlert.ignoreTextChange = true;
                    EditTextBoldCursor[] editTextBoldCursorArr = this.colorEditText;
                    editTextBoldCursorArr[0].setText("" + iRed);
                    editTextBoldCursorArr[1].setText("" + iGreen);
                    editTextBoldCursorArr[2].setText("" + iBlue);
                    editTextBoldCursorArr[3].setText("" + iAlpha);
                    for (int i2 = 0; i2 < 4; i2++) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i2];
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    editorAlert.ignoreTextChange = false;
                }
                this.alphaGradient = null;
                this.colorGradient = null;
                this.alpha = iAlpha / 255.0f;
                Color.colorToHSV(i, this.colorHSV);
                invalidate();
            }

            public final void startColorChange(boolean z) {
                EditorAlert editorAlert = this.this$1;
                if (editorAlert.startedColorChange == z) {
                    return;
                }
                AnimatorSet animatorSet = editorAlert.colorChangeAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                editorAlert.startedColorChange = z;
                AnimatorSet animatorSet2 = new AnimatorSet();
                editorAlert.colorChangeAnimation = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofInt(((BottomSheet) editorAlert).backDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, z ? 0 : 51), ObjectAnimator.ofFloat(((BottomSheet) editorAlert).containerView, (Property<ViewGroup, Float>) View.ALPHA, z ? 0.2f : 1.0f));
                editorAlert.colorChangeAnimation.setDuration(150L);
                editorAlert.colorChangeAnimation.setInterpolator(this.decelerateInterpolator);
                editorAlert.colorChangeAnimation.start();
            }
        }

        public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
            public final Context context;
            public int lastSearchId;
            public String lastSearchText;
            public PollItemMenu$$ExternalSyntheticLambda17 searchRunnable;
            public ArrayList searchResult = new ArrayList();
            public ArrayList searchNames = new ArrayList();

            public SearchAdapter(Context context) {
                this.context = context;
            }

            public static CharSequence generateSearchName(String str, String str2) {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strTrim = str.trim();
                String lowerCase = strTrim.toLowerCase();
                int i = 0;
                while (true) {
                    int iIndexOf = lowerCase.indexOf(str2, i);
                    if (iIndexOf == -1) {
                        break;
                    }
                    int length = str2.length() + iIndexOf;
                    if (i != 0 && i != iIndexOf + 1) {
                        spannableStringBuilder.append((CharSequence) strTrim.substring(i, iIndexOf));
                    } else if (i == 0 && iIndexOf != 0) {
                        spannableStringBuilder.append((CharSequence) strTrim.substring(0, iIndexOf));
                    }
                    String strSubstring = strTrim.substring(iIndexOf, Math.min(strTrim.length(), length));
                    if (strSubstring.startsWith(" ")) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    String strTrim2 = strSubstring.trim();
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) strTrim2);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-11697229), length2, strTrim2.length() + length2, 33);
                    i = length;
                }
                if (i != -1 && i < strTrim.length()) {
                    spannableStringBuilder.append((CharSequence) strTrim.substring(i));
                }
                return spannableStringBuilder;
            }

            @Override
            public final int getItemCount() {
                if (this.searchResult.isEmpty()) {
                    return 0;
                }
                return this.searchResult.size() + 1;
            }

            @Override
            public final int getItemViewType(int i) {
                return i == 0 ? 1 : 0;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder.mItemViewType == 0) {
                    int i2 = i - 1;
                    ThemeDescription themeDescription = (ThemeDescription) ((ArrayList) this.searchResult.get(i2)).get(0);
                    int setColor = themeDescription.currentKey == Theme.key_chat_wallpaper ? 0 : themeDescription.getSetColor();
                    TextColorThemeCell textColorThemeCell = (TextColorThemeCell) viewHolder.itemView;
                    textColorThemeCell.textView.setText((CharSequence) this.searchNames.get(i2));
                    textColorThemeCell.currentColor = setColor;
                    textColorThemeCell.setWillNotDraw(setColor == 0);
                    textColorThemeCell.invalidate();
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View textColorThemeCell;
                Context context = this.context;
                if (i != 0) {
                    textColorThemeCell = new View(context);
                    textColorThemeCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                } else {
                    textColorThemeCell = new TextColorThemeCell(context);
                    textColorThemeCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                }
                return new RecyclerListView.Holder(textColorThemeCell);
            }
        }

        public final class SearchField extends FrameLayout {
            public final ImageView clearSearchImageView;
            public final UsersSelectActivity.AnonymousClass4 searchEditText;

            public SearchField(Context context) {
                super(context);
                View view = new View(context);
                view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), -854795));
                addView(view, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                imageView.setScaleType(scaleType);
                imageView.setImageResource(R.drawable.smiles_inputsearch);
                imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
                addView(imageView, LayoutHelper.createFrame(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView2 = new ImageView(context);
                this.clearSearchImageView = imageView2;
                imageView2.setScaleType(scaleType);
                ChatActivityEnterView.AnonymousClass26 anonymousClass26 = new ChatActivityEnterView.AnonymousClass26(2.0f, 1);
                imageView2.setImageDrawable(anonymousClass26);
                anonymousClass26.side = AndroidUtilities.dp(7.0f);
                imageView2.setScaleX(0.1f);
                imageView2.setScaleY(0.1f);
                imageView2.setAlpha(0.0f);
                addView(imageView2, LayoutHelper.createFrame(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
                imageView2.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 5));
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 7);
                this.searchEditText = anonymousClass4;
                anonymousClass4.setTextSize(1, 16.0f);
                anonymousClass4.setHintTextColor(-6774617);
                anonymousClass4.setTextColor(-14540254);
                anonymousClass4.setBackgroundDrawable(null);
                anonymousClass4.setPadding(0, 0, 0, 0);
                anonymousClass4.setMaxLines(1);
                anonymousClass4.setLines(1);
                anonymousClass4.setSingleLine(true);
                anonymousClass4.setImeOptions(268435459);
                anonymousClass4.setHint(LocaleController.getString(R.string.Search));
                anonymousClass4.setCursorColor(-11491093);
                anonymousClass4.setCursorSize(AndroidUtilities.dp(20.0f));
                anonymousClass4.setCursorWidth(1.5f);
                addView(anonymousClass4, LayoutHelper.createFrame(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
                anonymousClass4.addTextChangedListener(new TextWatcher() {
                    @Override
                    public final void afterTextChanged(Editable editable) {
                        boolean z = SearchField.this.searchEditText.length() > 0;
                        if (z != (SearchField.this.clearSearchImageView.getAlpha() != 0.0f)) {
                            SearchField.this.clearSearchImageView.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).start();
                        }
                        String string = SearchField.this.searchEditText.getText().toString();
                        if (string.length() != 0) {
                            EmptyTextProgressView emptyTextProgressView = EditorAlert.this.searchEmptyView;
                            if (emptyTextProgressView != null) {
                                emptyTextProgressView.setText(LocaleController.getString(R.string.NoResult));
                            }
                        } else {
                            RecyclerView.Adapter adapter = EditorAlert.this.listView.getAdapter();
                            EditorAlert editorAlert = EditorAlert.this;
                            if (adapter != editorAlert.listAdapter) {
                                int iAccess$600 = EditorAlert.access$600(editorAlert);
                                EditorAlert.this.searchEmptyView.setText(LocaleController.getString(R.string.NoChats));
                                EditorAlert.this.searchEmptyView.showTextView();
                                EditorAlert editorAlert2 = EditorAlert.this;
                                editorAlert2.listView.setAdapter(editorAlert2.listAdapter);
                                EditorAlert.this.listAdapter.mObservable.notifyChanged();
                                if (iAccess$600 > 0) {
                                    LinearLayoutManager linearLayoutManager = EditorAlert.this.layoutManager;
                                    linearLayoutManager.scrollToPositionWithOffset(0, -iAccess$600, linearLayoutManager.mShouldReverseLayout);
                                }
                            }
                        }
                        SearchAdapter searchAdapter = EditorAlert.this.searchAdapter;
                        if (searchAdapter == null || string.equals(searchAdapter.lastSearchText)) {
                            return;
                        }
                        searchAdapter.lastSearchText = string;
                        if (searchAdapter.searchRunnable != null) {
                            Utilities.searchQueue.cancelRunnable(searchAdapter.searchRunnable);
                            searchAdapter.searchRunnable = null;
                        }
                        if (string.length() != 0) {
                            int i = searchAdapter.lastSearchId + 1;
                            searchAdapter.lastSearchId = i;
                            searchAdapter.searchRunnable = new PollItemMenu$$ExternalSyntheticLambda17(searchAdapter, string, i, 13);
                            Utilities.searchQueue.postRunnable(searchAdapter.searchRunnable, 300L);
                            return;
                        }
                        searchAdapter.searchResult.clear();
                        EditorAlert editorAlert3 = EditorAlert.this;
                        editorAlert3.topBeforeSwitch = EditorAlert.access$600(editorAlert3);
                        searchAdapter.lastSearchId = -1;
                        searchAdapter.mObservable.notifyChanged();
                    }

                    @Override
                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override
                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }
                });
                anonymousClass4.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 13));
            }
        }

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, null, true, false);
            View[] viewArr = {view, view};
            this.shadow = viewArr;
            this.shadowAnimation = new AnimatorSet[2];
            this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            KeepMediaPopupView.ExceptionsView exceptionsView = new KeepMediaPopupView.ExceptionsView(this, context);
            this.containerView = exceptionsView;
            exceptionsView.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i = this.backgroundPaddingLeft;
            viewGroup.setPadding(i, 0, i, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.frameLayout = frameLayout;
            frameLayout.setBackgroundColor(-1);
            SearchField searchField = new SearchField(context);
            this.searchField = searchField;
            frameLayout.addView(searchField, LayoutHelper.createFrame(-1, -1, 51));
            ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 20);
            this.listView = anonymousClass34;
            anonymousClass34.setSelectorDrawableColor(251658240);
            anonymousClass34.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            anonymousClass34.setClipToPadding(false);
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            this.layoutManager = linearLayoutManager;
            anonymousClass34.setLayoutManager(linearLayoutManager);
            anonymousClass34.setHorizontalScrollBarEnabled(false);
            anonymousClass34.setVerticalScrollBarEnabled(false);
            this.containerView.addView(anonymousClass34, LayoutHelper.createFrame(-1, -1, 51));
            FloatingDebugView.AnonymousClass3 anonymousClass3 = new FloatingDebugView.AnonymousClass3(context, arrayList);
            this.listAdapter = anonymousClass3;
            anonymousClass34.setAdapter(anonymousClass3);
            this.searchAdapter = new SearchAdapter(context);
            anonymousClass34.setGlowColor(-657673);
            anonymousClass34.setItemAnimator(null);
            anonymousClass34.setLayoutAnimation(null);
            anonymousClass34.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 3));
            anonymousClass34.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 10));
            EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
            this.searchEmptyView = emptyTextProgressView;
            emptyTextProgressView.setShowAtCenter(true);
            emptyTextProgressView.showTextView();
            emptyTextProgressView.setText(LocaleController.getString(R.string.NoResult));
            anonymousClass34.setEmptyView(emptyTextProgressView);
            this.containerView.addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            View view = new View(context);
            view.setBackgroundColor(301989888);
            viewArr[0].setAlpha(0.0f);
            viewArr[0].setTag(1);
            this.containerView.addView(viewArr[0], layoutParams);
            this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 58, 51));
            ColorPicker colorPicker = new ColorPicker(this, context);
            this.colorPicker = colorPicker;
            colorPicker.setVisibility(8);
            this.containerView.addView(colorPicker, LayoutHelper.createFrame(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            View view2 = new View(context);
            view2.setBackgroundColor(301989888);
            this.containerView.addView(viewArr[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.bottomSaveLayout = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -1, 51));
            final int i2 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$1$36(view3);
                            break;
                        case 1:
                            ThemeEditorView.EditorAlert editorAlert = this.f$0;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            Theme.saveCurrentTheme(themeEditorView.themeInfo, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.lambda$showGiftOfferSheet$15();
                            try {
                                themeEditorView.windowManager.removeView(themeEditorView.windowView);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.parentActivity = null;
                            break;
                        case 2:
                            int i3 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert2 = this.f$0;
                                ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                                if (i3 >= themeEditorView2.currentThemeDesription.size()) {
                                    editorAlert2.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription = (ThemeDescription) themeEditorView2.currentThemeDesription.get(i3);
                                    themeDescription.setColor(themeDescription.previousColor, themeDescription.previousIsDefault[0], true);
                                    i3++;
                                }
                                break;
                            }
                            break;
                        case 3:
                            int i4 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert3 = this.f$0;
                                ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                                if (i4 >= themeEditorView3.currentThemeDesription.size()) {
                                    editorAlert3.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription2 = (ThemeDescription) themeEditorView3.currentThemeDesription.get(i4);
                                    themeDescription2.setColor(Theme.getDefaultColor(themeDescription2.currentKey), true, true);
                                    i4++;
                                }
                                break;
                            }
                            break;
                        default:
                            this.f$0.setColorPickerVisible(false);
                            break;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -1, 53));
            final int i3 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$1$36(view3);
                            break;
                        case 1:
                            ThemeEditorView.EditorAlert editorAlert = this.f$0;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            Theme.saveCurrentTheme(themeEditorView.themeInfo, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.lambda$showGiftOfferSheet$15();
                            try {
                                themeEditorView.windowManager.removeView(themeEditorView.windowView);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.parentActivity = null;
                            break;
                        case 2:
                            int i4 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert2 = this.f$0;
                                ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                                if (i4 >= themeEditorView2.currentThemeDesription.size()) {
                                    editorAlert2.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription = (ThemeDescription) themeEditorView2.currentThemeDesription.get(i4);
                                    themeDescription.setColor(themeDescription.previousColor, themeDescription.previousIsDefault[0], true);
                                    i4++;
                                }
                                break;
                            }
                            break;
                        case 3:
                            int i5 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert3 = this.f$0;
                                ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                                if (i5 >= themeEditorView3.currentThemeDesription.size()) {
                                    editorAlert3.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription2 = (ThemeDescription) themeEditorView3.currentThemeDesription.get(i5);
                                    themeDescription2.setColor(Theme.getDefaultColor(themeDescription2.currentKey), true, true);
                                    i5++;
                                }
                                break;
                            }
                            break;
                        default:
                            this.f$0.setColorPickerVisible(false);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.bottomLayout = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, LayoutHelper.createFrame(-2, -1, 51));
            final int i4 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$1$36(view3);
                            break;
                        case 1:
                            ThemeEditorView.EditorAlert editorAlert = this.f$0;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            Theme.saveCurrentTheme(themeEditorView.themeInfo, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.lambda$showGiftOfferSheet$15();
                            try {
                                themeEditorView.windowManager.removeView(themeEditorView.windowView);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.parentActivity = null;
                            break;
                        case 2:
                            int i5 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert2 = this.f$0;
                                ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                                if (i5 >= themeEditorView2.currentThemeDesription.size()) {
                                    editorAlert2.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription = (ThemeDescription) themeEditorView2.currentThemeDesription.get(i5);
                                    themeDescription.setColor(themeDescription.previousColor, themeDescription.previousIsDefault[0], true);
                                    i5++;
                                }
                                break;
                            }
                            break;
                        case 3:
                            int i6 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert3 = this.f$0;
                                ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                                if (i6 >= themeEditorView3.currentThemeDesription.size()) {
                                    editorAlert3.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription2 = (ThemeDescription) themeEditorView3.currentThemeDesription.get(i6);
                                    themeDescription2.setColor(Theme.getDefaultColor(themeDescription2.currentKey), true, true);
                                    i6++;
                                }
                                break;
                            }
                            break;
                        default:
                            this.f$0.setColorPickerVisible(false);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, LayoutHelper.createFrame(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, LayoutHelper.createFrame(-2, -1, 51));
            final int i5 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$new$1$36(view3);
                            break;
                        case 1:
                            ThemeEditorView.EditorAlert editorAlert = this.f$0;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            Theme.saveCurrentTheme(themeEditorView.themeInfo, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.lambda$showGiftOfferSheet$15();
                            try {
                                themeEditorView.windowManager.removeView(themeEditorView.windowView);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.parentActivity = null;
                            break;
                        case 2:
                            int i6 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert2 = this.f$0;
                                ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                                if (i6 >= themeEditorView2.currentThemeDesription.size()) {
                                    editorAlert2.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription = (ThemeDescription) themeEditorView2.currentThemeDesription.get(i6);
                                    themeDescription.setColor(themeDescription.previousColor, themeDescription.previousIsDefault[0], true);
                                    i6++;
                                }
                                break;
                            }
                            break;
                        case 3:
                            int i7 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert3 = this.f$0;
                                ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                                if (i7 >= themeEditorView3.currentThemeDesription.size()) {
                                    editorAlert3.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription2 = (ThemeDescription) themeEditorView3.currentThemeDesription.get(i7);
                                    themeDescription2.setColor(Theme.getDefaultColor(themeDescription2.currentKey), true, true);
                                    i7++;
                                }
                                break;
                            }
                            break;
                        default:
                            this.f$0.setColorPickerVisible(false);
                            break;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, LayoutHelper.createFrame(-2, -1, 51));
            final int i6 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$new$1$36(view3);
                            break;
                        case 1:
                            ThemeEditorView.EditorAlert editorAlert = this.f$0;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            Theme.saveCurrentTheme(themeEditorView.themeInfo, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.lambda$showGiftOfferSheet$15();
                            try {
                                themeEditorView.windowManager.removeView(themeEditorView.windowView);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.parentActivity = null;
                            break;
                        case 2:
                            int i7 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert2 = this.f$0;
                                ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                                if (i7 >= themeEditorView2.currentThemeDesription.size()) {
                                    editorAlert2.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription = (ThemeDescription) themeEditorView2.currentThemeDesription.get(i7);
                                    themeDescription.setColor(themeDescription.previousColor, themeDescription.previousIsDefault[0], true);
                                    i7++;
                                }
                                break;
                            }
                            break;
                        case 3:
                            int i8 = 0;
                            while (true) {
                                ThemeEditorView.EditorAlert editorAlert3 = this.f$0;
                                ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                                if (i8 >= themeEditorView3.currentThemeDesription.size()) {
                                    editorAlert3.setColorPickerVisible(false);
                                } else {
                                    ThemeDescription themeDescription2 = (ThemeDescription) themeEditorView3.currentThemeDesription.get(i8);
                                    themeDescription2.setColor(Theme.getDefaultColor(themeDescription2.currentKey), true, true);
                                    i8++;
                                }
                                break;
                            }
                            break;
                        default:
                            this.f$0.setColorPickerVisible(false);
                            break;
                    }
                }
            });
        }

        public static void access$2200(EditorAlert editorAlert) {
            if (editorAlert.listView.getChildCount() > 0) {
                ChatActivity.AnonymousClass34 anonymousClass34 = editorAlert.listView;
                if (anonymousClass34.getVisibility() != 0 || editorAlert.animationInProgress) {
                    return;
                }
                int i = 0;
                View childAt = anonymousClass34.getChildAt(0);
                RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
                int paddingTop = (anonymousClass34.getVisibility() != 0 || editorAlert.animationInProgress) ? anonymousClass34.getPaddingTop() : childAt.getTop() - AndroidUtilities.dp(8.0f);
                if (paddingTop <= (-AndroidUtilities.dp(1.0f)) || holder == null || holder.getAdapterPosition() != 0) {
                    editorAlert.runShadowAnimation$3(true);
                } else {
                    editorAlert.runShadowAnimation$3(false);
                    i = paddingTop;
                }
                if (editorAlert.scrollOffsetY != i) {
                    editorAlert.setScrollOffsetY(i);
                }
            }
        }

        public static int access$600(EditorAlert editorAlert) {
            if (editorAlert.listView.getChildCount() == 0) {
                return -1000;
            }
            ChatActivity.AnonymousClass34 anonymousClass34 = editorAlert.listView;
            int top = 0;
            View childAt = anonymousClass34.getChildAt(0);
            RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
            if (holder == null) {
                return -1000;
            }
            int paddingTop = anonymousClass34.getPaddingTop();
            if (holder.getAdapterPosition() == 0 && childAt.getTop() >= 0) {
                top = childAt.getTop();
            }
            return paddingTop - top;
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            SearchField searchField = this.searchField;
            if (searchField.searchEditText.isFocused()) {
                AndroidUtilities.hideKeyboard(searchField.searchEditText);
            }
        }

        public final void runShadowAnimation$3(boolean z) {
            View[] viewArr = this.shadow;
            if ((!z || viewArr[0].getTag() == null) && (z || viewArr[0].getTag() != null)) {
                return;
            }
            viewArr[0].setTag(z ? null : 1);
            if (z) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.shadowAnimation;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new LoginActivity.AnonymousClass9(9, this, z));
            animatorSetArr[0].start();
        }

        public final void setColorPickerVisible(boolean z) {
            FrameLayout frameLayout = this.frameLayout;
            FrameLayout frameLayout2 = this.bottomSaveLayout;
            FrameLayout frameLayout3 = this.bottomLayout;
            EmptyTextProgressView emptyTextProgressView = this.searchEmptyView;
            View[] viewArr = this.shadow;
            final int i = 1;
            ColorPicker colorPicker = this.colorPicker;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
            if (z) {
                this.animationInProgress = true;
                colorPicker.setVisibility(0);
                frameLayout3.setVisibility(0);
                colorPicker.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.previousScrollPosition = this.scrollOffsetY;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(colorPicker, (Property<ColorPicker, Float>) property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(anonymousClass34, (Property<ChatActivity.AnonymousClass34, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(emptyTextProgressView, (Property<EmptyTextProgressView, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", anonymousClass34.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.decelerateInterpolator);
                final int i2 = 0;
                animatorSet.addListener(new AnimatorListenerAdapter(this) {
                    public final EditorAlert this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i2) {
                            case 0:
                                EditorAlert editorAlert = this.this$1;
                                editorAlert.listView.setVisibility(4);
                                editorAlert.searchField.setVisibility(4);
                                editorAlert.bottomSaveLayout.setVisibility(4);
                                editorAlert.animationInProgress = false;
                                break;
                            default:
                                EditorAlert editorAlert2 = this.this$1;
                                if (editorAlert2.listView.getAdapter() == editorAlert2.searchAdapter) {
                                    SearchField searchField = editorAlert2.searchField;
                                    searchField.searchEditText.requestFocus();
                                    AndroidUtilities.showKeyboard(searchField.searchEditText);
                                }
                                editorAlert2.colorPicker.setVisibility(8);
                                editorAlert2.bottomLayout.setVisibility(8);
                                editorAlert2.animationInProgress = false;
                                break;
                        }
                    }
                });
                animatorSet.start();
                return;
            }
            Activity activity = themeEditorView.parentActivity;
            if (activity != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                ActionBarLayout actionBarLayout = launchActivity.layersActionBarLayout;
                if (actionBarLayout != null) {
                    actionBarLayout.rebuildAllFragmentViews(false, false);
                } else {
                    launchActivity.actionBarLayout.rebuildAllFragmentViews(false, false);
                }
            }
            Theme.saveCurrentTheme(themeEditorView.themeInfo, false, false, false);
            if (anonymousClass34.getAdapter() == this.listAdapter) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.animationInProgress = true;
            anonymousClass34.setVisibility(0);
            frameLayout2.setVisibility(0);
            this.searchField.setVisibility(0);
            anonymousClass34.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(colorPicker, (Property<ColorPicker, Float>) property2, 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, 0.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(anonymousClass34, (Property<ChatActivity.AnonymousClass34, Float>) property2, 1.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 1.0f);
            View view = viewArr[0];
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, view.getTag() == null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(emptyTextProgressView, (Property<EmptyTextProgressView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.previousScrollPosition));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.decelerateInterpolator);
            animatorSet2.addListener(new AnimatorListenerAdapter(this) {
                public final EditorAlert this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 0:
                            EditorAlert editorAlert = this.this$1;
                            editorAlert.listView.setVisibility(4);
                            editorAlert.searchField.setVisibility(4);
                            editorAlert.bottomSaveLayout.setVisibility(4);
                            editorAlert.animationInProgress = false;
                            break;
                        default:
                            EditorAlert editorAlert2 = this.this$1;
                            if (editorAlert2.listView.getAdapter() == editorAlert2.searchAdapter) {
                                SearchField searchField = editorAlert2.searchField;
                                searchField.searchEditText.requestFocus();
                                AndroidUtilities.showKeyboard(searchField.searchEditText);
                            }
                            editorAlert2.colorPicker.setVisibility(8);
                            editorAlert2.bottomLayout.setVisibility(8);
                            editorAlert2.animationInProgress = false;
                            break;
                    }
                }
            });
            animatorSet2.start();
            anonymousClass34.getAdapter().notifyItemChanged(themeEditorView.currentThemeDesriptionPosition);
        }

        public final void setScrollOffsetY(int i) {
            this.scrollOffsetY = i;
            this.listView.setTopGlowOffset(i);
            this.frameLayout.setTranslationY(this.scrollOffsetY);
            this.colorPicker.setTranslationY(this.scrollOffsetY);
            this.searchEmptyView.setTranslationY(this.scrollOffsetY);
            this.containerView.invalidate();
        }
    }

    public static int getSideCoord(boolean z, int i, float f, int i2) {
        int i3;
        int iDp;
        if (z) {
            i3 = AndroidUtilities.displaySize.x;
        } else {
            i3 = AndroidUtilities.displaySize.y - i2;
            i2 = ActionBar.getCurrentActionBarHeight();
        }
        int i4 = i3 - i2;
        if (i == 0) {
            iDp = AndroidUtilities.dp(10.0f);
        } else {
            iDp = i == 1 ? i4 - AndroidUtilities.dp(10.0f) : Math.round((i4 - AndroidUtilities.dp(20.0f)) * f) + AndroidUtilities.dp(10.0f);
        }
        return !z ? ActionBar.getCurrentActionBarHeight() + iDp : iDp;
    }

    public final void destroy() {
        AnonymousClass1 anonymousClass1;
        this.wallpaperUpdater.getClass();
        if (this.parentActivity == null || (anonymousClass1 = this.windowView) == null) {
            return;
        }
        try {
            this.windowManager.removeViewImmediate(anonymousClass1);
            this.windowView = null;
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
        try {
            EditorAlert editorAlert = this.editorAlert;
            if (editorAlert != null) {
                editorAlert.lambda$showGiftOfferSheet$15();
                this.editorAlert = null;
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.parentActivity = null;
        Instance = null;
    }

    public final void show(Activity activity, Theme.ThemeInfo themeInfo) {
        if (Instance != null) {
            Instance.destroy();
        }
        this.themeInfo = themeInfo;
        this.windowView = new AnonymousClass1(activity);
        this.windowManager = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.preferences = sharedPreferences;
        int i = sharedPreferences.getInt("sidex", 1);
        int i2 = this.preferences.getInt("sidey", 0);
        float f = this.preferences.getFloat("px", 0.0f);
        float f2 = this.preferences.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.windowLayoutParams = layoutParams;
            int i3 = this.editorWidth;
            layoutParams.width = i3;
            layoutParams.height = this.editorHeight;
            layoutParams.x = getSideCoord(true, i, f, i3);
            this.windowLayoutParams.y = getSideCoord(false, i2, f2, this.editorHeight);
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, layoutParams2);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
            this.wallpaperUpdater = new WallpaperUpdater(activity, null, new ChatActivity.AnonymousClass1(this, 26));
            Instance = this;
            this.parentActivity = activity;
            showWithAnimation();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void showWithAnimation() {
        this.windowView.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.decelerateInterpolator);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }
}
