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
public final class r01 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int f37452n0 = 0;
    public final FrameLayout D;
    public final View E;
    public final View F;
    public int G;
    public int H;
    public int I;
    public ValueAnimator J;
    public long K;
    public String L;
    public final ArrayList M;
    public int N;
    public v80 O;
    public final org.telegram.ui.e61 P;
    public final bi.k5 Q;
    public final ArrayList R;
    public String S;
    public float T;
    public ValueAnimator U;
    public boolean V;
    public float W;
    public final int f37453a;
    public float f37454a0;
    public final long f37455b;
    public boolean f37456b0;
    public final boolean f37457c;
    public boolean f37458c0;
    public final boolean d;
    public float f37459d0;
    public final org.telegram.ui.ActionBar.f6 f37460e;
    public VelocityTracker f37461e0;
    public final org.telegram.ui.dk f37462f;
    public boolean f37463f0;
    public ValueAnimator f37464g0;
    public final di.a4 h;
    public final TextPaint f37465h0;
    public final HashMap f37466i0;
    public final TextPaint f37467j0;
    public final TextPaint f37468k0;
    public final TextPaint f37469l0;
    public final TextPaint m0;
    public final ImageView f37470n;
    public final pj0 f37471r;
    public final m01 f37472s;
    public final EditText f37473w;
    public final Paint f37474x;
    public float f37475y;

    public r01(Activity activity, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, final org.telegram.ui.dk dkVar) {
        super(activity);
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        String str;
        String M0;
        TLRPC.Chat chat;
        TLRPC.User user;
        this.f37474x = new Paint();
        this.G = -1;
        this.I = org.telegram.messenger.g0.L(288.0f);
        this.L = "";
        this.M = new ArrayList();
        this.R = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.f37465h0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f37466i0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.f37467j0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f37468k0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.f37469l0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.m0 = textPaint5;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint5.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        this.f37453a = i7;
        this.f37455b = j3;
        this.f37460e = f6Var;
        this.f37462f = dkVar;
        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
        boolean p02 = org.telegram.messenger.t3.p0(M02);
        this.f37457c = p02;
        if (j3 == org.telegram.messenger.p10.i(i7).e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        setWillNotDraw(false);
        di.a4 a4Var = new di.a4(activity, 22);
        this.h = a4Var;
        a4Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        a4Var.setOutlineProvider(new bg.q0(16));
        a4Var.setClipToOutline(true);
        a4Var.setOnTouchListener(new ei.b(25));
        addView(a4Var, c8.ha.e(288, -1, 53));
        int i11 = org.telegram.messenger.g0.f22531m;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        l9 l9Var = new l9(activity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        if (z9) {
            w8Var.g(1);
            w8Var.f39912p = 0.75f;
            l9Var.setImageDrawable(w8Var);
            String M03 = org.telegram.messenger.hd.M0(2131745902, null);
            i10 = i11;
            M0 = org.telegram.messenger.hd.G(s12.G1().f26204j.size(), "Chats", new Object[0]);
            z10 = p02;
            z11 = z9;
            str = M03;
        } else {
            i10 = i11;
            if (p02) {
                z10 = p02;
                z11 = z9;
                if (M02 != null) {
                    chat = s12.M0(Long.valueOf(M02.linked_monoforum_id));
                } else {
                    chat = null;
                }
                chat = chat == null ? M02 : chat;
                if (chat == null) {
                    str = "";
                } else {
                    w8Var.q(chat);
                    l9Var.e(chat, w8Var);
                    str = chat.title;
                }
                M0 = org.telegram.messenger.hd.M0(2131743984, null);
            } else {
                z10 = p02;
                z11 = z9;
                if (M02 != null) {
                    w8Var.q(M02);
                    l9Var.e(M02, w8Var);
                    str = M02.title;
                    TLRPC.ChatFull N0 = s12.N0(M02.f26952id);
                    int i12 = (N0 == null || (i12 = N0.participants_count) <= 0) ? M02.participants_count : i12;
                    if (i12 > 0) {
                        M0 = org.telegram.messenger.hd.H(',', "Members", i12);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131743995, null);
                    }
                } else {
                    TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                    if (a22 == null) {
                        str = "";
                    } else {
                        w8Var.r(a22);
                        l9Var.e(a22, w8Var);
                        str = org.telegram.messenger.t10.p(a22);
                    }
                    M0 = org.telegram.messenger.hd.M0(2131743995, null);
                }
            }
        }
        bi.e5 e5Var = new bi.e5(activity, 29);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        boolean z12 = z10;
        boolean z13 = z11;
        e5Var.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i13, f6Var)), 24, 24));
        e5Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i14 = r2;
                org.telegram.ui.dk dkVar2 = dkVar;
                switch (i14) {
                    case 0:
                        org.telegram.ui.an anVar = dkVar2.f45086a;
                        anVar.m0.d();
                        if (anVar.X9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", anVar.getUserConfig().e());
                            anVar.presentFragment(new u80(bundle, null));
                            return;
                        } else if (org.telegram.messenger.t3.p0(anVar.f43772e)) {
                            anVar.presentFragment(ProfileActivity.A4(-anVar.f43772e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = anVar.f43772e;
                            if (chat2 != null) {
                                anVar.presentFragment(ProfileActivity.A4(-chat2.f26952id));
                                return;
                            }
                            TLRPC.User user2 = anVar.f43786f;
                            if (user2 != null) {
                                anVar.presentFragment(ProfileActivity.A4(user2.f27101id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.an anVar2 = dkVar2.f45086a;
                        org.telegram.ui.ActionBar.r0 r0Var = anVar2.f43826i0;
                        if (r0Var != null && anVar2.m0 != null) {
                            r0Var.y();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                            if (o0Var != null) {
                                o0Var.n();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.f43826i0.getPopupLayout();
                            k60 I = k60.I(anVar2, view);
                            boolean z14 = true;
                            for (int i15 = 0; i15 < popupLayout.getItemsCount(); i15++) {
                                View childAt = popupLayout.L.getChildAt(i15);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z14) {
                                            I.k();
                                            z14 = true;
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
                                            drawable2 = new zg0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.p0 p0Var = anVar2.f43951s1;
                                        if (p0Var != null && z0Var == p0Var.f28356j) {
                                            if (anVar2.getMessagesController().r2(anVar2.f43843j6, anVar2.b(), null)) {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(anVar2, 16), false);
                                            } else {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.qf(0, anVar2, I), false);
                                            }
                                        } else if (z0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) z0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            I.b(z0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.qe(anVar2, intValue, 4));
                                            if (drawable3 instanceof zg0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                    if (z0Var2.getImageView() instanceof ch0) {
                                                        ch0 ch0Var = (ch0) z0Var2.getImageView();
                                                        ch0Var.setAnimation((zg0) drawable3);
                                                        ch0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.gq0(z0Var, 26));
                                        }
                                        z14 = false;
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
        a4Var.addView(e5Var, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        e5Var.addView(l9Var, c8.ha.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i13, f6Var)), 1, -1));
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
                        org.telegram.ui.an anVar = dkVar2.f45086a;
                        anVar.m0.d();
                        if (anVar.X9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", anVar.getUserConfig().e());
                            anVar.presentFragment(new u80(bundle, null));
                            return;
                        } else if (org.telegram.messenger.t3.p0(anVar.f43772e)) {
                            anVar.presentFragment(ProfileActivity.A4(-anVar.f43772e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = anVar.f43772e;
                            if (chat2 != null) {
                                anVar.presentFragment(ProfileActivity.A4(-chat2.f26952id));
                                return;
                            }
                            TLRPC.User user2 = anVar.f43786f;
                            if (user2 != null) {
                                anVar.presentFragment(ProfileActivity.A4(user2.f27101id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.an anVar2 = dkVar2.f45086a;
                        org.telegram.ui.ActionBar.r0 r0Var = anVar2.f43826i0;
                        if (r0Var != null && anVar2.m0 != null) {
                            r0Var.y();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                            if (o0Var != null) {
                                o0Var.n();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.f43826i0.getPopupLayout();
                            k60 I = k60.I(anVar2, view);
                            boolean z14 = true;
                            for (int i15 = 0; i15 < popupLayout.getItemsCount(); i15++) {
                                View childAt = popupLayout.L.getChildAt(i15);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z14) {
                                            I.k();
                                            z14 = true;
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
                                            drawable2 = new zg0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.p0 p0Var = anVar2.f43951s1;
                                        if (p0Var != null && z0Var == p0Var.f28356j) {
                                            if (anVar2.getMessagesController().r2(anVar2.f43843j6, anVar2.b(), null)) {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(anVar2, 16), false);
                                            } else {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.qf(0, anVar2, I), false);
                                            }
                                        } else if (z0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) z0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            I.b(z0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.qe(anVar2, intValue, 4));
                                            if (drawable3 instanceof zg0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                    if (z0Var2.getImageView() instanceof ch0) {
                                                        ch0 ch0Var = (ch0) z0Var2.getImageView();
                                                        ch0Var.setAnimation((zg0) drawable3);
                                                        ch0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.gq0(z0Var, 26));
                                        }
                                        z14 = false;
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
        a4Var.addView(imageView, c8.ha.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.f37470n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i13, f6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        e5Var.addView(textView, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.k6.f28240y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i14, f6Var));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        e5Var.addView(textView2, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new j01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(2131232486);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), mode));
        frameLayout.addView(imageView2, c8.ha.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.f37473w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.hd.M0(2131745837, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(i14, f6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.k6.w0(i13, f6Var));
        editText.addTextChangedListener(new ah.j(this, 25));
        frameLayout.addView(editText, c8.ha.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        a4Var.addView(frameLayout, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        pj0 pj0Var = new pj0(activity, f6Var);
        this.f37471r = pj0Var;
        pj0Var.setLayoutManager(new v4.b0());
        pj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        pj0Var.setClipToPadding(false);
        pj0Var.setVerticalScrollBarEnabled(false);
        v4.k kVar = new v4.k();
        kVar.f56979m = false;
        kVar.C = false;
        xq xqVar = xq.h;
        kVar.f57028i = xqVar;
        kVar.n(350L);
        kVar.d = 160L;
        pj0Var.setItemAnimator(kVar);
        pj0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        pj0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i13, f6Var)));
        m01 m01Var = new m01(this);
        this.f37472s = m01Var;
        pj0Var.setAdapter(m01Var);
        pj0Var.setOnItemClickListener(new di.p4(14, this, dkVar));
        pj0Var.setOnItemLongClickListener((dj0) new f2(19, this, dkVar));
        pj0Var.j(new k01(this, i7, j3));
        a4Var.addView(pj0Var, c8.ha.f(-1.0f, -1, 119, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        org.telegram.ui.e61 e61Var = new org.telegram.ui.e61(7, activity, f6Var);
        this.P = e61Var;
        e61Var.setLayoutManager(new v4.b0(0, false));
        e61Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        e61Var.setClipToPadding(false);
        e61Var.setHorizontalScrollBarEnabled(false);
        e61Var.setOverScrollMode(2);
        v4.k kVar2 = new v4.k();
        kVar2.f56979m = false;
        kVar2.C = false;
        kVar2.o(xqVar);
        kVar2.n(320L);
        e61Var.setItemAnimator(kVar2);
        bi.k5 k5Var = new bi.k5(this, 5);
        this.Q = k5Var;
        e61Var.setAdapter(k5Var);
        e61Var.setOnItemClickListener(new k(this, 19));
        e61Var.setVisibility(8);
        a4Var.addView(e61Var, c8.ha.f(36.0f, -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        int i15 = org.telegram.ui.ActionBar.k6.f27848d6;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i15, f6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        a4Var.addView(view, c8.ha.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.F = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        a4Var.addView(view2, c8.ha.e(-1, 24, 87));
        this.E = view;
        j();
        if (j3 > 0) {
            user = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
        } else {
            user = null;
        }
        if (!z12 && !z13 && ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user))) {
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
            int i16 = org.telegram.ui.ActionBar.k6.Gi;
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i16, f6Var));
            textView3.setText(org.telegram.messenger.hd.M0(2131748250, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(2131231177).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i16, f6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var)));
            c8.ka.a(textView3);
            textView3.setOnClickListener(new lk(25, this, dkVar));
            frameLayout2.addView(textView3, c8.ha.c(44.0f, -2));
            a4Var.addView(frameLayout2, c8.ha.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.D = frameLayout2;
        }
        a4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(i15, f6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.I + this.H;
    }

    private void setTagsShown(boolean z9) {
        float f10;
        if (this.f37463f0 == z9) {
            return;
        }
        this.f37463f0 = z9;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        float f11 = this.T;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new g01(this, 1));
        this.U.addListener(new i01(this, 0));
        this.U.setDuration(320L);
        this.U.setInterpolator(xq.h);
        this.U.start();
    }

    public final void a(float f10, float f11) {
        long j3;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        float f12 = this.f37475y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new g01(this, 2));
        this.J.addListener(new i01(this, 2));
        float abs = Math.abs(f10 - this.f37475y) * getPanelWidth();
        if (Math.abs(f11) > org.telegram.messenger.g0.L(300.0f)) {
            j3 = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f11)) * 1000.0f * 2.0f));
        } else {
            j3 = 320;
        }
        this.J.setDuration(j3);
        this.J.setInterpolator(xq.h);
        this.J.start();
    }

    public final void b(float f10) {
        org.telegram.ui.e61 e61Var = this.P;
        int childCount = e61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = e61Var.getChildAt(i7);
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f10);
            childAt.setScaleX(T1);
            childAt.setScaleY(T1);
            childAt.setAlpha(f10);
        }
    }

    public final void c() {
        v80 v80Var = this.O;
        if (v80Var != null) {
            org.telegram.messenger.g0.r(v80Var);
            this.O = null;
        }
        if (this.N != 0) {
            ConnectionsManager.getInstance(this.f37453a).cancelRequest(this.N, true);
            this.N = 0;
        }
    }

    public final void d() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.f37473w);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25045q5) {
            if (((Long) objArr[0]).longValue() == (-this.f37455b)) {
                i();
            }
        } else if (i7 == org.telegram.messenger.qs.f25046r) {
            i();
        } else if (i7 == org.telegram.messenger.qs.f24988g3) {
            if (this.d) {
                i();
            }
        } else if (i7 == org.telegram.messenger.qs.f25001i4) {
            org.telegram.messenger.g0.d0(this.f37471r, new org.telegram.ui.web.z0(1));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(this.f37475y, 687865856);
        Paint paint = this.f37474x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.dk dkVar = this.f37462f;
        if (dkVar != null && this.f37475y > 0.0f) {
            org.telegram.ui.an.M2(dkVar.f45086a, canvas);
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
        if (this.f37475y <= 0.0f) {
            i7 = 8;
        }
        setVisibility(i7);
        return dispatchTouchEvent;
    }

    public final String e(TLRPC.TL_forumTopic tL_forumTopic) {
        StringBuilder sb2;
        if (tL_forumTopic != null && !this.f37457c && !this.d && tL_forumTopic.f27004id != 1) {
            if (tL_forumTopic.icon_emoji_id != 0) {
                sb2 = new StringBuilder("e");
                sb2.append(tL_forumTopic.icon_emoji_id);
            } else {
                sb2 = new StringBuilder("c");
                sb2.append(tL_forumTopic.icon_color);
            }
            return sb2.toString();
        }
        return null;
    }

    public final TLObject f(o01 o01Var) {
        long o4;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.f37453a);
        org.telegram.messenger.uv uvVar = o01Var.f36452b;
        if (uvVar != null) {
            o4 = uvVar.f25886a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = o01Var.f36451a;
            if (tL_forumTopic != null && this.f37457c) {
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

    public final String g(long j3) {
        int i7 = this.f37453a;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        if (j3 == org.telegram.messenger.p10.i(i7).e()) {
            return org.telegram.messenger.hd.M0(2131748302, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.hd.M0(2131754252, null);
        }
        if (j3 >= 0) {
            return org.telegram.messenger.t10.p(s12.a2(Long.valueOf(j3)));
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        if (M0 != null) {
            return M0.title;
        }
        return "";
    }

    public int getContentWidth() {
        return this.I;
    }

    public float getProgress() {
        return this.f37475y;
    }

    public final boolean h(o01 o01Var) {
        String str;
        org.telegram.messenger.uv uvVar = o01Var.f36452b;
        String str2 = "";
        if (uvVar != null) {
            String g10 = g(uvVar.f25886a);
            if (g10 != null) {
                str2 = g10.toString();
            }
        } else {
            TLObject f10 = f(o01Var);
            if (f10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.t10.p((TLRPC.User) f10);
            } else if (f10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) f10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = o01Var.f36451a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.L);
    }

    public final void i() {
        boolean z9;
        ArrayList l10;
        boolean z10;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        String str3;
        boolean z11;
        n01 n01Var;
        int visibility = getVisibility();
        m01 m01Var = this.f37472s;
        if (visibility != 0 && this.f37475y <= 0.0f && m01Var.f35812c.size() > 0) {
            return;
        }
        ArrayList arrayList = m01Var.f35812c;
        String str4 = m01Var.d;
        r01 r01Var = m01Var.f35813e;
        String str5 = r01Var.L;
        int i7 = r01Var.f37453a;
        boolean z12 = r01Var.d;
        if (TextUtils.equals(str4, str5) && r01Var.f37475y > 0.0f && !arrayList.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        m01Var.d = r01Var.L;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (z12) {
            l10 = null;
        } else {
            l10 = org.telegram.messenger.qp.s1(i7).f24862q7.l(-r01Var.f37455b);
        }
        if (!z12) {
            bi.k5 k5Var = r01Var.Q;
            ArrayList arrayList3 = r01Var.R;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (l10 != null) {
                int size = l10.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = l10.get(i10);
                    i10++;
                    TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj;
                    String e10 = r01Var.e(tL_forumTopic2);
                    if (e10 != null) {
                        n01 n01Var2 = (n01) linkedHashMap.get(e10);
                        int i11 = size;
                        if (n01Var2 == null) {
                            ?? obj2 = new Object();
                            obj2.f36123a = e10;
                            obj2.f36124b = tL_forumTopic2;
                            linkedHashMap.put(e10, obj2);
                            n01Var = obj2;
                        } else {
                            n01Var = n01Var2;
                        }
                        n01Var.f36125c++;
                        size = i11;
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (n01 n01Var3 : linkedHashMap.values()) {
                if (n01Var3.f36125c >= 2) {
                    arrayList4.add(n01Var3);
                }
            }
            if (arrayList4.size() < 2) {
                arrayList4.clear();
            }
            Collections.sort(arrayList4, new org.telegram.ui.oe(19));
            int size2 = arrayList4.size();
            boolean z13 = false;
            int i12 = 0;
            while (i12 < size2) {
                Object obj3 = arrayList4.get(i12);
                i12++;
                boolean z14 = z9;
                if (((n01) obj3).f36123a.equals(r01Var.S)) {
                    z13 = true;
                }
                z9 = z14;
            }
            z10 = z9;
            str = null;
            if (!z13) {
                r01Var.S = null;
            }
            ArrayList arrayList5 = new ArrayList(arrayList3);
            arrayList3.clear();
            arrayList3.addAll(arrayList4);
            if (arrayList5.isEmpty() || arrayList4.isEmpty() || r01Var.T <= 0.0f) {
                z11 = true;
                k5Var.f();
            } else {
                l01 l01Var = new l01(arrayList5, arrayList4);
                z11 = true;
                v4.o.c(l01Var, true).c(k5Var);
            }
            r01Var.setTagsShown(arrayList3.isEmpty() ^ z11);
        } else {
            z10 = z9;
            str = null;
        }
        if (TextUtils.isEmpty(r01Var.L) && r01Var.S == null) {
            arrayList.add(new o01(r01Var));
        }
        if (z12) {
            ArrayList arrayList6 = org.telegram.messenger.qp.s1(i7).G1().f26204j;
            int size3 = arrayList6.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList6.get(i13);
                i13++;
                o01 o01Var = new o01(r01Var);
                o01Var.f36452b = (org.telegram.messenger.uv) obj4;
                if (!TextUtils.isEmpty(r01Var.L) && !r01Var.h(o01Var)) {
                    TLObject f10 = r01Var.f(o01Var);
                    if (f10 instanceof TLRPC.User) {
                        str3 = org.telegram.messenger.t10.n((TLRPC.User) f10);
                    } else if (f10 instanceof TLRPC.Chat) {
                        str3 = org.telegram.messenger.t3.K((TLRPC.Chat) f10, false);
                    } else {
                        str3 = str;
                    }
                    if (str3 != null && str3.toLowerCase().contains(r01Var.L)) {
                    }
                }
                arrayList.add(o01Var);
            }
            if (!z10) {
                m01Var.f();
            } else {
                v4.o.c(new jg.h(m01Var, arrayList2, 3), true).c(m01Var);
            }
        } else {
            HashSet hashSet = new HashSet();
            if (l10 != null) {
                int size4 = l10.size();
                int i14 = 0;
                while (i14 < size4) {
                    Object obj5 = l10.get(i14);
                    i14++;
                    o01 o01Var2 = new o01(r01Var);
                    o01Var2.f36451a = (TLRPC.TL_forumTopic) obj5;
                    if (!TextUtils.isEmpty(r01Var.L) && !r01Var.h(o01Var2)) {
                        TLObject f11 = r01Var.f(o01Var2);
                        if (f11 instanceof TLRPC.User) {
                            str2 = org.telegram.messenger.t10.n((TLRPC.User) f11);
                        } else if (f11 instanceof TLRPC.Chat) {
                            str2 = org.telegram.messenger.t3.K((TLRPC.Chat) f11, false);
                        } else {
                            str2 = str;
                        }
                        if (str2 != null && str2.toLowerCase().contains(r01Var.L)) {
                        }
                    }
                    String str6 = r01Var.S;
                    if (str6 == null || ((tL_forumTopic = o01Var2.f36451a) != null && str6.equals(r01Var.e(tL_forumTopic)))) {
                        arrayList.add(o01Var2);
                        hashSet.add(Long.valueOf(o01Var2.a()));
                    }
                }
            }
            int i15 = 0;
            if (!TextUtils.isEmpty(r01Var.L)) {
                ArrayList arrayList7 = r01Var.M;
                int size5 = arrayList7.size();
                while (i15 < size5) {
                    Object obj6 = arrayList7.get(i15);
                    i15++;
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) obj6;
                    o01 o01Var3 = new o01(r01Var);
                    o01Var3.f36451a = tL_forumTopic3;
                    String str7 = r01Var.S;
                    if (str7 == null || (tL_forumTopic3 != null && str7.equals(r01Var.e(tL_forumTopic3)))) {
                        if (hashSet.add(Long.valueOf(o01Var3.a()))) {
                            arrayList.add(o01Var3);
                        }
                    }
                }
            }
            if (!z10) {
                m01Var.f();
            } else {
                v4.o.c(new jg.h(m01Var, arrayList2, 3), true).c(m01Var);
            }
        }
        this.f37471r.post(new ir0(this, 17));
    }

    public final void j() {
        View view;
        View view2 = this.E;
        if (view2 != null && (view = this.F) != null) {
            pj0 pj0Var = this.f37471r;
            view2.setAlpha(Utilities.i(pj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            if (this.D != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((pj0Var.computeVerticalScrollRange() - pj0Var.computeVerticalScrollOffset()) - pj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f37453a;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f25045q5);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f25046r);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f24988g3);
        org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.f25001i4);
        i();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f37453a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25045q5);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25046r);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f24988g3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001i4);
        c();
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.W = motionEvent.getX();
            this.f37454a0 = motionEvent.getY();
            this.f37456b0 = false;
            this.f37458c0 = true;
            this.f37459d0 = this.f37475y;
            VelocityTracker velocityTracker = this.f37461e0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f37461e0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.f37458c0) {
            VelocityTracker velocityTracker2 = this.f37461e0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.W;
            float y10 = motionEvent.getY() - this.f37454a0;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.f37456b0 = true;
                this.W = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        WeakHashMap weakHashMap = r0.i0.f54098a;
        r0.k1 a10 = r0.b0.a(this);
        if (a10 != null) {
            i13 = a10.f54109a.f(2).d;
        } else {
            i13 = 0;
        }
        if (i13 != this.G) {
            this.G = i13;
            pj0 pj0Var = this.f37471r;
            View view = this.F;
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                pj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                pj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.an anVar;
        org.telegram.ui.ActionBar.r0 m92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.f54098a;
        r0.k1 a10 = r0.b0.a(this);
        int i12 = 0;
        if (a10 != null) {
            i11 = org.telegram.messenger.g0.I0(a10, false).f15119c;
        } else {
            i11 = 0;
        }
        int i13 = this.H;
        di.a4 a4Var = this.h;
        if (i11 != i13) {
            this.H = i11;
            a4Var.getLayoutParams().width = getPanelWidth();
            a4Var.setPadding(0, 0, i11, 0);
            a4Var.setTranslationX((1.0f - this.f37475y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.dk dkVar = this.f37462f;
        if (dkVar != null && (m92 = (anVar = dkVar.f45086a).m9()) != null) {
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            i12 = (int) ((kVar.getWidth() - ((m92.getWidth() / 2.0f) + (m92.getX() + ((View) m92.getParent()).getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.H) - i12));
        if (max != this.I) {
            this.I = max;
            a4Var.getLayoutParams().width = getPanelWidth();
            a4Var.setTranslationX((1.0f - this.f37475y) * getPanelWidth());
            this.f37472s.f();
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r01.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j3) {
        this.K = j3;
        this.f37472s.f();
    }

    public void setMenuAvailable(boolean z9) {
        int i7;
        ImageView imageView = this.f37470n;
        if (imageView != null) {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public void setProgress(float f10) {
        boolean z9;
        int i7 = 0;
        if (this.f37475y <= 0.0f && f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37475y = Utilities.l(f10);
        if (z9 && this.P != null) {
            ValueAnimator valueAnimator = this.f37464g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.f37463f0 && this.U == null) {
                b(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f37464g0 = ofFloat;
                ofFloat.addUpdateListener(new g01(this, 0));
                this.f37464g0.addListener(new i01(this, 1));
                this.f37464g0.setDuration(320L);
                this.f37464g0.setInterpolator(xq.h);
                this.f37464g0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.f37475y) * getPanelWidth());
        if (this.f37475y <= 0.0f && !this.V) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
        org.telegram.ui.dk dkVar = this.f37462f;
        if (dkVar != null) {
            dkVar.f45086a.l1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z9 = false;
        float f11 = 0.0f;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.f37475y > 0.5f : f10 < 0.0f) {
            z9 = true;
        }
        if (z9) {
            i();
        }
        if (z9) {
            f11 = 1.0f;
        }
        a(f11, f10);
        if (!z9) {
            org.telegram.messenger.g0.v1(this.f37473w);
        }
    }
}
