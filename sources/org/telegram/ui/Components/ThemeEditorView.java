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
    public static volatile ThemeEditorView f26553n;
    public e01 f26554a;
    public Activity f26555b;
    public ArrayList f26556c;
    public int d;
    public final int f26557e = AndroidUtilities.dp(54.0f);
    public final int f26558f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams f26559g;
    public WindowManager h;
    public DecelerateInterpolator f26560i;
    public SharedPreferences f26561j;
    public u71 f26562k;
    public EditorAlert f26563l;
    public org.telegram.ui.ActionBar.e6 f26564m;

    public class EditorAlert extends org.telegram.ui.ActionBar.f3 {
        public static final int I = 0;
        public int A;
        public int B;
        public int C;
        public boolean D;
        public AnimatorSet E;
        public boolean F;
        public boolean G;
        public final p01 f26565b;
        public final j01 f26566c;
        public final FrameLayout d;
        public final yy f26567e;
        public final v01 f26568f;
        public final f2.m0 h;
        public final q01 f26569n;
        public final r01 f26570r;
        public final FrameLayout f26571s;
        public final FrameLayout v;
        public final View[] f26572w;
        public final AnimatorSet[] f26573x;
        public final Drawable f26574y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f26572w = new View[2];
            this.f26573x = new AnimatorSet[2];
            this.f26574y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            i01 i01Var = new i01(this, context);
            this.containerView = i01Var;
            i01Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i9 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i9, 0, i9, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            v01 v01Var = new v01(this, context);
            this.f26568f = v01Var;
            frameLayout.addView(v01Var, g7.e6.e(-1, -1, 51));
            j01 j01Var = new j01(this, context);
            this.f26566c = j01Var;
            j01Var.setSelectorDrawableColor(251658240);
            j01Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            j01Var.setClipToPadding(false);
            getContext();
            f2.m0 m0Var = new f2.m0();
            this.h = m0Var;
            j01Var.setLayoutManager(m0Var);
            j01Var.setHorizontalScrollBarEnabled(false);
            j01Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(j01Var, g7.e6.e(-1, -1, 51));
            ?? r0Var = new f2.r0();
            r0Var.d = new ArrayList();
            r0Var.f31792c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList.get(i10);
                int i11 = h6Var.f23498f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i11));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i11), arrayList2);
                    r0Var.d.add(arrayList2);
                }
                arrayList2.add(h6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i12 = org.telegram.ui.ActionBar.f6.f22947a7;
                if (!hashMap.containsKey(Integer.valueOf(i12))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, i12));
                    r0Var.d.add(arrayList3);
                }
            }
            this.f26569n = r0Var;
            j01Var.setAdapter(r0Var);
            this.f26570r = new r01(this, context);
            this.f26566c.setGlowColor(-657673);
            this.f26566c.setItemAnimator(null);
            this.f26566c.setLayoutAnimation(null);
            this.f26566c.setOnItemClickListener(new j(this, 18));
            this.f26566c.setOnScrollListener(new k01(this));
            yy yyVar = new yy(context, null);
            this.f26567e = yyVar;
            yyVar.setShowAtCenter(true);
            yyVar.c();
            yyVar.setText(LocaleController.getString(R.string.NoResult));
            this.f26566c.setEmptyView(yyVar);
            this.containerView.addView(yyVar, g7.e6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f26572w[0] = new View(context);
            this.f26572w[0].setBackgroundColor(301989888);
            this.f26572w[0].setAlpha(0.0f);
            this.f26572w[0].setTag(1);
            this.containerView.addView(this.f26572w[0], layoutParams);
            this.containerView.addView(this.d, g7.e6.e(-1, 58, 51));
            p01 p01Var = new p01(this, context);
            this.f26565b = p01Var;
            p01Var.setVisibility(8);
            this.containerView.addView(p01Var, g7.e6.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f26572w[1] = new View(context);
            this.f26572w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f26572w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f26571s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, g7.e6.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, g7.e6.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f28909b;

                {
                    this.f28909b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f28909b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.f26564m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26554a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26555b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f26556c.size(); i15++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.f26556c.get(i15);
                                h6Var2.d(h6Var2.f23500i, h6Var2.f23501j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f26556c.size(); i16++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.f26556c.get(i16);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f23498f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, g7.e6.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f28909b;

                {
                    this.f28909b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f28909b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.f26564m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26554a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26555b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f26556c.size(); i15++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.f26556c.get(i15);
                                h6Var2.d(h6Var2.f23500i, h6Var2.f23501j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f26556c.size(); i16++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.f26556c.get(i16);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f23498f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, g7.e6.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, g7.e6.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f28909b;

                {
                    this.f28909b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f28909b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.f26564m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26554a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26555b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f26556c.size(); i15++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.f26556c.get(i15);
                                h6Var2.d(h6Var2.f23500i, h6Var2.f23501j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f26556c.size(); i16++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.f26556c.get(i16);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f23498f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, g7.e6.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, g7.e6.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f28909b;

                {
                    this.f28909b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f28909b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.f26564m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26554a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26555b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f26556c.size(); i15++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.f26556c.get(i15);
                                h6Var2.d(h6Var2.f23500i, h6Var2.f23501j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f26556c.size(); i16++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.f26556c.get(i16);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f23498f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, g7.e6.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f28909b;

                {
                    this.f28909b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i13 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f28909b;
                    switch (i13) {
                        case 0:
                            int i14 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.f26564m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26554a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26555b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i15 = 0; i15 < themeEditorView2.f26556c.size(); i15++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.f26556c.get(i15);
                                h6Var2.d(h6Var2.f23500i, h6Var2.f23501j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView3.f26556c.size(); i16++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.f26556c.get(i16);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f23498f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i17 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
        }

        public static int I(EditorAlert editorAlert) {
            j01 j01Var = editorAlert.f26566c;
            if (j01Var.getChildCount() != 0) {
                int i9 = 0;
                View childAt = j01Var.getChildAt(0);
                ik0 ik0Var = (ik0) j01Var.G(childAt);
                if (ik0Var != null) {
                    int paddingTop = j01Var.getPaddingTop();
                    if (ik0Var.b() == 0 && childAt.getTop() >= 0) {
                        i9 = childAt.getTop();
                    }
                    return paddingTop - i9;
                }
                return -1000;
            }
            return -1000;
        }

        public static void s(EditorAlert editorAlert) {
            int paddingTop;
            j01 j01Var = editorAlert.f26566c;
            if (j01Var.getChildCount() > 0 && j01Var.getVisibility() == 0 && !editorAlert.D) {
                int i9 = 0;
                View childAt = j01Var.getChildAt(0);
                ik0 ik0Var = (ik0) j01Var.G(childAt);
                if (j01Var.getVisibility() == 0 && !editorAlert.D) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = j01Var.getPaddingTop();
                }
                if (paddingTop > (-AndroidUtilities.dp(1.0f)) && ik0Var != null && ik0Var.b() == 0) {
                    editorAlert.J(false);
                    i9 = paddingTop;
                } else {
                    editorAlert.J(true);
                }
                if (editorAlert.A != i9) {
                    editorAlert.setScrollOffsetY(i9);
                }
            }
        }

        public final void J(boolean z10) {
            Integer num;
            float f10;
            View[] viewArr = this.f26572w;
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
                AnimatorSet[] animatorSetArr = this.f26573x;
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
                animatorSetArr[0].addListener(new l01(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void K(boolean z10) {
            ?? r62;
            yy yyVar = this.f26567e;
            View[] viewArr = this.f26572w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f26571s;
            FrameLayout frameLayout3 = this.v;
            p01 p01Var = this.f26565b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            j01 j01Var = this.f26566c;
            if (z10) {
                this.D = true;
                p01Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                p01Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.C = this.A;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(p01Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(j01Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(yyVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", j01Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f26560i);
                animatorSet.addListener(new m01(this));
                animatorSet.start();
                return;
            }
            Activity activity = themeEditorView.f26555b;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.f6.r1(themeEditorView.f26564m, r62, r62, r62);
            if (j01Var.getAdapter() == this.f26569n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.D = true;
            j01Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f26568f.setVisibility(r62);
            j01Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float f10 = 0.0f;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p01Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j01Var, property2, fArr3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, 1.0f);
            View view = viewArr[0];
            if (view.getTag() == null) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f10), ObjectAnimator.ofFloat(yyVar, property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.C));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.f26560i);
            animatorSet2.addListener(new n01(this));
            animatorSet2.start();
            j01Var.getAdapter().m(themeEditorView.d);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            v01 v01Var = this.f26568f;
            if (v01Var.f33196b.isFocused()) {
                AndroidUtilities.hideKeyboard(v01Var.f33196b);
            }
        }

        public int getScrollOffsetY() {
            return this.A;
        }

        public void setScrollOffsetY(int i9) {
            this.A = i9;
            this.f26566c.setTopGlowOffset(i9);
            this.d.setTranslationY(this.A);
            this.f26565b.setTranslationY(this.A);
            this.f26567e.setTranslationY(this.A);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z10, int i9, float f10, int i10) {
        int i11;
        int round;
        if (z10) {
            i11 = AndroidUtilities.displaySize.x;
        } else {
            i11 = AndroidUtilities.displaySize.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i12 = i11 - i10;
        if (i9 == 0) {
            round = AndroidUtilities.dp(10.0f);
        } else if (i9 == 1) {
            round = i12 - AndroidUtilities.dp(10.0f);
        } else {
            round = Math.round((i12 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a() {
        e01 e01Var;
        this.f26562k.getClass();
        if (this.f26555b != null && (e01Var = this.f26554a) != null) {
            try {
                this.h.removeViewImmediate(e01Var);
                this.f26554a = null;
            } catch (Exception e10) {
                FileLog.e((Throwable) e10, false);
            }
            try {
                EditorAlert editorAlert = this.f26563l;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f26563l = null;
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            this.f26555b = null;
            f26553n = null;
        }
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        if (f26553n != null) {
            f26553n.a();
        }
        this.f26564m = e6Var;
        this.f26554a = new e01(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f26561j = sharedPreferences;
        int i9 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f26561j.getInt("sidey", 0);
        float f10 = this.f26561j.getFloat("px", 0.0f);
        float f11 = this.f26561j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f26559g = layoutParams;
            int i11 = this.f26557e;
            layoutParams.width = i11;
            layoutParams.height = this.f26558f;
            layoutParams.x = b(true, i9, f10, i11);
            this.f26559g.y = b(false, i10, f11, this.f26558f);
            WindowManager.LayoutParams layoutParams2 = this.f26559g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.f26554a, layoutParams2);
            this.h.addView(this.f26554a, this.f26559g);
            this.f26562k = new u71(activity, null, new f01(this));
            f26553n = this;
            this.f26555b = activity;
            d();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void d() {
        this.f26554a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26554a, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26554a, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26554a, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f26560i);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f26559g.x;
    }

    public int getY() {
        return this.f26559g.y;
    }

    public void setX(int i9) {
        WindowManager.LayoutParams layoutParams = this.f26559g;
        layoutParams.x = i9;
        this.h.updateViewLayout(this.f26554a, layoutParams);
    }

    public void setY(int i9) {
        WindowManager.LayoutParams layoutParams = this.f26559g;
        layoutParams.y = i9;
        this.h.updateViewLayout(this.f26554a, layoutParams);
    }
}
