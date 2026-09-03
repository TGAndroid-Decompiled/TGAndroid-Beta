package org.telegram.ui.Components;

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
    public static volatile ThemeEditorView f25054n;
    public b11 f25055a;
    public Activity f25056b;
    public ArrayList f25057c;
    public int d;
    public final int f25058e = AndroidUtilities.dp(54.0f);
    public final int f25059f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams f25060g;
    public WindowManager h;
    public DecelerateInterpolator f25061i;
    public SharedPreferences f25062j;
    public s81 f25063k;
    public EditorAlert f25064l;
    public org.telegram.ui.ActionBar.j6 f25065m;

    public class EditorAlert extends org.telegram.ui.ActionBar.h3 {
        public static final int J = 0;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public AnimatorSet F;
        public boolean G;
        public boolean H;
        public final m11 f25066b;
        public final g11 f25067c;
        public final FrameLayout d;
        public final oz f25068e;
        public final s11 f25069f;
        public final f2.j0 h;
        public final n11 f25070n;
        public final o11 f25071r;
        public final FrameLayout f25072s;
        public final FrameLayout v;
        public final View[] f25073w;
        public final AnimatorSet[] f25074x;
        public final Drawable f25075y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f25073w = new View[2];
            this.f25074x = new AnimatorSet[2];
            this.f25075y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            f11 f11Var = new f11(this, context);
            this.containerView = f11Var;
            f11Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            s11 s11Var = new s11(this, context);
            this.f25069f = s11Var;
            frameLayout.addView(s11Var, k7.c6.e(-1, -1, 51));
            g11 g11Var = new g11(this, context);
            this.f25067c = g11Var;
            g11Var.setSelectorDrawableColor(251658240);
            g11Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            g11Var.setClipToPadding(false);
            getContext();
            f2.j0 j0Var = new f2.j0();
            this.h = j0Var;
            g11Var.setLayoutManager(j0Var);
            g11Var.setHorizontalScrollBarEnabled(false);
            g11Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(g11Var, k7.c6.e(-1, -1, 51));
            ?? p0Var = new f2.p0();
            p0Var.d = new ArrayList();
            p0Var.f29365c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) arrayList.get(i11);
                int i12 = m6Var.f22145f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    p0Var.d.add(arrayList2);
                }
                arrayList2.add(m6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.k6.f21607a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, i13));
                    p0Var.d.add(arrayList3);
                }
            }
            this.f25070n = p0Var;
            g11Var.setAdapter(p0Var);
            this.f25071r = new o11(this, context);
            this.f25067c.setGlowColor(-657673);
            this.f25067c.setItemAnimator(null);
            this.f25067c.setLayoutAnimation(null);
            this.f25067c.setOnItemClickListener(new k(this, 18));
            this.f25067c.setOnScrollListener(new h11(this));
            oz ozVar = new oz(context, null);
            this.f25068e = ozVar;
            ozVar.setShowAtCenter(true);
            ozVar.c();
            ozVar.setText(LocaleController.getString(R.string.NoResult));
            this.f25067c.setEmptyView(ozVar);
            this.containerView.addView(ozVar, k7.c6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f25073w[0] = new View(context);
            this.f25073w[0].setBackgroundColor(301989888);
            this.f25073w[0].setAlpha(0.0f);
            this.f25073w[0].setTag(1);
            this.containerView.addView(this.f25073w[0], layoutParams);
            this.containerView.addView(this.d, k7.c6.e(-1, 58, 51));
            m11 m11Var = new m11(this, context);
            this.f25066b = m11Var;
            m11Var.setVisibility(8);
            this.containerView.addView(m11Var, k7.c6.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f25073w[1] = new View(context);
            this.f25073w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f25073w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f25072s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, k7.c6.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, k7.c6.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f26420b;

                {
                    this.f26420b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f26420b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.f25065m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f25055a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f25056b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f25057c.size(); i16++) {
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.f25057c.get(i16);
                                m6Var2.d(m6Var2.f22147i, m6Var2.f22148j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f25057c.size(); i17++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.f25057c.get(i17);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f22145f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, k7.c6.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f26420b;

                {
                    this.f26420b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f26420b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.f25065m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f25055a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f25056b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f25057c.size(); i16++) {
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.f25057c.get(i16);
                                m6Var2.d(m6Var2.f22147i, m6Var2.f22148j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f25057c.size(); i17++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.f25057c.get(i17);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f22145f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, k7.c6.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, k7.c6.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f26420b;

                {
                    this.f26420b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f26420b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.f25065m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f25055a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f25056b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f25057c.size(); i16++) {
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.f25057c.get(i16);
                                m6Var2.d(m6Var2.f22147i, m6Var2.f22148j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f25057c.size(); i17++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.f25057c.get(i17);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f22145f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, k7.c6.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, k7.c6.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f26420b;

                {
                    this.f26420b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f26420b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.f25065m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f25055a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f25056b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f25057c.size(); i16++) {
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.f25057c.get(i16);
                                m6Var2.d(m6Var2.f22147i, m6Var2.f22148j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f25057c.size(); i17++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.f25057c.get(i17);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f22145f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, k7.c6.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f26420b;

                {
                    this.f26420b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f26420b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.f25065m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f25055a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f25056b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f25057c.size(); i16++) {
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.f25057c.get(i16);
                                m6Var2.d(m6Var2.f22147i, m6Var2.f22148j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f25057c.size(); i17++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.f25057c.get(i17);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f22145f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
        }

        public static int I(EditorAlert editorAlert) {
            g11 g11Var = editorAlert.f25067c;
            if (g11Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = g11Var.getChildAt(0);
                el0 el0Var = (el0) g11Var.G(childAt);
                if (el0Var != null) {
                    int paddingTop = g11Var.getPaddingTop();
                    if (el0Var.b() == 0 && childAt.getTop() >= 0) {
                        i10 = childAt.getTop();
                    }
                    return paddingTop - i10;
                }
                return -1000;
            }
            return -1000;
        }

        public static void s(EditorAlert editorAlert) {
            int paddingTop;
            g11 g11Var = editorAlert.f25067c;
            if (g11Var.getChildCount() > 0 && g11Var.getVisibility() == 0 && !editorAlert.E) {
                int i10 = 0;
                View childAt = g11Var.getChildAt(0);
                el0 el0Var = (el0) g11Var.G(childAt);
                if (g11Var.getVisibility() == 0 && !editorAlert.E) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = g11Var.getPaddingTop();
                }
                if (paddingTop > (-AndroidUtilities.dp(1.0f)) && el0Var != null && el0Var.b() == 0) {
                    editorAlert.J(false);
                    i10 = paddingTop;
                } else {
                    editorAlert.J(true);
                }
                if (editorAlert.B != i10) {
                    editorAlert.setScrollOffsetY(i10);
                }
            }
        }

        public final void J(boolean z4) {
            Integer num;
            float f10;
            View[] viewArr = this.f25073w;
            if ((z4 && viewArr[0].getTag() != null) || (!z4 && viewArr[0].getTag() == null)) {
                View view = viewArr[0];
                if (z4) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z4) {
                    viewArr[0].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.f25074x;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                View view2 = viewArr[0];
                Property property = View.ALPHA;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].addListener(new i11(this, z4));
                animatorSetArr[0].start();
            }
        }

        public final void K(boolean z4) {
            ?? r62;
            oz ozVar = this.f25068e;
            View[] viewArr = this.f25073w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f25072s;
            FrameLayout frameLayout3 = this.v;
            m11 m11Var = this.f25066b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            g11 g11Var = this.f25067c;
            if (z4) {
                this.E = true;
                m11Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                m11Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.D = this.B;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(m11Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(g11Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(ozVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", g11Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f25061i);
                animatorSet.addListener(new j11(this));
                animatorSet.start();
                return;
            }
            Activity activity = themeEditorView.f25056b;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.k6.r1(themeEditorView.f25065m, r62, r62, r62);
            if (g11Var.getAdapter() == this.f25070n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.E = true;
            g11Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f25069f.setVisibility(r62);
            g11Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float f10 = 0.0f;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m11Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(g11Var, property2, fArr3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, 1.0f);
            View view = viewArr[0];
            if (view.getTag() == null) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f10), ObjectAnimator.ofFloat(ozVar, property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.D));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.f25061i);
            animatorSet2.addListener(new k11(this));
            animatorSet2.start();
            g11Var.getAdapter().m(themeEditorView.d);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            s11 s11Var = this.f25069f;
            if (s11Var.f30959b.isFocused()) {
                AndroidUtilities.hideKeyboard(s11Var.f30959b);
            }
        }

        public int getScrollOffsetY() {
            return this.B;
        }

        public void setScrollOffsetY(int i10) {
            this.B = i10;
            this.f25067c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.B);
            this.f25066b.setTranslationY(this.B);
            this.f25068e.setTranslationY(this.B);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z4, int i10, float f10, int i11) {
        int i12;
        int round;
        if (z4) {
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
            round = Math.round((i13 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        }
        if (!z4) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a() {
        b11 b11Var;
        this.f25063k.getClass();
        if (this.f25056b != null && (b11Var = this.f25055a) != null) {
            try {
                this.h.removeViewImmediate(b11Var);
                this.f25055a = null;
            } catch (Exception e6) {
                FileLog.e((Throwable) e6, false);
            }
            try {
                EditorAlert editorAlert = this.f25064l;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f25064l = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.f25056b = null;
            f25054n = null;
        }
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.j6 j6Var) {
        if (f25054n != null) {
            f25054n.a();
        }
        this.f25065m = j6Var;
        this.f25055a = new b11(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f25062j = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f25062j.getInt("sidey", 0);
        float f10 = this.f25062j.getFloat("px", 0.0f);
        float f11 = this.f25062j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f25060g = layoutParams;
            int i12 = this.f25058e;
            layoutParams.width = i12;
            layoutParams.height = this.f25059f;
            layoutParams.x = b(true, i10, f10, i12);
            this.f25060g.y = b(false, i11, f11, this.f25059f);
            WindowManager.LayoutParams layoutParams2 = this.f25060g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.f25055a, layoutParams2);
            this.h.addView(this.f25055a, this.f25060g);
            this.f25063k = new s81(activity, null, new c11(this));
            f25054n = this;
            this.f25056b = activity;
            d();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void d() {
        this.f25055a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f25055a, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f25055a, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f25055a, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f25061i);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f25060g.x;
    }

    public int getY() {
        return this.f25060g.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f25060g;
        layoutParams.x = i10;
        this.h.updateViewLayout(this.f25055a, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f25060g;
        layoutParams.y = i10;
        this.h.updateViewLayout(this.f25055a, layoutParams);
    }
}
