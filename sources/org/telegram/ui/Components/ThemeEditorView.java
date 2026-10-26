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
    public static volatile ThemeEditorView f26325p;
    public boolean f26326a;
    public h21 f26328c;
    public Activity d;
    public ArrayList e;
    public int f26329f;
    public WindowManager.LayoutParams f26331i;
    public WindowManager f26332j;
    public DecelerateInterpolator f26333k;
    public SharedPreferences f26334l;
    public ba1 f26335m;
    public EditorAlert f26336n;
    public org.telegram.ui.ActionBar.x6 f26337o;
    public final cy0 f26327b = new cy0(this, 1);
    public final int f26330g = AndroidUtilities.dp(54.0f);
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
        public final s21 f26338b;
        public final m21 f26339c;
        public final FrameLayout d;
        public final uz e;
        public final y21 f26340f;
        public final s4.c0 h;
        public final t21 f26341n;
        public final u21 f26342r;
        public final FrameLayout f26343s;
        public final FrameLayout v;
        public final View[] f26344w;
        public final AnimatorSet[] f26345x;
        public final Drawable f26346y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f26344w = new View[2];
            this.f26345x = new AnimatorSet[2];
            this.f26346y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            l21 l21Var = new l21(this, context);
            this.containerView = l21Var;
            l21Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            y21 y21Var = new y21(this, context);
            this.f26340f = y21Var;
            frameLayout.addView(y21Var, gb1.i(-1, -1, 51));
            m21 m21Var = new m21(this, context);
            this.f26339c = m21Var;
            m21Var.setSelectorDrawableColor(251658240);
            m21Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            m21Var.setClipToPadding(false);
            getContext();
            s4.c0 c0Var = new s4.c0();
            this.h = c0Var;
            m21Var.setLayoutManager(c0Var);
            m21Var.setHorizontalScrollBarEnabled(false);
            m21Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(m21Var, gb1.i(-1, -1, 51));
            ?? h0Var = new s4.h0();
            h0Var.d = new ArrayList();
            h0Var.f32818c = context;
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
                int i13 = org.telegram.ui.ActionBar.y6.f23299a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
                    h0Var.d.add(arrayList3);
                }
            }
            this.f26341n = h0Var;
            m21Var.setAdapter(h0Var);
            this.f26342r = new u21(this, context);
            this.f26339c.setGlowColor(-657673);
            this.f26339c.setItemAnimator(null);
            this.f26339c.setLayoutAnimation(null);
            this.f26339c.setOnItemClickListener(new j(this, 18));
            this.f26339c.setOnScrollListener(new n21(this));
            uz uzVar = new uz(context, null);
            this.e = uzVar;
            uzVar.setShowAtCenter(true);
            uzVar.c();
            uzVar.setText(LocaleController.getString(R.string.NoResult));
            this.f26339c.setEmptyView(uzVar);
            this.containerView.addView(uzVar, gb1.h(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f26344w[0] = new View(context);
            this.f26344w[0].setBackgroundColor(301989888);
            this.f26344w[0].setAlpha(0.0f);
            this.f26344w[0].setTag(1);
            this.containerView.addView(this.f26344w[0], layoutParams);
            this.containerView.addView(this.d, gb1.i(-1, 58, 51));
            s21 s21Var = new s21(this, context);
            this.f26338b = s21Var;
            s21Var.setVisibility(8);
            this.containerView.addView(s21Var, gb1.i(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f26344w[1] = new View(context);
            this.f26344w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f26344w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f26343s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, gb1.i(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.g0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, gb1.i(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f29784b;

                {
                    this.f29784b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f29784b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26337o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26332j.removeView(themeEditorView.f26328c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22695i[0], true);
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
            frameLayout2.addView(textView2, gb1.i(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f29784b;

                {
                    this.f29784b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f29784b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26337o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26332j.removeView(themeEditorView.f26328c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22695i[0], true);
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
            this.containerView.addView(frameLayout3, gb1.i(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.g0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, gb1.i(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f29784b;

                {
                    this.f29784b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f29784b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26337o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26332j.removeView(themeEditorView.f26328c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22695i[0], true);
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
            frameLayout3.addView(linearLayout, gb1.i(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.g0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, gb1.i(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f29784b;

                {
                    this.f29784b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f29784b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26337o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26332j.removeView(themeEditorView.f26328c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22695i[0], true);
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
            linearLayout.addView(textView5, gb1.i(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f29784b;

                {
                    this.f29784b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f29784b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26337o, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.f26332j.removeView(themeEditorView.f26328c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.e.size(); i16++) {
                                org.telegram.ui.ActionBar.h7 h7Var2 = (org.telegram.ui.ActionBar.h7) themeEditorView2.e.get(i16);
                                h7Var2.e(h7Var2.h, h7Var2.f22695i[0], true);
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
            m21 m21Var = editorAlert.f26339c;
            if (m21Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = m21Var.getChildAt(0);
                vl0 vl0Var = (vl0) m21Var.G(childAt);
                if (vl0Var != null) {
                    int paddingTop = m21Var.getPaddingTop();
                    if (vl0Var.b() == 0 && childAt.getTop() >= 0) {
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
            m21 m21Var = editorAlert.f26339c;
            if (m21Var.getChildCount() > 0 && m21Var.getVisibility() == 0 && !editorAlert.H) {
                int i10 = 0;
                View childAt = m21Var.getChildAt(0);
                vl0 vl0Var = (vl0) m21Var.G(childAt);
                if (m21Var.getVisibility() == 0 && !editorAlert.H) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = m21Var.getPaddingTop();
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
            View[] viewArr = this.f26344w;
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
                AnimatorSet[] animatorSetArr = this.f26345x;
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
                animatorSetArr[0].addListener(new o21(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void L(boolean z10) {
            ?? r6;
            uz uzVar = this.e;
            View[] viewArr = this.f26344w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f26343s;
            FrameLayout frameLayout3 = this.v;
            s21 s21Var = this.f26338b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            m21 m21Var = this.f26339c;
            if (z10) {
                this.H = true;
                s21Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                s21Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.G = this.E;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(s21Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(m21Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(uzVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", m21Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f26333k);
                animatorSet.addListener(new p21(this));
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
            org.telegram.ui.ActionBar.y6.u1(themeEditorView.f26337o, r6, r6, r6);
            if (m21Var.getAdapter() == this.f26341n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.H = true;
            m21Var.setVisibility(r6);
            frameLayout2.setVisibility(r6);
            this.f26340f.setVisibility(r6);
            m21Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r6] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s21Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r6] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r6] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m21Var, property2, fArr3);
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
            animatorSet2.setInterpolator(themeEditorView.f26333k);
            animatorSet2.addListener(new q21(this));
            animatorSet2.start();
            m21Var.getAdapter().m(themeEditorView.f26329f);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            y21 y21Var = this.f26340f;
            if (y21Var.f34915b.isFocused()) {
                AndroidUtilities.hideKeyboard(y21Var.f34915b);
            }
        }

        public int getScrollOffsetY() {
            return this.E;
        }

        public void setScrollOffsetY(int i10) {
            this.E = i10;
            this.f26339c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.E);
            this.f26338b.setTranslationY(this.E);
            this.e.setTranslationY(this.E);
            this.containerView.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (!themeEditorView.f26326a) {
            themeEditorView.f26326a = true;
            AndroidUtilities.runOnUIThread(themeEditorView.f26327b);
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
        h21 h21Var;
        this.f26335m.getClass();
        if (this.d != null && (h21Var = this.f26328c) != null) {
            try {
                this.f26332j.removeViewImmediate(h21Var);
                this.f26328c = null;
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            try {
                EditorAlert editorAlert = this.f26336n;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f26336n = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.d = null;
            f26325p = null;
        }
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.x6 x6Var) {
        if (f26325p != null) {
            f26325p.b();
        }
        this.f26337o = x6Var;
        this.f26328c = new h21(this, activity);
        this.f26332j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f26334l = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f26334l.getInt("sidey", 0);
        float f7 = this.f26334l.getFloat("px", 0.0f);
        float f10 = this.f26334l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f26331i = layoutParams;
            int i12 = this.f26330g;
            layoutParams.width = i12;
            layoutParams.height = this.h;
            layoutParams.x = c(f7, i10, i12, true);
            this.f26331i.y = c(f10, i11, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.f26331i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f26332j, this.f26328c, layoutParams2);
            this.f26332j.addView(this.f26328c, this.f26331i);
            this.f26335m = new ba1(activity, null, new i21(this));
            f26325p = this;
            this.d = activity;
            e();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void e() {
        this.f26328c.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26328c, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26328c, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26328c, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f26333k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f26331i.x;
    }

    public int getY() {
        return this.f26331i.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f26331i;
        layoutParams.x = i10;
        this.f26332j.updateViewLayout(this.f26328c, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f26331i;
        layoutParams.y = i10;
        this.f26332j.updateViewLayout(this.f26328c, layoutParams);
    }
}
