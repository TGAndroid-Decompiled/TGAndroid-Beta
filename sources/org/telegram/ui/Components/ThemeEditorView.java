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
import org.telegram.ui.WallpapersListActivity;
public class ThemeEditorView {
    public static volatile ThemeEditorView f31640p;
    public boolean f31641a;
    public dz0 f31643c;
    public Activity d;
    public ArrayList f31644e;
    public int f31645f;
    public WindowManager.LayoutParams f31647i;
    public WindowManager f31648j;
    public DecelerateInterpolator f31649k;
    public SharedPreferences f31650l;
    public b8.ke f31651m;
    public EditorAlert f31652n;
    public org.telegram.ui.ActionBar.j6 f31653o;
    public final lt f31642b = new lt(this, 15);
    public final int f31646g = org.telegram.messenger.g0.L(54.0f);
    public final int h = org.telegram.messenger.g0.L(54.0f);

    public class EditorAlert extends org.telegram.ui.ActionBar.t2 {
        public static final int E1 = 0;
        public AnimatorSet A1;
        public boolean B1;
        public boolean C1;
        public final oz0 f31654j1;
        public final iz0 k1;
        public final FrameLayout f31655l1;
        public final gy m1;
        public final uz0 f31656n1;
        public final u4.b0 f31657o1;
        public final pz0 f31658p1;
        public final qz0 f31659q1;
        public final FrameLayout f31660r1;
        public final FrameLayout f31661s1;
        public final View[] f31662t1;
        public final AnimatorSet[] f31663u1;
        public final Drawable f31664v1;
        public int f31665w1;
        public int f31666x1;
        public int f31667y1;
        public boolean f31668z1;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f31662t1 = new View[2];
            this.f31663u1 = new AnimatorSet[2];
            this.f31664v1 = k2.p1.g(context, 2131232726);
            hz0 hz0Var = new hz0(this, context);
            this.f28586b = hz0Var;
            hz0Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.f28586b;
            int i3 = this.f28618u0;
            viewGroup.setPadding(i3, 0, i3, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.f31655l1 = frameLayout;
            frameLayout.setBackgroundColor(-1);
            uz0 uz0Var = new uz0(this, context);
            this.f31656n1 = uz0Var;
            frameLayout.addView(uz0Var, b8.mf.e(-1, -1, 51));
            iz0 iz0Var = new iz0(this, context);
            this.k1 = iz0Var;
            iz0Var.setSelectorDrawableColor(251658240);
            float f10 = 48.0f;
            iz0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
            iz0Var.setClipToPadding(false);
            getContext();
            u4.b0 b0Var = new u4.b0();
            this.f31657o1 = b0Var;
            iz0Var.setLayoutManager(b0Var);
            iz0Var.setHorizontalScrollBarEnabled(false);
            iz0Var.setVerticalScrollBarEnabled(false);
            this.f28586b.addView(iz0Var, b8.mf.e(-1, -1, 51));
            ?? h0Var = new u4.h0();
            h0Var.d = new ArrayList();
            h0Var.f37297c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) arrayList.get(i10);
                int i11 = t6Var.f28659e;
                float f11 = f10;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i11));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i11), arrayList2);
                    h0Var.d.add(arrayList2);
                }
                arrayList2.add(t6Var);
                i10++;
                f10 = f11;
            }
            float f12 = f10;
            if (Build.VERSION.SDK_INT >= 26) {
                int i12 = org.telegram.ui.ActionBar.k6.f27824a7;
                if (!hashMap.containsKey(Integer.valueOf(i12))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
                    h0Var.d.add(arrayList3);
                }
            }
            this.f31658p1 = h0Var;
            iz0Var.setAdapter(h0Var);
            this.f31659q1 = new qz0(this, context);
            this.k1.setGlowColor(-657673);
            this.k1.setItemAnimator(null);
            this.k1.setLayoutAnimation(null);
            this.k1.setOnItemClickListener(new k(this, 18));
            this.k1.setOnScrollListener(new jz0(this));
            gy gyVar = new gy(context, null);
            this.m1 = gyVar;
            gyVar.setShowAtCenter(true);
            gyVar.c();
            gyVar.setText(org.telegram.messenger.bd.M0(2131748175, null));
            this.k1.setEmptyView(gyVar);
            this.f28586b.addView(gyVar, b8.mf.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
            layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
            this.f31662t1[0] = new View(context);
            this.f31662t1[0].setBackgroundColor(301989888);
            this.f31662t1[0].setAlpha(0.0f);
            this.f31662t1[0].setTag(1);
            this.f28586b.addView(this.f31662t1[0], layoutParams);
            this.f28586b.addView(this.f31655l1, b8.mf.e(-1, 58, 51));
            oz0 oz0Var = new oz0(this, context);
            this.f31654j1 = oz0Var;
            oz0Var.setVisibility(8);
            this.f28586b.addView(oz0Var, b8.mf.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(f12);
            this.f31662t1[1] = new View(context);
            this.f31662t1[1].setBackgroundColor(301989888);
            this.f28586b.addView(this.f31662t1[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f31660r1 = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.f28586b.addView(frameLayout2, b8.mf.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setText(org.telegram.messenger.bd.M0(2131752040, null).toUpperCase());
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView, b8.mf.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34245b;

                {
                    this.f34245b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34245b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.f31653o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31648j.removeView(themeEditorView.f31643c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31644e.size(); i15++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.f31644e.get(i15);
                                t6Var2.e(t6Var2.h, t6Var2.f28662i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31644e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.f31644e.get(i16);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.f28659e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView2.setText(org.telegram.messenger.bd.M0(2131745942, null).toUpperCase());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView2, b8.mf.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34245b;

                {
                    this.f34245b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34245b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.f31653o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31648j.removeView(themeEditorView.f31643c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31644e.size(); i15++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.f31644e.get(i15);
                                t6Var2.e(t6Var2.h, t6Var2.f28662i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31644e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.f31644e.get(i16);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.f28659e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.f31661s1 = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.f28586b.addView(frameLayout3, b8.mf.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView3.setText(org.telegram.messenger.bd.M0(2131752589, null).toUpperCase());
            textView3.setTypeface(org.telegram.messenger.g0.o());
            frameLayout3.addView(textView3, b8.mf.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34245b;

                {
                    this.f34245b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34245b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.f31653o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31648j.removeView(themeEditorView.f31643c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31644e.size(); i15++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.f31644e.get(i15);
                                t6Var2.e(t6Var2.h, t6Var2.f28662i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31644e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.f31644e.get(i16);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.f28659e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, b8.mf.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView4.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView4.setText(org.telegram.messenger.bd.M0(2131751601, null).toUpperCase());
            textView4.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView4, b8.mf.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34245b;

                {
                    this.f34245b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34245b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.f31653o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31648j.removeView(themeEditorView.f31643c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31644e.size(); i15++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.f31644e.get(i15);
                                t6Var2.e(t6Var2.h, t6Var2.f28662i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31644e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.f31644e.get(i16);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.f28659e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView5.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView5.setText(org.telegram.messenger.bd.M0(2131745956, null).toUpperCase());
            textView5.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView5, b8.mf.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34245b;

                {
                    this.f34245b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34245b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.f31653o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31648j.removeView(themeEditorView.f31643c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31644e.size(); i15++) {
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.f31644e.get(i15);
                                t6Var2.e(t6Var2.h, t6Var2.f28662i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31644e.size(); i16++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.f31644e.get(i16);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.f28659e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.E1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
        }

        public static void I0(EditorAlert editorAlert) {
            int paddingTop;
            iz0 iz0Var = editorAlert.k1;
            if (iz0Var.getChildCount() > 0 && iz0Var.getVisibility() == 0 && !editorAlert.f31668z1) {
                int i3 = 0;
                View childAt = iz0Var.getChildAt(0);
                bj0 bj0Var = (bj0) iz0Var.G(childAt);
                if (iz0Var.getVisibility() == 0 && !editorAlert.f31668z1) {
                    paddingTop = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
                } else {
                    paddingTop = iz0Var.getPaddingTop();
                }
                if (paddingTop > (-org.telegram.messenger.g0.L(1.0f)) && bj0Var != null && bj0Var.b() == 0) {
                    editorAlert.K0(false);
                    i3 = paddingTop;
                } else {
                    editorAlert.K0(true);
                }
                if (editorAlert.f31665w1 != i3) {
                    editorAlert.setScrollOffsetY(i3);
                }
            }
        }

        public static int J0(EditorAlert editorAlert) {
            iz0 iz0Var = editorAlert.k1;
            if (iz0Var.getChildCount() != 0) {
                int i3 = 0;
                View childAt = iz0Var.getChildAt(0);
                bj0 bj0Var = (bj0) iz0Var.G(childAt);
                if (bj0Var != null) {
                    int paddingTop = iz0Var.getPaddingTop();
                    if (bj0Var.b() == 0 && childAt.getTop() >= 0) {
                        i3 = childAt.getTop();
                    }
                    return paddingTop - i3;
                }
                return -1000;
            }
            return -1000;
        }

        @Override
        public final boolean G() {
            return false;
        }

        @Override
        public final void K() {
            super.K();
            uz0 uz0Var = this.f31656n1;
            if (uz0Var.f38914b.isFocused()) {
                org.telegram.messenger.g0.v1(uz0Var.f38914b);
            }
        }

        public final void K0(boolean z10) {
            Integer num;
            float f10;
            View[] viewArr = this.f31662t1;
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
                AnimatorSet[] animatorSetArr = this.f31663u1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                View view2 = viewArr[0];
                Property property = View.ALPHA;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].addListener(new kz0(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void L0(boolean z10) {
            ?? r62;
            gy gyVar = this.m1;
            View[] viewArr = this.f31662t1;
            FrameLayout frameLayout = this.f31655l1;
            FrameLayout frameLayout2 = this.f31660r1;
            FrameLayout frameLayout3 = this.f31661s1;
            oz0 oz0Var = this.f31654j1;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            iz0 iz0Var = this.k1;
            if (z10) {
                this.f31668z1 = true;
                oz0Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                oz0Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.f31667y1 = this.f31665w1;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(oz0Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(iz0Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(gyVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", iz0Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f31649k);
                animatorSet.addListener(new lz0(this));
                animatorSet.start();
                return;
            }
            float f10 = 0.0f;
            Activity activity = themeEditorView.d;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).y0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.k6.x1(themeEditorView.f31653o, r62, r62, r62);
            if (iz0Var.getAdapter() == this.f31658p1) {
                org.telegram.messenger.g0.v1(getCurrentFocus());
            }
            this.f31668z1 = true;
            iz0Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f31656n1.setVisibility(r62);
            iz0Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oz0Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iz0Var, property2, fArr3);
            char c2 = r62;
            float[] fArr4 = new float[1];
            fArr4[c2] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, fArr4);
            View view = viewArr[c2];
            if (view.getTag() == null) {
                f10 = 1.0f;
            }
            float[] fArr5 = new float[1];
            fArr5[c2] = f10;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, property2, fArr5);
            float[] fArr6 = new float[1];
            fArr6[c2] = 1.0f;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(gyVar, property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c2] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.f31667y1);
            Animator[] animatorArr = new Animator[8];
            animatorArr[c2] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofInt;
            animatorSet2.playTogether(animatorArr);
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.f31649k);
            animatorSet2.addListener(new mz0(this));
            animatorSet2.start();
            iz0Var.getAdapter().g(themeEditorView.f31645f);
        }

        public int getScrollOffsetY() {
            return this.f31665w1;
        }

        public void setScrollOffsetY(int i3) {
            this.f31665w1 = i3;
            this.k1.setTopGlowOffset(i3);
            this.f31655l1.setTranslationY(this.f31665w1);
            this.f31654j1.setTranslationY(this.f31665w1);
            this.m1.setTranslationY(this.f31665w1);
            this.f28586b.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (!themeEditorView.f31641a) {
            themeEditorView.f31641a = true;
            org.telegram.messenger.g0.h3(themeEditorView.f31642b);
        }
    }

    public static int c(float f10, int i3, int i10, boolean z10) {
        int i11;
        int round;
        if (z10) {
            i11 = org.telegram.messenger.g0.f22608q.x;
        } else {
            i11 = org.telegram.messenger.g0.f22608q.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i12 = i11 - i10;
        if (i3 == 0) {
            round = org.telegram.messenger.g0.L(10.0f);
        } else if (i3 == 1) {
            round = i12 - org.telegram.messenger.g0.L(10.0f);
        } else {
            round = Math.round((i12 - org.telegram.messenger.g0.L(20.0f)) * f10) + org.telegram.messenger.g0.L(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void b() {
        dz0 dz0Var;
        this.f31651m.getClass();
        if (this.d != null && (dz0Var = this.f31643c) != null) {
            try {
                this.f31648j.removeViewImmediate(dz0Var);
                this.f31643c = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, false);
            }
            try {
                EditorAlert editorAlert = this.f31652n;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f31652n = null;
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            this.d = null;
            f31640p = null;
        }
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.j6 j6Var) {
        if (f31640p != null) {
            f31640p.b();
        }
        this.f31653o = j6Var;
        this.f31643c = new dz0(this, activity);
        this.f31648j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0);
        this.f31650l = sharedPreferences;
        int i3 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f31650l.getInt("sidey", 0);
        float f10 = this.f31650l.getFloat("px", 0.0f);
        float f11 = this.f31650l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f31647i = layoutParams;
            int i11 = this.f31646g;
            layoutParams.width = i11;
            layoutParams.height = this.h;
            layoutParams.x = c(f10, i3, i11, true);
            this.f31647i.y = c(f11, i10, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.f31647i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.y3(this.f31648j, this.f31643c, layoutParams2);
            this.f31648j.addView(this.f31643c, this.f31647i);
            this.f31651m = new b8.ke(activity, (WallpapersListActivity) null, new ez0(this));
            f31640p = this;
            this.d = activity;
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void e() {
        this.f31643c.setBackgroundResource(2131232776);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f31643c, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f31643c, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f31643c, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f31649k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f31647i.x;
    }

    public int getY() {
        return this.f31647i.y;
    }

    public void setX(int i3) {
        WindowManager.LayoutParams layoutParams = this.f31647i;
        layoutParams.x = i3;
        this.f31648j.updateViewLayout(this.f31643c, layoutParams);
    }

    public void setY(int i3) {
        WindowManager.LayoutParams layoutParams = this.f31647i;
        layoutParams.y = i3;
        this.f31648j.updateViewLayout(this.f31643c, layoutParams);
    }
}
