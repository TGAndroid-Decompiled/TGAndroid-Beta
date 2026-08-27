package org.telegram.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class je0 extends org.telegram.ui.Components.ev0 {
    public int A;
    public int B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public Bundle H;
    public boolean I;
    public Timer J;
    public final Object K;
    public int L;
    public double M;
    public boolean N;
    public Bundle O;
    public TLRPC.TL_auth_sentCode P;
    public final ge0 Q;
    public final ge0 R;
    public float S;
    public final ig0 T;

    public final int f39350a;

    public final org.telegram.ui.Components.jc0 f39351b;

    public final gg.g f39352c;
    public final org.telegram.ui.Components.voip.m2 d;

    public final TextView f39353e;

    public final TextView f39354f;
    public final org.telegram.ui.Components.ri0 h;

    public final TextView f39355n;

    public final TextView f39356r;

    public final TextView f39357s;
    public final kf0 v;

    public boolean f39358w;

    public boolean f39359x;

    public boolean f39360y;

    public je0(ig0 ig0Var, Context context, int i10) {
        boolean z10;
        super(context);
        this.T = ig0Var;
        this.f39358w = true;
        this.f39359x = false;
        this.f39360y = false;
        this.K = new Object();
        this.L = 60000;
        this.Q = new ge0(this, 1);
        this.R = new ge0(this, 2);
        this.S = -3.0f;
        this.f39350a = i10;
        boolean z11 = i10 != 16;
        setOrientation(1);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.h = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.f(R.raw.bubble, 95, 95, null);
        if (AndroidUtilities.isSmallScreen()) {
            z10 = true;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        ri0Var.setVisibility(z10 ? 8 : 0);
        addView(ri0Var, h7.z5.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView = new TextView(context);
        this.f39355n = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
        addView(textView, h7.z5.t(-2, -2, 1, 8, z10 ? 25 : 0, 8, 0));
        TextView textView2 = new TextView(context);
        this.f39356r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, h7.z5.t(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
        this.f39351b = jc0Var;
        jc0Var.setText(LocaleController.getString(!z11 ? R.string.SMSWord : R.string.SMSPhrase));
        gg.g gVar = new gg.g(this, context, 9);
        this.f39352c = gVar;
        gVar.setSingleLine();
        gVar.setLines(1);
        gVar.setCursorSize(AndroidUtilities.dp(20.0f));
        gVar.setCursorWidth(1.5f);
        gVar.setImeOptions(268435461);
        gVar.setTextSize(1, 18.0f);
        gVar.setMaxLines(1);
        gVar.setBackground(null);
        gVar.setHint(LocaleController.getString(!z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
        gVar.addTextChangedListener(new org.telegram.ui.Cells.f3(this));
        gVar.setEllipsizeByGradient(true);
        gVar.setInputType(1);
        gVar.setTypeface(Typeface.DEFAULT);
        gVar.setGravity(LocaleController.isRTL ? 5 : 3);
        gVar.setOnFocusChangeListener(new ld(this, 5));
        TextView textView3 = new TextView(context);
        this.f39357s = textView3;
        org.telegram.ui.Cells.pa.m(12.0f, 1, textView3);
        textView3.setPadding(org.telegram.ui.Cells.pa.c(10.0f, R.string.Paste, textView3), 0, AndroidUtilities.dp(10.0f), 0);
        textView3.setGravity(17);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23251o6, ((org.telegram.ui.ActionBar.n2) ig0Var).resourceProvider);
        textView3.setTextColor(iV0);
        int iDp = AndroidUtilities.dp(6.0f);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.12f, iV0);
        int iL2 = org.telegram.ui.ActionBar.g6.l1(0.15f, iV0);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iL1, iL2, iL2));
        h7.b6.b(textView3, 0.1f, 1.5f);
        gVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
        final int i11 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final je0 f38792b;

            {
                this.f38792b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence charSequenceCoerceToText;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i11) {
                    case 0:
                        je0 je0Var = this.f38792b;
                        gg.g gVar2 = je0Var.f39352c;
                        try {
                            charSequenceCoerceToText = ((ClipboardManager) je0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(je0Var.getContext());
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            charSequenceCoerceToText = null;
                        }
                        if (charSequenceCoerceToText != null) {
                            Editable text = gVar2.getText();
                            je0Var.f39360y = true;
                            if (text != null) {
                                int iMax = Math.max(0, gVar2.getSelectionStart());
                                text.replace(iMax, Math.max(iMax, gVar2.getSelectionEnd()), charSequenceCoerceToText);
                            }
                        }
                        je0Var.q(true);
                        break;
                    case 1:
                        this.f38792b.c(true);
                        break;
                    default:
                        final je0 je0Var2 = this.f38792b;
                        ig0 ig0Var2 = je0Var2.T;
                        kf0 kf0Var = je0Var2.v;
                        if (je0Var2.L <= 0 || je0Var2.J == null) {
                            Bundle bundle = je0Var2.O;
                            if (bundle != null && (tL_auth_sentCode = je0Var2.P) != null) {
                                ig0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i12 = je0Var2.A;
                                if (i12 == 4 || i12 == 2 || i12 == 11 || i12 == 15) {
                                    je0Var2.I = true;
                                    kf0Var.invalidate();
                                    kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                    kf0Var.setTextSize(1, 15.0f);
                                    int i13 = je0Var2.A;
                                    if (i13 == 4 || i13 == 11) {
                                        kf0Var.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        kf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    bundle2.putString("phone", je0Var2.F);
                                    bundle2.putString("ephone", je0Var2.E);
                                    bundle2.putString("phoneFormated", je0Var2.C);
                                    bundle2.putInt("prevType", je0Var2.f39350a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = je0Var2.C;
                                    tL_auth_resendCode.phone_code_hash = je0Var2.D;
                                    final int i14 = 0;
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i14) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new fe0(je0Var2, tLObject, bundle2, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new fe0(je0Var2, tL_error, bundle2, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                } else if (i12 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    if (!je0Var2.N && !je0Var2.I && !ig0Var2.f39094k0) {
                                        je0Var2.I = true;
                                        kf0Var.invalidate();
                                        kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                        final Bundle bundle3 = new Bundle();
                                        bundle3.putString("phone", je0Var2.F);
                                        bundle3.putString("ephone", je0Var2.E);
                                        bundle3.putString("phoneFormated", je0Var2.C);
                                        je0Var2.N = true;
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode2.phone_number = je0Var2.C;
                                        tL_auth_resendCode2.phone_code_hash = je0Var2.D;
                                        final int i15 = 1;
                                        ig0Var2.n1(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(tL_auth_resendCode2, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                switch (i15) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(new fe0(je0Var2, tLObject, bundle3, tL_error));
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(new fe0(je0Var2, tL_error, bundle3, tLObject));
                                                        break;
                                                }
                                            }
                                        }, 10), true);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        jc0Var.addView(gVar, h7.z5.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        jc0Var.e(gVar);
        jc0Var.addView(textView3, h7.z5.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(jc0Var, h7.z5.q(-1, -2, 1));
        addView(linearLayout, h7.z5.t(-1, -2, 1, 16, 3, 16, 0));
        gVar.setOnEditorActionListener(new fa(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, h7.z5.n(-1, -2));
        org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(ig0Var, context);
        this.d = m2Var;
        int i12 = org.telegram.ui.ActionBar.g6.I6;
        m2Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        m2Var.setTextColor(ig0Var.getThemedColor(i12));
        m2Var.setTextSize(1, 14.0f);
        m2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        m2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i13 = 1;
        m2Var.setOnClickListener(new View.OnClickListener(this) {

            public final je0 f38792b;

            {
                this.f38792b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence charSequenceCoerceToText;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i13) {
                    case 0:
                        je0 je0Var = this.f38792b;
                        gg.g gVar2 = je0Var.f39352c;
                        try {
                            charSequenceCoerceToText = ((ClipboardManager) je0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(je0Var.getContext());
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            charSequenceCoerceToText = null;
                        }
                        if (charSequenceCoerceToText != null) {
                            Editable text = gVar2.getText();
                            je0Var.f39360y = true;
                            if (text != null) {
                                int iMax = Math.max(0, gVar2.getSelectionStart());
                                text.replace(iMax, Math.max(iMax, gVar2.getSelectionEnd()), charSequenceCoerceToText);
                            }
                        }
                        je0Var.q(true);
                        break;
                    case 1:
                        this.f38792b.c(true);
                        break;
                    default:
                        final je0 je0Var2 = this.f38792b;
                        ig0 ig0Var2 = je0Var2.T;
                        kf0 kf0Var = je0Var2.v;
                        if (je0Var2.L <= 0 || je0Var2.J == null) {
                            Bundle bundle = je0Var2.O;
                            if (bundle != null && (tL_auth_sentCode = je0Var2.P) != null) {
                                ig0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i14 = je0Var2.A;
                                if (i14 == 4 || i14 == 2 || i14 == 11 || i14 == 15) {
                                    je0Var2.I = true;
                                    kf0Var.invalidate();
                                    kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                    kf0Var.setTextSize(1, 15.0f);
                                    int i15 = je0Var2.A;
                                    if (i15 == 4 || i15 == 11) {
                                        kf0Var.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        kf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    bundle2.putString("phone", je0Var2.F);
                                    bundle2.putString("ephone", je0Var2.E);
                                    bundle2.putString("phoneFormated", je0Var2.C);
                                    bundle2.putInt("prevType", je0Var2.f39350a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = je0Var2.C;
                                    tL_auth_resendCode.phone_code_hash = je0Var2.D;
                                    final int i16 = 0;
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new fe0(je0Var2, tLObject, bundle2, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new fe0(je0Var2, tL_error, bundle2, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                } else if (i14 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    if (!je0Var2.N && !je0Var2.I && !ig0Var2.f39094k0) {
                                        je0Var2.I = true;
                                        kf0Var.invalidate();
                                        kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                        final Bundle bundle3 = new Bundle();
                                        bundle3.putString("phone", je0Var2.F);
                                        bundle3.putString("ephone", je0Var2.E);
                                        bundle3.putString("phoneFormated", je0Var2.C);
                                        je0Var2.N = true;
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode2.phone_number = je0Var2.C;
                                        tL_auth_resendCode2.phone_code_hash = je0Var2.D;
                                        final int i17 = 1;
                                        ig0Var2.n1(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(tL_auth_resendCode2, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                switch (i17) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(new fe0(je0Var2, tLObject, bundle3, tL_error));
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(new fe0(je0Var2, tL_error, bundle3, tLObject));
                                                        break;
                                                }
                                            }
                                        }, 10), true);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        addView(m2Var, h7.z5.t(-2, -2, 1, 0, 18, 0, 0));
        m2Var.setVisibility(8);
        TextView textView4 = new TextView(context);
        this.f39353e = textView4;
        textView4.setPivotX(0.0f);
        textView4.setPivotY(0.0f);
        textView4.setText(LocaleController.getString(!z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        textView4.setTextColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
        textView4.setTextSize(1, 13.0f);
        frameLayout.addView(textView4, h7.z5.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        textView4.setAlpha(0.0f);
        textView4.setScaleX(0.8f);
        textView4.setScaleY(0.8f);
        textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
        TextView textView5 = new TextView(context);
        this.f39354f = textView5;
        textView5.setPivotX(0.0f);
        textView5.setPivotY(0.0f);
        textView5.setText(LocaleController.getString(!z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
        textView5.setTextColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
        textView5.setTextSize(1, 13.0f);
        frameLayout.addView(textView5, h7.z5.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        kf0 kf0Var = new kf0(this, context);
        this.v = kf0Var;
        kf0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        kf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        kf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        kf0Var.setTextSize(1, 15.0f);
        kf0Var.setGravity(19);
        final int i14 = 2;
        kf0Var.setOnClickListener(new View.OnClickListener(this) {

            public final je0 f38792b;

            {
                this.f38792b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence charSequenceCoerceToText;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i14) {
                    case 0:
                        je0 je0Var = this.f38792b;
                        gg.g gVar2 = je0Var.f39352c;
                        try {
                            charSequenceCoerceToText = ((ClipboardManager) je0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(je0Var.getContext());
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            charSequenceCoerceToText = null;
                        }
                        if (charSequenceCoerceToText != null) {
                            Editable text = gVar2.getText();
                            je0Var.f39360y = true;
                            if (text != null) {
                                int iMax = Math.max(0, gVar2.getSelectionStart());
                                text.replace(iMax, Math.max(iMax, gVar2.getSelectionEnd()), charSequenceCoerceToText);
                            }
                        }
                        je0Var.q(true);
                        break;
                    case 1:
                        this.f38792b.c(true);
                        break;
                    default:
                        final je0 je0Var2 = this.f38792b;
                        ig0 ig0Var2 = je0Var2.T;
                        kf0 kf0Var2 = je0Var2.v;
                        if (je0Var2.L <= 0 || je0Var2.J == null) {
                            Bundle bundle = je0Var2.O;
                            if (bundle != null && (tL_auth_sentCode = je0Var2.P) != null) {
                                ig0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i15 = je0Var2.A;
                                if (i15 == 4 || i15 == 2 || i15 == 11 || i15 == 15) {
                                    je0Var2.I = true;
                                    kf0Var2.invalidate();
                                    kf0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                    kf0Var2.setTextSize(1, 15.0f);
                                    int i16 = je0Var2.A;
                                    if (i16 == 4 || i16 == 11) {
                                        kf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        kf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    bundle2.putString("phone", je0Var2.F);
                                    bundle2.putString("ephone", je0Var2.E);
                                    bundle2.putString("phoneFormated", je0Var2.C);
                                    bundle2.putInt("prevType", je0Var2.f39350a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = je0Var2.C;
                                    tL_auth_resendCode.phone_code_hash = je0Var2.D;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new fe0(je0Var2, tLObject, bundle2, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new fe0(je0Var2, tL_error, bundle2, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                } else if (i15 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    if (!je0Var2.N && !je0Var2.I && !ig0Var2.f39094k0) {
                                        je0Var2.I = true;
                                        kf0Var2.invalidate();
                                        kf0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                        final Bundle bundle3 = new Bundle();
                                        bundle3.putString("phone", je0Var2.F);
                                        bundle3.putString("ephone", je0Var2.E);
                                        bundle3.putString("phoneFormated", je0Var2.C);
                                        je0Var2.N = true;
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode2.phone_number = je0Var2.C;
                                        tL_auth_resendCode2.phone_code_hash = je0Var2.D;
                                        final int i18 = 1;
                                        ig0Var2.n1(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(tL_auth_resendCode2, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                switch (i18) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(new fe0(je0Var2, tLObject, bundle3, tL_error));
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(new fe0(je0Var2, tL_error, bundle3, tLObject));
                                                        break;
                                                }
                                            }
                                        }, 10), true);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(kf0Var, h7.z5.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout2, h7.z5.q(-1, -1, 80));
        i6.q2(kf0Var);
    }

    public static String t(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) <= ' ') {
            i10++;
        }
        return (i10 > 0 || length < str.length()) ? str.substring(i10, length) : str;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        ig0 ig0Var = this.T;
        ig0Var.k1(true, true);
        int i10 = this.B;
        if (i10 != 0) {
            ig0Var.u1(i10, true, null, true);
            return false;
        }
        this.H = null;
        this.N = false;
        return true;
    }

    @Override
    public final void d() {
        this.N = false;
    }

    @Override
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.Q);
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (this.N) {
            return;
        }
        String string = this.f39352c.getText().toString();
        if (string.length() == 0) {
            s(false);
            return;
        }
        if (!p(string)) {
            s(true);
            return;
        }
        this.N = true;
        TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
        tL_auth_signIn.phone_number = this.C;
        tL_auth_signIn.phone_code = string;
        tL_auth_signIn.phone_code_hash = this.D;
        tL_auth_signIn.flags |= 1;
        ig0 ig0Var = this.T;
        ig0Var.n1(ig0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new ce0(this, tL_auth_signIn, 0), 10), true);
        ig0Var.v1(true, true);
    }

    @Override
    public final void i() {
        q(true);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ge0(this, 3), ig0.f39078p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f39350a);
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.H != null) {
            bundle.putBundle("recoveryview_word" + this.f39350a, this.H);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        kf0 kf0Var = this.v;
        if (bundle == null) {
            if (this.O == null || this.P == null) {
                return;
            }
            kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
            int i11 = this.A;
            if (i11 == 17) {
                i10 = R.string.ReturnEnteringPhrase;
            } else if (i11 == 16) {
                i10 = R.string.ReturnEnteringWord;
            } else {
                i10 = i11 == 3 ? R.string.ReturnPhoneCall : R.string.ReturnEnteringSMS;
            }
            kf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i10), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
            return;
        }
        gg.g gVar = this.f39352c;
        gVar.setText("");
        this.H = bundle;
        this.G = null;
        this.A = bundle.getInt("nextType");
        this.B = bundle.getInt("prevType", 0);
        this.E = bundle.getString("ephone");
        if (this.H.containsKey("beginning")) {
            this.G = this.H.getString("beginning");
        }
        this.C = bundle.getString("phoneFormated");
        this.D = bundle.getString("phoneHash");
        this.F = this.H.getString("phone");
        this.L = bundle.getInt("timeout");
        int i12 = this.B;
        org.telegram.ui.Components.voip.m2 m2Var = this.d;
        if (i12 == 17) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i12 == 16) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i12 == 1 || i12 == 2 || i12 == 4 || i12 == 3 || i12 == 15) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else {
            m2Var.setVisibility(8);
        }
        this.O = null;
        this.P = null;
        this.N = false;
        this.I = false;
        ig0 ig0Var = this.T;
        ig0Var.f39094k0 = false;
        kf0Var.invalidate();
        boolean z11 = this.f39350a != 16;
        String str = "+" + oe.b.c().b(oe.b.d(this.F, false));
        String str2 = this.G;
        TextView textView = this.f39356r;
        if (str2 == null) {
            org.telegram.messenger.rl.n(!z11 ? R.string.SMSWordText : R.string.SMSPhraseText, new Object[]{str}, textView);
        } else {
            org.telegram.messenger.rl.n(!z11 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, new Object[]{str, str2}, textView);
        }
        ig0.T0(ig0Var, gVar);
        gVar.requestFocus();
        org.telegram.ui.Components.ri0 ri0Var = this.h;
        if (ri0Var.getAnimatedDrawable() != null) {
            ri0Var.getAnimatedDrawable().L(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new r00(ri0Var, 20), 500L);
        q(false);
        o(false);
        this.M = System.currentTimeMillis();
        int i13 = org.telegram.ui.ActionBar.g6.f23423y6;
        kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int i14 = this.A;
        if (i14 != 2 && i14 != 4 && i14 != 3) {
            kf0Var.setVisibility(8);
            return;
        }
        if (this.J != null) {
            return;
        }
        kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        kf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i13));
        Timer timer = new Timer();
        this.J = timer;
        timer.schedule(new ie0(this), 0L, 1000L);
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        ig0 ig0Var = this.T;
        this.f39355n.setTextColor(ig0Var.getThemedColor(i10));
        this.f39356r.setTextColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.g6.D6));
        int themedColor = ig0Var.getThemedColor(i10);
        gg.g gVar = this.f39352c;
        gVar.setTextColor(themedColor);
        gVar.setCursorColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23198l6));
        gVar.setHintTextColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        this.f39351b.f();
    }

    public final void o(boolean z10) {
        this.f39359x = z10;
        float f10 = 0.0f;
        float f11 = z10 ? 1.0f : 0.0f;
        this.f39351b.a(f11);
        float f12 = (f11 * 0.1f) + 0.9f;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.f39353e.animate().scaleX(f12).scaleY(f12).alpha(f11).translationY((1.0f - f11) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        org.telegram.messenger.rl.o(viewPropertyAnimatorTranslationY, erVar, 290L);
        if (this.f39358w && !this.f39359x) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        this.f39354f.animate().scaleX(f13).scaleY(f13).alpha(f10).translationY((1.0f - f10) * AndroidUtilities.dp(this.f39359x ? 5.0f : -5.0f)).setInterpolator(erVar).setDuration(290L).start();
    }

    public final boolean p(String str) {
        if (this.G == null) {
            return true;
        }
        String lowerCase = t(str).toLowerCase();
        String lowerCase2 = this.G.toLowerCase();
        int iMin = Math.min(lowerCase.length(), lowerCase2.length());
        if (iMin <= 0) {
            return true;
        }
        return TextUtils.equals(lowerCase.substring(0, iMin), lowerCase2.substring(0, iMin));
    }

    public final void q(boolean z10) {
        ge0 ge0Var = this.Q;
        AndroidUtilities.cancelRunOnUIThread(ge0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z11 = TextUtils.isEmpty(this.f39352c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        if (this.f39358w != z11) {
            this.f39358w = z11;
            float f10 = 0.9f;
            TextView textView = this.f39357s;
            TextView textView2 = this.f39354f;
            float fDp = 0.0f;
            if (z10) {
                ViewPropertyAnimator viewPropertyAnimatorScaleY = textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.7f).scaleY(z11 ? 1.0f : 0.7f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                viewPropertyAnimatorScaleY.setInterpolator(erVar).setDuration(300L).start();
                ViewPropertyAnimator viewPropertyAnimatorScaleX = textView2.animate().scaleX((!this.f39358w || this.f39359x) ? 0.9f : 1.0f);
                if (this.f39358w && !this.f39359x) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorScaleX.scaleY(f10).alpha((!this.f39358w || this.f39359x) ? 0.0f : 1.0f);
                if (!this.f39358w || this.f39359x) {
                    fDp = AndroidUtilities.dp(this.f39359x ? 5.0f : -5.0f);
                }
                viewPropertyAnimatorAlpha.translationY(fDp).setInterpolator(erVar).setDuration(300L).start();
            } else {
                textView.setAlpha(z11 ? 1.0f : 0.0f);
                textView.setScaleX(z11 ? 1.0f : 0.7f);
                textView.setScaleY(z11 ? 1.0f : 0.7f);
                textView2.setScaleX((!this.f39358w || this.f39359x) ? 0.9f : 1.0f);
                if (this.f39358w && !this.f39359x) {
                    f10 = 1.0f;
                }
                textView2.setScaleY(f10);
                textView2.setAlpha((!this.f39358w || this.f39359x) ? 0.0f : 1.0f);
                if (!this.f39358w || this.f39359x) {
                    fDp = AndroidUtilities.dp(this.f39359x ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(fDp);
            }
        }
        AndroidUtilities.runOnUIThread(ge0Var, 5000L);
    }

    public final void r() {
        kf0 kf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.g6.f23423y6;
        kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.K) {
                try {
                    Timer timer = this.J;
                    if (timer != null) {
                        timer.cancel();
                        this.J = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void s(boolean z10) {
        gg.g gVar = this.f39352c;
        if (this.T.getParentActivity() == null) {
            return;
        }
        try {
            gVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z11 = this.f39350a != 16;
        TextView textView = this.f39353e;
        if (z10) {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
        } else if (TextUtils.isEmpty(gVar.getText())) {
            textView.setText("");
        } else {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        }
        if (!this.f39359x && !this.f39360y) {
            AndroidUtilities.shakeViewSpring(gVar, this.S);
            AndroidUtilities.shakeViewSpring(textView, this.S);
        }
        ge0 ge0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(ge0Var);
        o(true);
        AndroidUtilities.runOnUIThread(ge0Var, 10000L);
        this.S = -this.S;
    }
}
