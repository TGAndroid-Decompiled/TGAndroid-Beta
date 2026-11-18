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
    public static volatile ThemeEditorView f33144p;
    public boolean f33145a;
    public nz0 f33147c;
    public Activity d;
    public ArrayList f33148e;
    public int f33149f;
    public WindowManager.LayoutParams f33151i;
    public WindowManager f33152j;
    public DecelerateInterpolator f33153k;
    public SharedPreferences f33154l;
    public a8.r7 f33155m;
    public EditorAlert f33156n;
    public org.telegram.ui.ActionBar.m6 f33157o;
    public final gk f33146b = new gk(this, 19);
    public final int f33150g = org.telegram.messenger.g0.L(54.0f);
    public final int h = org.telegram.messenger.g0.L(54.0f);

    public class EditorAlert extends org.telegram.ui.ActionBar.x2 {
        public static final int H1 = 0;
        public int A1;
        public int B1;
        public boolean C1;
        public AnimatorSet D1;
        public boolean E1;
        public boolean F1;
        public final yz0 f33158m1;
        public final sz0 n1;
        public final FrameLayout f33159o1;
        public final ty f33160p1;
        public final e01 f33161q1;
        public final v4.c0 f33162r1;
        public final zz0 f33163s1;
        public final a01 f33164t1;
        public final FrameLayout f33165u1;
        public final FrameLayout f33166v1;
        public final View[] f33167w1;
        public final AnimatorSet[] f33168x1;
        public final Drawable f33169y1;
        public int f33170z1;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f33167w1 = new View[2];
            this.f33168x1 = new AnimatorSet[2];
            this.f33169y1 = i5.c.g(context, 2131232730);
            rz0 rz0Var = new rz0(this, context);
            this.f30192b = rz0Var;
            rz0Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.f30192b;
            int i7 = this.f30227u0;
            viewGroup.setPadding(i7, 0, i7, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.f33159o1 = frameLayout;
            frameLayout.setBackgroundColor(-1);
            e01 e01Var = new e01(this, context);
            this.f33161q1 = e01Var;
            frameLayout.addView(e01Var, c8.ma.e(-1, -1, 51));
            sz0 sz0Var = new sz0(this, context);
            this.n1 = sz0Var;
            sz0Var.setSelectorDrawableColor(251658240);
            float f10 = 48.0f;
            sz0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
            sz0Var.setClipToPadding(false);
            getContext();
            v4.c0 c0Var = new v4.c0();
            this.f33162r1 = c0Var;
            sz0Var.setLayoutManager(c0Var);
            sz0Var.setHorizontalScrollBarEnabled(false);
            sz0Var.setVerticalScrollBarEnabled(false);
            this.f30192b.addView(sz0Var, c8.ma.e(-1, -1, 51));
            ?? i0Var = new v4.i0();
            i0Var.d = new ArrayList();
            i0Var.f42975c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) arrayList.get(i10);
                int i11 = w6Var.f30157e;
                float f11 = f10;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i11));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i11), arrayList2);
                    i0Var.d.add(arrayList2);
                }
                arrayList2.add(w6Var);
                i10++;
                f10 = f11;
            }
            float f12 = f10;
            if (Build.VERSION.SDK_INT >= 26) {
                int i12 = org.telegram.ui.ActionBar.n6.f29339a7;
                if (!hashMap.containsKey(Integer.valueOf(i12))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
                    i0Var.d.add(arrayList3);
                }
            }
            this.f33163s1 = i0Var;
            sz0Var.setAdapter(i0Var);
            this.f33164t1 = new a01(this, context);
            this.n1.setGlowColor(-657673);
            this.n1.setItemAnimator(null);
            this.n1.setLayoutAnimation(null);
            this.n1.setOnItemClickListener(new n(this, 18));
            this.n1.setOnScrollListener(new tz0(this));
            ty tyVar = new ty(context, null);
            this.f33160p1 = tyVar;
            tyVar.setShowAtCenter(true);
            tyVar.c();
            tyVar.setText(org.telegram.messenger.gd.M0(2131747975, null));
            this.n1.setEmptyView(tyVar);
            this.f30192b.addView(tyVar, c8.ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
            layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
            this.f33167w1[0] = new View(context);
            this.f33167w1[0].setBackgroundColor(301989888);
            this.f33167w1[0].setAlpha(0.0f);
            this.f33167w1[0].setTag(1);
            this.f30192b.addView(this.f33167w1[0], layoutParams);
            this.f30192b.addView(this.f33159o1, c8.ma.e(-1, 58, 51));
            yz0 yz0Var = new yz0(this, context);
            this.f33158m1 = yz0Var;
            yz0Var.setVisibility(8);
            this.f30192b.addView(yz0Var, c8.ma.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(f12);
            this.f33167w1[1] = new View(context);
            this.f33167w1[1].setBackgroundColor(301989888);
            this.f30192b.addView(this.f33167w1[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f33165u1 = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.f30192b.addView(frameLayout2, c8.ma.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setText(org.telegram.messenger.gd.M0(2131752029, null).toUpperCase());
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView, c8.ma.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f38954b;

                {
                    this.f38954b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f38954b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.f33157o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f33152j.removeView(themeEditorView.f33147c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f33148e.size(); i15++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.f33148e.get(i15);
                                w6Var2.e(w6Var2.h, w6Var2.f30160i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f33148e.size(); i16++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.f33148e.get(i16);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.f30157e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView2.setText(org.telegram.messenger.gd.M0(2131745737, null).toUpperCase());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView2, c8.ma.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f38954b;

                {
                    this.f38954b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f38954b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.f33157o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f33152j.removeView(themeEditorView.f33147c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f33148e.size(); i15++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.f33148e.get(i15);
                                w6Var2.e(w6Var2.h, w6Var2.f30160i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f33148e.size(); i16++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.f33148e.get(i16);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.f30157e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.f33166v1 = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.f30192b.addView(frameLayout3, c8.ma.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView3.setText(org.telegram.messenger.gd.M0(2131752578, null).toUpperCase());
            textView3.setTypeface(org.telegram.messenger.g0.o());
            frameLayout3.addView(textView3, c8.ma.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f38954b;

                {
                    this.f38954b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f38954b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.f33157o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f33152j.removeView(themeEditorView.f33147c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f33148e.size(); i15++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.f33148e.get(i15);
                                w6Var2.e(w6Var2.h, w6Var2.f30160i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f33148e.size(); i16++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.f33148e.get(i16);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.f30157e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, c8.ma.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView4.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView4.setText(org.telegram.messenger.gd.M0(2131751589, null).toUpperCase());
            textView4.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView4, c8.ma.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f38954b;

                {
                    this.f38954b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f38954b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.f33157o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f33152j.removeView(themeEditorView.f33147c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f33148e.size(); i15++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.f33148e.get(i15);
                                w6Var2.e(w6Var2.h, w6Var2.f30160i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f33148e.size(); i16++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.f33148e.get(i16);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.f30157e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView5.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView5.setText(org.telegram.messenger.gd.M0(2131745751, null).toUpperCase());
            textView5.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView5, c8.ma.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f38954b;

                {
                    this.f38954b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f38954b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.f33157o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f33152j.removeView(themeEditorView.f33147c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f33148e.size(); i15++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.f33148e.get(i15);
                                w6Var2.e(w6Var2.h, w6Var2.f30160i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f33148e.size(); i16++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.f33148e.get(i16);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.f30157e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            return;
                    }
                }
            });
        }

        public static void J0(EditorAlert editorAlert) {
            int paddingTop;
            sz0 sz0Var = editorAlert.n1;
            if (sz0Var.getChildCount() > 0 && sz0Var.getVisibility() == 0 && !editorAlert.C1) {
                int i7 = 0;
                View childAt = sz0Var.getChildAt(0);
                kj0 kj0Var = (kj0) sz0Var.G(childAt);
                if (sz0Var.getVisibility() == 0 && !editorAlert.C1) {
                    paddingTop = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
                } else {
                    paddingTop = sz0Var.getPaddingTop();
                }
                if (paddingTop > (-org.telegram.messenger.g0.L(1.0f)) && kj0Var != null && kj0Var.b() == 0) {
                    editorAlert.L0(false);
                    i7 = paddingTop;
                } else {
                    editorAlert.L0(true);
                }
                if (editorAlert.f33170z1 != i7) {
                    editorAlert.setScrollOffsetY(i7);
                }
            }
        }

        public static int K0(EditorAlert editorAlert) {
            sz0 sz0Var = editorAlert.n1;
            if (sz0Var.getChildCount() != 0) {
                int i7 = 0;
                View childAt = sz0Var.getChildAt(0);
                kj0 kj0Var = (kj0) sz0Var.G(childAt);
                if (kj0Var != null) {
                    int paddingTop = sz0Var.getPaddingTop();
                    if (kj0Var.b() == 0 && childAt.getTop() >= 0) {
                        i7 = childAt.getTop();
                    }
                    return paddingTop - i7;
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
        public final void L() {
            super.L();
            e01 e01Var = this.f33161q1;
            if (e01Var.f34556b.isFocused()) {
                org.telegram.messenger.g0.v1(e01Var.f34556b);
            }
        }

        public final void L0(boolean z10) {
            Integer num;
            float f10;
            View[] viewArr = this.f33167w1;
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
                AnimatorSet[] animatorSetArr = this.f33168x1;
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
                animatorSetArr[0].addListener(new uz0(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void M0(boolean z10) {
            ?? r62;
            ty tyVar = this.f33160p1;
            View[] viewArr = this.f33167w1;
            FrameLayout frameLayout = this.f33159o1;
            FrameLayout frameLayout2 = this.f33165u1;
            FrameLayout frameLayout3 = this.f33166v1;
            yz0 yz0Var = this.f33158m1;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            sz0 sz0Var = this.n1;
            if (z10) {
                this.C1 = true;
                yz0Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                yz0Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.B1 = this.f33170z1;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(yz0Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(sz0Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(tyVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", sz0Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f33153k);
                animatorSet.addListener(new vz0(this));
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
            org.telegram.ui.ActionBar.n6.x1(themeEditorView.f33157o, r62, r62, r62);
            if (sz0Var.getAdapter() == this.f33163s1) {
                org.telegram.messenger.g0.v1(getCurrentFocus());
            }
            this.C1 = true;
            sz0Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f33161q1.setVisibility(r62);
            sz0Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yz0Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(sz0Var, property2, fArr3);
            char c10 = r62;
            float[] fArr4 = new float[1];
            fArr4[c10] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, fArr4);
            View view = viewArr[c10];
            if (view.getTag() == null) {
                f10 = 1.0f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f10;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, property2, fArr5);
            float[] fArr6 = new float[1];
            fArr6[c10] = 1.0f;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tyVar, property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c10] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.B1);
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
            animatorSet2.setInterpolator(themeEditorView.f33153k);
            animatorSet2.addListener(new wz0(this));
            animatorSet2.start();
            sz0Var.getAdapter().g(themeEditorView.f33149f);
        }

        public int getScrollOffsetY() {
            return this.f33170z1;
        }

        public void setScrollOffsetY(int i7) {
            this.f33170z1 = i7;
            this.n1.setTopGlowOffset(i7);
            this.f33159o1.setTranslationY(this.f33170z1);
            this.f33158m1.setTranslationY(this.f33170z1);
            this.f33160p1.setTranslationY(this.f33170z1);
            this.f30192b.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (!themeEditorView.f33145a) {
            themeEditorView.f33145a = true;
            org.telegram.messenger.g0.g3(themeEditorView.f33146b);
        }
    }

    public static int c(float f10, int i7, int i10, boolean z10) {
        int i11;
        int round;
        if (z10) {
            i11 = org.telegram.messenger.g0.f24121q.x;
        } else {
            i11 = org.telegram.messenger.g0.f24121q.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i12 = i11 - i10;
        if (i7 == 0) {
            round = org.telegram.messenger.g0.L(10.0f);
        } else if (i7 == 1) {
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
        nz0 nz0Var;
        this.f33155m.getClass();
        if (this.d != null && (nz0Var = this.f33147c) != null) {
            try {
                this.f33152j.removeViewImmediate(nz0Var);
                this.f33147c = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, false);
            }
            try {
                EditorAlert editorAlert = this.f33156n;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f33156n = null;
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            this.d = null;
            f33144p = null;
        }
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.m6 m6Var) {
        if (f33144p != null) {
            f33144p.b();
        }
        this.f33157o = m6Var;
        this.f33147c = new nz0(this, activity);
        this.f33152j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26915b.getSharedPreferences("themeconfig", 0);
        this.f33154l = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f33154l.getInt("sidey", 0);
        float f10 = this.f33154l.getFloat("px", 0.0f);
        float f11 = this.f33154l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f33151i = layoutParams;
            int i11 = this.f33150g;
            layoutParams.width = i11;
            layoutParams.height = this.h;
            layoutParams.x = c(f10, i7, i11, true);
            this.f33151i.y = c(f11, i10, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.f33151i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.w3(this.f33152j, this.f33147c, layoutParams2);
            this.f33152j.addView(this.f33147c, this.f33151i);
            this.f33155m = new a8.r7(activity, (WallpapersListActivity) null, new oz0(this));
            f33144p = this;
            this.d = activity;
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void e() {
        this.f33147c.setBackgroundResource(2131232780);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f33147c, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f33147c, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f33147c, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f33153k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f33151i.x;
    }

    public int getY() {
        return this.f33151i.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.f33151i;
        layoutParams.x = i7;
        this.f33152j.updateViewLayout(this.f33147c, layoutParams);
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.f33151i;
        layoutParams.y = i7;
        this.f33152j.updateViewLayout(this.f33147c, layoutParams);
    }
}
