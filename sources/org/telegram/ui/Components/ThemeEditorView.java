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
    public static volatile ThemeEditorView f24159n;
    public x01 f24160a;
    public Activity f24161b;
    public ArrayList f24162c;
    public int d;
    public final int f24163e = AndroidUtilities.dp(54.0f);
    public final int f24164f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams f24165g;
    public WindowManager h;
    public DecelerateInterpolator f24166i;
    public SharedPreferences f24167j;
    public p81 f24168k;
    public EditorAlert f24169l;
    public org.telegram.ui.ActionBar.i6 f24170m;

    public class EditorAlert extends org.telegram.ui.ActionBar.f3 {
        public static final int M = 0;
        public int E;
        public int F;
        public int G;
        public boolean H;
        public AnimatorSet I;
        public boolean J;
        public boolean K;
        public final i11 f24171b;
        public final c11 f24172c;
        public final FrameLayout d;
        public final mz f24173e;
        public final o11 f24174f;
        public final s4.c0 h;
        public final j11 f24175n;
        public final k11 f24176r;
        public final FrameLayout f24177s;
        public final FrameLayout v;
        public final View[] f24178w;
        public final AnimatorSet[] f24179x;
        public final Drawable f24180y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f24178w = new View[2];
            this.f24179x = new AnimatorSet[2];
            this.f24180y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            b11 b11Var = new b11(this, context);
            this.containerView = b11Var;
            b11Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            o11 o11Var = new o11(this, context);
            this.f24174f = o11Var;
            frameLayout.addView(o11Var, w7.x5.e(-1, -1, 51));
            c11 c11Var = new c11(this, context);
            this.f24172c = c11Var;
            c11Var.setSelectorDrawableColor(251658240);
            c11Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            c11Var.setClipToPadding(false);
            getContext();
            s4.c0 c0Var = new s4.c0();
            this.h = c0Var;
            c11Var.setLayoutManager(c0Var);
            c11Var.setHorizontalScrollBarEnabled(false);
            c11Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(c11Var, w7.x5.e(-1, -1, 51));
            ?? h0Var = new s4.h0();
            h0Var.d = new ArrayList();
            h0Var.f27301c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) arrayList.get(i11);
                int i12 = l6Var.f21177f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    h0Var.d.add(arrayList2);
                }
                arrayList2.add(l6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.j6.f20607a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i13));
                    h0Var.d.add(arrayList3);
                }
            }
            this.f24175n = h0Var;
            c11Var.setAdapter(h0Var);
            this.f24176r = new k11(this, context);
            this.f24172c.setGlowColor(-657673);
            this.f24172c.setItemAnimator(null);
            this.f24172c.setLayoutAnimation(null);
            this.f24172c.setOnItemClickListener(new k(this, 18));
            this.f24172c.setOnScrollListener(new d11(this));
            mz mzVar = new mz(context, null);
            this.f24173e = mzVar;
            mzVar.setShowAtCenter(true);
            mzVar.c();
            mzVar.setText(LocaleController.getString(R.string.NoResult));
            this.f24172c.setEmptyView(mzVar);
            this.containerView.addView(mzVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f24178w[0] = new View(context);
            this.f24178w[0].setBackgroundColor(301989888);
            this.f24178w[0].setAlpha(0.0f);
            this.f24178w[0].setTag(1);
            this.containerView.addView(this.f24178w[0], layoutParams);
            this.containerView.addView(this.d, w7.x5.e(-1, 58, 51));
            i11 i11Var = new i11(this, context);
            this.f24171b = i11Var;
            i11Var.setVisibility(8);
            this.containerView.addView(i11Var, w7.x5.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f24178w[1] = new View(context);
            this.f24178w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f24178w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f24177s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, w7.x5.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, w7.x5.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24226b;

                {
                    this.f24226b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24226b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.j6.r1(themeEditorView.f24170m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24160a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24161b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24162c.size(); i16++) {
                                org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) themeEditorView2.f24162c.get(i16);
                                l6Var2.d(l6Var2.f21179i, l6Var2.f21180j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24162c.size(); i17++) {
                                org.telegram.ui.ActionBar.l6 l6Var3 = (org.telegram.ui.ActionBar.l6) themeEditorView3.f24162c.get(i17);
                                l6Var3.d(org.telegram.ui.ActionBar.j6.C0(l6Var3.f21177f), true, true);
                            }
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
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, w7.x5.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24226b;

                {
                    this.f24226b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24226b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.j6.r1(themeEditorView.f24170m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24160a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24161b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24162c.size(); i16++) {
                                org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) themeEditorView2.f24162c.get(i16);
                                l6Var2.d(l6Var2.f21179i, l6Var2.f21180j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24162c.size(); i17++) {
                                org.telegram.ui.ActionBar.l6 l6Var3 = (org.telegram.ui.ActionBar.l6) themeEditorView3.f24162c.get(i17);
                                l6Var3.d(org.telegram.ui.ActionBar.j6.C0(l6Var3.f21177f), true, true);
                            }
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
            this.containerView.addView(frameLayout3, w7.x5.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, w7.x5.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24226b;

                {
                    this.f24226b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24226b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.j6.r1(themeEditorView.f24170m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24160a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24161b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24162c.size(); i16++) {
                                org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) themeEditorView2.f24162c.get(i16);
                                l6Var2.d(l6Var2.f21179i, l6Var2.f21180j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24162c.size(); i17++) {
                                org.telegram.ui.ActionBar.l6 l6Var3 = (org.telegram.ui.ActionBar.l6) themeEditorView3.f24162c.get(i17);
                                l6Var3.d(org.telegram.ui.ActionBar.j6.C0(l6Var3.f21177f), true, true);
                            }
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
            frameLayout3.addView(linearLayout, w7.x5.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, w7.x5.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24226b;

                {
                    this.f24226b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24226b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.j6.r1(themeEditorView.f24170m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24160a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24161b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24162c.size(); i16++) {
                                org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) themeEditorView2.f24162c.get(i16);
                                l6Var2.d(l6Var2.f21179i, l6Var2.f21180j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24162c.size(); i17++) {
                                org.telegram.ui.ActionBar.l6 l6Var3 = (org.telegram.ui.ActionBar.l6) themeEditorView3.f24162c.get(i17);
                                l6Var3.d(org.telegram.ui.ActionBar.j6.C0(l6Var3.f21177f), true, true);
                            }
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
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, w7.x5.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f24226b;

                {
                    this.f24226b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f24226b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.j6.r1(themeEditorView.f24170m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f24160a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f24161b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f24162c.size(); i16++) {
                                org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) themeEditorView2.f24162c.get(i16);
                                l6Var2.d(l6Var2.f21179i, l6Var2.f21180j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f24162c.size(); i17++) {
                                org.telegram.ui.ActionBar.l6 l6Var3 = (org.telegram.ui.ActionBar.l6) themeEditorView3.f24162c.get(i17);
                                l6Var3.d(org.telegram.ui.ActionBar.j6.C0(l6Var3.f21177f), true, true);
                            }
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
            c11 c11Var = editorAlert.f24172c;
            if (c11Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = c11Var.getChildAt(0);
                vk0 vk0Var = (vk0) c11Var.G(childAt);
                if (vk0Var != null) {
                    int paddingTop = c11Var.getPaddingTop();
                    if (vk0Var.b() == 0 && childAt.getTop() >= 0) {
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
            c11 c11Var = editorAlert.f24172c;
            if (c11Var.getChildCount() > 0 && c11Var.getVisibility() == 0 && !editorAlert.H) {
                int i10 = 0;
                View childAt = c11Var.getChildAt(0);
                vk0 vk0Var = (vk0) c11Var.G(childAt);
                if (c11Var.getVisibility() == 0 && !editorAlert.H) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = c11Var.getPaddingTop();
                }
                if (paddingTop > (-AndroidUtilities.dp(1.0f)) && vk0Var != null && vk0Var.b() == 0) {
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
            View[] viewArr = this.f24178w;
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
                AnimatorSet[] animatorSetArr = this.f24179x;
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
                animatorSetArr[0].addListener(new e11(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void L(boolean z10) {
            ?? r62;
            mz mzVar = this.f24173e;
            View[] viewArr = this.f24178w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f24177s;
            FrameLayout frameLayout3 = this.v;
            i11 i11Var = this.f24171b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            c11 c11Var = this.f24172c;
            if (z10) {
                this.H = true;
                i11Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                i11Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.G = this.E;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(i11Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(c11Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(mzVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", c11Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f24166i);
                animatorSet.addListener(new f11(this));
                animatorSet.start();
                return;
            }
            Activity activity = themeEditorView.f24161b;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.j6.r1(themeEditorView.f24170m, r62, r62, r62);
            if (c11Var.getAdapter() == this.f24175n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.H = true;
            c11Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f24174f.setVisibility(r62);
            c11Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float f7 = 0.0f;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i11Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c11Var, property2, fArr3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, 1.0f);
            View view = viewArr[0];
            if (view.getTag() == null) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f7), ObjectAnimator.ofFloat(mzVar, property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.G));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.f24166i);
            animatorSet2.addListener(new g11(this));
            animatorSet2.start();
            c11Var.getAdapter().m(themeEditorView.d);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            o11 o11Var = this.f24174f;
            if (o11Var.f28923b.isFocused()) {
                AndroidUtilities.hideKeyboard(o11Var.f28923b);
            }
        }

        public int getScrollOffsetY() {
            return this.E;
        }

        public void setScrollOffsetY(int i10) {
            this.E = i10;
            this.f24172c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.E);
            this.f24171b.setTranslationY(this.E);
            this.f24173e.setTranslationY(this.E);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z10, int i10, float f7, int i11) {
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

    public final void a() {
        x01 x01Var;
        this.f24168k.getClass();
        if (this.f24161b != null && (x01Var = this.f24160a) != null) {
            try {
                this.h.removeViewImmediate(x01Var);
                this.f24160a = null;
            } catch (Exception e7) {
                FileLog.e((Throwable) e7, false);
            }
            try {
                EditorAlert editorAlert = this.f24169l;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f24169l = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.f24161b = null;
            f24159n = null;
        }
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        if (f24159n != null) {
            f24159n.a();
        }
        this.f24170m = i6Var;
        this.f24160a = new x01(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f24167j = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24167j.getInt("sidey", 0);
        float f7 = this.f24167j.getFloat("px", 0.0f);
        float f10 = this.f24167j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f24165g = layoutParams;
            int i12 = this.f24163e;
            layoutParams.width = i12;
            layoutParams.height = this.f24164f;
            layoutParams.x = b(true, i10, f7, i12);
            this.f24165g.y = b(false, i11, f10, this.f24164f);
            WindowManager.LayoutParams layoutParams2 = this.f24165g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.f24160a, layoutParams2);
            this.h.addView(this.f24160a, this.f24165g);
            this.f24168k = new p81(activity, null, new y01(this));
            f24159n = this;
            this.f24161b = activity;
            d();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void d() {
        this.f24160a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f24160a, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f24160a, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f24160a, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f24166i);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f24165g.x;
    }

    public int getY() {
        return this.f24165g.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24165g;
        layoutParams.x = i10;
        this.h.updateViewLayout(this.f24160a, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24165g;
        layoutParams.y = i10;
        this.h.updateViewLayout(this.f24160a, layoutParams);
    }
}
