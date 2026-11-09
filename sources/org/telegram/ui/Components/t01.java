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
public final class t01 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int m0 = 0;
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
    public w80 O;
    public final org.telegram.ui.f61 P;
    public final bi.k5 Q;
    public final ArrayList R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public float V;
    public float W;
    public final int f38207a;
    public boolean f38208a0;
    public final long f38209b;
    public boolean f38210b0;
    public final boolean f38211c;
    public float f38212c0;
    public final boolean d;
    public VelocityTracker f38213d0;
    public final org.telegram.ui.ActionBar.g6 f38214e;
    public boolean f38215e0;
    public final org.telegram.ui.fk f38216f;
    public ValueAnimator f38217f0;
    public final TextPaint f38218g0;
    public final di.b4 h;
    public final HashMap f38219h0;
    public final TextPaint f38220i0;
    public final TextPaint f38221j0;
    public final TextPaint f38222k0;
    public final TextPaint f38223l0;
    public final ImageView f38224n;
    public final qj0 f38225r;
    public final o01 f38226s;
    public final EditText f38227w;
    public final Paint f38228x;
    public float f38229y;

    public t01(Activity activity, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var, final org.telegram.ui.fk fkVar) {
        super(activity);
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        String str;
        String M0;
        TLRPC.Chat chat;
        TLRPC.User user;
        this.f38228x = new Paint();
        this.G = -1;
        this.I = org.telegram.messenger.g0.L(288.0f);
        this.L = "";
        this.M = new ArrayList();
        this.R = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.f38218g0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f38219h0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.f38220i0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f38221j0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.f38222k0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.f38223l0 = textPaint5;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint5.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        this.f38207a = i7;
        this.f38209b = j3;
        this.f38214e = g6Var;
        this.f38216f = fkVar;
        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
        boolean p02 = org.telegram.messenger.t3.p0(M02);
        this.f38211c = p02;
        if (j3 == org.telegram.messenger.p10.i(i7).e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        setWillNotDraw(false);
        di.b4 b4Var = new di.b4(activity, 22);
        this.h = b4Var;
        b4Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        b4Var.setOutlineProvider(new bg.q0(16));
        b4Var.setClipToOutline(true);
        b4Var.setOnTouchListener(new ei.b(25));
        addView(b4Var, c8.ha.e(288, -1, 53));
        int i11 = org.telegram.messenger.g0.f22557m;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        l9 l9Var = new l9(activity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        w8 w8Var = new w8((org.telegram.ui.ActionBar.g6) null);
        if (z9) {
            w8Var.g(1);
            w8Var.f39982p = 0.75f;
            l9Var.setImageDrawable(w8Var);
            String M03 = org.telegram.messenger.id.M0(2131745901, null);
            i10 = i11;
            M0 = org.telegram.messenger.id.G(s12.G1().f26218j.size(), "Chats", new Object[0]);
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
                M0 = org.telegram.messenger.id.M0(2131743983, null);
            } else {
                z10 = p02;
                z11 = z9;
                if (M02 != null) {
                    w8Var.q(M02);
                    l9Var.e(M02, w8Var);
                    str = M02.title;
                    TLRPC.ChatFull N0 = s12.N0(M02.f26956id);
                    int i12 = (N0 == null || (i12 = N0.participants_count) <= 0) ? M02.participants_count : i12;
                    if (i12 > 0) {
                        M0 = org.telegram.messenger.id.H(',', "Members", i12);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131743994, null);
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
                    M0 = org.telegram.messenger.id.M0(2131743994, null);
                }
            }
        }
        bi.e5 e5Var = new bi.e5(activity, 29);
        int i13 = org.telegram.ui.ActionBar.l6.G6;
        boolean z12 = z10;
        boolean z13 = z11;
        e5Var.setBackground(org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i13, g6Var)), 24, 24));
        e5Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i14 = r2;
                org.telegram.ui.fk fkVar2 = fkVar;
                switch (i14) {
                    case 0:
                        org.telegram.ui.cn cnVar = fkVar2.f45734a;
                        cnVar.m0.d();
                        if (cnVar.Y9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", cnVar.getUserConfig().e());
                            cnVar.presentFragment(new v80(bundle, null));
                            return;
                        } else if (org.telegram.messenger.t3.p0(cnVar.f44432e)) {
                            cnVar.presentFragment(ProfileActivity.D4(-cnVar.f44432e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = cnVar.f44432e;
                            if (chat2 != null) {
                                cnVar.presentFragment(ProfileActivity.D4(-chat2.f26956id));
                                return;
                            }
                            TLRPC.User user2 = cnVar.f44446f;
                            if (user2 != null) {
                                cnVar.presentFragment(ProfileActivity.D4(user2.f27105id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.cn cnVar2 = fkVar2.f45734a;
                        org.telegram.ui.ActionBar.r0 r0Var = cnVar2.f44486i0;
                        if (r0Var != null && cnVar2.m0 != null) {
                            r0Var.y();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                            if (o0Var != null) {
                                o0Var.n();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = cnVar2.f44486i0.getPopupLayout();
                            l60 I = l60.I(cnVar2, view);
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
                                            drawable2 = new ah0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.p0 p0Var = cnVar2.f44613s1;
                                        if (p0Var != null && z0Var == p0Var.f28363j) {
                                            if (cnVar2.getMessagesController().r2(cnVar2.f44504j6, cnVar2.b(), null)) {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(cnVar2, 16), false);
                                            } else {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.rf(0, cnVar2, I), false);
                                            }
                                        } else if (z0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) z0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            I.b(z0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.l6.F8, org.telegram.ui.ActionBar.l6.E8, new org.telegram.ui.qe(cnVar2, intValue, 4));
                                            if (drawable3 instanceof ah0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                    if (z0Var2.getImageView() instanceof dh0) {
                                                        dh0 dh0Var = (dh0) z0Var2.getImageView();
                                                        dh0Var.setAnimation((ah0) drawable3);
                                                        dh0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.l6.F8, org.telegram.ui.ActionBar.l6.E8, new org.telegram.ui.iq0(z0Var, 26));
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
        b4Var.addView(e5Var, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        e5Var.addView(l9Var, c8.ha.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        int w02 = org.telegram.ui.ActionBar.l6.w0(i13, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i13, g6Var)), 1, -1));
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i14 = r2;
                org.telegram.ui.fk fkVar2 = fkVar;
                switch (i14) {
                    case 0:
                        org.telegram.ui.cn cnVar = fkVar2.f45734a;
                        cnVar.m0.d();
                        if (cnVar.Y9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", cnVar.getUserConfig().e());
                            cnVar.presentFragment(new v80(bundle, null));
                            return;
                        } else if (org.telegram.messenger.t3.p0(cnVar.f44432e)) {
                            cnVar.presentFragment(ProfileActivity.D4(-cnVar.f44432e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = cnVar.f44432e;
                            if (chat2 != null) {
                                cnVar.presentFragment(ProfileActivity.D4(-chat2.f26956id));
                                return;
                            }
                            TLRPC.User user2 = cnVar.f44446f;
                            if (user2 != null) {
                                cnVar.presentFragment(ProfileActivity.D4(user2.f27105id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.cn cnVar2 = fkVar2.f45734a;
                        org.telegram.ui.ActionBar.r0 r0Var = cnVar2.f44486i0;
                        if (r0Var != null && cnVar2.m0 != null) {
                            r0Var.y();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                            if (o0Var != null) {
                                o0Var.n();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = cnVar2.f44486i0.getPopupLayout();
                            l60 I = l60.I(cnVar2, view);
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
                                            drawable2 = new ah0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.p0 p0Var = cnVar2.f44613s1;
                                        if (p0Var != null && z0Var == p0Var.f28363j) {
                                            if (cnVar2.getMessagesController().r2(cnVar2.f44504j6, cnVar2.b(), null)) {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(cnVar2, 16), false);
                                            } else {
                                                I.c(z0Var.getIconResId(), text, new org.telegram.ui.rf(0, cnVar2, I), false);
                                            }
                                        } else if (z0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) z0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            I.b(z0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.l6.F8, org.telegram.ui.ActionBar.l6.E8, new org.telegram.ui.qe(cnVar2, intValue, 4));
                                            if (drawable3 instanceof ah0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                    if (z0Var2.getImageView() instanceof dh0) {
                                                        dh0 dh0Var = (dh0) z0Var2.getImageView();
                                                        dh0Var.setAnimation((ah0) drawable3);
                                                        dh0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.l6.F8, org.telegram.ui.ActionBar.l6.E8, new org.telegram.ui.iq0(z0Var, 26));
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
        b4Var.addView(imageView, c8.ha.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.f38224n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.l6.w0(i13, g6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        e5Var.addView(textView, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.l6.f28257y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.l6.w0(i14, g6Var));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        e5Var.addView(textView2, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new l01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(2131232486);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i14, g6Var), mode));
        frameLayout.addView(imageView2, c8.ha.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.f38227w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.id.M0(2131745836, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.l6.w0(i14, g6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.l6.w0(i13, g6Var));
        editText.addTextChangedListener(new ah.j(this, 25));
        frameLayout.addView(editText, c8.ha.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        b4Var.addView(frameLayout, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        qj0 qj0Var = new qj0(activity, g6Var);
        this.f38225r = qj0Var;
        qj0Var.setLayoutManager(new v4.b0());
        qj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        qj0Var.setClipToPadding(false);
        qj0Var.setVerticalScrollBarEnabled(false);
        v4.k kVar = new v4.k();
        kVar.f57083m = false;
        kVar.C = false;
        xq xqVar = xq.h;
        kVar.f57132i = xqVar;
        kVar.n(350L);
        kVar.d = 160L;
        qj0Var.setItemAnimator(kVar);
        qj0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        qj0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i13, g6Var)));
        o01 o01Var = new o01(this);
        this.f38226s = o01Var;
        qj0Var.setAdapter(o01Var);
        qj0Var.setOnItemClickListener(new di.q4(14, this, fkVar));
        qj0Var.setOnItemLongClickListener((ej0) new f2(19, this, fkVar));
        qj0Var.j(new m01(this, i7, j3));
        b4Var.addView(qj0Var, c8.ha.f(-1.0f, -1, 119, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(7, activity, g6Var);
        this.P = f61Var;
        f61Var.setLayoutManager(new v4.b0(0, false));
        f61Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        f61Var.setClipToPadding(false);
        f61Var.setHorizontalScrollBarEnabled(false);
        f61Var.setOverScrollMode(2);
        v4.k kVar2 = new v4.k();
        kVar2.f57083m = false;
        kVar2.C = false;
        kVar2.o(xqVar);
        kVar2.n(320L);
        f61Var.setItemAnimator(kVar2);
        bi.k5 k5Var = new bi.k5(this, 5);
        this.Q = k5Var;
        f61Var.setAdapter(k5Var);
        f61Var.setOnItemClickListener(new k(this, 19));
        f61Var.setVisibility(8);
        b4Var.addView(f61Var, c8.ha.f(36.0f, -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        int i15 = org.telegram.ui.ActionBar.l6.f27865d6;
        int w03 = org.telegram.ui.ActionBar.l6.w0(i15, g6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        b4Var.addView(view, c8.ha.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.F = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        b4Var.addView(view2, c8.ha.e(-1, 24, 87));
        this.E = view;
        i();
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
            int i16 = org.telegram.ui.ActionBar.l6.Gi;
            textView3.setTextColor(org.telegram.ui.ActionBar.l6.w0(i16, g6Var));
            textView3.setText(org.telegram.messenger.id.M0(2131748251, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(2131231177).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i16, g6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var)));
            c8.ka.a(textView3);
            textView3.setOnClickListener(new lk(25, this, fkVar));
            frameLayout2.addView(textView3, c8.ha.c(44.0f, -2));
            b4Var.addView(frameLayout2, c8.ha.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.D = frameLayout2;
        }
        b4Var.setBackgroundColor(org.telegram.ui.ActionBar.l6.w0(i15, g6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.I + this.H;
    }

    private void setTagsShown(boolean z9) {
        float f10;
        if (this.f38215e0 == z9) {
            return;
        }
        this.f38215e0 = z9;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        float f11 = this.S;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new i01(this, 1));
        this.T.addListener(new k01(this, 0));
        this.T.setDuration(320L);
        this.T.setInterpolator(xq.h);
        this.T.start();
    }

    public final void a(float f10, float f11) {
        long j3;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        float f12 = this.f38229y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new i01(this, 2));
        this.J.addListener(new k01(this, 2));
        float abs = Math.abs(f10 - this.f38229y) * getPanelWidth();
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
        org.telegram.ui.f61 f61Var = this.P;
        int childCount = f61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = f61Var.getChildAt(i7);
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f10);
            childAt.setScaleX(T1);
            childAt.setScaleY(T1);
            childAt.setAlpha(f10);
        }
    }

    public final void c() {
        w80 w80Var = this.O;
        if (w80Var != null) {
            org.telegram.messenger.g0.r(w80Var);
            this.O = null;
        }
        if (this.N != 0) {
            ConnectionsManager.getInstance(this.f38207a).cancelRequest(this.N, true);
            this.N = 0;
        }
    }

    public final void d() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.f38227w);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25062q5) {
            if (((Long) objArr[0]).longValue() == (-this.f38209b)) {
                h();
            }
        } else if (i7 == org.telegram.messenger.qs.f25063r) {
            h();
        } else if (i7 == org.telegram.messenger.qs.f25005g3) {
            if (this.d) {
                h();
            }
        } else if (i7 == org.telegram.messenger.qs.f25018i4) {
            org.telegram.messenger.g0.d0(this.f38225r, new pg.c(0));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.l6.r1(this.f38229y, 687865856);
        Paint paint = this.f38228x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.fk fkVar = this.f38216f;
        if (fkVar != null && this.f38229y > 0.0f) {
            org.telegram.ui.cn.N2(fkVar.f45734a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.U = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        int i7 = 0;
        this.U = false;
        if (this.f38229y <= 0.0f) {
            i7 = 8;
        }
        setVisibility(i7);
        return dispatchTouchEvent;
    }

    public final TLObject e(q01 q01Var) {
        long o4;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.f38207a);
        org.telegram.messenger.uv uvVar = q01Var.f37149b;
        if (uvVar != null) {
            o4 = uvVar.f25896a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = q01Var.f37148a;
            if (tL_forumTopic != null && this.f38211c) {
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
        int i7 = this.f38207a;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        if (j3 == org.telegram.messenger.p10.i(i7).e()) {
            return org.telegram.messenger.id.M0(2131748303, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.id.M0(2131754252, null);
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

    public final boolean g(q01 q01Var) {
        String str;
        org.telegram.messenger.uv uvVar = q01Var.f37149b;
        String str2 = "";
        if (uvVar != null) {
            String f10 = f(uvVar.f25896a);
            if (f10 != null) {
                str2 = f10.toString();
            }
        } else {
            TLObject e10 = e(q01Var);
            if (e10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.t10.p((TLRPC.User) e10);
            } else if (e10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) e10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = q01Var.f37148a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.L);
    }

    public int getContentWidth() {
        return this.I;
    }

    public float getProgress() {
        return this.f38229y;
    }

    public final void h() {
        boolean z9;
        ArrayList l10;
        String str;
        String str2;
        String str3;
        int visibility = getVisibility();
        o01 o01Var = this.f38226s;
        if (visibility != 0 && this.f38229y <= 0.0f && o01Var.f36593c.size() > 0) {
            return;
        }
        ArrayList arrayList = o01Var.f36593c;
        String str4 = o01Var.d;
        t01 t01Var = o01Var.f36594e;
        String str5 = t01Var.L;
        int i7 = t01Var.f38207a;
        boolean z10 = t01Var.d;
        int i10 = 0;
        if (TextUtils.equals(str4, str5) && t01Var.f38229y > 0.0f && !arrayList.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        o01Var.d = t01Var.L;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (z10) {
            l10 = null;
        } else {
            l10 = org.telegram.messenger.qp.s1(i7).f24877q7.l(-t01Var.f38209b);
        }
        if (!z10) {
            bi.k5 k5Var = t01Var.Q;
            ArrayList arrayList3 = t01Var.R;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (l10 != null) {
                boolean z11 = org.telegram.messenger.r2.f25212a;
            }
            ArrayList arrayList4 = new ArrayList();
            for (p01 p01Var : linkedHashMap.values()) {
                p01Var.getClass();
            }
            str = null;
            if (arrayList4.size() < 2) {
                arrayList4.clear();
            }
            Collections.sort(arrayList4, new org.telegram.ui.oe(19));
            if (arrayList4.size() <= 0) {
                ArrayList arrayList5 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                if (!arrayList5.isEmpty() && !arrayList4.isEmpty() && t01Var.S > 0.0f) {
                    v4.o.c(new n01(arrayList5, arrayList4), true).c(k5Var);
                } else {
                    k5Var.f();
                }
                t01Var.setTagsShown(!arrayList3.isEmpty());
            } else {
                ((p01) arrayList4.get(0)).getClass();
                throw null;
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(t01Var.L)) {
            arrayList.add(new q01(t01Var));
        }
        if (z10) {
            ArrayList arrayList6 = org.telegram.messenger.qp.s1(i7).G1().f26218j;
            int size = arrayList6.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList6.get(i11);
                i11++;
                q01 q01Var = new q01(t01Var);
                q01Var.f37149b = (org.telegram.messenger.uv) obj;
                if (!TextUtils.isEmpty(t01Var.L) && !t01Var.g(q01Var)) {
                    TLObject e10 = t01Var.e(q01Var);
                    if (e10 instanceof TLRPC.User) {
                        str3 = org.telegram.messenger.t10.n((TLRPC.User) e10);
                    } else if (e10 instanceof TLRPC.Chat) {
                        str3 = org.telegram.messenger.t3.K((TLRPC.Chat) e10, false);
                    } else {
                        str3 = str;
                    }
                    if (str3 != null && str3.toLowerCase().contains(t01Var.L)) {
                    }
                }
                arrayList.add(q01Var);
            }
            if (!z9) {
                o01Var.f();
            } else {
                v4.o.c(new jg.h(o01Var, arrayList2, 3), true).c(o01Var);
            }
        } else {
            HashSet hashSet = new HashSet();
            if (l10 != null) {
                int size2 = l10.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = l10.get(i12);
                    i12++;
                    q01 q01Var2 = new q01(t01Var);
                    q01Var2.f37148a = (TLRPC.TL_forumTopic) obj2;
                    if (!TextUtils.isEmpty(t01Var.L) && !t01Var.g(q01Var2)) {
                        TLObject e11 = t01Var.e(q01Var2);
                        if (e11 instanceof TLRPC.User) {
                            str2 = org.telegram.messenger.t10.n((TLRPC.User) e11);
                        } else if (e11 instanceof TLRPC.Chat) {
                            str2 = org.telegram.messenger.t3.K((TLRPC.Chat) e11, false);
                        } else {
                            str2 = str;
                        }
                        if (str2 != null && str2.toLowerCase().contains(t01Var.L)) {
                        }
                    }
                    arrayList.add(q01Var2);
                    hashSet.add(Long.valueOf(q01Var2.a()));
                }
            }
            if (!TextUtils.isEmpty(t01Var.L)) {
                ArrayList arrayList7 = t01Var.M;
                int size3 = arrayList7.size();
                while (i10 < size3) {
                    Object obj3 = arrayList7.get(i10);
                    i10++;
                    q01 q01Var3 = new q01(t01Var);
                    q01Var3.f37148a = (TLRPC.TL_forumTopic) obj3;
                    if (hashSet.add(Long.valueOf(q01Var3.a()))) {
                        arrayList.add(q01Var3);
                    }
                }
            }
            if (!z9) {
                o01Var.f();
            } else {
                v4.o.c(new jg.h(o01Var, arrayList2, 3), true).c(o01Var);
            }
        }
        this.f38225r.post(new kr0(this, 17));
    }

    public final void i() {
        View view;
        View view2 = this.E;
        if (view2 != null && (view = this.F) != null) {
            qj0 qj0Var = this.f38225r;
            view2.setAlpha(Utilities.i(qj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            if (this.D != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((qj0Var.computeVerticalScrollRange() - qj0Var.computeVerticalScrollOffset()) - qj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f38207a;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f25062q5);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f25063r);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f25005g3);
        org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.f25018i4);
        h();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f38207a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25062q5);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25063r);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25005g3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
        c();
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.V = motionEvent.getX();
            this.W = motionEvent.getY();
            this.f38208a0 = false;
            this.f38210b0 = true;
            this.f38212c0 = this.f38229y;
            VelocityTracker velocityTracker = this.f38213d0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f38213d0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.f38210b0) {
            VelocityTracker velocityTracker2 = this.f38213d0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.V;
            float y10 = motionEvent.getY() - this.W;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.f38208a0 = true;
                this.V = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.k1 a10 = r0.b0.a(this);
        if (a10 != null) {
            i13 = a10.f54214a.f(2).d;
        } else {
            i13 = 0;
        }
        if (i13 != this.G) {
            this.G = i13;
            qj0 qj0Var = this.f38225r;
            View view = this.F;
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                qj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                qj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.cn cnVar;
        org.telegram.ui.ActionBar.r0 n92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.k1 a10 = r0.b0.a(this);
        int i12 = 0;
        if (a10 != null) {
            i11 = org.telegram.messenger.g0.I0(a10, false).f15122c;
        } else {
            i11 = 0;
        }
        int i13 = this.H;
        di.b4 b4Var = this.h;
        if (i11 != i13) {
            this.H = i11;
            b4Var.getLayoutParams().width = getPanelWidth();
            b4Var.setPadding(0, 0, i11, 0);
            b4Var.setTranslationX((1.0f - this.f38229y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.fk fkVar = this.f38216f;
        if (fkVar != null && (n92 = (cnVar = fkVar.f45734a).n9()) != null) {
            kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            i12 = (int) ((kVar.getWidth() - ((n92.getWidth() / 2.0f) + (n92.getX() + ((View) n92.getParent()).getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.H) - i12));
        if (max != this.I) {
            this.I = max;
            b4Var.getLayoutParams().width = getPanelWidth();
            b4Var.setTranslationX((1.0f - this.f38229y) * getPanelWidth());
            this.f38226s.f();
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t01.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j3) {
        this.K = j3;
        this.f38226s.f();
    }

    public void setMenuAvailable(boolean z9) {
        int i7;
        ImageView imageView = this.f38224n;
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
        if (this.f38229y <= 0.0f && f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f38229y = Utilities.l(f10);
        if (z9 && this.P != null) {
            ValueAnimator valueAnimator = this.f38217f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.f38215e0 && this.T == null) {
                b(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f38217f0 = ofFloat;
                ofFloat.addUpdateListener(new i01(this, 0));
                this.f38217f0.addListener(new k01(this, 1));
                this.f38217f0.setDuration(320L);
                this.f38217f0.setInterpolator(xq.h);
                this.f38217f0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.f38229y) * getPanelWidth());
        if (this.f38229y <= 0.0f && !this.U) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
        org.telegram.ui.fk fkVar = this.f38216f;
        if (fkVar != null) {
            fkVar.f45734a.l1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z9 = false;
        float f11 = 0.0f;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.f38229y > 0.5f : f10 < 0.0f) {
            z9 = true;
        }
        if (z9) {
            h();
        }
        if (z9) {
            f11 = 1.0f;
        }
        a(f11, f10);
        if (!z9) {
            org.telegram.messenger.g0.v1(this.f38227w);
        }
    }
}
