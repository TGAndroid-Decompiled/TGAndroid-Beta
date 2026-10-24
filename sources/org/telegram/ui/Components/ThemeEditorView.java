package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
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
    public static volatile ThemeEditorView f24533p;
    public boolean f24534a;
    public y11 f24536c;
    public Activity d;
    public ArrayList e;
    public int f24537f;
    public WindowManager.LayoutParams f24539i;
    public WindowManager f24540j;
    public DecelerateInterpolator f24541k;
    public SharedPreferences f24542l;
    public s91 f24543m;
    public EditorAlert f24544n;
    public org.telegram.ui.ActionBar.j6 f24545o;
    public final org.telegram.ui.Cells.u5 f24535b = new org.telegram.ui.Cells.u5(this, 26);
    public final int f24538g = AndroidUtilities.dp(54.0f);
    public final int h = AndroidUtilities.dp(54.0f);

    public class EditorAlert extends org.telegram.ui.ActionBar.h3 {
        public static final int M = 0;
        public int E;
        public int F;
        public int G;
        public boolean H;
        public AnimatorSet I;
        public boolean J;
        public boolean K;
        public final j21 f24546b;
        public final d21 f24547c;
        public final FrameLayout d;
        public final tz e;
        public final p21 f24548f;
        public final s4.b0 h;
        public final k21 f24549n;
        public final l21 f24550r;
        public final FrameLayout f24551s;
        public final FrameLayout v;
        public final View[] f24552w;
        public final AnimatorSet[] f24553x;
        public final Drawable f24554y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f24552w = new View[2];
            this.f24553x = new AnimatorSet[2];
            this.f24554y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            c21 c21Var = new c21(this, context);
            this.containerView = c21Var;
            c21Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            p21 p21Var = new p21(this, context);
            this.f24548f = p21Var;
            frameLayout.addView(p21Var, w7.z5.e(-1, -1, 51));
            d21 d21Var = new d21(this, context);
            this.f24547c = d21Var;
            d21Var.setSelectorDrawableColor(251658240);
            d21Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            d21Var.setClipToPadding(false);
            getContext();
            s4.b0 b0Var = new s4.b0();
            this.h = b0Var;
            d21Var.setLayoutManager(b0Var);
            d21Var.setHorizontalScrollBarEnabled(false);
            d21Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(d21Var, w7.z5.e(-1, -1, 51));
            ?? g0Var = new s4.g0();
            g0Var.d = new ArrayList();
            g0Var.f27838c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) arrayList.get(i11);
                int i12 = t6Var.e;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    g0Var.d.add(arrayList2);
                }
                arrayList2.add(t6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.k6.f21126a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
                    g0Var.d.add(arrayList3);
                }
            }
            this.f24549n = g0Var;
            d21Var.setAdapter(g0Var);
            this.f24550r = new l21(this, context);
            this.f24547c.setGlowColor(-657673);
            this.f24547c.setItemAnimator(null);
            this.f24547c.setLayoutAnimation(null);
            this.f24547c.setOnItemClickListener(new j(this, 18));
            this.f24547c.setOnScrollListener(new e21(this));
            tz tzVar = new tz(context, null);
            this.e = tzVar;
            tzVar.setShowAtCenter(true);
            tzVar.c();
            tzVar.setText(LocaleController.getString(R.string.NoResult));
            this.f24547c.setEmptyView(tzVar);
            this.containerView.addView(tzVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f24552w[0] = new View(context);
            this.f24552w[0].setBackgroundColor(301989888);
            this.f24552w[0].setAlpha(0.0f);
            this.f24552w[0].setTag(1);
            this.containerView.addView(this.f24552w[0], layoutParams);
            this.containerView.addView(this.d, w7.z5.e(-1, 58, 51));
            j21 j21Var = new j21(this, context);
            this.f24546b = j21Var;
            j21Var.setVisibility(8);
            this.containerView.addView(j21Var, w7.z5.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f24552w[1] = new View(context);
            this.f24552w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f24552w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f24551s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, w7.z5.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, w7.z5.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24881b;

                {
                    this.f24881b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24881b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.u1(themeEditorView.f24545o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24540j.removeView(themeEditorView.f24536c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i16);
                                t6Var2.e(t6Var2.h, t6Var2.f21864i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i17);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.E0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.L(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, w7.z5.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24881b;

                {
                    this.f24881b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24881b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.u1(themeEditorView.f24545o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24540j.removeView(themeEditorView.f24536c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i16);
                                t6Var2.e(t6Var2.h, t6Var2.f21864i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i17);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.E0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.L(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, w7.z5.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, w7.z5.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24881b;

                {
                    this.f24881b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24881b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.u1(themeEditorView.f24545o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24540j.removeView(themeEditorView.f24536c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i16);
                                t6Var2.e(t6Var2.h, t6Var2.f21864i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i17);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.E0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.L(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, w7.z5.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, w7.z5.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24881b;

                {
                    this.f24881b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24881b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.u1(themeEditorView.f24545o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24540j.removeView(themeEditorView.f24536c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i16);
                                t6Var2.e(t6Var2.h, t6Var2.f21864i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i17);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.E0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.L(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, w7.z5.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24881b;

                {
                    this.f24881b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24881b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.u1(themeEditorView.f24545o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24540j.removeView(themeEditorView.f24536c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i16);
                                t6Var2.e(t6Var2.h, t6Var2.f21864i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i17);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.E0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.M;
                            editorAlert.L(false);
                            return;
                    }
                }
            });
        }

        public static int J(EditorAlert editorAlert) {
            d21 d21Var = editorAlert.f24547c;
            if (d21Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = d21Var.getChildAt(0);
                vl0 vl0Var = (vl0) d21Var.G(childAt);
                if (vl0Var != null) {
                    int paddingTop = d21Var.getPaddingTop();
                    if (vl0Var.b() == 0 && childAt.getTop() >= 0) {
                        i10 = childAt.getTop();
                    }
                    return paddingTop - i10;
                }
                return -1000;
            }
            return -1000;
        }

        public static void t(EditorAlert editorAlert) {
            int paddingTop;
            d21 d21Var = editorAlert.f24547c;
            if (d21Var.getChildCount() > 0 && d21Var.getVisibility() == 0 && !editorAlert.H) {
                int i10 = 0;
                View childAt = d21Var.getChildAt(0);
                vl0 vl0Var = (vl0) d21Var.G(childAt);
                if (d21Var.getVisibility() == 0 && !editorAlert.H) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = d21Var.getPaddingTop();
                }
                if (paddingTop > (-AndroidUtilities.dp(1.0f)) && vl0Var != null && vl0Var.b() == 0) {
                    editorAlert.K(false);
                    i10 = paddingTop;
                } else {
                    editorAlert.K(true);
                }
                if (editorAlert.E != i10) {
                    editorAlert.setScrollOffsetY(i10);
                }
            }
        }

        public final void K(boolean z10) {
            Integer num;
            float f7;
            View[] viewArr = this.f24552w;
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
                AnimatorSet[] animatorSetArr = this.f24553x;
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
                animatorSetArr[0].addListener(new f21(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void L(boolean z10) {
            ?? r62;
            tz tzVar = this.e;
            View[] viewArr = this.f24552w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f24551s;
            FrameLayout frameLayout3 = this.v;
            j21 j21Var = this.f24546b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            d21 d21Var = this.f24547c;
            if (z10) {
                this.H = true;
                j21Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                j21Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.G = this.E;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(j21Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(d21Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(tzVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", d21Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f24541k);
                animatorSet.addListener(new g21(this));
                animatorSet.start();
                return;
            }
            float f7 = 0.0f;
            Activity activity = themeEditorView.d;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).z0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.k6.u1(themeEditorView.f24545o, r62, r62, r62);
            if (d21Var.getAdapter() == this.f24549n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.H = true;
            d21Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f24548f.setVisibility(r62);
            d21Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j21Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(d21Var, property2, fArr3);
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
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tzVar, property2, fArr6);
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
            animatorSet2.setInterpolator(themeEditorView.f24541k);
            animatorSet2.addListener(new h21(this));
            animatorSet2.start();
            d21Var.getAdapter().m(themeEditorView.f24537f);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            p21 p21Var = this.f24548f;
            if (p21Var.f29456b.isFocused()) {
                AndroidUtilities.hideKeyboard(p21Var.f29456b);
            }
        }

        public int getScrollOffsetY() {
            return this.E;
        }

        public void setScrollOffsetY(int i10) {
            this.E = i10;
            this.f24547c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.E);
            this.f24546b.setTranslationY(this.E);
            this.e.setTranslationY(this.E);
            this.containerView.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (!themeEditorView.f24534a) {
            themeEditorView.f24534a = true;
            AndroidUtilities.runOnUIThread(themeEditorView.f24535b);
        }
    }

    public static int c(float f7, int i10, int i11, boolean z10) {
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

    public final void b() {
        y11 y11Var;
        this.f24543m.getClass();
        if (this.d != null && (y11Var = this.f24536c) != null) {
            try {
                this.f24540j.removeViewImmediate(y11Var);
                this.f24536c = null;
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            try {
                EditorAlert editorAlert = this.f24544n;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f24544n = null;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.d = null;
            f24533p = null;
        }
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.j6 j6Var) {
        if (f24533p != null) {
            f24533p.b();
        }
        this.f24545o = j6Var;
        this.f24536c = new y11(this, activity);
        this.f24540j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f24542l = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24542l.getInt("sidey", 0);
        float f7 = this.f24542l.getFloat("px", 0.0f);
        float f10 = this.f24542l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f24539i = layoutParams;
            int i12 = this.f24538g;
            layoutParams.width = i12;
            layoutParams.height = this.h;
            layoutParams.x = c(f7, i10, i12, true);
            this.f24539i.y = c(f10, i11, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.f24539i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f24540j, this.f24536c, layoutParams2);
            this.f24540j.addView(this.f24536c, this.f24539i);
            this.f24543m = new s91(activity, null, new z11(this));
            f24533p = this;
            this.d = activity;
            e();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void e() {
        this.f24536c.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f24536c, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f24536c, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f24536c, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f24541k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f24539i.x;
    }

    public int getY() {
        return this.f24539i.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24539i;
        layoutParams.x = i10;
        this.f24540j.updateViewLayout(this.f24536c, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24539i;
        layoutParams.y = i10;
        this.f24540j.updateViewLayout(this.f24536c, layoutParams);
    }
}
