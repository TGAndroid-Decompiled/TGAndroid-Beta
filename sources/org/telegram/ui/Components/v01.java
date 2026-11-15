package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;
public final class v01 extends FrameLayout implements org.telegram.messenger.is {
    public static final int f40207n0 = 0;
    public final FrameLayout E;
    public final View F;
    public final View G;
    public int H;
    public int I;
    public int J;
    public ValueAnimator K;
    public long L;
    public String M;
    public final ArrayList N;
    public int O;
    public hh0 P;
    public final org.telegram.ui.b61 Q;
    public final di.i4 R;
    public final ArrayList S;
    public float T;
    public ValueAnimator U;
    public boolean V;
    public float W;
    public final int f40208a;
    public float f40209a0;
    public final long f40210b;
    public boolean f40211b0;
    public final boolean f40212c;
    public boolean f40213c0;
    public final boolean d;
    public float f40214d0;
    public final org.telegram.ui.ActionBar.e6 f40215e;
    public VelocityTracker f40216e0;
    public final org.telegram.ui.dk f40217f;
    public boolean f40218f0;
    public ValueAnimator f40219g0;
    public final bi.v1 h;
    public final TextPaint f40220h0;
    public final HashMap f40221i0;
    public final TextPaint f40222j0;
    public final TextPaint f40223k0;
    public final TextPaint f40224l0;
    public final TextPaint m0;
    public final ImageView f40225n;
    public final uj0 f40226r;
    public final q01 f40227s;
    public final EditText f40228w;
    public final Paint f40229x;
    public float f40230y;

    public v01(Activity activity, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, final org.telegram.ui.dk dkVar) {
        super(activity);
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        String str;
        String M0;
        TLRPC.Chat chat;
        TLRPC.User user;
        this.f40229x = new Paint();
        this.H = -1;
        this.J = org.telegram.messenger.g0.L(288.0f);
        this.M = "";
        this.N = new ArrayList();
        this.S = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.f40220h0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f40221i0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.f40222j0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f40223k0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.f40224l0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.m0 = textPaint5;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint5.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        this.f40208a = i7;
        this.f40210b = j3;
        this.f40215e = e6Var;
        this.f40217f = dkVar;
        TLRPC.Chat M02 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
        boolean p02 = org.telegram.messenger.t3.p0(M02);
        this.f40212c = p02;
        if (j3 == org.telegram.messenger.m10.i(i7).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        setWillNotDraw(false);
        bi.v1 v1Var = new bi.v1(activity, 24);
        this.h = v1Var;
        v1Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        v1Var.setOutlineProvider(new bg.p0(16));
        v1Var.setClipToOutline(true);
        v1Var.setOnTouchListener(new gi.a(26));
        addView(v1Var, c8.ja.e(288, -1, 53));
        int i11 = org.telegram.messenger.g0.f23603m;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        i9 i9Var = new i9(activity);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        if (z10) {
            t8Var.g(1);
            t8Var.f39600p = 0.75f;
            i9Var.setImageDrawable(t8Var);
            String M03 = org.telegram.messenger.hd.M0(2131745901, null);
            i10 = i11;
            M0 = org.telegram.messenger.hd.G(s12.G1().f26740j.size(), "Chats", new Object[0]);
            z11 = p02;
            z12 = z10;
            str = M03;
        } else {
            i10 = i11;
            if (p02) {
                z11 = p02;
                z12 = z10;
                if (M02 != null) {
                    chat = s12.M0(Long.valueOf(M02.linked_monoforum_id));
                } else {
                    chat = null;
                }
                chat = chat == null ? M02 : chat;
                if (chat == null) {
                    str = "";
                } else {
                    t8Var.q(chat);
                    i9Var.f(chat, t8Var);
                    str = chat.title;
                }
                M0 = org.telegram.messenger.hd.M0(2131743983, null);
            } else {
                z11 = p02;
                z12 = z10;
                if (M02 != null) {
                    t8Var.q(M02);
                    i9Var.f(M02, t8Var);
                    str = M02.title;
                    TLRPC.ChatFull N0 = s12.N0(M02.f28051id);
                    int i12 = (N0 == null || (i12 = N0.participants_count) <= 0) ? M02.participants_count : i12;
                    if (i12 > 0) {
                        M0 = org.telegram.messenger.hd.H(',', "Members", i12);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131743994, null);
                    }
                } else {
                    TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                    if (a22 == null) {
                        str = "";
                    } else {
                        t8Var.r(a22);
                        i9Var.f(a22, t8Var);
                        str = org.telegram.messenger.q10.p(a22);
                    }
                    M0 = org.telegram.messenger.hd.M0(2131743994, null);
                }
            }
        }
        m01 m01Var = new m01(activity, 0);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        boolean z13 = z11;
        boolean z14 = z12;
        m01Var.setBackground(org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i13, e6Var)), 24, 24));
        m01Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i14 = r2;
                org.telegram.ui.dk dkVar2 = dkVar;
                switch (i14) {
                    case 0:
                        org.telegram.ui.an anVar = dkVar2.f46415a;
                        anVar.f45289n0.d();
                        if (anVar.Z9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", anVar.getUserConfig().e());
                            anVar.presentFragment(new x80(bundle, null));
                            return;
                        } else if (org.telegram.messenger.t3.p0(anVar.f45173e)) {
                            anVar.presentFragment(ProfileActivity.C4(-anVar.f45173e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = anVar.f45173e;
                            if (chat2 != null) {
                                anVar.presentFragment(ProfileActivity.C4(-chat2.f28051id));
                                return;
                            }
                            TLRPC.User user2 = anVar.f45187f;
                            if (user2 != null) {
                                anVar.presentFragment(ProfileActivity.C4(user2.f28200id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.an anVar2 = dkVar2.f46415a;
                        org.telegram.ui.ActionBar.q0 q0Var = anVar2.f45240j0;
                        if (q0Var != null && anVar2.f45289n0 != null) {
                            q0Var.z();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.k();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.f45240j0.getPopupLayout();
                            m60 I = m60.I(anVar2, view);
                            boolean z15 = true;
                            for (int i15 = 0; i15 < popupLayout.getItemsCount(); i15++) {
                                View childAt = popupLayout.M.getChildAt(i15);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z15) {
                                            I.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        if (z0Var.getIconResId() == 0) {
                                            drawable = z0Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) {
                                            drawable2 = new ch0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.o0 o0Var = anVar2.f45366t1;
                                        if (o0Var != null && z0Var == o0Var.f29429j) {
                                            if (anVar2.getMessagesController().r2(anVar2.f45259k6, anVar2.b(), null)) {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.ye(anVar2, 16), false);
                                            } else {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.u5(19, anVar2, I), false);
                                            }
                                        } else if (z0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) z0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            I.b(z0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.oe(anVar2, intValue, 4));
                                            if (drawable3 instanceof ch0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                    if (z0Var2.getImageView() instanceof fh0) {
                                                        fh0 fh0Var = (fh0) z0Var2.getImageView();
                                                        fh0Var.setAnimation((ch0) drawable3);
                                                        fh0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.fq0(z0Var, 26));
                                        }
                                        z15 = false;
                                    }
                                }
                            }
                            I.V(5);
                            I.a0(0.0f, -view.getHeight());
                            I.Z();
                            return;
                        }
                        return;
                }
            }
        });
        v1Var.addView(m01Var, c8.ja.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        m01Var.addView(i9Var, c8.ja.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        int w02 = org.telegram.ui.ActionBar.j6.w0(i13, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i13, e6Var)), 1, -1));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i14 = r2;
                org.telegram.ui.dk dkVar2 = dkVar;
                switch (i14) {
                    case 0:
                        org.telegram.ui.an anVar = dkVar2.f46415a;
                        anVar.f45289n0.d();
                        if (anVar.Z9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", anVar.getUserConfig().e());
                            anVar.presentFragment(new x80(bundle, null));
                            return;
                        } else if (org.telegram.messenger.t3.p0(anVar.f45173e)) {
                            anVar.presentFragment(ProfileActivity.C4(-anVar.f45173e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = anVar.f45173e;
                            if (chat2 != null) {
                                anVar.presentFragment(ProfileActivity.C4(-chat2.f28051id));
                                return;
                            }
                            TLRPC.User user2 = anVar.f45187f;
                            if (user2 != null) {
                                anVar.presentFragment(ProfileActivity.C4(user2.f28200id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.an anVar2 = dkVar2.f46415a;
                        org.telegram.ui.ActionBar.q0 q0Var = anVar2.f45240j0;
                        if (q0Var != null && anVar2.f45289n0 != null) {
                            q0Var.z();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.k();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.f45240j0.getPopupLayout();
                            m60 I = m60.I(anVar2, view);
                            boolean z15 = true;
                            for (int i15 = 0; i15 < popupLayout.getItemsCount(); i15++) {
                                View childAt = popupLayout.M.getChildAt(i15);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z15) {
                                            I.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        if (z0Var.getIconResId() == 0) {
                                            drawable = z0Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) {
                                            drawable2 = new ch0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.o0 o0Var = anVar2.f45366t1;
                                        if (o0Var != null && z0Var == o0Var.f29429j) {
                                            if (anVar2.getMessagesController().r2(anVar2.f45259k6, anVar2.b(), null)) {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.ye(anVar2, 16), false);
                                            } else {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.u5(19, anVar2, I), false);
                                            }
                                        } else if (z0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) z0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            I.b(z0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.oe(anVar2, intValue, 4));
                                            if (drawable3 instanceof ch0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                    if (z0Var2.getImageView() instanceof fh0) {
                                                        fh0 fh0Var = (fh0) z0Var2.getImageView();
                                                        fh0Var.setAnimation((ch0) drawable3);
                                                        fh0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.fq0(z0Var, 26));
                                        }
                                        z15 = false;
                                    }
                                }
                            }
                            I.V(5);
                            I.a0(0.0f, -view.getHeight());
                            I.Z();
                            return;
                        }
                        return;
                }
            }
        });
        v1Var.addView(imageView, c8.ja.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.f40225n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        m01Var.addView(textView, c8.ja.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.j6.f29241y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(i14, e6Var));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        m01Var.addView(textView2, c8.ja.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new n01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(2131232487);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), mode));
        frameLayout.addView(imageView2, c8.ja.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.f40228w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.hd.M0(2131745836, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(i14, e6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
        editText.addTextChangedListener(new ah.j(this, 27));
        frameLayout.addView(editText, c8.ja.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        v1Var.addView(frameLayout, c8.ja.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        uj0 uj0Var = new uj0(activity, e6Var);
        this.f40226r = uj0Var;
        uj0Var.setLayoutManager(new v4.b0());
        uj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        uj0Var.setClipToPadding(false);
        uj0Var.setVerticalScrollBarEnabled(false);
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        er erVar = er.h;
        kVar.f58612i = erVar;
        kVar.n(350L);
        kVar.d = 160L;
        uj0Var.setItemAnimator(kVar);
        uj0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        uj0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i13, e6Var)));
        q01 q01Var = new q01(this);
        this.f40227s = q01Var;
        uj0Var.setAdapter(q01Var);
        uj0Var.setOnItemClickListener(new fi.i4(14, this, dkVar));
        uj0Var.setOnItemLongClickListener((ij0) new f1(23, this, dkVar));
        uj0Var.j(new o01(this, i7, j3));
        v1Var.addView(uj0Var, c8.ja.f(-1.0f, -1, 119, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(7, activity, e6Var);
        this.Q = b61Var;
        b61Var.setLayoutManager(new v4.b0(0, false));
        b61Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        b61Var.setClipToPadding(false);
        b61Var.setHorizontalScrollBarEnabled(false);
        b61Var.setOverScrollMode(2);
        v4.k kVar2 = new v4.k();
        kVar2.f58564m = false;
        kVar2.C = false;
        kVar2.o(erVar);
        kVar2.n(320L);
        b61Var.setItemAnimator(kVar2);
        di.i4 i4Var = new di.i4(this, 5);
        this.R = i4Var;
        b61Var.setAdapter(i4Var);
        b61Var.setOnItemClickListener(new j(this, 19));
        b61Var.setVisibility(8);
        v1Var.addView(b61Var, c8.ja.f(36.0f, -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        int i15 = org.telegram.ui.ActionBar.j6.f28849d6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(i15, e6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        v1Var.addView(view, c8.ja.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        v1Var.addView(view2, c8.ja.e(-1, 24, 87));
        this.F = view;
        i();
        if (j3 > 0) {
            user = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3));
        } else {
            user = null;
        }
        if (!z13 && !z14 && ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.q10.v(user))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(25.0f));
            gradientDrawable.setColor(i0.a.o(w03, 224));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(org.telegram.messenger.g0.L(2.0f));
            frameLayout2.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i16 = org.telegram.ui.ActionBar.j6.Ji;
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(i16, e6Var));
            textView3.setText(org.telegram.messenger.hd.M0(2131748251, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(2131231177).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i16, e6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var)));
            c8.na.a(textView3);
            textView3.setOnClickListener(new vv0(3, this, dkVar));
            frameLayout2.addView(textView3, c8.ja.c(44.0f, -2));
            v1Var.addView(frameLayout2, c8.ja.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        v1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(i15, e6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.J + this.I;
    }

    private void setTagsShown(boolean z10) {
        float f10;
        if (this.f40218f0 == z10) {
            return;
        }
        this.f40218f0 = z10;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        float f11 = this.T;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new j01(this, 1));
        this.U.addListener(new l01(this, 0));
        this.U.setDuration(320L);
        this.U.setInterpolator(er.h);
        this.U.start();
    }

    public final void a(float f10, float f11) {
        long j3;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        float f12 = this.f40230y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new j01(this, 2));
        this.K.addListener(new l01(this, 2));
        float abs = Math.abs(f10 - this.f40230y) * getPanelWidth();
        if (Math.abs(f11) > org.telegram.messenger.g0.L(300.0f)) {
            j3 = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f11)) * 1000.0f * 2.0f));
        } else {
            j3 = 320;
        }
        this.K.setDuration(j3);
        this.K.setInterpolator(er.h);
        this.K.start();
    }

    public final void b(float f10) {
        org.telegram.ui.b61 b61Var = this.Q;
        int childCount = b61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = b61Var.getChildAt(i7);
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f10);
            childAt.setScaleX(T1);
            childAt.setScaleY(T1);
            childAt.setAlpha(f10);
        }
    }

    public final void c() {
        hh0 hh0Var = this.P;
        if (hh0Var != null) {
            org.telegram.messenger.g0.r(hh0Var);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.f40208a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    public final void d() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.f40228w);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25558q5) {
            if (((Long) objArr[0]).longValue() == (-this.f40210b)) {
                h();
            }
        } else if (i7 == org.telegram.messenger.ns.f25559r) {
            h();
        } else if (i7 == org.telegram.messenger.ns.f25501g3) {
            if (this.d) {
                h();
            }
        } else if (i7 == org.telegram.messenger.ns.f25514i4) {
            org.telegram.messenger.g0.d0(this.f40226r, new pg.c(0));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.j6.r1(this.f40230y, 687865856);
        Paint paint = this.f40229x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.dk dkVar = this.f40217f;
        if (dkVar != null && this.f40230y > 0.0f) {
            org.telegram.ui.an.N2(dkVar.f46415a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        int i7 = 0;
        this.V = false;
        if (this.f40230y <= 0.0f) {
            i7 = 8;
        }
        setVisibility(i7);
        return dispatchTouchEvent;
    }

    public final TLObject e(s01 s01Var) {
        long o4;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.f40208a);
        org.telegram.messenger.sv svVar = s01Var.f39135b;
        if (svVar != null) {
            o4 = svVar.f26569a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = s01Var.f39134a;
            if (tL_forumTopic != null && this.f40212c) {
                o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            } else {
                return null;
            }
        }
        if (o4 >= 0) {
            return s12.a2(Long.valueOf(o4));
        }
        return s12.M0(Long.valueOf(-o4));
    }

    public final String f(long j3) {
        int i7 = this.f40208a;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        if (j3 == org.telegram.messenger.m10.i(i7).e()) {
            return org.telegram.messenger.hd.M0(2131748303, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.hd.M0(2131754252, null);
        }
        if (j3 >= 0) {
            return org.telegram.messenger.q10.p(s12.a2(Long.valueOf(j3)));
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        if (M0 != null) {
            return M0.title;
        }
        return "";
    }

    public final boolean g(s01 s01Var) {
        String str;
        org.telegram.messenger.sv svVar = s01Var.f39135b;
        String str2 = "";
        if (svVar != null) {
            String f10 = f(svVar.f26569a);
            if (f10 != null) {
                str2 = f10.toString();
            }
        } else {
            TLObject e10 = e(s01Var);
            if (e10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.q10.p((TLRPC.User) e10);
            } else if (e10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) e10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = s01Var.f39134a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.M);
    }

    public int getContentWidth() {
        return this.J;
    }

    public float getProgress() {
        return this.f40230y;
    }

    public final void h() {
        boolean z10;
        ArrayList l10;
        String str;
        String str2;
        String str3;
        int visibility = getVisibility();
        q01 q01Var = this.f40227s;
        if (visibility != 0 && this.f40230y <= 0.0f && q01Var.f38458c.size() > 0) {
            return;
        }
        ArrayList arrayList = q01Var.f38458c;
        String str4 = q01Var.d;
        v01 v01Var = q01Var.f38459e;
        String str5 = v01Var.M;
        int i7 = v01Var.f40208a;
        boolean z11 = v01Var.d;
        int i10 = 0;
        if (TextUtils.equals(str4, str5) && v01Var.f40230y > 0.0f && !arrayList.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        q01Var.d = v01Var.M;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (z11) {
            l10 = null;
        } else {
            l10 = org.telegram.messenger.np.s1(i7).f25383r7.l(-v01Var.f40210b);
        }
        if (!z11) {
            di.i4 i4Var = v01Var.R;
            ArrayList arrayList3 = v01Var.S;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (l10 != null) {
                boolean z12 = org.telegram.messenger.r2.f26198a;
            }
            ArrayList arrayList4 = new ArrayList();
            for (r01 r01Var : linkedHashMap.values()) {
                r01Var.getClass();
            }
            str = null;
            if (arrayList4.size() < 2) {
                arrayList4.clear();
            }
            Collections.sort(arrayList4, new org.telegram.ui.me(18));
            if (arrayList4.size() <= 0) {
                ArrayList arrayList5 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                if (!arrayList5.isEmpty() && !arrayList4.isEmpty() && v01Var.T > 0.0f) {
                    v4.o.c(new p01(arrayList5, arrayList4), true).c(i4Var);
                } else {
                    i4Var.f();
                }
                v01Var.setTagsShown(!arrayList3.isEmpty());
            } else {
                ((r01) arrayList4.get(0)).getClass();
                throw null;
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(v01Var.M)) {
            arrayList.add(new s01(v01Var));
        }
        if (z11) {
            ArrayList arrayList6 = org.telegram.messenger.np.s1(i7).G1().f26740j;
            int size = arrayList6.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList6.get(i11);
                i11++;
                s01 s01Var = new s01(v01Var);
                s01Var.f39135b = (org.telegram.messenger.sv) obj;
                if (!TextUtils.isEmpty(v01Var.M) && !v01Var.g(s01Var)) {
                    TLObject e10 = v01Var.e(s01Var);
                    if (e10 instanceof TLRPC.User) {
                        str3 = org.telegram.messenger.q10.n((TLRPC.User) e10);
                    } else if (e10 instanceof TLRPC.Chat) {
                        str3 = org.telegram.messenger.t3.K((TLRPC.Chat) e10, false);
                    } else {
                        str3 = str;
                    }
                    if (str3 != null && str3.toLowerCase().contains(v01Var.M)) {
                    }
                }
                arrayList.add(s01Var);
            }
            if (!z10) {
                q01Var.f();
            } else {
                v4.o.c(new jg.g(q01Var, arrayList2, 3), true).c(q01Var);
            }
        } else {
            HashSet hashSet = new HashSet();
            if (l10 != null) {
                int size2 = l10.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = l10.get(i12);
                    i12++;
                    s01 s01Var2 = new s01(v01Var);
                    s01Var2.f39134a = (TLRPC.TL_forumTopic) obj2;
                    if (!TextUtils.isEmpty(v01Var.M) && !v01Var.g(s01Var2)) {
                        TLObject e11 = v01Var.e(s01Var2);
                        if (e11 instanceof TLRPC.User) {
                            str2 = org.telegram.messenger.q10.n((TLRPC.User) e11);
                        } else if (e11 instanceof TLRPC.Chat) {
                            str2 = org.telegram.messenger.t3.K((TLRPC.Chat) e11, false);
                        } else {
                            str2 = str;
                        }
                        if (str2 != null && str2.toLowerCase().contains(v01Var.M)) {
                        }
                    }
                    arrayList.add(s01Var2);
                    hashSet.add(Long.valueOf(s01Var2.a()));
                }
            }
            if (!TextUtils.isEmpty(v01Var.M)) {
                ArrayList arrayList7 = v01Var.N;
                int size3 = arrayList7.size();
                while (i10 < size3) {
                    Object obj3 = arrayList7.get(i10);
                    i10++;
                    s01 s01Var3 = new s01(v01Var);
                    s01Var3.f39134a = (TLRPC.TL_forumTopic) obj3;
                    if (hashSet.add(Long.valueOf(s01Var3.a()))) {
                        arrayList.add(s01Var3);
                    }
                }
            }
            if (!z10) {
                q01Var.f();
            } else {
                v4.o.c(new jg.g(q01Var, arrayList2, 3), true).c(q01Var);
            }
        }
        this.f40226r.post(new ro0(this, 20));
    }

    public final void i() {
        View view;
        View view2 = this.F;
        if (view2 != null && (view = this.G) != null) {
            uj0 uj0Var = this.f40226r;
            view2.setAlpha(Utilities.i(uj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            if (this.E != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((uj0Var.computeVerticalScrollRange() - uj0Var.computeVerticalScrollOffset()) - uj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f40208a;
        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.f25558q5);
        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.f25559r);
        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.f25501g3);
        org.telegram.messenger.ns.e().b(this, org.telegram.messenger.ns.f25514i4);
        h();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f40208a;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25558q5);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25559r);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25501g3);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
        c();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.W = motionEvent.getX();
            this.f40209a0 = motionEvent.getY();
            this.f40211b0 = false;
            this.f40213c0 = true;
            this.f40214d0 = this.f40230y;
            VelocityTracker velocityTracker = this.f40216e0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f40216e0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.f40213c0) {
            VelocityTracker velocityTracker2 = this.f40216e0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.W;
            float y10 = motionEvent.getY() - this.f40209a0;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.f40211b0 = true;
                this.W = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.k1 a10 = r0.b0.a(this);
        if (a10 != null) {
            i13 = a10.f55682a.f(2).d;
        } else {
            i13 = 0;
        }
        if (i13 != this.H) {
            this.H = i13;
            uj0 uj0Var = this.f40226r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                uj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                uj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.an anVar;
        org.telegram.ui.ActionBar.q0 o92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.k1 a10 = r0.b0.a(this);
        int i12 = 0;
        if (a10 != null) {
            i11 = org.telegram.messenger.g0.I0(a10, false).f15576c;
        } else {
            i11 = 0;
        }
        int i13 = this.I;
        bi.v1 v1Var = this.h;
        if (i11 != i13) {
            this.I = i11;
            v1Var.getLayoutParams().width = getPanelWidth();
            v1Var.setPadding(0, 0, i11, 0);
            v1Var.setTranslationX((1.0f - this.f40230y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.dk dkVar = this.f40217f;
        if (dkVar != null && (o92 = (anVar = dkVar.f46415a).o9()) != null) {
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            i12 = (int) ((kVar.getWidth() - ((o92.getWidth() / 2.0f) + (o92.getX() + ((View) o92.getParent()).getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.I) - i12));
        if (max != this.J) {
            this.J = max;
            v1Var.getLayoutParams().width = getPanelWidth();
            v1Var.setTranslationX((1.0f - this.f40230y) * getPanelWidth());
            this.f40227s.f();
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v01.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j3) {
        this.L = j3;
        this.f40227s.f();
    }

    public void setMenuAvailable(boolean z10) {
        int i7;
        ImageView imageView = this.f40225n;
        if (imageView != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public void setProgress(float f10) {
        boolean z10;
        int i7 = 0;
        if (this.f40230y <= 0.0f && f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40230y = Utilities.l(f10);
        if (z10 && this.Q != null) {
            ValueAnimator valueAnimator = this.f40219g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.f40218f0 && this.U == null) {
                b(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f40219g0 = ofFloat;
                ofFloat.addUpdateListener(new j01(this, 0));
                this.f40219g0.addListener(new l01(this, 1));
                this.f40219g0.setDuration(320L);
                this.f40219g0.setInterpolator(er.h);
                this.f40219g0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.f40230y) * getPanelWidth());
        if (this.f40230y <= 0.0f && !this.V) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
        org.telegram.ui.dk dkVar = this.f40217f;
        if (dkVar != null) {
            dkVar.f46415a.f45278m1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z10 = false;
        float f11 = 0.0f;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.f40230y > 0.5f : f10 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            h();
        }
        if (z10) {
            f11 = 1.0f;
        }
        a(f11, f10);
        if (!z10) {
            org.telegram.messenger.g0.v1(this.f40228w);
        }
    }
}
