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
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;
public final class n01 extends FrameLayout implements org.telegram.messenger.cs {
    public static final int f36307f0 = 0;
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
    public j50 P;
    public boolean Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public float V;
    public VelocityTracker W;
    public final int f36308a;
    public final HashMap f36309a0;
    public final long f36310b;
    public final TextPaint f36311b0;
    public final boolean f36312c;
    public final TextPaint f36313c0;
    public final boolean d;
    public final TextPaint f36314d0;
    public final org.telegram.ui.ActionBar.e6 f36315e;
    public final TextPaint f36316e0;
    public final org.telegram.ui.zj f36317f;
    public final ai.d2 h;
    public final ImageView f36318n;
    public final tj0 f36319r;
    public final k01 f36320s;
    public final EditText f36321w;
    public final Paint f36322x;
    public float f36323y;

    public n01(Activity activity, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, final org.telegram.ui.zj zjVar) {
        super(activity);
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        String M0;
        TLRPC.Chat chat;
        TLRPC.User user;
        this.f36322x = new Paint();
        this.H = -1;
        this.J = org.telegram.messenger.g0.L(288.0f);
        this.M = "";
        this.N = new ArrayList();
        this.f36309a0 = new HashMap();
        TextPaint textPaint = new TextPaint(1);
        this.f36311b0 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f36313c0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f36314d0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.f36316e0 = textPaint4;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint4.setTypeface(org.telegram.messenger.g0.o());
        this.f36308a = i3;
        this.f36310b = j10;
        this.f36315e = e6Var;
        this.f36317f = zjVar;
        TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
        boolean p02 = org.telegram.messenger.t3.p0(M02);
        this.f36312c = p02;
        if (j10 == org.telegram.messenger.h10.i(i3).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        setWillNotDraw(false);
        ai.d2 d2Var = new ai.d2(activity, 24);
        this.h = d2Var;
        d2Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        d2Var.setOutlineProvider(new cg.p0(19));
        d2Var.setClipToOutline(true);
        d2Var.setOnTouchListener(new fi.a(25));
        addView(d2Var, b8.mf.e(288, -1, 53));
        int i10 = org.telegram.messenger.g0.f22602m;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        k9 k9Var = new k9(activity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        if (z10) {
            u8Var.g(1);
            u8Var.f38691p = 0.75f;
            k9Var.setImageDrawable(u8Var);
            String M03 = org.telegram.messenger.bd.M0(2131745911, null);
            z11 = p02;
            M0 = org.telegram.messenger.bd.G(s12.G1().f24441j.size(), "Chats", new Object[0]);
            z12 = z10;
            str = M03;
        } else {
            z11 = p02;
            if (z11) {
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
                    u8Var.q(chat);
                    k9Var.e(chat, u8Var);
                    str = chat.title;
                }
                M0 = org.telegram.messenger.bd.M0(2131743993, null);
            } else {
                z12 = z10;
                if (M02 != null) {
                    u8Var.q(M02);
                    k9Var.e(M02, u8Var);
                    str = M02.title;
                    TLRPC.ChatFull N0 = s12.N0(M02.f27001id);
                    int i11 = (N0 == null || (i11 = N0.participants_count) <= 0) ? M02.participants_count : i11;
                    if (i11 > 0) {
                        M0 = org.telegram.messenger.bd.H(',', "Members", i11);
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131744004, null);
                    }
                } else {
                    TLRPC.User a22 = s12.a2(Long.valueOf(j10));
                    if (a22 == null) {
                        str = "";
                    } else {
                        u8Var.r(a22);
                        k9Var.e(a22, u8Var);
                        str = org.telegram.messenger.l10.p(a22);
                    }
                    M0 = org.telegram.messenger.bd.M0(2131744004, null);
                }
            }
        }
        kw0 kw0Var = new kw0(activity);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        boolean z13 = z12;
        kw0Var.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var)), 24, 24));
        kw0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i13 = r2;
                org.telegram.ui.zj zjVar2 = zjVar;
                switch (i13) {
                    case 0:
                        org.telegram.ui.wm wmVar = zjVar2.f52687a;
                        wmVar.f51407n0.c();
                        if (wmVar.X9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", wmVar.getUserConfig().e());
                            wmVar.presentFragment(new r80(bundle, null));
                            return;
                        } else if (org.telegram.messenger.t3.p0(wmVar.f51292e)) {
                            wmVar.presentFragment(ProfileActivity.A4(-wmVar.f51292e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = wmVar.f51292e;
                            if (chat2 != null) {
                                wmVar.presentFragment(ProfileActivity.A4(-chat2.f27001id));
                                return;
                            }
                            TLRPC.User user2 = wmVar.f51306f;
                            if (user2 != null) {
                                wmVar.presentFragment(ProfileActivity.A4(user2.f27150id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.wm wmVar2 = zjVar2.f52687a;
                        org.telegram.ui.ActionBar.q0 q0Var = wmVar2.f51359j0;
                        if (q0Var != null && wmVar2.f51407n0 != null) {
                            q0Var.y();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.g();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = wmVar2.f51359j0.getPopupLayout();
                            f60 I = f60.I(wmVar2, view);
                            boolean z14 = true;
                            for (int i14 = 0; i14 < popupLayout.getItemsCount(); i14++) {
                                View childAt = popupLayout.M.getChildAt(i14);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.c1) {
                                        if (!z14) {
                                            I.k();
                                            z14 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                                        CharSequence text = y0Var.getTextView().getText();
                                        if (y0Var.getIconResId() == 0) {
                                            drawable = y0Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((y0Var.getTag() instanceof Integer) && ((Integer) y0Var.getTag()).intValue() == 29) {
                                            drawable2 = new ch0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.o0 o0Var = wmVar2.f51484t1;
                                        if (o0Var != null && y0Var == o0Var.f28371j) {
                                            if (wmVar2.getMessagesController().r2(wmVar2.f51376k6, wmVar2.b(), null)) {
                                                I.c(y0Var.getIconResId(), text, new org.telegram.ui.xe(wmVar2, 16), false);
                                            } else {
                                                I.c(y0Var.getIconResId(), text, new org.telegram.ui.sc(5, wmVar2, I), false);
                                            }
                                        } else if (y0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) y0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            I.b(y0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.ne(wmVar2, intValue, 4));
                                            if (drawable3 instanceof ch0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                                    org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt2;
                                                    if (y0Var2.getImageView() instanceof fh0) {
                                                        fh0 fh0Var = (fh0) y0Var2.getImageView();
                                                        fh0Var.setAnimation((ch0) drawable3);
                                                        fh0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            I.b(y0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.xp0(y0Var, 26));
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
        d2Var.addView(kw0Var, b8.mf.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        kw0Var.addView(k9Var, b8.mf.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231244);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var)), 1, -1));
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i13 = r2;
                org.telegram.ui.zj zjVar2 = zjVar;
                switch (i13) {
                    case 0:
                        org.telegram.ui.wm wmVar = zjVar2.f52687a;
                        wmVar.f51407n0.c();
                        if (wmVar.X9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", wmVar.getUserConfig().e());
                            wmVar.presentFragment(new r80(bundle, null));
                            return;
                        } else if (org.telegram.messenger.t3.p0(wmVar.f51292e)) {
                            wmVar.presentFragment(ProfileActivity.A4(-wmVar.f51292e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = wmVar.f51292e;
                            if (chat2 != null) {
                                wmVar.presentFragment(ProfileActivity.A4(-chat2.f27001id));
                                return;
                            }
                            TLRPC.User user2 = wmVar.f51306f;
                            if (user2 != null) {
                                wmVar.presentFragment(ProfileActivity.A4(user2.f27150id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.wm wmVar2 = zjVar2.f52687a;
                        org.telegram.ui.ActionBar.q0 q0Var = wmVar2.f51359j0;
                        if (q0Var != null && wmVar2.f51407n0 != null) {
                            q0Var.y();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.g();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = wmVar2.f51359j0.getPopupLayout();
                            f60 I = f60.I(wmVar2, view);
                            boolean z14 = true;
                            for (int i14 = 0; i14 < popupLayout.getItemsCount(); i14++) {
                                View childAt = popupLayout.M.getChildAt(i14);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.c1) {
                                        if (!z14) {
                                            I.k();
                                            z14 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                                        CharSequence text = y0Var.getTextView().getText();
                                        if (y0Var.getIconResId() == 0) {
                                            drawable = y0Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((y0Var.getTag() instanceof Integer) && ((Integer) y0Var.getTag()).intValue() == 29) {
                                            drawable2 = new ch0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.o0 o0Var = wmVar2.f51484t1;
                                        if (o0Var != null && y0Var == o0Var.f28371j) {
                                            if (wmVar2.getMessagesController().r2(wmVar2.f51376k6, wmVar2.b(), null)) {
                                                I.c(y0Var.getIconResId(), text, new org.telegram.ui.xe(wmVar2, 16), false);
                                            } else {
                                                I.c(y0Var.getIconResId(), text, new org.telegram.ui.sc(5, wmVar2, I), false);
                                            }
                                        } else if (y0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) y0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            I.b(y0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.ne(wmVar2, intValue, 4));
                                            if (drawable3 instanceof ch0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                                    org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt2;
                                                    if (y0Var2.getImageView() instanceof fh0) {
                                                        fh0 fh0Var = (fh0) y0Var2.getImageView();
                                                        fh0Var.setAnimation((ch0) drawable3);
                                                        fh0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            I.b(y0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.xp0(y0Var, 26));
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
        d2Var.addView(imageView, b8.mf.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.f36318n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        kw0Var.addView(textView, b8.mf.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i13 = org.telegram.ui.ActionBar.k6.f28273y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i13, e6Var));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        kw0Var.addView(textView2, b8.mf.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new h01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232486);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i13, e6Var), mode));
        frameLayout.addView(imageView2, b8.mf.d(24, 24.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.f36321w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(i13, e6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        editText.addTextChangedListener(new bh.h(this, 25));
        frameLayout.addView(editText, b8.mf.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        d2Var.addView(frameLayout, b8.mf.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        tj0 tj0Var = new tj0(activity, e6Var);
        this.f36319r = tj0Var;
        tj0Var.setLayoutManager(new u4.b0());
        tj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        tj0Var.setClipToPadding(false);
        tj0Var.setVerticalScrollBarEnabled(false);
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.f55620i = xq.h;
        kVar.n(350L);
        tj0Var.setItemAnimator(kVar);
        tj0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        tj0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var)));
        k01 k01Var = new k01(this);
        this.f36320s = k01Var;
        tj0Var.setAdapter(k01Var);
        tj0Var.setOnItemClickListener(new ei.q4(14, this, zjVar));
        tj0Var.setOnItemLongClickListener(new org.telegram.ui.jo(29, this, zjVar));
        tj0Var.j(new i01(this, i3, j10));
        d2Var.addView(tj0Var, b8.mf.f(-1.0f, -1, 119, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        int i14 = org.telegram.ui.ActionBar.k6.f27878d6;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i14, e6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        d2Var.addView(view, b8.mf.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        d2Var.addView(view2, b8.mf.e(-1, 24, 87));
        this.F = view;
        h();
        if (j10 > 0) {
            user = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10));
        } else {
            user = null;
        }
        if (!z11 && !z13 && ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user))) {
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
            int i15 = org.telegram.ui.ActionBar.k6.Gi;
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i15, e6Var));
            textView3.setText(org.telegram.messenger.bd.M0(2131748259, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(2131231177).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i15, e6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var)));
            b8.pf.a(textView3);
            textView3.setOnClickListener(new ux0(1, (Object) this, (Object) zjVar));
            frameLayout2.addView(textView3, b8.mf.c(44.0f, -2));
            d2Var.addView(frameLayout2, b8.mf.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        d2Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(i14, e6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.J + this.I;
    }

    public final void a(float f10, float f11) {
        long j10;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        float f12 = this.f36323y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 27));
        this.K.addListener(new j01(this, 0));
        float abs = Math.abs(f10 - this.f36323y) * getPanelWidth();
        if (Math.abs(f11) > org.telegram.messenger.g0.L(300.0f)) {
            j10 = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f11)) * 1000.0f * 2.0f));
        } else {
            j10 = 320;
        }
        this.K.setDuration(j10);
        this.K.setInterpolator(xq.h);
        this.K.start();
    }

    public final void b() {
        j50 j50Var = this.P;
        if (j50Var != null) {
            org.telegram.messenger.g0.r(j50Var);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.f36308a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    public final void c() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.f36321w);
    }

    public final TLObject d(l01 l01Var) {
        long o10;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.f36308a);
        org.telegram.messenger.mv mvVar = l01Var.f35540b;
        if (mvVar != null) {
            o10 = mvVar.f24264a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = l01Var.f35539a;
            if (tL_forumTopic != null && this.f36312c) {
                o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            } else {
                return null;
            }
        }
        if (o10 >= 0) {
            return s12.a2(Long.valueOf(o10));
        }
        return s12.M0(Long.valueOf(-o10));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23291q5) {
            if (((Long) objArr[0]).longValue() == (-this.f36310b)) {
                g();
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            g();
        } else if (i3 == org.telegram.messenger.hs.f23234g3) {
            if (this.d) {
                g();
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            org.telegram.messenger.g0.d0(this.f36319r, new ei.e(27));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(this.f36323y, 687865856);
        Paint paint = this.f36322x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.zj zjVar = this.f36317f;
        if (zjVar != null && this.f36323y > 0.0f) {
            org.telegram.ui.wm.M2(zjVar.f52687a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        int i3 = 0;
        this.Q = false;
        if (this.f36323y <= 0.0f) {
            i3 = 8;
        }
        setVisibility(i3);
        return dispatchTouchEvent;
    }

    public final String e(long j10) {
        int i3 = this.f36308a;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        if (j10 == org.telegram.messenger.h10.i(i3).e()) {
            return org.telegram.messenger.bd.M0(2131748311, null);
        }
        if (j10 == 2666000) {
            return org.telegram.messenger.bd.M0(2131754252, null);
        }
        if (j10 >= 0) {
            return org.telegram.messenger.l10.p(s12.a2(Long.valueOf(j10)));
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j10));
        if (M0 != null) {
            return M0.title;
        }
        return "";
    }

    public final boolean f(l01 l01Var) {
        String str;
        org.telegram.messenger.mv mvVar = l01Var.f35540b;
        String str2 = "";
        if (mvVar != null) {
            String e10 = e(mvVar.f24264a);
            if (e10 != null) {
                str2 = e10.toString();
            }
        } else {
            TLObject d = d(l01Var);
            if (d instanceof TLRPC.User) {
                str2 = org.telegram.messenger.l10.p((TLRPC.User) d);
            } else if (d instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) d).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = l01Var.f35539a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.M);
    }

    public final void g() {
        boolean z10;
        String str;
        String str2;
        int visibility = getVisibility();
        k01 k01Var = this.f36320s;
        if (visibility != 0 && this.f36323y <= 0.0f && k01Var.f35234c.size() > 0) {
            return;
        }
        ArrayList arrayList = k01Var.f35234c;
        String str3 = k01Var.d;
        n01 n01Var = k01Var.f35235e;
        String str4 = n01Var.M;
        int i3 = n01Var.f36308a;
        int i10 = 0;
        if (TextUtils.equals(str3, str4) && n01Var.f36323y > 0.0f && !arrayList.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k01Var.d = n01Var.M;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(n01Var.M)) {
            arrayList.add(new l01(n01Var));
        }
        if (n01Var.d) {
            ArrayList arrayList3 = org.telegram.messenger.hp.s1(i3).G1().f24441j;
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                l01 l01Var = new l01(n01Var);
                l01Var.f35540b = (org.telegram.messenger.mv) obj;
                if (!TextUtils.isEmpty(n01Var.M) && !n01Var.f(l01Var)) {
                    TLObject d = n01Var.d(l01Var);
                    if (d instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.l10.n((TLRPC.User) d);
                    } else if (d instanceof TLRPC.Chat) {
                        str2 = org.telegram.messenger.t3.K((TLRPC.Chat) d, false);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && str2.toLowerCase().contains(n01Var.M)) {
                    }
                }
                arrayList.add(l01Var);
            }
            if (!z10) {
                k01Var.f();
                return;
            } else {
                u4.o.c(new kg.g(k01Var, arrayList2, 3), true).c(k01Var);
                return;
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList l10 = org.telegram.messenger.hp.s1(i3).f23102q7.l(-n01Var.f36310b);
        if (l10 != null) {
            int size2 = l10.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = l10.get(i12);
                i12++;
                l01 l01Var2 = new l01(n01Var);
                l01Var2.f35539a = (TLRPC.TL_forumTopic) obj2;
                if (!TextUtils.isEmpty(n01Var.M) && !n01Var.f(l01Var2)) {
                    TLObject d10 = n01Var.d(l01Var2);
                    if (d10 instanceof TLRPC.User) {
                        str = org.telegram.messenger.l10.n((TLRPC.User) d10);
                    } else if (d10 instanceof TLRPC.Chat) {
                        str = org.telegram.messenger.t3.K((TLRPC.Chat) d10, false);
                    } else {
                        str = null;
                    }
                    if (str != null && str.toLowerCase().contains(n01Var.M)) {
                    }
                }
                arrayList.add(l01Var2);
                hashSet.add(Long.valueOf(l01Var2.a()));
            }
        }
        if (!TextUtils.isEmpty(n01Var.M)) {
            ArrayList arrayList4 = n01Var.N;
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj3 = arrayList4.get(i10);
                i10++;
                l01 l01Var3 = new l01(n01Var);
                l01Var3.f35539a = (TLRPC.TL_forumTopic) obj3;
                if (hashSet.add(Long.valueOf(l01Var3.a()))) {
                    arrayList.add(l01Var3);
                }
            }
        }
        if (!z10) {
            k01Var.f();
        } else {
            u4.o.c(new kg.g(k01Var, arrayList2, 3), true).c(k01Var);
        }
    }

    public int getContentWidth() {
        return this.J;
    }

    public float getProgress() {
        return this.f36323y;
    }

    public final void h() {
        View view;
        View view2 = this.F;
        if (view2 != null && (view = this.G) != null) {
            tj0 tj0Var = this.f36319r;
            view2.setAlpha(Utilities.i(tj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            if (this.E != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((tj0Var.computeVerticalScrollRange() - tj0Var.computeVerticalScrollOffset()) - tj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.f36308a;
        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.f23291q5);
        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.f23234g3);
        org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.f23246i4);
        g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.f36308a;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23291q5);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23234g3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        b();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            this.T = false;
            this.U = true;
            this.V = this.f36323y;
            VelocityTracker velocityTracker = this.W;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.W = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.U) {
            VelocityTracker velocityTracker2 = this.W;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.R;
            float y9 = motionEvent.getY() - this.S;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y9) * 1.5f) {
                this.T = true;
                this.R = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.k1 a10 = r0.b0.a(this);
        if (a10 != null) {
            i13 = a10.f54026a.f(2).d;
        } else {
            i13 = 0;
        }
        if (i13 != this.H) {
            this.H = i13;
            tj0 tj0Var = this.f36319r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                tj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                tj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        org.telegram.ui.wm wmVar;
        org.telegram.ui.ActionBar.q0 m92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.k1 a10 = r0.b0.a(this);
        int i12 = 0;
        if (a10 != null) {
            i11 = org.telegram.messenger.g0.I0(a10, false).f14497c;
        } else {
            i11 = 0;
        }
        int i13 = this.I;
        ai.d2 d2Var = this.h;
        if (i11 != i13) {
            this.I = i11;
            d2Var.getLayoutParams().width = getPanelWidth();
            d2Var.setPadding(0, 0, i11, 0);
            d2Var.setTranslationX((1.0f - this.f36323y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i3);
        org.telegram.ui.zj zjVar = this.f36317f;
        if (zjVar != null && (m92 = (wmVar = zjVar.f52687a).m9()) != null) {
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            i12 = (int) ((kVar.getWidth() - ((m92.getWidth() / 2.0f) + (m92.getX() + ((View) m92.getParent()).getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.I) - i12));
        if (max != this.J) {
            this.J = max;
            d2Var.getLayoutParams().width = getPanelWidth();
            d2Var.setTranslationX((1.0f - this.f36323y) * getPanelWidth());
            this.f36320s.f();
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n01.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j10) {
        this.L = j10;
        this.f36320s.f();
    }

    public void setMenuAvailable(boolean z10) {
        int i3;
        ImageView imageView = this.f36318n;
        if (imageView != null) {
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
    }

    public void setProgress(float f10) {
        int i3;
        this.f36323y = Utilities.l(f10);
        this.h.setTranslationX((1.0f - this.f36323y) * getPanelWidth());
        if (this.f36323y <= 0.0f && !this.Q) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        setVisibility(i3);
        invalidate();
        org.telegram.ui.zj zjVar = this.f36317f;
        if (zjVar != null) {
            zjVar.f52687a.m1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z10 = false;
        float f11 = 0.0f;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.f36323y > 0.5f : f10 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            g();
        }
        if (z10) {
            f11 = 1.0f;
        }
        a(f11, f10);
        if (!z10) {
            org.telegram.messenger.g0.v1(this.f36321w);
        }
    }
}
