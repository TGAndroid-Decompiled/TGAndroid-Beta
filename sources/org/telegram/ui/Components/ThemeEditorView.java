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
    public static volatile ThemeEditorView f22205n;
    public y01 f22206a;
    public Activity f22207b;
    public ArrayList f22208c;
    public int d;
    public final int e = AndroidUtilities.dp(54.0f);
    public final int f22209f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams f22210g;
    public WindowManager h;
    public DecelerateInterpolator f22211i;
    public SharedPreferences f22212j;
    public p81 f22213k;
    public EditorAlert f22214l;
    public org.telegram.ui.ActionBar.h6 f22215m;

    public class EditorAlert extends org.telegram.ui.ActionBar.f3 {
        public static final int M = 0;
        public int E;
        public int F;
        public int G;
        public boolean H;
        public AnimatorSet I;
        public boolean J;
        public boolean K;
        public final j11 f22216b;
        public final d11 f22217c;
        public final FrameLayout d;
        public final mz e;
        public final p11 f22218f;
        public final s4.c0 h;
        public final k11 f22219n;
        public final l11 f22220r;
        public final FrameLayout f22221s;
        public final FrameLayout v;
        public final View[] f22222w;
        public final AnimatorSet[] f22223x;
        public final Drawable f22224y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f22222w = new View[2];
            this.f22223x = new AnimatorSet[2];
            this.f22224y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            c11 c11Var = new c11(this, context);
            this.containerView = c11Var;
            c11Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            p11 p11Var = new p11(this, context);
            this.f22218f = p11Var;
            frameLayout.addView(p11Var, w7.x5.e(-1, -1, 51));
            d11 d11Var = new d11(this, context);
            this.f22217c = d11Var;
            d11Var.setSelectorDrawableColor(251658240);
            d11Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            d11Var.setClipToPadding(false);
            getContext();
            s4.c0 c0Var = new s4.c0();
            this.h = c0Var;
            d11Var.setLayoutManager(c0Var);
            d11Var.setHorizontalScrollBarEnabled(false);
            d11Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(d11Var, w7.x5.e(-1, -1, 51));
            ?? h0Var = new s4.h0();
            h0Var.d = new ArrayList();
            h0Var.f25504c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) arrayList.get(i11);
                int i12 = k6Var.f19352f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    h0Var.d.add(arrayList2);
                }
                arrayList2.add(k6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.i6.f18778a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i13));
                    h0Var.d.add(arrayList3);
                }
            }
            this.f22219n = h0Var;
            d11Var.setAdapter(h0Var);
            this.f22220r = new l11(this, context);
            this.f22217c.setGlowColor(-657673);
            this.f22217c.setItemAnimator(null);
            this.f22217c.setLayoutAnimation(null);
            this.f22217c.setOnItemClickListener(new j(this, 18));
            this.f22217c.setOnScrollListener(new e11(this));
            mz mzVar = new mz(context, null);
            this.e = mzVar;
            mzVar.setShowAtCenter(true);
            mzVar.c();
            mzVar.setText(LocaleController.getString(R.string.NoResult));
            this.f22217c.setEmptyView(mzVar);
            this.containerView.addView(mzVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f22222w[0] = new View(context);
            this.f22222w[0].setBackgroundColor(301989888);
            this.f22222w[0].setAlpha(0.0f);
            this.f22222w[0].setTag(1);
            this.containerView.addView(this.f22222w[0], layoutParams);
            this.containerView.addView(this.d, w7.x5.e(-1, 58, 51));
            j11 j11Var = new j11(this, context);
            this.f22216b = j11Var;
            j11Var.setVisibility(8);
            this.containerView.addView(j11Var, w7.x5.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f22222w[1] = new View(context);
            this.f22222w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f22222w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f22221s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, w7.x5.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, w7.x5.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f22561b;

                {
                    this.f22561b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f22561b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.r1(themeEditorView.f22215m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f22206a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f22207b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f22208c.size(); i16++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.f22208c.get(i16);
                                k6Var2.d(k6Var2.f19354i, k6Var2.f19355j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f22208c.size(); i17++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.f22208c.get(i17);
                                k6Var3.d(org.telegram.ui.ActionBar.i6.C0(k6Var3.f19352f), true, true);
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
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, w7.x5.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f22561b;

                {
                    this.f22561b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f22561b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.r1(themeEditorView.f22215m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f22206a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f22207b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f22208c.size(); i16++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.f22208c.get(i16);
                                k6Var2.d(k6Var2.f19354i, k6Var2.f19355j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f22208c.size(); i17++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.f22208c.get(i17);
                                k6Var3.d(org.telegram.ui.ActionBar.i6.C0(k6Var3.f19352f), true, true);
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
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, w7.x5.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f22561b;

                {
                    this.f22561b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f22561b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.r1(themeEditorView.f22215m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f22206a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f22207b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f22208c.size(); i16++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.f22208c.get(i16);
                                k6Var2.d(k6Var2.f19354i, k6Var2.f19355j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f22208c.size(); i17++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.f22208c.get(i17);
                                k6Var3.d(org.telegram.ui.ActionBar.i6.C0(k6Var3.f19352f), true, true);
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
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, w7.x5.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f22561b;

                {
                    this.f22561b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f22561b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.r1(themeEditorView.f22215m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f22206a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f22207b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f22208c.size(); i16++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.f22208c.get(i16);
                                k6Var2.d(k6Var2.f19354i, k6Var2.f19355j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f22208c.size(); i17++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.f22208c.get(i17);
                                k6Var3.d(org.telegram.ui.ActionBar.i6.C0(k6Var3.f19352f), true, true);
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
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, w7.x5.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f22561b;

                {
                    this.f22561b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f22561b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.r1(themeEditorView.f22215m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f22206a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f22207b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f22208c.size(); i16++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.f22208c.get(i16);
                                k6Var2.d(k6Var2.f19354i, k6Var2.f19355j[0], true);
                            }
                            editorAlert.L(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f22208c.size(); i17++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.f22208c.get(i17);
                                k6Var3.d(org.telegram.ui.ActionBar.i6.C0(k6Var3.f19352f), true, true);
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
            d11 d11Var = editorAlert.f22217c;
            if (d11Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = d11Var.getChildAt(0);
                vk0 vk0Var = (vk0) d11Var.G(childAt);
                if (vk0Var != null) {
                    int paddingTop = d11Var.getPaddingTop();
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
            d11 d11Var = editorAlert.f22217c;
            if (d11Var.getChildCount() > 0 && d11Var.getVisibility() == 0 && !editorAlert.H) {
                int i10 = 0;
                View childAt = d11Var.getChildAt(0);
                vk0 vk0Var = (vk0) d11Var.G(childAt);
                if (d11Var.getVisibility() == 0 && !editorAlert.H) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = d11Var.getPaddingTop();
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
            View[] viewArr = this.f22222w;
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
                AnimatorSet[] animatorSetArr = this.f22223x;
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
                animatorSetArr[0].addListener(new f11(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void L(boolean z10) {
            ?? r62;
            mz mzVar = this.e;
            View[] viewArr = this.f22222w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f22221s;
            FrameLayout frameLayout3 = this.v;
            j11 j11Var = this.f22216b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            d11 d11Var = this.f22217c;
            if (z10) {
                this.H = true;
                j11Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                j11Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.G = this.E;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(j11Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(d11Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(mzVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", d11Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f22211i);
                animatorSet.addListener(new g11(this));
                animatorSet.start();
                return;
            }
            Activity activity = themeEditorView.f22207b;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.i6.r1(themeEditorView.f22215m, r62, r62, r62);
            if (d11Var.getAdapter() == this.f22219n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.H = true;
            d11Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f22218f.setVisibility(r62);
            d11Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float f7 = 0.0f;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j11Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(d11Var, property2, fArr3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, 1.0f);
            View view = viewArr[0];
            if (view.getTag() == null) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f7), ObjectAnimator.ofFloat(mzVar, property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.G));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.f22211i);
            animatorSet2.addListener(new h11(this));
            animatorSet2.start();
            d11Var.getAdapter().m(themeEditorView.d);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            p11 p11Var = this.f22218f;
            if (p11Var.f26925b.isFocused()) {
                AndroidUtilities.hideKeyboard(p11Var.f26925b);
            }
        }

        public int getScrollOffsetY() {
            return this.E;
        }

        public void setScrollOffsetY(int i10) {
            this.E = i10;
            this.f22217c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.E);
            this.f22216b.setTranslationY(this.E);
            this.e.setTranslationY(this.E);
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
        y01 y01Var;
        this.f22213k.getClass();
        if (this.f22207b != null && (y01Var = this.f22206a) != null) {
            try {
                this.h.removeViewImmediate(y01Var);
                this.f22206a = null;
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            try {
                EditorAlert editorAlert = this.f22214l;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f22214l = null;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.f22207b = null;
            f22205n = null;
        }
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        if (f22205n != null) {
            f22205n.a();
        }
        this.f22215m = h6Var;
        this.f22206a = new y01(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f22212j = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f22212j.getInt("sidey", 0);
        float f7 = this.f22212j.getFloat("px", 0.0f);
        float f10 = this.f22212j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f22210g = layoutParams;
            int i12 = this.e;
            layoutParams.width = i12;
            layoutParams.height = this.f22209f;
            layoutParams.x = b(true, i10, f7, i12);
            this.f22210g.y = b(false, i11, f10, this.f22209f);
            WindowManager.LayoutParams layoutParams2 = this.f22210g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.f22206a, layoutParams2);
            this.h.addView(this.f22206a, this.f22210g);
            this.f22213k = new p81(activity, null, new z01(this));
            f22205n = this;
            this.f22207b = activity;
            d();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void d() {
        this.f22206a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f22206a, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f22206a, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f22206a, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f22211i);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f22210g.x;
    }

    public int getY() {
        return this.f22210g.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f22210g;
        layoutParams.x = i10;
        this.h.updateViewLayout(this.f22206a, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f22210g;
        layoutParams.y = i10;
        this.h.updateViewLayout(this.f22206a, layoutParams);
    }
}
