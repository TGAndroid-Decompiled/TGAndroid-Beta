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
    public static volatile ThemeEditorView f31582p;
    public boolean f31583a;
    public ez0 f31585c;
    public Activity d;
    public ArrayList f31586e;
    public int f31587f;
    public WindowManager.LayoutParams f31589i;
    public WindowManager f31590j;
    public DecelerateInterpolator f31591k;
    public SharedPreferences f31592l;
    public a8.r7 f31593m;
    public EditorAlert f31594n;
    public org.telegram.ui.ActionBar.l6 f31595o;
    public final dt f31584b = new dt(this, 16);
    public final int f31588g = org.telegram.messenger.g0.L(54.0f);
    public final int h = org.telegram.messenger.g0.L(54.0f);

    public class EditorAlert extends org.telegram.ui.ActionBar.w2 {
        public static final int G1 = 0;
        public int A1;
        public boolean B1;
        public AnimatorSet C1;
        public boolean D1;
        public boolean E1;
        public final pz0 l1;
        public final jz0 f31596m1;
        public final FrameLayout n1;
        public final iy f31597o1;
        public final vz0 f31598p1;
        public final v4.b0 f31599q1;
        public final qz0 f31600r1;
        public final rz0 f31601s1;
        public final FrameLayout f31602t1;
        public final FrameLayout f31603u1;
        public final View[] f31604v1;
        public final AnimatorSet[] f31605w1;
        public final Drawable f31606x1;
        public int f31607y1;
        public int f31608z1;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f31604v1 = new View[2];
            this.f31605w1 = new AnimatorSet[2];
            this.f31606x1 = jg.g.h(context, 2131232728);
            iz0 iz0Var = new iz0(this, context);
            this.f28672b = iz0Var;
            iz0Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.f28672b;
            int i7 = this.f28705t0;
            viewGroup.setPadding(i7, 0, i7, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.n1 = frameLayout;
            frameLayout.setBackgroundColor(-1);
            vz0 vz0Var = new vz0(this, context);
            this.f31598p1 = vz0Var;
            frameLayout.addView(vz0Var, c8.ha.e(-1, -1, 51));
            jz0 jz0Var = new jz0(this, context);
            this.f31596m1 = jz0Var;
            jz0Var.setSelectorDrawableColor(251658240);
            float f10 = 48.0f;
            jz0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
            jz0Var.setClipToPadding(false);
            getContext();
            v4.b0 b0Var = new v4.b0();
            this.f31599q1 = b0Var;
            jz0Var.setLayoutManager(b0Var);
            jz0Var.setHorizontalScrollBarEnabled(false);
            jz0Var.setVerticalScrollBarEnabled(false);
            this.f28672b.addView(jz0Var, c8.ha.e(-1, -1, 51));
            ?? g0Var = new v4.g0();
            g0Var.d = new ArrayList();
            g0Var.f37430c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) arrayList.get(i10);
                int i11 = v6Var.f28631e;
                float f11 = f10;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i11));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i11), arrayList2);
                    g0Var.d.add(arrayList2);
                }
                arrayList2.add(v6Var);
                i10++;
                f10 = f11;
            }
            float f12 = f10;
            if (Build.VERSION.SDK_INT >= 26) {
                int i12 = org.telegram.ui.ActionBar.m6.f27834a7;
                if (!hashMap.containsKey(Integer.valueOf(i12))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
                    g0Var.d.add(arrayList3);
                }
            }
            this.f31600r1 = g0Var;
            jz0Var.setAdapter(g0Var);
            this.f31601s1 = new rz0(this, context);
            this.f31596m1.setGlowColor(-657673);
            this.f31596m1.setItemAnimator(null);
            this.f31596m1.setLayoutAnimation(null);
            this.f31596m1.setOnItemClickListener(new j(this, 18));
            this.f31596m1.setOnScrollListener(new kz0(this));
            iy iyVar = new iy(context, null);
            this.f31597o1 = iyVar;
            iyVar.setShowAtCenter(true);
            iyVar.c();
            iyVar.setText(org.telegram.messenger.id.M0(2131748167, null));
            this.f31596m1.setEmptyView(iyVar);
            this.f28672b.addView(iyVar, c8.ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
            layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
            this.f31604v1[0] = new View(context);
            this.f31604v1[0].setBackgroundColor(301989888);
            this.f31604v1[0].setAlpha(0.0f);
            this.f31604v1[0].setTag(1);
            this.f28672b.addView(this.f31604v1[0], layoutParams);
            this.f28672b.addView(this.n1, c8.ha.e(-1, 58, 51));
            pz0 pz0Var = new pz0(this, context);
            this.l1 = pz0Var;
            pz0Var.setVisibility(8);
            this.f28672b.addView(pz0Var, c8.ha.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(f12);
            this.f31604v1[1] = new View(context);
            this.f31604v1[1].setBackgroundColor(301989888);
            this.f28672b.addView(this.f31604v1[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f31602t1 = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.f28672b.addView(frameLayout2, c8.ha.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(788529152, 0, -1));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setText(org.telegram.messenger.id.M0(2131752040, null).toUpperCase());
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView, c8.ha.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34488b;

                {
                    this.f34488b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34488b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.m6.x1(themeEditorView.f31595o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31590j.removeView(themeEditorView.f31585c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31586e.size(); i15++) {
                                org.telegram.ui.ActionBar.v6 v6Var2 = (org.telegram.ui.ActionBar.v6) themeEditorView2.f31586e.get(i15);
                                v6Var2.e(v6Var2.h, v6Var2.f28634i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31586e.size(); i16++) {
                                org.telegram.ui.ActionBar.v6 v6Var3 = (org.telegram.ui.ActionBar.v6) themeEditorView3.f31586e.get(i16);
                                v6Var3.e(org.telegram.ui.ActionBar.m6.F0(v6Var3.f28631e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(788529152, 0, -1));
            textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView2.setText(org.telegram.messenger.id.M0(2131745932, null).toUpperCase());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView2, c8.ha.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34488b;

                {
                    this.f34488b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34488b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.m6.x1(themeEditorView.f31595o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31590j.removeView(themeEditorView.f31585c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31586e.size(); i15++) {
                                org.telegram.ui.ActionBar.v6 v6Var2 = (org.telegram.ui.ActionBar.v6) themeEditorView2.f31586e.get(i15);
                                v6Var2.e(v6Var2.h, v6Var2.f28634i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31586e.size(); i16++) {
                                org.telegram.ui.ActionBar.v6 v6Var3 = (org.telegram.ui.ActionBar.v6) themeEditorView3.f31586e.get(i16);
                                v6Var3.e(org.telegram.ui.ActionBar.m6.F0(v6Var3.f28631e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.f31603u1 = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.f28672b.addView(frameLayout3, c8.ha.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(788529152, 0, -1));
            textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView3.setText(org.telegram.messenger.id.M0(2131752589, null).toUpperCase());
            textView3.setTypeface(org.telegram.messenger.g0.o());
            frameLayout3.addView(textView3, c8.ha.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34488b;

                {
                    this.f34488b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34488b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.m6.x1(themeEditorView.f31595o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31590j.removeView(themeEditorView.f31585c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31586e.size(); i15++) {
                                org.telegram.ui.ActionBar.v6 v6Var2 = (org.telegram.ui.ActionBar.v6) themeEditorView2.f31586e.get(i15);
                                v6Var2.e(v6Var2.h, v6Var2.f28634i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31586e.size(); i16++) {
                                org.telegram.ui.ActionBar.v6 v6Var3 = (org.telegram.ui.ActionBar.v6) themeEditorView3.f31586e.get(i16);
                                v6Var3.e(org.telegram.ui.ActionBar.m6.F0(v6Var3.f28631e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, c8.ha.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(788529152, 0, -1));
            textView4.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView4.setText(org.telegram.messenger.id.M0(2131751600, null).toUpperCase());
            textView4.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView4, c8.ha.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34488b;

                {
                    this.f34488b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34488b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.m6.x1(themeEditorView.f31595o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31590j.removeView(themeEditorView.f31585c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31586e.size(); i15++) {
                                org.telegram.ui.ActionBar.v6 v6Var2 = (org.telegram.ui.ActionBar.v6) themeEditorView2.f31586e.get(i15);
                                v6Var2.e(v6Var2.h, v6Var2.f28634i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31586e.size(); i16++) {
                                org.telegram.ui.ActionBar.v6 v6Var3 = (org.telegram.ui.ActionBar.v6) themeEditorView3.f31586e.get(i16);
                                v6Var3.e(org.telegram.ui.ActionBar.m6.F0(v6Var3.f28631e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(788529152, 0, -1));
            textView5.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView5.setText(org.telegram.messenger.id.M0(2131745946, null).toUpperCase());
            textView5.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView5, c8.ha.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f34488b;

                {
                    this.f34488b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f34488b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.m6.x1(themeEditorView.f31595o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f31590j.removeView(themeEditorView.f31585c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f31586e.size(); i15++) {
                                org.telegram.ui.ActionBar.v6 v6Var2 = (org.telegram.ui.ActionBar.v6) themeEditorView2.f31586e.get(i15);
                                v6Var2.e(v6Var2.h, v6Var2.f28634i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f31586e.size(); i16++) {
                                org.telegram.ui.ActionBar.v6 v6Var3 = (org.telegram.ui.ActionBar.v6) themeEditorView3.f31586e.get(i16);
                                v6Var3.e(org.telegram.ui.ActionBar.m6.F0(v6Var3.f28631e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.L0(false);
                            return;
                    }
                }
            });
        }

        public static void I0(EditorAlert editorAlert) {
            int paddingTop;
            jz0 jz0Var = editorAlert.f31596m1;
            if (jz0Var.getChildCount() > 0 && jz0Var.getVisibility() == 0 && !editorAlert.B1) {
                int i7 = 0;
                View childAt = jz0Var.getChildAt(0);
                xi0 xi0Var = (xi0) jz0Var.G(childAt);
                if (jz0Var.getVisibility() == 0 && !editorAlert.B1) {
                    paddingTop = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
                } else {
                    paddingTop = jz0Var.getPaddingTop();
                }
                if (paddingTop > (-org.telegram.messenger.g0.L(1.0f)) && xi0Var != null && xi0Var.b() == 0) {
                    editorAlert.K0(false);
                    i7 = paddingTop;
                } else {
                    editorAlert.K0(true);
                }
                if (editorAlert.f31607y1 != i7) {
                    editorAlert.setScrollOffsetY(i7);
                }
            }
        }

        public static int J0(EditorAlert editorAlert) {
            jz0 jz0Var = editorAlert.f31596m1;
            if (jz0Var.getChildCount() != 0) {
                int i7 = 0;
                View childAt = jz0Var.getChildAt(0);
                xi0 xi0Var = (xi0) jz0Var.G(childAt);
                if (xi0Var != null) {
                    int paddingTop = jz0Var.getPaddingTop();
                    if (xi0Var.b() == 0 && childAt.getTop() >= 0) {
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
        public final void K() {
            super.K();
            vz0 vz0Var = this.f31598p1;
            if (vz0Var.f39847b.isFocused()) {
                org.telegram.messenger.g0.v1(vz0Var.f39847b);
            }
        }

        public final void K0(boolean z9) {
            Integer num;
            float f10;
            View[] viewArr = this.f31604v1;
            if ((z9 && viewArr[0].getTag() != null) || (!z9 && viewArr[0].getTag() == null)) {
                View view = viewArr[0];
                if (z9) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z9) {
                    viewArr[0].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.f31605w1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                View view2 = viewArr[0];
                Property property = View.ALPHA;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].addListener(new lz0(this, z9));
                animatorSetArr[0].start();
            }
        }

        public final void L0(boolean z9) {
            ?? r62;
            iy iyVar = this.f31597o1;
            View[] viewArr = this.f31604v1;
            FrameLayout frameLayout = this.n1;
            FrameLayout frameLayout2 = this.f31602t1;
            FrameLayout frameLayout3 = this.f31603u1;
            pz0 pz0Var = this.l1;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            jz0 jz0Var = this.f31596m1;
            if (z9) {
                this.B1 = true;
                pz0Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                pz0Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.A1 = this.f31607y1;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(pz0Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(jz0Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(iyVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", jz0Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f31591k);
                animatorSet.addListener(new mz0(this));
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
            org.telegram.ui.ActionBar.m6.x1(themeEditorView.f31595o, r62, r62, r62);
            if (jz0Var.getAdapter() == this.f31600r1) {
                org.telegram.messenger.g0.v1(getCurrentFocus());
            }
            this.B1 = true;
            jz0Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f31598p1.setVisibility(r62);
            jz0Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pz0Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jz0Var, property2, fArr3);
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
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(iyVar, property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c10] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.A1);
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
            animatorSet2.setInterpolator(themeEditorView.f31591k);
            animatorSet2.addListener(new nz0(this));
            animatorSet2.start();
            jz0Var.getAdapter().g(themeEditorView.f31587f);
        }

        public int getScrollOffsetY() {
            return this.f31607y1;
        }

        public void setScrollOffsetY(int i7) {
            this.f31607y1 = i7;
            this.f31596m1.setTopGlowOffset(i7);
            this.n1.setTranslationY(this.f31607y1);
            this.l1.setTranslationY(this.f31607y1);
            this.f31597o1.setTranslationY(this.f31607y1);
            this.f28672b.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (!themeEditorView.f31583a) {
            themeEditorView.f31583a = true;
            org.telegram.messenger.g0.h3(themeEditorView.f31584b);
        }
    }

    public static int c(float f10, int i7, int i10, boolean z9) {
        int i11;
        int round;
        if (z9) {
            i11 = org.telegram.messenger.g0.f22567q.x;
        } else {
            i11 = org.telegram.messenger.g0.f22567q.y - i10;
            i10 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        int i12 = i11 - i10;
        if (i7 == 0) {
            round = org.telegram.messenger.g0.L(10.0f);
        } else if (i7 == 1) {
            round = i12 - org.telegram.messenger.g0.L(10.0f);
        } else {
            round = Math.round((i12 - org.telegram.messenger.g0.L(20.0f)) * f10) + org.telegram.messenger.g0.L(10.0f);
        }
        if (!z9) {
            return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void b() {
        ez0 ez0Var;
        this.f31593m.getClass();
        if (this.d != null && (ez0Var = this.f31585c) != null) {
            try {
                this.f31590j.removeViewImmediate(ez0Var);
                this.f31585c = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, false);
            }
            try {
                EditorAlert editorAlert = this.f31594n;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f31594n = null;
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            this.d = null;
            f31582p = null;
        }
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.l6 l6Var) {
        if (f31582p != null) {
            f31582p.b();
        }
        this.f31595o = l6Var;
        this.f31585c = new ez0(this, activity);
        this.f31590j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25570b.getSharedPreferences("themeconfig", 0);
        this.f31592l = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f31592l.getInt("sidey", 0);
        float f10 = this.f31592l.getFloat("px", 0.0f);
        float f11 = this.f31592l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f31589i = layoutParams;
            int i11 = this.f31588g;
            layoutParams.width = i11;
            layoutParams.height = this.h;
            layoutParams.x = c(f10, i7, i11, true);
            this.f31589i.y = c(f11, i10, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.f31589i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.y3(this.f31590j, this.f31585c, layoutParams2);
            this.f31590j.addView(this.f31585c, this.f31589i);
            this.f31593m = new a8.r7(activity, (WallpapersListActivity) null, new fz0(this));
            f31582p = this;
            this.d = activity;
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void e() {
        this.f31585c.setBackgroundResource(2131232778);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f31585c, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f31585c, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f31585c, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f31591k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f31589i.x;
    }

    public int getY() {
        return this.f31589i.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.f31589i;
        layoutParams.x = i7;
        this.f31590j.updateViewLayout(this.f31585c, layoutParams);
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.f31589i;
        layoutParams.y = i7;
        this.f31590j.updateViewLayout(this.f31585c, layoutParams);
    }
}
