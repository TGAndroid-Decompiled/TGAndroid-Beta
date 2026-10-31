package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
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
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
public class ThemeEditorView {
    public static volatile ThemeEditorView f24207p;
    public boolean f24208a;
    public i01 f24210c;
    public Activity d;
    public ArrayList e;
    public int f24211f;
    public WindowManager.LayoutParams f24213i;
    public WindowManager f24214j;
    public DecelerateInterpolator f24215k;
    public SharedPreferences f24216l;
    public bh.d f24217m;
    public EditorAlert f24218n;
    public org.telegram.ui.ActionBar.s6 f24219o;
    public final ew f24209b = new ew(this, 14);
    public final int f24212g = org.telegram.messenger.i0.L(54.0f);
    public final int h = org.telegram.messenger.i0.L(54.0f);

    public class EditorAlert extends org.telegram.ui.ActionBar.z2 {
        public static final int D1 = 0;
        public boolean A1;
        public boolean B1;
        public final t01 f24220i1;
        public final n01 f24221j1;
        public final FrameLayout f24222k1;
        public final xy l1;
        public final z01 f24223m1;
        public final s4.a0 f24224n1;
        public final u01 f24225o1;
        public final v01 f24226p1;
        public final FrameLayout f24227q1;
        public final FrameLayout f24228r1;
        public final View[] f24229s1;
        public final AnimatorSet[] f24230t1;
        public final Drawable f24231u1;
        public int f24232v1;
        public int f24233w1;
        public int f24234x1;
        public boolean f24235y1;
        public AnimatorSet f24236z1;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f24229s1 = new View[2];
            this.f24230t1 = new AnimatorSet[2];
            this.f24231u1 = i0.a.f(context, 2131232725);
            m01 m01Var = new m01(this, context);
            this.f21586b = m01Var;
            m01Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.f21586b;
            int i10 = this.f21615t0;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.f24222k1 = frameLayout;
            frameLayout.setBackgroundColor(-1);
            z01 z01Var = new z01(this, context);
            this.f24223m1 = z01Var;
            frameLayout.addView(z01Var, w7.b6.e(-1, -1, 51));
            n01 n01Var = new n01(this, context);
            this.f24221j1 = n01Var;
            n01Var.setSelectorDrawableColor(251658240);
            float f7 = 48.0f;
            n01Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
            n01Var.setClipToPadding(false);
            getContext();
            s4.a0 a0Var = new s4.a0();
            this.f24224n1 = a0Var;
            n01Var.setLayoutManager(a0Var);
            n01Var.setHorizontalScrollBarEnabled(false);
            n01Var.setVerticalScrollBarEnabled(false);
            this.f21586b.addView(n01Var, w7.b6.e(-1, -1, 51));
            ?? g0Var = new s4.g0();
            g0Var.d = new ArrayList();
            g0Var.f30743c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) arrayList.get(i11);
                int i12 = c7Var.e;
                float f10 = f7;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    g0Var.d.add(arrayList2);
                }
                arrayList2.add(c7Var);
                i11++;
                f7 = f10;
            }
            float f11 = f7;
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.t6.f20872a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
                    g0Var.d.add(arrayList3);
                }
            }
            this.f24225o1 = g0Var;
            n01Var.setAdapter(g0Var);
            this.f24226p1 = new v01(this, context);
            this.f24221j1.setGlowColor(-657673);
            this.f24221j1.setItemAnimator(null);
            this.f24221j1.setLayoutAnimation(null);
            this.f24221j1.setOnItemClickListener(new k(this, 18));
            this.f24221j1.setOnScrollListener(new o01(this));
            xy xyVar = new xy(context, null);
            this.l1 = xyVar;
            xyVar.setShowAtCenter(true);
            xyVar.c();
            xyVar.setText(org.telegram.messenger.cd.L0(2131748183, null));
            this.f24221j1.setEmptyView(xyVar);
            this.f21586b.addView(xyVar, w7.b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
            layoutParams.topMargin = org.telegram.messenger.i0.L(58.0f);
            this.f24229s1[0] = new View(context);
            this.f24229s1[0].setBackgroundColor(301989888);
            this.f24229s1[0].setAlpha(0.0f);
            this.f24229s1[0].setTag(1);
            this.f21586b.addView(this.f24229s1[0], layoutParams);
            this.f21586b.addView(this.f24222k1, w7.b6.e(-1, 58, 51));
            t01 t01Var = new t01(this, context);
            this.f24220i1 = t01Var;
            t01Var.setVisibility(8);
            this.f21586b.addView(t01Var, w7.b6.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
            layoutParams2.bottomMargin = org.telegram.messenger.i0.L(f11);
            this.f24229s1[1] = new View(context);
            this.f24229s1[1].setBackgroundColor(301989888);
            this.f21586b.addView(this.f24229s1[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f24227q1 = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.f21586b.addView(frameLayout2, w7.b6.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView.setText(org.telegram.messenger.cd.L0(2131752040, null).toUpperCase());
            textView.setTypeface(org.telegram.messenger.i0.o());
            frameLayout2.addView(textView, w7.b6.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27960b;

                {
                    this.f27960b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27960b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.f24219o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24214j.removeView(themeEditorView.f24210c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i16);
                                c7Var2.e(c7Var2.h, c7Var2.f20237i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i17);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView2.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView2.setText(org.telegram.messenger.cd.L0(2131745949, null).toUpperCase());
            textView2.setTypeface(org.telegram.messenger.i0.o());
            frameLayout2.addView(textView2, w7.b6.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27960b;

                {
                    this.f27960b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27960b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.f24219o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24214j.removeView(themeEditorView.f24210c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i16);
                                c7Var2.e(c7Var2.h, c7Var2.f20237i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i17);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.f24228r1 = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.f21586b.addView(frameLayout3, w7.b6.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView3.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView3.setText(org.telegram.messenger.cd.L0(2131752589, null).toUpperCase());
            textView3.setTypeface(org.telegram.messenger.i0.o());
            frameLayout3.addView(textView3, w7.b6.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27960b;

                {
                    this.f27960b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27960b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.f24219o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24214j.removeView(themeEditorView.f24210c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i16);
                                c7Var2.e(c7Var2.h, c7Var2.f20237i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i17);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, w7.b6.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView4.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView4.setText(org.telegram.messenger.cd.L0(2131751601, null).toUpperCase());
            textView4.setTypeface(org.telegram.messenger.i0.o());
            linearLayout.addView(textView4, w7.b6.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27960b;

                {
                    this.f27960b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27960b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.f24219o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24214j.removeView(themeEditorView.f24210c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i16);
                                c7Var2.e(c7Var2.h, c7Var2.f20237i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i17);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView5.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView5.setText(org.telegram.messenger.cd.L0(2131745963, null).toUpperCase());
            textView5.setTypeface(org.telegram.messenger.i0.o());
            linearLayout.addView(textView5, w7.b6.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f27960b;

                {
                    this.f27960b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f27960b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.f24219o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f24214j.removeView(themeEditorView.f24210c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i16);
                                c7Var2.e(c7Var2.h, c7Var2.f20237i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i17);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
        }

        public static void I0(EditorAlert editorAlert) {
            int paddingTop;
            n01 n01Var = editorAlert.f24221j1;
            if (n01Var.getChildCount() > 0 && n01Var.getVisibility() == 0 && !editorAlert.f24235y1) {
                int i10 = 0;
                View childAt = n01Var.getChildAt(0);
                ck0 ck0Var = (ck0) n01Var.G(childAt);
                if (n01Var.getVisibility() == 0 && !editorAlert.f24235y1) {
                    paddingTop = childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
                } else {
                    paddingTop = n01Var.getPaddingTop();
                }
                if (paddingTop > (-org.telegram.messenger.i0.L(1.0f)) && ck0Var != null && ck0Var.b() == 0) {
                    editorAlert.K0(false);
                    i10 = paddingTop;
                } else {
                    editorAlert.K0(true);
                }
                if (editorAlert.f24232v1 != i10) {
                    editorAlert.setScrollOffsetY(i10);
                }
            }
        }

        public static int J0(EditorAlert editorAlert) {
            n01 n01Var = editorAlert.f24221j1;
            if (n01Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = n01Var.getChildAt(0);
                ck0 ck0Var = (ck0) n01Var.G(childAt);
                if (ck0Var != null) {
                    int paddingTop = n01Var.getPaddingTop();
                    if (ck0Var.b() == 0 && childAt.getTop() >= 0) {
                        i10 = childAt.getTop();
                    }
                    return paddingTop - i10;
                }
                return -1000;
            }
            return -1000;
        }

        @Override
        public final boolean H() {
            return false;
        }

        public final void K0(boolean z10) {
            Integer num;
            float f7;
            View[] viewArr = this.f24229s1;
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
                AnimatorSet[] animatorSetArr = this.f24230t1;
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
                animatorSetArr[0].addListener(new p01(this, z10));
                animatorSetArr[0].start();
            }
        }

        @Override
        public final void L() {
            super.L();
            z01 z01Var = this.f24223m1;
            if (z01Var.f32863b.isFocused()) {
                org.telegram.messenger.i0.v1(z01Var.f32863b);
            }
        }

        public final void L0(boolean z10) {
            ?? r62;
            xy xyVar = this.l1;
            View[] viewArr = this.f24229s1;
            FrameLayout frameLayout = this.f24222k1;
            FrameLayout frameLayout2 = this.f24227q1;
            FrameLayout frameLayout3 = this.f24228r1;
            t01 t01Var = this.f24220i1;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            n01 n01Var = this.f24221j1;
            if (z10) {
                this.f24235y1 = true;
                t01Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                t01Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.f24234x1 = this.f24232v1;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(t01Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(n01Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(xyVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", n01Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f24215k);
                animatorSet.addListener(new q01(this));
                animatorSet.start();
                return;
            }
            float f7 = 0.0f;
            Activity activity = themeEditorView.d;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).y0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.t6.x1(themeEditorView.f24219o, r62, r62, r62);
            if (n01Var.getAdapter() == this.f24225o1) {
                org.telegram.messenger.i0.v1(getCurrentFocus());
            }
            this.f24235y1 = true;
            n01Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f24223m1.setVisibility(r62);
            n01Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t01Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n01Var, property2, fArr3);
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
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(xyVar, property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c10] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.f24234x1);
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
            animatorSet2.setInterpolator(themeEditorView.f24215k);
            animatorSet2.addListener(new r01(this));
            animatorSet2.start();
            n01Var.getAdapter().g(themeEditorView.f24211f);
        }

        public int getScrollOffsetY() {
            return this.f24232v1;
        }

        public void setScrollOffsetY(int i10) {
            this.f24232v1 = i10;
            this.f24221j1.setTopGlowOffset(i10);
            this.f24222k1.setTranslationY(this.f24232v1);
            this.f24220i1.setTranslationY(this.f24232v1);
            this.l1.setTranslationY(this.f24232v1);
            this.f21586b.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (!themeEditorView.f24208a) {
            themeEditorView.f24208a = true;
            org.telegram.messenger.i0.g3(themeEditorView.f24209b);
        }
    }

    public static int c(float f7, int i10, int i11, boolean z10) {
        int i12;
        int round;
        if (z10) {
            i12 = org.telegram.messenger.i0.f16026q.x;
        } else {
            i12 = org.telegram.messenger.i0.f16026q.y - i11;
            i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        int i13 = i12 - i11;
        if (i10 == 0) {
            round = org.telegram.messenger.i0.L(10.0f);
        } else if (i10 == 1) {
            round = i13 - org.telegram.messenger.i0.L(10.0f);
        } else {
            round = Math.round((i13 - org.telegram.messenger.i0.L(20.0f)) * f7) + org.telegram.messenger.i0.L(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void b() {
        i01 i01Var;
        this.f24217m.getClass();
        if (this.d != null && (i01Var = this.f24210c) != null) {
            try {
                this.f24214j.removeViewImmediate(i01Var);
                this.f24210c = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, false);
            }
            try {
                EditorAlert editorAlert = this.f24218n;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f24218n = null;
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
            this.d = null;
            f24207p = null;
        }
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.s6 s6Var) {
        if (f24207p != null) {
            f24207p.b();
        }
        this.f24219o = s6Var;
        this.f24210c = new i01(this, activity);
        this.f24214j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0);
        this.f24216l = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24216l.getInt("sidey", 0);
        float f7 = this.f24216l.getFloat("px", 0.0f);
        float f10 = this.f24216l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f24213i = layoutParams;
            int i12 = this.f24212g;
            layoutParams.width = i12;
            layoutParams.height = this.h;
            layoutParams.x = c(f7, i10, i12, true);
            this.f24213i.y = c(f10, i11, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.f24213i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.i0.x3(this.f24214j, this.f24210c, layoutParams2);
            this.f24214j.addView(this.f24210c, this.f24213i);
            this.f24217m = new bh.d(activity, null, new j01(this));
            f24207p = this;
            this.d = activity;
            e();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void e() {
        this.f24210c.setBackgroundResource(2131232775);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f24210c, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f24210c, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f24210c, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f24215k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f24213i.x;
    }

    public int getY() {
        return this.f24213i.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24213i;
        layoutParams.x = i10;
        this.f24214j.updateViewLayout(this.f24210c, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24213i;
        layoutParams.y = i10;
        this.f24214j.updateViewLayout(this.f24210c, layoutParams);
    }
}
