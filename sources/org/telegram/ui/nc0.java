package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nc0 extends org.telegram.ui.Components.vt0 implements org.telegram.ui.Components.e30 {
    public final TextView E;
    public String F;
    public String G;
    public Bundle H;
    public boolean I;
    public final org.telegram.ui.Components.ch0 J;
    public final org.telegram.ui.Components.ch0 K;
    public boolean L;
    public final org.telegram.ui.Components.f30 M;
    public TLRPC.FileLocation N;
    public TLRPC.FileLocation O;
    public final xd0 P;
    public final org.telegram.ui.Components.gb0 f47956a;
    public final org.telegram.ui.Components.gb0 f47957b;
    public final EditTextBoldCursor f47958c;
    public final EditTextBoldCursor d;
    public final ei.d4 f47959e;
    public final org.telegram.ui.Components.u8 f47960f;
    public final gi.n5 h;
    public final xc f47961n;
    public final yc f47962r;
    public AnimatorSet f47963s;
    public final TextView f47964w;
    public final TextView f47965x;
    public final TextView f47966y;

    public nc0(xd0 xd0Var, Context context) {
        super(context);
        int i3;
        float f10;
        this.P = xd0Var;
        this.I = false;
        this.L = true;
        setOrientation(1);
        org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, false, false);
        this.M = f30Var;
        f30Var.I = true;
        f30Var.K = false;
        f30Var.H = false;
        f30Var.L = false;
        f30Var.f33681a = xd0Var;
        f30Var.f33682b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, b8.mf.r(78, 78, 1));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f47960f = u8Var;
        ei.d4 d4Var = new ei.d4(10, context, this);
        this.f47959e = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(64.0f));
        u8Var.g(13);
        u8Var.k(5L, null, null, null);
        d4Var.setImageDrawable(u8Var);
        frameLayout.addView(d4Var, b8.mf.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        gi.n5 n5Var = new gi.n5(this, context, paint, 14);
        this.h = n5Var;
        frameLayout.addView(n5Var, b8.mf.c(-1.0f, -1));
        n5Var.setOnClickListener(new View.OnClickListener(this) {
            public final nc0 f46239b;

            {
                this.f46239b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        nc0 nc0Var = this.f46239b;
                        xc xcVar = nc0Var.f47961n;
                        org.telegram.ui.Components.ch0 ch0Var = nc0Var.J;
                        org.telegram.ui.Components.f30 f30Var2 = nc0Var.M;
                        if (nc0Var.N != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f30Var2.n(z10, new xa0(nc0Var, 1), new s5(nc0Var, 8), 0);
                        nc0Var.L = false;
                        xcVar.setAnimation(ch0Var);
                        ch0Var.M(0);
                        ch0Var.P(43);
                        xcVar.d();
                        return;
                    default:
                        nc0 nc0Var2 = this.f46239b;
                        if (nc0Var2.P.W.getTag() == null) {
                            nc0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131623959, org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f), false, null);
        this.J = ch0Var;
        this.K = new org.telegram.ui.Components.ch0(2131623967, org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f), false, null);
        xc xcVar = new xc(4, context, this);
        this.f47961n = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setAnimation(ch0Var);
        xcVar.setEnabled(false);
        xcVar.setClickable(false);
        frameLayout.addView(xcVar, b8.mf.c(-1.0f, -1));
        xcVar.addOnAttachStateChangeListener(new mc0(this));
        yc ycVar = new yc(this, context, 2);
        this.f47962r = ycVar;
        ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
        ycVar.setProgressColor(-1);
        frameLayout.addView(ycVar, b8.mf.c(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setText(org.telegram.messenger.bd.M0(2131746346, null));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, b8.mf.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.f47964w = textView2;
        textView2.setText(org.telegram.messenger.bd.M0(2131746347, "RegisterText2"));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, b8.mf.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, b8.mf.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
        this.f47956a = gb0Var;
        gb0Var.setText(org.telegram.messenger.bd.M0(2131750695, null));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f47958c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final nc0 f46598b;

            {
                this.f46598b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.gb0 gb0Var2 = this.f46598b.f47956a;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        gb0Var2.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.gb0 gb0Var3 = this.f46598b.f47957b;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        gb0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        gb0Var.e(editTextBoldCursor);
        gb0Var.addView(editTextBoldCursor, b8.mf.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final nc0 f46896b;

            {
                this.f46896b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        nc0 nc0Var = this.f46896b;
                        if (i10 == 5) {
                            nc0Var.d.requestFocus();
                            return true;
                        }
                        nc0Var.getClass();
                        return false;
                    default:
                        nc0 nc0Var2 = this.f46896b;
                        nc0Var2.getClass();
                        if (i10 != 6 && i10 != 5) {
                            return false;
                        }
                        nc0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.gb0 gb0Var2 = new org.telegram.ui.Components.gb0(context, null);
        this.f47957b = gb0Var2;
        gb0Var2.setText(org.telegram.messenger.bd.M0(2131749040, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final nc0 f46598b;

            {
                this.f46598b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.gb0 gb0Var22 = this.f46598b.f47956a;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        gb0Var22.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.gb0 gb0Var3 = this.f46598b.f47957b;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        gb0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        gb0Var2.e(editTextBoldCursor2);
        gb0Var2.addView(editTextBoldCursor2, b8.mf.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final nc0 f46896b;

            {
                this.f46896b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        nc0 nc0Var = this.f46896b;
                        if (i10 == 5) {
                            nc0Var.d.requestFocus();
                            return true;
                        }
                        nc0Var.getClass();
                        return false;
                    default:
                        nc0 nc0Var2 = this.f46896b;
                        nc0Var2.getClass();
                        if (i10 != 6 && i10 != 5) {
                            return false;
                        }
                        nc0Var2.h(null);
                        return true;
                }
            }
        });
        boolean O1 = org.telegram.messenger.g0.O1();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (O1) {
            LinearLayout linearLayout = new LinearLayout(xd0Var.getParentActivity());
            linearLayout.setOrientation(0);
            gb0Var.setText(org.telegram.messenger.bd.M0(2131750694, null));
            gb0Var2.setText(org.telegram.messenger.bd.M0(2131749039, null));
            linearLayout.addView(gb0Var, b8.mf.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(gb0Var2, b8.mf.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor2);
            }
        } else {
            gb0Var.setText(org.telegram.messenger.bd.M0(2131750695, null));
            gb0Var2.setText(org.telegram.messenger.bd.M0(2131749040, null));
            frameLayout2.addView(gb0Var, b8.mf.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(gb0Var2, b8.mf.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f47965x = textView3;
        textView3.setText(org.telegram.messenger.bd.M0(2131752572, "CancelRegistration"));
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView3.setGravity(i3 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView3.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, b8.mf.t(-2, -2, (org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final nc0 f46239b;

            {
                this.f46239b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        nc0 nc0Var = this.f46239b;
                        xc xcVar2 = nc0Var.f47961n;
                        org.telegram.ui.Components.ch0 ch0Var2 = nc0Var.J;
                        org.telegram.ui.Components.f30 f30Var2 = nc0Var.M;
                        if (nc0Var.N != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f30Var2.n(z10, new xa0(nc0Var, 1), new s5(nc0Var, 8), 0);
                        nc0Var.L = false;
                        xcVar2.setAnimation(ch0Var2);
                        ch0Var2.M(0);
                        ch0Var2.P(43);
                        xcVar2.d();
                        return;
                    default:
                        nc0 nc0Var2 = this.f46239b;
                        if (nc0Var2.P.W.getTag() == null) {
                            nc0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, b8.mf.r(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f47966y = textView4;
        textView4.setMovementMethod(new org.telegram.messenger.c0(false));
        if (org.telegram.messenger.g0.O1()) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView4.setTextSize(1, f10);
        textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, b8.mf.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        k4.j.k(textView4);
        String M0 = org.telegram.messenger.bd.M0(2131744207, "TermsOfServiceLogin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new gi.ka(this, 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new hc0(this, photoSize2, photoSize, 1));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        xd0 xd0Var = this.P;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131742958, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131754080, "AreYouSureRegistration");
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131744851, "Stop"), new gc0(this, 0));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, "Continue"), null);
            xd0Var.showDialog(s1Var);
            return false;
        }
        xd0Var.t1(true, true);
        this.I = false;
        this.H = null;
        return true;
    }

    @Override
    public final void d() {
        this.I = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131742820, "YourName");
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(String str) {
        int i3;
        if (this.I) {
            return;
        }
        xd0 xd0Var = this.P;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = xd0Var.f51969r0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f47958c;
        if (editTextBoldCursor.length() == 0) {
            xd0.b1(xd0Var, this.f47956a, true);
            return;
        }
        this.I = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.G;
        tL_auth_signUp.phone_number = this.F;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        xd0Var.w1(0, true);
        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signUp, new l(this, 12), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f47966y;
        if (textView != null) {
            if (this.P.f51955f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(org.telegram.messenger.g0.F).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f47958c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            org.telegram.messenger.g0.K3(editTextBoldCursor);
        }
        org.telegram.messenger.g0.i3(new xa0(this, 3), xd0.f51945z0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.P.f51969r0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f47958c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f47958c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        xd0 xd0Var = this.P;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = xd0Var.f51969r0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            xd0Var.f51969r0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.H;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f47958c.setText("");
        this.d.setText("");
        this.F = bundle.getString("phoneFormated");
        this.G = bundle.getString("phoneHash");
        this.H = bundle;
    }

    public final void n() {
        this.f47966y.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(org.telegram.messenger.g0.G).start();
    }

    public final void o(boolean z10) {
        xc xcVar = this.f47961n;
        if (xcVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f47963s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f47963s = null;
        }
        yc ycVar = this.f47962r;
        if (z10) {
            this.f47963s = new AnimatorSet();
            xcVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f47963s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, property, 1.0f), ObjectAnimator.ofFloat(ycVar, property, 0.0f));
            this.f47963s.setDuration(180L);
            this.f47963s.addListener(new y20(this, 4));
            this.f47963s.start();
            return;
        }
        xcVar.setAlpha(1.0f);
        xcVar.setVisibility(0);
        ycVar.setAlpha(0.0f);
        ycVar.setVisibility(4);
    }

    public final void p(boolean z10) {
        xd0 xd0Var = this.P;
        if (xd0Var.f51969r0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131744208, "TermsOfService");
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        if (z10) {
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754717, "Accept"), new gc0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751605, "Decline"), new gc0(this, 2));
        } else {
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xd0Var.f51969r0.text);
        org.telegram.messenger.zi.b(spannableStringBuilder, xd0Var.f51969r0.entities, false, false, false, false, 0);
        s1Var.U = spannableStringBuilder;
        xd0Var.showDialog(s1Var);
    }

    @Override
    public final void updateColors() {
        this.f47960f.invalidateSelf();
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.E.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        this.f47964w.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        EditTextBoldCursor editTextBoldCursor = this.f47958c;
        editTextBoldCursor.setTextColor(x02);
        int i11 = org.telegram.ui.ActionBar.k6.f28026l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f47965x.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false));
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        TextView textView = this.f47966y;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        this.f47956a.f();
        this.f47957b.f();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void H(float f10) {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z10, boolean z11) {
    }
}
