package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView.EditorAlert;
import org.telegram.ui.LaunchActivity;

public final class g01 extends FrameLayout {

    public static final int f28491e = 0;

    public float f28492a;

    public float f28493b;

    public boolean f28494c;
    public final ThemeEditorView d;

    public g01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5VarO;
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions;
        float fC;
        int iB;
        int iB2;
        SharedPreferences.Editor editorEdit;
        int iDp;
        ArrayList arrayList;
        boolean z10;
        AnimatorSet animatorSet;
        boolean z11;
        int i10;
        WindowManager.LayoutParams layoutParams;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        WindowManager.LayoutParams layoutParams2;
        int i18;
        int i19;
        ThemeEditorView themeEditorView = this.d;
        int i20 = themeEditorView.f26553e;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        int i21 = 4;
        Property property = View.ALPHA;
        if (action == 0) {
            this.f28492a = rawX;
            this.f28493b = rawY;
        } else {
            if (motionEvent.getAction() != 2 || this.f28494c) {
                if (motionEvent.getAction() == 1 && !this.f28494c && themeEditorView.f26559l == null) {
                    LaunchActivity launchActivity = (LaunchActivity) themeEditorView.f26551b;
                    if (AndroidUtilities.isTablet()) {
                        b5VarO = launchActivity.f35523n0;
                        if (b5VarO != null && b5VarO.getFragmentStack().isEmpty()) {
                            b5VarO = null;
                        }
                        if (b5VarO == null && (b5VarO = launchActivity.f35525o0) != null && b5VarO.getFragmentStack().isEmpty()) {
                            b5VarO = null;
                        }
                    } else {
                        b5VarO = null;
                    }
                    if (b5VarO == null) {
                        b5VarO = launchActivity.O();
                    }
                    if (b5VarO != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = !b5VarO.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.n2) b5VarO.getFragmentStack().get(b5VarO.getFragmentStack().size() - 1) : null;
                        if (n2Var != null && (themeDescriptions = n2Var.getThemeDescriptions()) != null) {
                            ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.f26551b, themeDescriptions);
                            themeEditorView.f26559l = editorAlert;
                            editorAlert.setOnDismissListener(new lh.e1(i21));
                            themeEditorView.f26559l.setOnDismissListener(new a1(this, 9));
                            themeEditorView.f26559l.show();
                            if (themeEditorView.f26551b != null) {
                                try {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    try {
                                        try {
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) View.SCALE_Y, 1.0f, 0.0f));
                                            animatorSet2.setInterpolator(themeEditorView.f26556i);
                                            animatorSet2.setDuration(150L);
                                            animatorSet2.addListener(new i01(themeEditorView, 0));
                                            animatorSet2.start();
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception unused2) {
                                        if (this.f28494c) {
                                            fC = 1.0f;
                                            if (motionEvent.getAction() == 2) {
                                                float f10 = rawX - this.f28492a;
                                                float f11 = rawY - this.f28493b;
                                                layoutParams = themeEditorView.f26555g;
                                                i11 = (int) (layoutParams.x + f10);
                                                layoutParams.x = i11;
                                                layoutParams.y = (int) (layoutParams.y + f11);
                                                i12 = i20 / 2;
                                                i13 = -i12;
                                                if (i11 < i13) {
                                                    layoutParams.x = i13;
                                                } else {
                                                    i14 = (AndroidUtilities.displaySize.x - layoutParams.width) + i12;
                                                    if (i11 > i14) {
                                                        layoutParams.x = i14;
                                                    }
                                                }
                                                i15 = layoutParams.x;
                                                if (i15 < 0) {
                                                    fC = s3.c.c(i15, i12, 0.5f, 1.0f);
                                                } else {
                                                    i16 = AndroidUtilities.displaySize.x;
                                                    i17 = layoutParams.width;
                                                    if (i15 > i16 - i17) {
                                                        fC = org.telegram.messenger.rl.c((i15 - i16) + i17, i12, 0.5f, 1.0f);
                                                    }
                                                }
                                                if (themeEditorView.f26550a.getAlpha() != fC) {
                                                    themeEditorView.f26550a.setAlpha(fC);
                                                }
                                                layoutParams2 = themeEditorView.f26555g;
                                                i18 = layoutParams2.y;
                                                if (i18 < 0) {
                                                    layoutParams2.y = 0;
                                                } else {
                                                    i19 = AndroidUtilities.displaySize.y - layoutParams2.height;
                                                    if (i18 > i19) {
                                                        layoutParams2.y = i19;
                                                    }
                                                }
                                                themeEditorView.h.updateViewLayout(themeEditorView.f26550a, layoutParams2);
                                                this.f28492a = rawX;
                                                this.f28493b = rawY;
                                            } else {
                                                if (motionEvent.getAction() != 1) {
                                                    return true;
                                                }
                                                this.f28494c = false;
                                                iB = ThemeEditorView.b(true, 0, 0.0f, i20);
                                                int iB3 = ThemeEditorView.b(true, 1, 0.0f, i20);
                                                int i22 = themeEditorView.f26554f;
                                                iB2 = ThemeEditorView.b(false, 0, 0.0f, i22);
                                                int iB4 = ThemeEditorView.b(false, 1, 0.0f, i22);
                                                editorEdit = themeEditorView.f26557j.edit();
                                                iDp = AndroidUtilities.dp(20.0f);
                                                if (Math.abs(iB - themeEditorView.f26555g.x) > iDp) {
                                                    arrayList = new ArrayList();
                                                    editorEdit.putInt("sidex", 0);
                                                    if (themeEditorView.f26550a.getAlpha() != 1.0f) {
                                                        arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 1.0f));
                                                    }
                                                    arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", iB));
                                                    z10 = false;
                                                } else {
                                                    arrayList = new ArrayList();
                                                    editorEdit.putInt("sidex", 0);
                                                    if (themeEditorView.f26550a.getAlpha() != 1.0f) {
                                                        arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 1.0f));
                                                    }
                                                    arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", iB));
                                                    z10 = false;
                                                }
                                                if (!z10) {
                                                    if (Math.abs(iB2 - themeEditorView.f26555g.y) > iDp) {
                                                        if (arrayList == null) {
                                                            arrayList = new ArrayList();
                                                        }
                                                        editorEdit.putInt("sidey", 0);
                                                        arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", iB2));
                                                    } else {
                                                        if (arrayList == null) {
                                                            arrayList = new ArrayList();
                                                        }
                                                        editorEdit.putInt("sidey", 0);
                                                        arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", iB2));
                                                    }
                                                    editorEdit.commit();
                                                }
                                                if (arrayList != null) {
                                                    if (themeEditorView.f26556i == null) {
                                                        themeEditorView.f26556i = new DecelerateInterpolator();
                                                    }
                                                    animatorSet = new AnimatorSet();
                                                    animatorSet.setInterpolator(themeEditorView.f26556i);
                                                    animatorSet.setDuration(150L);
                                                    if (z10) {
                                                        z11 = true;
                                                        arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 0.0f));
                                                        animatorSet.addListener(new i01(themeEditorView, 1 == true ? 1 : 0));
                                                    } else {
                                                        z11 = true;
                                                    }
                                                    animatorSet.playTogether(arrayList);
                                                    animatorSet.start();
                                                    return z11;
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    }
                }
                if (this.f28494c) {
                    fC = 1.0f;
                    if (motionEvent.getAction() == 2) {
                        float f12 = rawX - this.f28492a;
                        float f13 = rawY - this.f28493b;
                        layoutParams = themeEditorView.f26555g;
                        i11 = (int) (layoutParams.x + f12);
                        layoutParams.x = i11;
                        layoutParams.y = (int) (layoutParams.y + f13);
                        i12 = i20 / 2;
                        i13 = -i12;
                        if (i11 < i13) {
                            layoutParams.x = i13;
                        } else {
                            i14 = (AndroidUtilities.displaySize.x - layoutParams.width) + i12;
                            if (i11 > i14) {
                                layoutParams.x = i14;
                            }
                        }
                        i15 = layoutParams.x;
                        if (i15 < 0) {
                            fC = s3.c.c(i15, i12, 0.5f, 1.0f);
                        } else {
                            i16 = AndroidUtilities.displaySize.x;
                            i17 = layoutParams.width;
                            if (i15 > i16 - i17) {
                                fC = org.telegram.messenger.rl.c((i15 - i16) + i17, i12, 0.5f, 1.0f);
                            }
                        }
                        if (themeEditorView.f26550a.getAlpha() != fC) {
                            themeEditorView.f26550a.setAlpha(fC);
                        }
                        layoutParams2 = themeEditorView.f26555g;
                        i18 = layoutParams2.y;
                        if (i18 < 0) {
                            layoutParams2.y = 0;
                        } else {
                            i19 = AndroidUtilities.displaySize.y - layoutParams2.height;
                            if (i18 > i19) {
                                layoutParams2.y = i19;
                            }
                        }
                        themeEditorView.h.updateViewLayout(themeEditorView.f26550a, layoutParams2);
                        this.f28492a = rawX;
                        this.f28493b = rawY;
                    } else {
                        if (motionEvent.getAction() != 1) {
                            return true;
                        }
                        this.f28494c = false;
                        iB = ThemeEditorView.b(true, 0, 0.0f, i20);
                        int iB5 = ThemeEditorView.b(true, 1, 0.0f, i20);
                        int i23 = themeEditorView.f26554f;
                        iB2 = ThemeEditorView.b(false, 0, 0.0f, i23);
                        int iB6 = ThemeEditorView.b(false, 1, 0.0f, i23);
                        editorEdit = themeEditorView.f26557j.edit();
                        iDp = AndroidUtilities.dp(20.0f);
                        if (Math.abs(iB - themeEditorView.f26555g.x) > iDp || ((i10 = themeEditorView.f26555g.x) < 0 && i10 > (-i20) / 4)) {
                            arrayList = new ArrayList();
                            editorEdit.putInt("sidex", 0);
                            if (themeEditorView.f26550a.getAlpha() != 1.0f) {
                                arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 1.0f));
                            }
                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", iB));
                        } else {
                            if (Math.abs(iB5 - i10) > iDp) {
                                int i24 = themeEditorView.f26555g.x;
                                int i25 = AndroidUtilities.displaySize.x;
                                if (i24 <= i25 - i20 || i24 >= i25 - ((i20 / 4) * 3)) {
                                    if (themeEditorView.f26550a.getAlpha() != 1.0f) {
                                        arrayList = new ArrayList();
                                        if (themeEditorView.f26555g.x < 0) {
                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", -i20));
                                        } else {
                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", AndroidUtilities.displaySize.x));
                                        }
                                        z10 = true;
                                    } else {
                                        editorEdit.putFloat("px", (themeEditorView.f26555g.x - iB) / (iB5 - iB));
                                        editorEdit.putInt("sidex", 2);
                                        z10 = false;
                                        arrayList = null;
                                    }
                                }
                                if (!z10) {
                                    if (Math.abs(iB2 - themeEditorView.f26555g.y) > iDp || themeEditorView.f26555g.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        editorEdit.putInt("sidey", 0);
                                        arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", iB2));
                                    } else if (Math.abs(iB6 - themeEditorView.f26555g.y) <= iDp) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        editorEdit.putInt("sidey", 1);
                                        arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", iB6));
                                    } else {
                                        editorEdit.putFloat("py", (themeEditorView.f26555g.y - iB2) / (iB6 - iB2));
                                        editorEdit.putInt("sidey", 2);
                                    }
                                    editorEdit.commit();
                                }
                                if (arrayList != null) {
                                    if (themeEditorView.f26556i == null) {
                                        themeEditorView.f26556i = new DecelerateInterpolator();
                                    }
                                    animatorSet = new AnimatorSet();
                                    animatorSet.setInterpolator(themeEditorView.f26556i);
                                    animatorSet.setDuration(150L);
                                    if (z10) {
                                        z11 = true;
                                        arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 0.0f));
                                        animatorSet.addListener(new i01(themeEditorView, 1 == true ? 1 : 0));
                                    } else {
                                        z11 = true;
                                    }
                                    animatorSet.playTogether(arrayList);
                                    animatorSet.start();
                                    return z11;
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            editorEdit.putInt("sidex", 1);
                            if (themeEditorView.f26550a.getAlpha() != 1.0f) {
                                arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 1.0f));
                            }
                            arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", iB5));
                            arrayList = arrayList2;
                        }
                        z10 = false;
                        if (!z10) {
                            if (Math.abs(iB2 - themeEditorView.f26555g.y) > iDp) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                editorEdit.putInt("sidey", 0);
                                arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", iB2));
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                editorEdit.putInt("sidey", 0);
                                arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", iB2));
                            }
                            editorEdit.commit();
                        }
                        if (arrayList != null) {
                            if (themeEditorView.f26556i == null) {
                                themeEditorView.f26556i = new DecelerateInterpolator();
                            }
                            animatorSet = new AnimatorSet();
                            animatorSet.setInterpolator(themeEditorView.f26556i);
                            animatorSet.setDuration(150L);
                            if (z10) {
                                z11 = true;
                                arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 0.0f));
                                animatorSet.addListener(new i01(themeEditorView, 1 == true ? 1 : 0));
                            } else {
                                z11 = true;
                            }
                            animatorSet.playTogether(arrayList);
                            animatorSet.start();
                            return z11;
                        }
                    }
                }
                return true;
            }
            if (Math.abs(this.f28492a - rawX) >= AndroidUtilities.getPixelsInCM(0.3f, true) || Math.abs(this.f28493b - rawY) >= AndroidUtilities.getPixelsInCM(0.3f, false)) {
                this.f28494c = true;
                this.f28492a = rawX;
                this.f28493b = rawY;
            }
        }
        if (this.f28494c) {
            fC = 1.0f;
            if (motionEvent.getAction() == 2) {
                float f14 = rawX - this.f28492a;
                float f15 = rawY - this.f28493b;
                layoutParams = themeEditorView.f26555g;
                i11 = (int) (layoutParams.x + f14);
                layoutParams.x = i11;
                layoutParams.y = (int) (layoutParams.y + f15);
                i12 = i20 / 2;
                i13 = -i12;
                if (i11 < i13) {
                    layoutParams.x = i13;
                } else {
                    i14 = (AndroidUtilities.displaySize.x - layoutParams.width) + i12;
                    if (i11 > i14) {
                        layoutParams.x = i14;
                    }
                }
                i15 = layoutParams.x;
                if (i15 < 0) {
                    fC = s3.c.c(i15, i12, 0.5f, 1.0f);
                } else {
                    i16 = AndroidUtilities.displaySize.x;
                    i17 = layoutParams.width;
                    if (i15 > i16 - i17) {
                        fC = org.telegram.messenger.rl.c((i15 - i16) + i17, i12, 0.5f, 1.0f);
                    }
                }
                if (themeEditorView.f26550a.getAlpha() != fC) {
                    themeEditorView.f26550a.setAlpha(fC);
                }
                layoutParams2 = themeEditorView.f26555g;
                i18 = layoutParams2.y;
                if (i18 < 0) {
                    layoutParams2.y = 0;
                } else {
                    i19 = AndroidUtilities.displaySize.y - layoutParams2.height;
                    if (i18 > i19) {
                        layoutParams2.y = i19;
                    }
                }
                themeEditorView.h.updateViewLayout(themeEditorView.f26550a, layoutParams2);
                this.f28492a = rawX;
                this.f28493b = rawY;
            } else {
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                this.f28494c = false;
                iB = ThemeEditorView.b(true, 0, 0.0f, i20);
                int iB7 = ThemeEditorView.b(true, 1, 0.0f, i20);
                int i26 = themeEditorView.f26554f;
                iB2 = ThemeEditorView.b(false, 0, 0.0f, i26);
                int iB8 = ThemeEditorView.b(false, 1, 0.0f, i26);
                editorEdit = themeEditorView.f26557j.edit();
                iDp = AndroidUtilities.dp(20.0f);
                if (Math.abs(iB - themeEditorView.f26555g.x) > iDp) {
                    arrayList = new ArrayList();
                    editorEdit.putInt("sidex", 0);
                    if (themeEditorView.f26550a.getAlpha() != 1.0f) {
                        arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 1.0f));
                    }
                    arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", iB));
                    z10 = false;
                } else {
                    arrayList = new ArrayList();
                    editorEdit.putInt("sidex", 0);
                    if (themeEditorView.f26550a.getAlpha() != 1.0f) {
                        arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 1.0f));
                    }
                    arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", iB));
                    z10 = false;
                }
                if (!z10) {
                    if (Math.abs(iB2 - themeEditorView.f26555g.y) > iDp) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        editorEdit.putInt("sidey", 0);
                        arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", iB2));
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        editorEdit.putInt("sidey", 0);
                        arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", iB2));
                    }
                    editorEdit.commit();
                }
                if (arrayList != null) {
                    if (themeEditorView.f26556i == null) {
                        themeEditorView.f26556i = new DecelerateInterpolator();
                    }
                    animatorSet = new AnimatorSet();
                    animatorSet.setInterpolator(themeEditorView.f26556i);
                    animatorSet.setDuration(150L);
                    if (z10) {
                        z11 = true;
                        arrayList.add(ObjectAnimator.ofFloat(themeEditorView.f26550a, (Property<g01, Float>) property, 0.0f));
                        animatorSet.addListener(new i01(themeEditorView, 1 == true ? 1 : 0));
                    } else {
                        z11 = true;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.start();
                    return z11;
                }
            }
        }
        return true;
    }
}
