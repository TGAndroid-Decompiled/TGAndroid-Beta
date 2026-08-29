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
    public static volatile ThemeEditorView f26564n;
    public q01 f26565a;
    public Activity f26566b;
    public ArrayList f26567c;
    public int d;
    public final int f26568e = AndroidUtilities.dp(54.0f);
    public final int f26569f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams f26570g;
    public WindowManager h;
    public DecelerateInterpolator f26571i;
    public SharedPreferences f26572j;
    public g81 f26573k;
    public EditorAlert f26574l;
    public org.telegram.ui.ActionBar.f6 f26575m;

    public class EditorAlert extends org.telegram.ui.ActionBar.f3 {
        public static final int I = 0;
        public int A;
        public int B;
        public int C;
        public boolean D;
        public AnimatorSet E;
        public boolean F;
        public boolean G;
        public final b11 f26576b;
        public final v01 f26577c;
        public final FrameLayout d;
        public final hz f26578e;
        public final h11 f26579f;
        public final f2.j0 h;
        public final c11 f26580n;
        public final d11 f26581r;
        public final FrameLayout f26582s;
        public final FrameLayout v;
        public final View[] f26583w;
        public final AnimatorSet[] f26584x;
        public final Drawable f26585y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f26583w = new View[2];
            this.f26584x = new AnimatorSet[2];
            this.f26585y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            u01 u01Var = new u01(this, context);
            this.containerView = u01Var;
            u01Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            h11 h11Var = new h11(this, context);
            this.f26579f = h11Var;
            frameLayout.addView(h11Var, i7.f6.e(-1, -1, 51));
            v01 v01Var = new v01(this, context);
            this.f26577c = v01Var;
            v01Var.setSelectorDrawableColor(251658240);
            v01Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            v01Var.setClipToPadding(false);
            getContext();
            f2.j0 j0Var = new f2.j0();
            this.h = j0Var;
            v01Var.setLayoutManager(j0Var);
            v01Var.setHorizontalScrollBarEnabled(false);
            v01Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(v01Var, i7.f6.e(-1, -1, 51));
            ?? p0Var = new f2.p0();
            p0Var.d = new ArrayList();
            p0Var.f27276c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) arrayList.get(i11);
                int i12 = i6Var.f23536f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    p0Var.d.add(arrayList2);
                }
                arrayList2.add(i6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.g6.f23009a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i13));
                    p0Var.d.add(arrayList3);
                }
            }
            this.f26580n = p0Var;
            v01Var.setAdapter(p0Var);
            this.f26581r = new d11(this, context);
            this.f26577c.setGlowColor(-657673);
            this.f26577c.setItemAnimator(null);
            this.f26577c.setLayoutAnimation(null);
            this.f26577c.setOnItemClickListener(new k(this, 18));
            this.f26577c.setOnScrollListener(new w01(this));
            hz hzVar = new hz(context, null);
            this.f26578e = hzVar;
            hzVar.setShowAtCenter(true);
            hzVar.c();
            hzVar.setText(LocaleController.getString(R.string.NoResult));
            this.f26577c.setEmptyView(hzVar);
            this.containerView.addView(hzVar, i7.f6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f26583w[0] = new View(context);
            this.f26583w[0].setBackgroundColor(301989888);
            this.f26583w[0].setAlpha(0.0f);
            this.f26583w[0].setTag(1);
            this.containerView.addView(this.f26583w[0], layoutParams);
            this.containerView.addView(this.d, i7.f6.e(-1, 58, 51));
            b11 b11Var = new b11(this, context);
            this.f26576b = b11Var;
            b11Var.setVisibility(8);
            this.containerView.addView(b11Var, i7.f6.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f26583w[1] = new View(context);
            this.f26583w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f26583w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f26582s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, i7.f6.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, i7.f6.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f32779b;

                {
                    this.f32779b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f32779b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26575m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26565a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26566b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f26567c.size(); i16++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26567c.get(i16);
                                i6Var2.d(i6Var2.f23538i, i6Var2.f23539j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f26567c.size(); i17++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26567c.get(i17);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23536f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, i7.f6.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f32779b;

                {
                    this.f32779b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f32779b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26575m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26565a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26566b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f26567c.size(); i16++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26567c.get(i16);
                                i6Var2.d(i6Var2.f23538i, i6Var2.f23539j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f26567c.size(); i17++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26567c.get(i17);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23536f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, i7.f6.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, i7.f6.e(-2, -1, 51));
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f32779b;

                {
                    this.f32779b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f32779b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26575m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26565a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26566b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f26567c.size(); i16++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26567c.get(i16);
                                i6Var2.d(i6Var2.f23538i, i6Var2.f23539j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f26567c.size(); i17++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26567c.get(i17);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23536f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, i7.f6.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, i7.f6.e(-2, -1, 51));
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f32779b;

                {
                    this.f32779b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f32779b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26575m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26565a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26566b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f26567c.size(); i16++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26567c.get(i16);
                                i6Var2.d(i6Var2.f23538i, i6Var2.f23539j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f26567c.size(); i17++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26567c.get(i17);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23536f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, i7.f6.e(-2, -1, 51));
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f32779b;

                {
                    this.f32779b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = r2;
                    ThemeEditorView.EditorAlert editorAlert = this.f32779b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            return;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26575m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26565a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26566b = null;
                            return;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i16 = 0; i16 < themeEditorView2.f26567c.size(); i16++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26567c.get(i16);
                                i6Var2.d(i6Var2.f23538i, i6Var2.f23539j[0], true);
                            }
                            editorAlert.K(false);
                            return;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.f26567c.size(); i17++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26567c.get(i17);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23536f), true, true);
                            }
                            editorAlert.K(false);
                            return;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            return;
                    }
                }
            });
        }

        public static int I(EditorAlert editorAlert) {
            v01 v01Var = editorAlert.f26577c;
            if (v01Var.getChildCount() != 0) {
                int i10 = 0;
                View childAt = v01Var.getChildAt(0);
                vk0 vk0Var = (vk0) v01Var.G(childAt);
                if (vk0Var != null) {
                    int paddingTop = v01Var.getPaddingTop();
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
            v01 v01Var = editorAlert.f26577c;
            if (v01Var.getChildCount() > 0 && v01Var.getVisibility() == 0 && !editorAlert.D) {
                int i10 = 0;
                View childAt = v01Var.getChildAt(0);
                vk0 vk0Var = (vk0) v01Var.G(childAt);
                if (v01Var.getVisibility() == 0 && !editorAlert.D) {
                    paddingTop = childAt.getTop() - AndroidUtilities.dp(8.0f);
                } else {
                    paddingTop = v01Var.getPaddingTop();
                }
                if (paddingTop > (-AndroidUtilities.dp(1.0f)) && vk0Var != null && vk0Var.b() == 0) {
                    editorAlert.J(false);
                    i10 = paddingTop;
                } else {
                    editorAlert.J(true);
                }
                if (editorAlert.A != i10) {
                    editorAlert.setScrollOffsetY(i10);
                }
            }
        }

        public final void J(boolean z10) {
            Integer num;
            float f9;
            View[] viewArr = this.f26583w;
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
                AnimatorSet[] animatorSetArr = this.f26584x;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                View view2 = viewArr[0];
                Property property = View.ALPHA;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f9));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].addListener(new x01(this, z10));
                animatorSetArr[0].start();
            }
        }

        public final void K(boolean z10) {
            ?? r6;
            hz hzVar = this.f26578e;
            View[] viewArr = this.f26583w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f26582s;
            FrameLayout frameLayout3 = this.v;
            b11 b11Var = this.f26576b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            v01 v01Var = this.f26577c;
            if (z10) {
                this.D = true;
                b11Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                b11Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.C = this.A;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(b11Var, property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, property, 1.0f), ObjectAnimator.ofFloat(v01Var, property, 0.0f), ObjectAnimator.ofFloat(frameLayout, property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], property, 0.0f), ObjectAnimator.ofFloat(hzVar, property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", v01Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f26571i);
                animatorSet.addListener(new y01(this));
                animatorSet.start();
                return;
            }
            Activity activity = themeEditorView.f26566b;
            if (activity != null) {
                r6 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r6 = 0;
            }
            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26575m, r6, r6, r6);
            if (v01Var.getAdapter() == this.f26580n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.D = true;
            v01Var.setVisibility(r6);
            frameLayout2.setVisibility(r6);
            this.f26579f.setVisibility(r6);
            v01Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float f9 = 0.0f;
            float[] fArr = new float[1];
            fArr[r6] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b11Var, property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r6] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r6] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(v01Var, property2, fArr3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, property2, 1.0f);
            View view = viewArr[0];
            if (view.getTag() == null) {
                f9 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f9), ObjectAnimator.ofFloat(hzVar, property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.C));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.f26571i);
            animatorSet2.addListener(new z01(this));
            animatorSet2.start();
            v01Var.getAdapter().m(themeEditorView.d);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            h11 h11Var = this.f26579f;
            if (h11Var.f29033b.isFocused()) {
                AndroidUtilities.hideKeyboard(h11Var.f29033b);
            }
        }

        public int getScrollOffsetY() {
            return this.A;
        }

        public void setScrollOffsetY(int i10) {
            this.A = i10;
            this.f26577c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.A);
            this.f26576b.setTranslationY(this.A);
            this.f26578e.setTranslationY(this.A);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z10, int i10, float f9, int i11) {
        int i12;
        int round;
        if (z10) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        int i13 = i12 - i11;
        if (i10 == 0) {
            round = AndroidUtilities.dp(10.0f);
        } else if (i10 == 1) {
            round = i13 - AndroidUtilities.dp(10.0f);
        } else {
            round = Math.round((i13 - AndroidUtilities.dp(20.0f)) * f9) + AndroidUtilities.dp(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a() {
        q01 q01Var;
        this.f26573k.getClass();
        if (this.f26566b != null && (q01Var = this.f26565a) != null) {
            try {
                this.h.removeViewImmediate(q01Var);
                this.f26565a = null;
            } catch (Exception e10) {
                FileLog.e((Throwable) e10, false);
            }
            try {
                EditorAlert editorAlert = this.f26574l;
                if (editorAlert != null) {
                    editorAlert.dismiss();
                    this.f26574l = null;
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            this.f26566b = null;
            f26564n = null;
        }
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        if (f26564n != null) {
            f26564n.a();
        }
        this.f26575m = f6Var;
        this.f26565a = new q01(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f26572j = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f26572j.getInt("sidey", 0);
        float f9 = this.f26572j.getFloat("px", 0.0f);
        float f10 = this.f26572j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f26570g = layoutParams;
            int i12 = this.f26568e;
            layoutParams.width = i12;
            layoutParams.height = this.f26569f;
            layoutParams.x = b(true, i10, f9, i12);
            this.f26570g.y = b(false, i11, f10, this.f26569f);
            WindowManager.LayoutParams layoutParams2 = this.f26570g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.f26565a, layoutParams2);
            this.h.addView(this.f26565a, this.f26570g);
            this.f26573k = new g81(activity, null, new r01(this));
            f26564n = this;
            this.f26566b = activity;
            d();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void d() {
        this.f26565a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26565a, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26565a, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26565a, View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f26571i);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f26570g.x;
    }

    public int getY() {
        return this.f26570g.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f26570g;
        layoutParams.x = i10;
        this.h.updateViewLayout(this.f26565a, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f26570g;
        layoutParams.y = i10;
        this.h.updateViewLayout(this.f26565a, layoutParams);
    }
}
