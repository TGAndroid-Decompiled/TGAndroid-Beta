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
import org.telegram.ui.LaunchActivity;

public class ThemeEditorView {

    public static volatile ThemeEditorView f26549n;

    public g01 f26550a;

    public Activity f26551b;

    public ArrayList f26552c;
    public int d;

    public final int f26553e = AndroidUtilities.dp(54.0f);

    public final int f26554f = AndroidUtilities.dp(54.0f);

    public WindowManager.LayoutParams f26555g;
    public WindowManager h;

    public DecelerateInterpolator f26556i;

    public SharedPreferences f26557j;

    public w71 f26558k;

    public EditorAlert f26559l;

    public org.telegram.ui.ActionBar.f6 f26560m;

    public class EditorAlert extends org.telegram.ui.ActionBar.e3 {
        public static final int I = 0;
        public int A;
        public int B;
        public int C;
        public boolean D;
        public AnimatorSet E;
        public boolean F;
        public boolean G;

        public final r01 f26561b;

        public final l01 f26562c;
        public final FrameLayout d;

        public final az f26563e;

        public final x01 f26564f;
        public final f2.k0 h;

        public final s01 f26565n;

        public final t01 f26566r;

        public final FrameLayout f26567s;
        public final FrameLayout v;

        public final View[] f26568w;

        public final AnimatorSet[] f26569x;

        public final Drawable f26570y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.f26568w = new View[2];
            this.f26569x = new AnimatorSet[2];
            this.f26570y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            k01 k01Var = new k01(this, context);
            this.containerView = k01Var;
            k01Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            x01 x01Var = new x01(this, context);
            this.f26564f = x01Var;
            frameLayout.addView(x01Var, h7.z5.e(-1, -1, 51));
            l01 l01Var = new l01(this, context);
            this.f26562c = l01Var;
            l01Var.setSelectorDrawableColor(251658240);
            l01Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            l01Var.setClipToPadding(false);
            getContext();
            f2.k0 k0Var = new f2.k0();
            this.h = k0Var;
            l01Var.setLayoutManager(k0Var);
            l01Var.setHorizontalScrollBarEnabled(false);
            l01Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(l01Var, h7.z5.e(-1, -1, 51));
            s01 s01Var = new s01();
            s01Var.d = new ArrayList();
            s01Var.f32289c = context;
            HashMap map = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) arrayList.get(i11);
                int i12 = i6Var.f23517f;
                ArrayList arrayList2 = (ArrayList) map.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i12), arrayList2);
                    s01Var.d.add(arrayList2);
                }
                arrayList2.add(i6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.g6.f22999a7;
                if (!map.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i13));
                    s01Var.d.add(arrayList3);
                }
            }
            this.f26565n = s01Var;
            l01Var.setAdapter(s01Var);
            this.f26566r = new t01(this, context);
            this.f26562c.setGlowColor(-657673);
            this.f26562c.setItemAnimator(null);
            this.f26562c.setLayoutAnimation(null);
            this.f26562c.setOnItemClickListener(new j(this, 18));
            this.f26562c.setOnScrollListener(new m01(this));
            az azVar = new az(context, null);
            this.f26563e = azVar;
            azVar.setShowAtCenter(true);
            azVar.c();
            azVar.setText(LocaleController.getString(R.string.NoResult));
            this.f26562c.setEmptyView(azVar);
            this.containerView.addView(azVar, h7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.f26568w[0] = new View(context);
            this.f26568w[0].setBackgroundColor(301989888);
            this.f26568w[0].setAlpha(0.0f);
            this.f26568w[0].setTag(1);
            this.containerView.addView(this.f26568w[0], layoutParams);
            this.containerView.addView(this.d, h7.z5.e(-1, 58, 51));
            r01 r01Var = new r01(this, context);
            this.f26561b = r01Var;
            r01Var.setVisibility(8);
            this.containerView.addView(r01Var, h7.z5.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f26568w[1] = new View(context);
            this.f26568w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.f26568w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f26567s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, h7.z5.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, h7.z5.e(-2, -1, 51));
            final int i14 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) {

                public final ThemeEditorView.EditorAlert f29534b;

                {
                    this.f29534b = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    int i15 = i14;
                    ThemeEditorView.EditorAlert editorAlert = this.f29534b;
                    switch (i15) {
                        case 0:
                            int i16 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26560m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26550a);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26551b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView2.f26552c.size(); i17++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26552c.get(i17);
                                i6Var2.d(i6Var2.f23519i, i6Var2.f23520j[0], true);
                            }
                            editorAlert.L(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.f26552c.size(); i18++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26552c.get(i18);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23517f), true, true);
                            }
                            editorAlert.L(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.I;
                            editorAlert.L(false);
                            break;
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
            frameLayout2.addView(textView2, h7.z5.e(-2, -1, 53));
            final int i15 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) {

                public final ThemeEditorView.EditorAlert f29534b;

                {
                    this.f29534b = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    int i16 = i15;
                    ThemeEditorView.EditorAlert editorAlert = this.f29534b;
                    switch (i16) {
                        case 0:
                            int i17 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26560m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26550a);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26551b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView2.f26552c.size(); i18++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26552c.get(i18);
                                i6Var2.d(i6Var2.f23519i, i6Var2.f23520j[0], true);
                            }
                            editorAlert.L(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i19 = 0; i19 < themeEditorView3.f26552c.size(); i19++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26552c.get(i19);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23517f), true, true);
                            }
                            editorAlert.L(false);
                            break;
                        default:
                            int i110 = ThemeEditorView.EditorAlert.I;
                            editorAlert.L(false);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, h7.z5.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, h7.z5.e(-2, -1, 51));
            final int i16 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) {

                public final ThemeEditorView.EditorAlert f29534b;

                {
                    this.f29534b = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    int i17 = i16;
                    ThemeEditorView.EditorAlert editorAlert = this.f29534b;
                    switch (i17) {
                        case 0:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26560m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26550a);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26551b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i19 = 0; i19 < themeEditorView2.f26552c.size(); i19++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26552c.get(i19);
                                i6Var2.d(i6Var2.f23519i, i6Var2.f23520j[0], true);
                            }
                            editorAlert.L(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i110 = 0; i110 < themeEditorView3.f26552c.size(); i110++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26552c.get(i110);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23517f), true, true);
                            }
                            editorAlert.L(false);
                            break;
                        default:
                            int i111 = ThemeEditorView.EditorAlert.I;
                            editorAlert.L(false);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, h7.z5.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, h7.z5.e(-2, -1, 51));
            final int i17 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) {

                public final ThemeEditorView.EditorAlert f29534b;

                {
                    this.f29534b = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    int i18 = i17;
                    ThemeEditorView.EditorAlert editorAlert = this.f29534b;
                    switch (i18) {
                        case 0:
                            int i19 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26560m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26550a);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26551b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i110 = 0; i110 < themeEditorView2.f26552c.size(); i110++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26552c.get(i110);
                                i6Var2.d(i6Var2.f23519i, i6Var2.f23520j[0], true);
                            }
                            editorAlert.L(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i111 = 0; i111 < themeEditorView3.f26552c.size(); i111++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26552c.get(i111);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23517f), true, true);
                            }
                            editorAlert.L(false);
                            break;
                        default:
                            int i112 = ThemeEditorView.EditorAlert.I;
                            editorAlert.L(false);
                            break;
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
            linearLayout.addView(textView5, h7.z5.e(-2, -1, 51));
            final int i18 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) {

                public final ThemeEditorView.EditorAlert f29534b;

                {
                    this.f29534b = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    int i19 = i18;
                    ThemeEditorView.EditorAlert editorAlert = this.f29534b;
                    switch (i19) {
                        case 0:
                            int i110 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26560m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.f26550a);
                                break;
                            } catch (Exception unused) {
                            }
                            themeEditorView.f26551b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i111 = 0; i111 < themeEditorView2.f26552c.size(); i111++) {
                                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) themeEditorView2.f26552c.get(i111);
                                i6Var2.d(i6Var2.f23519i, i6Var2.f23520j[0], true);
                            }
                            editorAlert.L(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i112 = 0; i112 < themeEditorView3.f26552c.size(); i112++) {
                                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) themeEditorView3.f26552c.get(i112);
                                i6Var3.d(org.telegram.ui.ActionBar.g6.C0(i6Var3.f23517f), true, true);
                            }
                            editorAlert.L(false);
                            break;
                        default:
                            int i113 = ThemeEditorView.EditorAlert.I;
                            editorAlert.L(false);
                            break;
                    }
                }
            });
        }

        public static int J(EditorAlert editorAlert) {
            l01 l01Var = editorAlert.f26562c;
            if (l01Var.getChildCount() == 0) {
                return -1000;
            }
            int top = 0;
            View childAt = l01Var.getChildAt(0);
            lk0 lk0Var = (lk0) l01Var.G(childAt);
            if (lk0Var == null) {
                return -1000;
            }
            int paddingTop = l01Var.getPaddingTop();
            if (lk0Var.b() == 0 && childAt.getTop() >= 0) {
                top = childAt.getTop();
            }
            return paddingTop - top;
        }

        public static void t(EditorAlert editorAlert) {
            l01 l01Var = editorAlert.f26562c;
            if (l01Var.getChildCount() <= 0 || l01Var.getVisibility() != 0 || editorAlert.D) {
                return;
            }
            int i10 = 0;
            View childAt = l01Var.getChildAt(0);
            lk0 lk0Var = (lk0) l01Var.G(childAt);
            int paddingTop = (l01Var.getVisibility() != 0 || editorAlert.D) ? l01Var.getPaddingTop() : childAt.getTop() - AndroidUtilities.dp(8.0f);
            if (paddingTop <= (-AndroidUtilities.dp(1.0f)) || lk0Var == null || lk0Var.b() != 0) {
                editorAlert.K(true);
            } else {
                editorAlert.K(false);
                i10 = paddingTop;
            }
            if (editorAlert.A != i10) {
                editorAlert.setScrollOffsetY(i10);
            }
        }

        public final void K(boolean z10) {
            View[] viewArr = this.f26568w;
            if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
                return;
            }
            viewArr[0].setTag(z10 ? null : 1);
            if (z10) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.f26569x;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new n01(this, z10));
            animatorSetArr[0].start();
        }

        public final void L(boolean z10) {
            ?? r10;
            az azVar = this.f26563e;
            View[] viewArr = this.f26568w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.f26567s;
            FrameLayout frameLayout3 = this.v;
            r01 r01Var = this.f26561b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            l01 l01Var = this.f26562c;
            if (z10) {
                this.D = true;
                r01Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                r01Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.C = this.A;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(r01Var, (Property<r01, Float>) property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(l01Var, (Property<l01, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(azVar, (Property<az, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", l01Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.f26556i);
                animatorSet.addListener(new o01(this));
                animatorSet.start();
                return;
            }
            Activity activity = themeEditorView.f26551b;
            if (activity != null) {
                r10 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r10 = 0;
            }
            org.telegram.ui.ActionBar.g6.r1(themeEditorView.f26560m, r10, r10, r10);
            if (l01Var.getAdapter() == this.f26565n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.D = true;
            l01Var.setVisibility(r10);
            frameLayout2.setVisibility(r10);
            this.f26564f.setVisibility(r10);
            l01Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r10] = 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(r01Var, (Property<r01, Float>) property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r10] = 0.0f;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r10] = 1.0f;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(l01Var, (Property<l01, Float>) property2, fArr3);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 1.0f);
            View view = viewArr[0];
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, view.getTag() == null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(azVar, (Property<az, Float>) property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.C));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.f26556i);
            animatorSet2.addListener(new p01(this));
            animatorSet2.start();
            l01Var.getAdapter().m(themeEditorView.d);
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            x01 x01Var = this.f26564f;
            if (x01Var.f34413b.isFocused()) {
                AndroidUtilities.hideKeyboard(x01Var.f34413b);
            }
        }

        public int getScrollOffsetY() {
            return this.A;
        }

        public void setScrollOffsetY(int i10) {
            this.A = i10;
            this.f26562c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.A);
            this.f26561b.setTranslationY(this.A);
            this.f26563e.setTranslationY(this.A);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z10, int i10, float f10, int i11) {
        int i12;
        int iDp;
        if (z10) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i13 = i12 - i11;
        if (i10 == 0) {
            iDp = AndroidUtilities.dp(10.0f);
        } else {
            iDp = i10 == 1 ? i13 - AndroidUtilities.dp(10.0f) : Math.round((i13 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        }
        return !z10 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + iDp : iDp;
    }

    public final void a() {
        g01 g01Var;
        this.f26558k.getClass();
        if (this.f26551b == null || (g01Var = this.f26550a) == null) {
            return;
        }
        try {
            this.h.removeViewImmediate(g01Var);
            this.f26550a = null;
        } catch (Exception e9) {
            FileLog.e((Throwable) e9, false);
        }
        try {
            EditorAlert editorAlert = this.f26559l;
            if (editorAlert != null) {
                editorAlert.dismiss();
                this.f26559l = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f26551b = null;
        f26549n = null;
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        if (f26549n != null) {
            f26549n.a();
        }
        this.f26560m = f6Var;
        this.f26550a = new g01(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.f26557j = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f26557j.getInt("sidey", 0);
        float f10 = this.f26557j.getFloat("px", 0.0f);
        float f11 = this.f26557j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f26555g = layoutParams;
            int i12 = this.f26553e;
            layoutParams.width = i12;
            layoutParams.height = this.f26554f;
            layoutParams.x = b(true, i10, f10, i12);
            this.f26555g.y = b(false, i11, f11, this.f26554f);
            WindowManager.LayoutParams layoutParams2 = this.f26555g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.f26550a, layoutParams2);
            this.h.addView(this.f26550a, this.f26555g);
            this.f26558k = new w71(activity, null, new h01(this));
            f26549n = this;
            this.f26551b = activity;
            d();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void d() {
        this.f26550a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26550a, (Property<g01, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26550a, (Property<g01, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f26550a, (Property<g01, Float>) View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.f26556i);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.f26555g.x;
    }

    public int getY() {
        return this.f26555g.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f26555g;
        layoutParams.x = i10;
        this.h.updateViewLayout(this.f26550a, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f26555g;
        layoutParams.y = i10;
        this.h.updateViewLayout(this.f26550a, layoutParams);
    }
}
