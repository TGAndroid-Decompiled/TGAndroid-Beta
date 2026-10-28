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
    public static volatile ThemeEditorView f26327p;
    public boolean f26328a;
    public i21 f26330c;
    public Activity d;
    public ArrayList e;
    public int f26331f;
    public WindowManager.LayoutParams f26333i;
    public WindowManager f26334j;
    public DecelerateInterpolator f26335k;
    public SharedPreferences f26336l;
    public ca1 f26337m;
    public EditorAlert f26338n;
    public org.telegram.ui.ActionBar.x6 f26339o;
    public final dy0 f26329b = new dy0(this, 1);
    public final int f26332g = AndroidUtilities.dp(54.0f);
    public final int h = AndroidUtilities.dp(54.0f);

    public class EditorAlert extends org.telegram.ui.ActionBar.k3 {
        public static final int M = 0;
        public int E;
        public int F;
        public int G;
        public boolean H;
        public AnimatorSet I;
        public boolean J;
        public boolean K;
        public final t21 f26340b;
        public final n21 f26341c;
        public final FrameLayout d;
        public final uz e;
        public final z21 f26342f;
        public final s4.c0 h;
        public final u21 f26343n;
        public final v21 f26344r;
        public final FrameLayout f26345s;
        public final FrameLayout v;
        public final View[] f26346w;
        public final AnimatorSet[] f26347x;
        public final Drawable f26348y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f26346w = new View[2];
            this.f26347x = new AnimatorSet[2];
            this.f26348y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            m21 m21Var = new m21(this, context);
            this.containerView = m21Var;
            m21Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            z21 z21Var = new z21(this, context);
            this.f26342f = z21Var;
            frameLayout.addView(z21Var, kb1.i(-1, -1, 51));
            n21 n21Var = new n21(this, context);
            this.f26341c = n21Var;
            n21Var.setSelectorDrawableColor(251658240);
            n21Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            n21Var.setClipToPadding(false);
            getContext();
            s4.c0 c0Var = new s4.c0();
            this.h = c0Var;
            n21Var.setLayoutManager(c0Var);
            n21Var.setHorizontalScrollBarEnabled(false);
            n21Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(n21Var, kb1.i(-1, -1, 51));
            ?? h0Var = new s4.h0();
            h0Var.d = new ArrayList();
            h0Var.f33215c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) arrayList.get(i11);
                int i12 = h7Var.e;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    h0Var.d.add(arrayList2);
                }
                arrayList2.add(h7Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.y6.f23300a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
                    h0Var.d.add(arrayList3);
                }
            }
            this.f26343n = h0Var;
            n21Var.setAdapter(h0Var);
            this.f26344r = new v21(this, context);
            this.f26341c.setGlowColor(-657673);
            this.f26341c.setItemAnimator(null);
            this.f26341c.setLayoutAnimation(null);
            this.f26341c.setOnItemClickListener(new j(this, 18));
            this.f26341c.setOnScrollListener(new o21(this));
            uz uzVar = new uz(context, null);
            this.e = uzVar;
            uzVar.setShowAtCenter(true);
            uzVar.c();
            uzVar.setText(LocaleController.getString(R.string.NoResult));
            this.f26341c.setEmptyView(uzVar);
            this.containerView.addView(uzVar, kb1.h(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f26346w[0] = new View(context);
            this.f26346w[0].setBackgroundColor(301989888);
            this.f26346w[0].setAlpha(0.0f);
            this.f26346w[0].setTag(1);
            this.containerView.addView(this.f26346w[0], layoutParams);
            this.containerView.addView(this.d, kb1.i(-1, 58, 51));
            t21 t21Var = new t21(this, context);
            this.f26340b = t21Var;
            t21Var.setVisibility(8);
            this.containerView.addView(t21Var, kb1.i(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f26346w[1] = new View(context);
            this.f26346w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f26346w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f26345s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, kb1.i(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.g0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, kb1.i(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f30098b;

                {
                    this.f30098b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f30098b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26339o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26334j.removeView(themeEditorView.f26330c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22696i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.h7 h7Var3 = (org.telegram.ui.ActionBar.h7) themeEditorView3.e.get(i17);
                                h7Var3.e(org.telegram.ui.ActionBar.y6.E0(h7Var3.e), true, true);
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
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.g0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, kb1.i(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f30098b;

                {
                    this.f30098b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f30098b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26339o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26334j.removeView(themeEditorView.f26330c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22696i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.h7 h7Var3 = (org.telegram.ui.ActionBar.h7) themeEditorView3.e.get(i17);
                                h7Var3.e(org.telegram.ui.ActionBar.y6.E0(h7Var3.e), true, true);
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
            this.containerView.addView(frameLayout3, kb1.i(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.g0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, kb1.i(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f30098b;

                {
                    this.f30098b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f30098b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26339o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26334j.removeView(themeEditorView.f26330c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22696i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.h7 h7Var3 = (org.telegram.ui.ActionBar.h7) themeEditorView3.e.get(i17);
                                h7Var3.e(org.telegram.ui.ActionBar.y6.E0(h7Var3.e), true, true);
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
            frameLayout3.addView(linearLayout, kb1.i(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.g0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, kb1.i(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f30098b;

                {
                    this.f30098b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f30098b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26339o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26334j.removeView(themeEditorView.f26330c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22696i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.h7 h7Var3 = (org.telegram.ui.ActionBar.h7) themeEditorView3.e.get(i17);
                                h7Var3.e(org.telegram.ui.ActionBar.y6.E0(h7Var3.e), true, true);
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
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.g0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, kb1.i(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f30098b;

                {
                    this.f30098b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f30098b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26339o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26334j.removeView(themeEditorView.f26330c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22696i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.e.size(); i17++) {
                                org.telegram.ui.ActionBar.h7 h7Var3 = (org.telegram.ui.ActionBar.h7) themeEditorView3.e.get(i17);
                                h7Var3.e(org.telegram.ui.ActionBar.y6.E0(h7Var3.e), true, true);
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
            n21 n21Var = editorAlert.f26341c;
            if (n21Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = n21Var.getChildAt(0);
                wl0 wl0Var = (wl0) n21Var.G(childAt);
                if (wl0Var != null) {
                    int paddingTop = n21Var.getPaddingTop();
                    if (wl0Var.b() == 0 && childAt.getTop() >= 0) {
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
            n21 n21Var = editorAlert.f26341c;
            if (n21Var.getChildCount() > 0 && n21Var.getVisibility() == 0 && !editorAlert.H) {
                int i10 = 0;
                View childAt = n21Var.getChildAt(0);
                wl0 wl0Var = (wl0) n21Var.G(childAt);
                if (n21Var.getVisibility() == 0 && !editorAlert.H) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = n21Var.getPaddingTop();
                }
                if (paddingTop > (-AndroidUtilities.dp(1.0f)) && wl0Var != null && wl0Var.b() == 0) {
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
            View[] viewArr = this.f26346w;
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
                AnimatorSet[] animatorSetArr = this.f26347x;
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
                animatorSetArr[0].addListener(new p21(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void L(boolean z10) {
            ?? r6;
            uz uzVar = this.e;
            View[] viewArr = this.f26346w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f26345s;
            FrameLayout frameLayout3 = this.v;
            t21 t21Var = this.f26340b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            n21 n21Var = this.f26341c;
            if (z10) {
                this.H = true;
                t21Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                t21Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.G = this.E;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(t21Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(n21Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(uzVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", n21Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f26335k);
                animatorSet.addListener(new q21(this));
                animatorSet.start();
                return;
            }
            float f7 = 0.0f;
            Activity activity = themeEditorView.d;
            if (activity != null) {
                r6 = 0;
                ((LaunchActivity) activity).z0(false);
            } else {
                r6 = 0;
            }
            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26339o, r6, r6, r6);
            if (n21Var.getAdapter() == this.f26343n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.H = true;
            n21Var.setVisibility(r6);
            frameLayout2.setVisibility(r6);
            this.f26342f.setVisibility(r6);
            n21Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r6] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t21Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r6] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r6] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n21Var, property2, fArr3);
            char c10 = r6;
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
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(uzVar, property2, fArr6);
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
            animatorSet2.setInterpolator(themeEditorView.f26335k);
            animatorSet2.addListener(new r21(this));
            animatorSet2.start();
            n21Var.getAdapter().m(themeEditorView.f26331f);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            z21 z21Var = this.f26342f;
            if (z21Var.f35225b.isFocused()) {
                AndroidUtilities.hideKeyboard(z21Var.f35225b);
            }
        }

        public int getScrollOffsetY() {
            return this.E;
        }

        public void setScrollOffsetY(int i10) {
            this.E = i10;
            this.f26341c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.E);
            this.f26340b.setTranslationY(this.E);
            this.e.setTranslationY(this.E);
            this.containerView.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (!themeEditorView.f26328a) {
            themeEditorView.f26328a = true;
            AndroidUtilities.runOnUIThread(themeEditorView.f26329b);
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
        i21 i21Var;
        this.f26337m.getClass();
        if (this.d != null && (i21Var = this.f26330c) != null) {
            try {
                this.f26334j.removeViewImmediate(i21Var);
                this.f26330c = null;
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            try {
                EditorAlert editorAlert = this.f26338n;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f26338n = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.d = null;
            f26327p = null;
        }
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.x6 x6Var) {
        if (f26327p != null) {
            f26327p.b();
        }
        this.f26339o = x6Var;
        this.f26330c = new i21(this, activity);
        this.f26334j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f26336l = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f26336l.getInt("sidey", 0);
        float f7 = this.f26336l.getFloat("px", 0.0f);
        float f10 = this.f26336l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f26333i = layoutParams;
            int i12 = this.f26332g;
            layoutParams.width = i12;
            layoutParams.height = this.h;
            layoutParams.x = c(f7, i10, i12, true);
            this.f26333i.y = c(f10, i11, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.f26333i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f26334j, this.f26330c, layoutParams2);
            this.f26334j.addView(this.f26330c, this.f26333i);
            this.f26337m = new ca1(activity, null, new j21(this));
            f26327p = this;
            this.d = activity;
            e();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void e() {
        this.f26330c.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26330c, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26330c, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26330c, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f26335k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f26333i.x;
    }

    public int getY() {
        return this.f26333i.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f26333i;
        layoutParams.x = i10;
        this.f26334j.updateViewLayout(this.f26330c, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f26333i;
        layoutParams.y = i10;
        this.f26334j.updateViewLayout(this.f26330c, layoutParams);
    }
}
