package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
public class ThemeEditorView {
    public static volatile ThemeEditorView f24340n;
    public f21 f24341a;
    public Activity f24342b;
    public ArrayList f24343c;
    public int d;
    public final int f24344e = AndroidUtilities.dp(54.0f);
    public final int f24345f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams f24346g;
    public WindowManager h;
    public DecelerateInterpolator f24347i;
    public SharedPreferences f24348j;
    public x91 f24349k;
    public EditorAlert f24350l;
    public org.telegram.ui.ActionBar.g6 f24351m;

    public class EditorAlert extends org.telegram.ui.ActionBar.e3 {
        public static final int M = 0;
        public int E;
        public int F;
        public int G;
        public boolean H;
        public AnimatorSet I;
        public boolean J;
        public boolean K;
        public final q21 f24352b;
        public final k21 f24353c;
        public final FrameLayout d;
        public final d00 f24354e;
        public final x21 f24355f;
        public final s4.d0 h;
        public final r21 f24356n;
        public final t21 f24357r;
        public final FrameLayout f24358s;
        public final FrameLayout v;
        public final View[] f24359w;
        public final AnimatorSet[] f24360x;
        public final Drawable f24361y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f24359w = new View[2];
            this.f24360x = new AnimatorSet[2];
            this.f24361y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            j21 j21Var = new j21(this, context);
            this.containerView = j21Var;
            j21Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            x21 x21Var = new x21(this, context);
            this.f24355f = x21Var;
            frameLayout.addView(x21Var, w7.x5.e(-1, -1, 51));
            k21 k21Var = new k21(this, context);
            this.f24353c = k21Var;
            k21Var.setSelectorDrawableColor(251658240);
            k21Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            k21Var.setClipToPadding(false);
            getContext();
            s4.d0 d0Var = new s4.d0();
            this.h = d0Var;
            k21Var.setLayoutManager(d0Var);
            k21Var.setHorizontalScrollBarEnabled(false);
            k21Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(k21Var, w7.x5.e(-1, -1, 51));
            ?? i0Var = new s4.i0();
            i0Var.d = new ArrayList();
            i0Var.f30315c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) arrayList.get(i11);
                int i12 = j6Var.f21247f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    i0Var.d.add(arrayList2);
                }
                arrayList2.add(j6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.h6.f20730a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i13));
                    i0Var.d.add(arrayList3);
                }
            }
            this.f24356n = i0Var;
            k21Var.setAdapter(i0Var);
            this.f24357r = new t21(this, context);
            this.f24353c.setGlowColor(-657673);
            this.f24353c.setItemAnimator(null);
            this.f24353c.setLayoutAnimation(null);
            this.f24353c.setOnItemClickListener(new j(this, 18));
            this.f24353c.setOnScrollListener(new l21(this));
            d00 d00Var = new d00(context, null);
            this.f24354e = d00Var;
            d00Var.setShowAtCenter(true);
            d00Var.c();
            d00Var.setText(LocaleController.getString(R.string.NoResult));
            this.f24353c.setEmptyView(d00Var);
            this.containerView.addView(d00Var, w7.x5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f24359w[0] = new View(context);
            this.f24359w[0].setBackgroundColor(301989888);
            this.f24359w[0].setAlpha(0.0f);
            this.f24359w[0].setTag(1);
            this.containerView.addView(this.f24359w[0], layoutParams);
            this.containerView.addView(this.d, w7.x5.e(-1, 58, 51));
            q21 q21Var = new q21(this, context);
            this.f24352b = q21Var;
            q21Var.setVisibility(8);
            this.containerView.addView(q21Var, w7.x5.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f24359w[1] = new View(context);
            this.f24359w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f24359w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f24358s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, w7.x5.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, w7.x5.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27143b;

                {
                    this.f27143b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27143b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.h6.s1(themeEditorView.f24351m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24341a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24342b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24343c.size(); i16++) {
                                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) themeEditorView2.f24343c.get(i16);
                                j6Var2.e(j6Var2.f21249i, j6Var2.f21250j[0], true);
                            }
                            editorAlert.M(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24343c.size(); i17++) {
                                org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) themeEditorView3.f24343c.get(i17);
                                j6Var3.e(org.telegram.ui.ActionBar.h6.D0(j6Var3.f21247f), true, true);
                            }
                            editorAlert.M(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, w7.x5.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27143b;

                {
                    this.f27143b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27143b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.h6.s1(themeEditorView.f24351m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24341a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24342b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24343c.size(); i16++) {
                                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) themeEditorView2.f24343c.get(i16);
                                j6Var2.e(j6Var2.f21249i, j6Var2.f21250j[0], true);
                            }
                            editorAlert.M(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24343c.size(); i17++) {
                                org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) themeEditorView3.f24343c.get(i17);
                                j6Var3.e(org.telegram.ui.ActionBar.h6.D0(j6Var3.f21247f), true, true);
                            }
                            editorAlert.M(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, w7.x5.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, w7.x5.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27143b;

                {
                    this.f27143b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27143b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.h6.s1(themeEditorView.f24351m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24341a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24342b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24343c.size(); i16++) {
                                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) themeEditorView2.f24343c.get(i16);
                                j6Var2.e(j6Var2.f21249i, j6Var2.f21250j[0], true);
                            }
                            editorAlert.M(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24343c.size(); i17++) {
                                org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) themeEditorView3.f24343c.get(i17);
                                j6Var3.e(org.telegram.ui.ActionBar.h6.D0(j6Var3.f21247f), true, true);
                            }
                            editorAlert.M(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, w7.x5.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, w7.x5.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27143b;

                {
                    this.f27143b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27143b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.h6.s1(themeEditorView.f24351m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24341a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24342b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24343c.size(); i16++) {
                                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) themeEditorView2.f24343c.get(i16);
                                j6Var2.e(j6Var2.f21249i, j6Var2.f21250j[0], true);
                            }
                            editorAlert.M(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24343c.size(); i17++) {
                                org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) themeEditorView3.f24343c.get(i17);
                                j6Var3.e(org.telegram.ui.ActionBar.h6.D0(j6Var3.f21247f), true, true);
                            }
                            editorAlert.M(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, w7.x5.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27143b;

                {
                    this.f27143b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27143b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.h6.s1(themeEditorView.f24351m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24341a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24342b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24343c.size(); i16++) {
                                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) themeEditorView2.f24343c.get(i16);
                                j6Var2.e(j6Var2.f21249i, j6Var2.f21250j[0], true);
                            }
                            editorAlert.M(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24343c.size(); i17++) {
                                org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) themeEditorView3.f24343c.get(i17);
                                j6Var3.e(org.telegram.ui.ActionBar.h6.D0(j6Var3.f21247f), true, true);
                            }
                            editorAlert.M(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            return;
                    }
                }
            });
        }

        public static int K(EditorAlert editorAlert) {
            k21 k21Var = editorAlert.f24353c;
            if (k21Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = k21Var.getChildAt(0);
                cm0 cm0Var = (cm0) k21Var.G(childAt);
                if (cm0Var != null) {
                    int paddingTop = k21Var.getPaddingTop();
                    if (cm0Var.b() == 0 && childAt.getTop() >= 0) {
                        i10 = childAt.getTop();
                    }
                    return paddingTop - i10;
                }
                return -1000;
            }
            return -1000;
        }

        public static void u(EditorAlert editorAlert) {
            int paddingTop;
            k21 k21Var = editorAlert.f24353c;
            if (k21Var.getChildCount() > 0 && k21Var.getVisibility() == 0 && !editorAlert.H) {
                int i10 = 0;
                View childAt = k21Var.getChildAt(0);
                cm0 cm0Var = (cm0) k21Var.G(childAt);
                if (k21Var.getVisibility() == 0 && !editorAlert.H) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = k21Var.getPaddingTop();
                }
                if (paddingTop > (-AndroidUtilities.dp(1.0f)) && cm0Var != null && cm0Var.b() == 0) {
                    editorAlert.L(false);
                    i10 = paddingTop;
                } else {
                    editorAlert.L(true);
                }
                if (editorAlert.E != i10) {
                    editorAlert.setScrollOffsetY(i10);
                }
            }
        }

        public final void L(boolean z10) {
            Integer num;
            float f7;
            View[] viewArr = this.f24359w;
            if ((z10 && viewArr[0].getTag() != null) || (!z10 && viewArr[0].getTag() == null)) {
                View view = viewArr[0];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[0].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.f24360x;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                View view2 = viewArr[0];
                Property property = View.ALPHA;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f7));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].addListener(new m21(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void M(boolean z10) {
            ?? r62;
            d00 d00Var = this.f24354e;
            View[] viewArr = this.f24359w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f24358s;
            FrameLayout frameLayout3 = this.v;
            q21 q21Var = this.f24352b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            k21 k21Var = this.f24353c;
            if (z10) {
                this.H = true;
                q21Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                q21Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.G = this.E;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(q21Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(k21Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(d00Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", k21Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f24347i);
                animatorSet.addListener(new n21(this));
                animatorSet.start();
                return;
            }
            float f7 = 0.0f;
            Activity activity = themeEditorView.f24342b;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.h6.s1(themeEditorView.f24351m, r62, r62, r62);
            if (k21Var.getAdapter() == this.f24356n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.H = true;
            k21Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f24355f.setVisibility(r62);
            k21Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q21Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k21Var, property2, fArr3);
            char c10 = r62;
            float[] fArr4 = new float[1];
            fArr4[c10] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, fArr4);
            View view = viewArr[c10];
            if (view.getTag() == null) {
                f7 = 1.0f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f7;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, property2, fArr5);
            float[] fArr6 = new float[1];
            fArr6[c10] = 1.0f;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(d00Var, property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c10] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.G);
            Animator[] animatorArr = new Animator[8];
            animatorArr[c10] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofInt;
            animatorSet2.playTogether(animatorArr);
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.f24347i);
            animatorSet2.addListener(new o21(this));
            animatorSet2.start();
            k21Var.getAdapter().m(themeEditorView.d);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            x21 x21Var = this.f24355f;
            if (x21Var.f32810b.isFocused()) {
                AndroidUtilities.hideKeyboard(x21Var.f32810b);
            }
        }

        public int getScrollOffsetY() {
            return this.E;
        }

        public void setScrollOffsetY(int i10) {
            this.E = i10;
            this.f24353c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.E);
            this.f24352b.setTranslationY(this.E);
            this.f24354e.setTranslationY(this.E);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z10, int i10, float f7, int i11) {
        int i12;
        int round;
        if (z10) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i13 = i12 - i11;
        if (i10 == 0) {
            round = AndroidUtilities.dp(10.0f);
        } else if (i10 == 1) {
            round = i13 - AndroidUtilities.dp(10.0f);
        } else {
            round = Math.round((i13 - AndroidUtilities.dp(20.0f)) * f7) + AndroidUtilities.dp(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a() {
        f21 f21Var;
        this.f24349k.getClass();
        if (this.f24342b != null && (f21Var = this.f24341a) != null) {
            try {
                this.h.removeViewImmediate(f21Var);
                this.f24341a = null;
            } catch (Exception e7) {
                FileLog.e((Throwable) e7, false);
            }
            try {
                EditorAlert editorAlert = this.f24350l;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f24350l = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.f24342b = null;
            f24340n = null;
        }
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        if (f24340n != null) {
            f24340n.a();
        }
        this.f24351m = g6Var;
        this.f24341a = new f21(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f24348j = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24348j.getInt("sidey", 0);
        float f7 = this.f24348j.getFloat("px", 0.0f);
        float f10 = this.f24348j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f24346g = layoutParams;
            int i12 = this.f24344e;
            layoutParams.width = i12;
            layoutParams.height = this.f24345f;
            layoutParams.x = b(true, i10, f7, i12);
            this.f24346g.y = b(false, i11, f10, this.f24345f);
            WindowManager.LayoutParams layoutParams2 = this.f24346g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.f24341a, layoutParams2);
            this.h.addView(this.f24341a, this.f24346g);
            this.f24349k = new x91(activity, null, new g21(this));
            f24340n = this;
            this.f24342b = activity;
            d();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void d() {
        this.f24341a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f24341a, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f24341a, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f24341a, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f24347i);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f24346g.x;
    }

    public int getY() {
        return this.f24346g.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24346g;
        layoutParams.x = i10;
        this.h.updateViewLayout(this.f24341a, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24346g;
        layoutParams.y = i10;
        this.h.updateViewLayout(this.f24341a, layoutParams);
    }
}
