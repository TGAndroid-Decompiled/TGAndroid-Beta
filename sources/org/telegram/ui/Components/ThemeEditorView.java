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
    public static volatile ThemeEditorView p;
    public boolean a;
    public r c;
    public Activity d;
    public ArrayList e;
    public int f;
    public WindowManager.LayoutParams i;
    public WindowManager j;
    public DecelerateInterpolator k;
    public SharedPreferences l;
    public sm2 m;
    public EditorAlert n;
    public bmb o;
    public final zka b = new zka(this, (byte) 7);
    public final int g = gm.L(54.0f);
    public final int h = gm.L(54.0f);

    public class EditorAlert extends my0 {
        public static final int G1 = 0;
        public int A1;
        public boolean B1;
        public AnimatorSet C1;
        public boolean D1;
        public boolean E1;
        public final a0 l1;
        public final u m1;
        public final FrameLayout n1;
        public final r34 o1;
        public final g0 p1;
        public final u46 q1;
        public final b0 r1;
        public final c0 s1;
        public final FrameLayout t1;
        public final FrameLayout u1;
        public final View[] v1;
        public final AnimatorSet[] w1;
        public final Drawable x1;
        public int y1;
        public int z1;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.v1 = new View[2];
            this.w1 = new AnimatorSet[2];
            this.x1 = b10.d(context, 2131232745);
            t tVar = new t(this, context);
            this.b = tVar;
            tVar.setWillNotDraw(false);
            ViewGroup viewGroup = this.b;
            int i = this.u0;
            viewGroup.setPadding(i, 0, i, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.n1 = frameLayout;
            frameLayout.setBackgroundColor(-1);
            g0 g0Var = new g0(this, context);
            this.p1 = g0Var;
            frameLayout.addView(g0Var, qoe.e(-1, -1, 51));
            u uVar = new u(this, context);
            this.m1 = uVar;
            uVar.setSelectorDrawableColor(251658240);
            float f = 48.0f;
            uVar.setPadding(0, 0, 0, gm.L(48.0f));
            uVar.setClipToPadding(false);
            getContext();
            u46 u46Var = new u46();
            this.q1 = u46Var;
            uVar.setLayoutManager(u46Var);
            uVar.setHorizontalScrollBarEnabled(false);
            uVar.setVerticalScrollBarEnabled(false);
            this.b.addView(uVar, qoe.e(-1, -1, 51));
            ?? y59Var = new y59();
            y59Var.d = new ArrayList();
            y59Var.c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                cnb cnbVar = (cnb) arrayList.get(i2);
                int i3 = cnbVar.e;
                float f2 = f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i3));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i3), arrayList2);
                    y59Var.d.add(arrayList2);
                }
                arrayList2.add(cnbVar);
                i2++;
                f = f2;
            }
            float f3 = f;
            if (Build.VERSION.SDK_INT >= 26) {
                int i4 = cmb.Z6;
                if (!hashMap.containsKey(Integer.valueOf(i4))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i4));
                    y59Var.d.add(arrayList3);
                }
            }
            this.r1 = y59Var;
            uVar.setAdapter(y59Var);
            this.s1 = new c0(this, context);
            this.m1.setGlowColor(-657673);
            this.m1.setItemAnimator(null);
            this.m1.setLayoutAnimation(null);
            this.m1.setOnItemClickListener(new s19(this, (byte) 22));
            this.m1.setOnScrollListener(new v(this));
            r34 r34Var = new r34(context, null);
            this.o1 = r34Var;
            r34Var.setShowAtCenter(true);
            r34Var.c();
            r34Var.setText(jb6.M0(2131747901, null));
            this.m1.setEmptyView(r34Var);
            this.b.addView(r34Var, qoe.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm.e1(), 51);
            layoutParams.topMargin = gm.L(58.0f);
            this.v1[0] = new View(context);
            this.v1[0].setBackgroundColor(301989888);
            this.v1[0].setAlpha(0.0f);
            this.v1[0].setTag(1);
            this.b.addView(this.v1[0], layoutParams);
            this.b.addView(this.n1, qoe.e(-1, 58, 51));
            a0 a0Var = new a0(this, context);
            this.l1 = a0Var;
            a0Var.setVisibility(8);
            this.b.addView(a0Var, qoe.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, gm.e1(), 83);
            layoutParams2.bottomMargin = gm.L(f3);
            this.v1[1] = new View(context);
            this.v1[1].setBackgroundColor(301989888);
            this.b.addView(this.v1[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.t1 = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.b.addView(frameLayout2, qoe.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(cmb.f0(788529152, 0, -1));
            textView.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
            textView.setText(jb6.M0(2131751977, null).toUpperCase());
            textView.setTypeface(gm.o());
            frameLayout2.addView(textView, qoe.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (b) {
                        case 0:
                            int i5 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            int i6 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            cmb.v1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            int i7 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i8 = 0; i8 < themeEditorView2.e.size(); i8++) {
                                cnb cnbVar2 = (cnb) themeEditorView2.e.get(i8);
                                cnbVar2.e(cnbVar2.h, cnbVar2.i[0], true);
                            }
                            themeEditorView2.c();
                            editorAlert.F0(false);
                            return;
                        case 3:
                            int i9 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i10 = 0; i10 < themeEditorView3.e.size(); i10++) {
                                cnb cnbVar3 = (cnb) themeEditorView3.e.get(i10);
                                cnbVar3.e(cmb.D0(cnbVar3.e), true, true);
                            }
                            themeEditorView3.c();
                            editorAlert.F0(false);
                            return;
                        default:
                            int i11 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.F0(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(cmb.f0(788529152, 0, -1));
            textView2.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
            textView2.setText(jb6.M0(2131745666, null).toUpperCase());
            textView2.setTypeface(gm.o());
            frameLayout2.addView(textView2, qoe.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (b) {
                        case 0:
                            int i5 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            int i6 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            cmb.v1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            int i7 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i8 = 0; i8 < themeEditorView2.e.size(); i8++) {
                                cnb cnbVar2 = (cnb) themeEditorView2.e.get(i8);
                                cnbVar2.e(cnbVar2.h, cnbVar2.i[0], true);
                            }
                            themeEditorView2.c();
                            editorAlert.F0(false);
                            return;
                        case 3:
                            int i9 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i10 = 0; i10 < themeEditorView3.e.size(); i10++) {
                                cnb cnbVar3 = (cnb) themeEditorView3.e.get(i10);
                                cnbVar3.e(cmb.D0(cnbVar3.e), true, true);
                            }
                            themeEditorView3.c();
                            editorAlert.F0(false);
                            return;
                        default:
                            int i11 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.F0(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.u1 = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.b.addView(frameLayout3, qoe.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(cmb.f0(788529152, 0, -1));
            textView3.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
            textView3.setText(jb6.M0(2131752542, null).toUpperCase());
            textView3.setTypeface(gm.o());
            frameLayout3.addView(textView3, qoe.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (b) {
                        case 0:
                            int i5 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            int i6 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            cmb.v1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            int i7 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i8 = 0; i8 < themeEditorView2.e.size(); i8++) {
                                cnb cnbVar2 = (cnb) themeEditorView2.e.get(i8);
                                cnbVar2.e(cnbVar2.h, cnbVar2.i[0], true);
                            }
                            themeEditorView2.c();
                            editorAlert.F0(false);
                            return;
                        case 3:
                            int i9 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i10 = 0; i10 < themeEditorView3.e.size(); i10++) {
                                cnb cnbVar3 = (cnb) themeEditorView3.e.get(i10);
                                cnbVar3.e(cmb.D0(cnbVar3.e), true, true);
                            }
                            themeEditorView3.c();
                            editorAlert.F0(false);
                            return;
                        default:
                            int i11 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.F0(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, qoe.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(cmb.f0(788529152, 0, -1));
            textView4.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
            textView4.setText(jb6.M0(2131751537, null).toUpperCase());
            textView4.setTypeface(gm.o());
            linearLayout.addView(textView4, qoe.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (b) {
                        case 0:
                            int i5 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            int i6 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            cmb.v1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            int i7 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i8 = 0; i8 < themeEditorView2.e.size(); i8++) {
                                cnb cnbVar2 = (cnb) themeEditorView2.e.get(i8);
                                cnbVar2.e(cnbVar2.h, cnbVar2.i[0], true);
                            }
                            themeEditorView2.c();
                            editorAlert.F0(false);
                            return;
                        case 3:
                            int i9 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i10 = 0; i10 < themeEditorView3.e.size(); i10++) {
                                cnb cnbVar3 = (cnb) themeEditorView3.e.get(i10);
                                cnbVar3.e(cmb.D0(cnbVar3.e), true, true);
                            }
                            themeEditorView3.c();
                            editorAlert.F0(false);
                            return;
                        default:
                            int i11 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.F0(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(cmb.f0(788529152, 0, -1));
            textView5.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
            textView5.setText(jb6.M0(2131745680, null).toUpperCase());
            textView5.setTypeface(gm.o());
            linearLayout.addView(textView5, qoe.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (b) {
                        case 0:
                            int i5 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            int i6 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            cmb.v1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            int i7 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i8 = 0; i8 < themeEditorView2.e.size(); i8++) {
                                cnb cnbVar2 = (cnb) themeEditorView2.e.get(i8);
                                cnbVar2.e(cnbVar2.h, cnbVar2.i[0], true);
                            }
                            themeEditorView2.c();
                            editorAlert.F0(false);
                            return;
                        case 3:
                            int i9 = ThemeEditorView.EditorAlert.G1;
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i10 = 0; i10 < themeEditorView3.e.size(); i10++) {
                                cnb cnbVar3 = (cnb) themeEditorView3.e.get(i10);
                                cnbVar3.e(cmb.D0(cnbVar3.e), true, true);
                            }
                            themeEditorView3.c();
                            editorAlert.F0(false);
                            return;
                        default:
                            int i11 = ThemeEditorView.EditorAlert.G1;
                            editorAlert.F0(false);
                            return;
                    }
                }
            });
        }

        @Override
        public final boolean C() {
            return false;
        }

        public final int D0() {
            u uVar = this.m1;
            if (uVar.getChildCount() != 0) {
                int i = 0;
                View childAt = uVar.getChildAt(0);
                b59 b59Var = (b59) uVar.G(childAt);
                if (b59Var != null) {
                    int paddingTop = uVar.getPaddingTop();
                    if (b59Var.b() == 0 && childAt.getTop() >= 0) {
                        i = childAt.getTop();
                    }
                    return paddingTop - i;
                }
                return -1000;
            }
            return -1000;
        }

        public final void E0(boolean z) {
            Integer num;
            float f;
            View[] viewArr = this.v1;
            if (z) {
                if (viewArr[0].getTag() == null) {
                    return;
                }
            } else if (viewArr[0].getTag() != null) {
                return;
            }
            View view = viewArr[0];
            if (z) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.w1;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            View view2 = viewArr[0];
            Property property = View.ALPHA;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new w(this, z));
            animatorSetArr[0].start();
        }

        public final void F0(boolean z) {
            ?? r6;
            r34 r34Var = this.o1;
            View[] viewArr = this.v1;
            FrameLayout frameLayout = this.n1;
            FrameLayout frameLayout2 = this.t1;
            FrameLayout frameLayout3 = this.u1;
            a0 a0Var = this.l1;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            u uVar = this.m1;
            if (z) {
                this.B1 = true;
                a0Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                a0Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.A1 = this.y1;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(a0Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(uVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(r34Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", uVar.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.k);
                animatorSet.addListener(new x(this));
                animatorSet.start();
                return;
            }
            float f = 0.0f;
            Activity activity = themeEditorView.d;
            if (activity != null) {
                r6 = 0;
                ((LaunchActivity) activity).y0(false);
            } else {
                r6 = 0;
            }
            cmb.v1(themeEditorView.o, r6, r6, r6);
            if (uVar.getAdapter() == this.r1) {
                gm.t1(getCurrentFocus());
            }
            this.B1 = true;
            uVar.setVisibility(r6);
            frameLayout2.setVisibility(r6);
            this.p1.setVisibility(r6);
            uVar.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r6] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a0Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r6] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r6] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(uVar, property2, fArr3);
            char c = r6;
            float[] fArr4 = new float[1];
            fArr4[c] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, fArr4);
            View view = viewArr[c];
            if (view.getTag() == null) {
                f = 1.0f;
            }
            float[] fArr5 = new float[1];
            fArr5[c] = f;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, property2, fArr5);
            float[] fArr6 = new float[1];
            fArr6[c] = 1.0f;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r34Var, property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.A1);
            Animator[] animatorArr = new Animator[8];
            animatorArr[c] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofInt;
            animatorSet2.playTogether(animatorArr);
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.k);
            animatorSet2.addListener(new y(this));
            animatorSet2.start();
            uVar.getAdapter().g(themeEditorView.f);
        }

        public final void G0() {
            int paddingTop;
            u uVar = this.m1;
            if (uVar.getChildCount() > 0 && uVar.getVisibility() == 0 && !this.B1) {
                int i = 0;
                View childAt = uVar.getChildAt(0);
                b59 b59Var = (b59) uVar.G(childAt);
                if (uVar.getVisibility() == 0 && !this.B1) {
                    paddingTop = childAt.getTop() - gm.L(8.0f);
                } else {
                    paddingTop = uVar.getPaddingTop();
                }
                if (paddingTop > (-gm.L(1.0f)) && b59Var != null && b59Var.b() == 0) {
                    E0(false);
                    i = paddingTop;
                } else {
                    E0(true);
                }
                if (this.y1 != i) {
                    setScrollOffsetY(i);
                }
            }
        }

        @Override
        public final void H() {
            super.H();
            g0 g0Var = this.p1;
            if (g0Var.b.isFocused()) {
                gm.t1(g0Var.b);
            }
        }

        public int getScrollOffsetY() {
            return this.y1;
        }

        public void setScrollOffsetY(int i) {
            this.y1 = i;
            this.m1.setTopGlowOffset(i);
            this.n1.setTranslationY(this.y1);
            this.l1.setTranslationY(this.y1);
            this.o1.setTranslationY(this.y1);
            this.b.invalidate();
        }
    }

    public static int b(float f, int i, int i2, boolean z) {
        int i3;
        int round;
        if (z) {
            i3 = gm.q.x;
        } else {
            i3 = gm.q.y - i2;
            i2 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        }
        int i4 = i3 - i2;
        if (i == 0) {
            round = gm.L(10.0f);
        } else if (i == 1) {
            round = i4 - gm.L(10.0f);
        } else {
            round = Math.round((i4 - gm.L(20.0f)) * f) + gm.L(10.0f);
        }
        if (!z) {
            return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a() {
        r rVar;
        this.m.getClass();
        if (this.d != null && (rVar = this.c) != null) {
            try {
                this.j.removeViewImmediate(rVar);
                this.c = null;
            } catch (Exception e) {
                fc4.g(e, false);
            }
            try {
                EditorAlert editorAlert = this.n;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.n = null;
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            this.d = null;
            p = null;
        }
    }

    public final void c() {
        if (!this.a) {
            this.a = true;
            gm.c3(this.b);
        }
    }

    public final void d(Activity activity, bmb bmbVar) {
        if (p != null) {
            p.a();
        }
        this.o = bmbVar;
        this.c = new r(this, activity);
        this.j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0);
        this.l = sharedPreferences;
        int i = sharedPreferences.getInt("sidex", 1);
        int i2 = this.l.getInt("sidey", 0);
        float f = this.l.getFloat("px", 0.0f);
        float f2 = this.l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.i = layoutParams;
            int i3 = this.g;
            layoutParams.width = i3;
            layoutParams.height = this.h;
            layoutParams.x = b(f, i, i3, true);
            this.i.y = b(f2, i2, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            gm.s3(this.j, this.c, layoutParams2);
            this.j.addView(this.c, this.i);
            this.m = new sm2(activity, (WallpapersListActivity) null, new s(this));
            p = this;
            this.d = activity;
            e();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void e() {
        this.c.setBackgroundResource(2131232796);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.c, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.i.x;
    }

    public int getY() {
        return this.i.y;
    }

    public void setX(int i) {
        WindowManager.LayoutParams layoutParams = this.i;
        layoutParams.x = i;
        this.j.updateViewLayout(this.c, layoutParams);
    }

    public void setY(int i) {
        WindowManager.LayoutParams layoutParams = this.i;
        layoutParams.y = i;
        this.j.updateViewLayout(this.c, layoutParams);
    }
}
