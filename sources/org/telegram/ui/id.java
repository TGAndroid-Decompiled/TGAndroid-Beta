package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class id extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40 {
    public String A;
    public LinearLayout B;
    public org.telegram.ui.Cells.m4 C;
    public EditTextBoldCursor D;
    public boolean E;
    public org.telegram.ui.Components.mi0 F;
    public LinearLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public org.telegram.ui.Components.e80 L;
    public org.telegram.ui.Cells.i6 M;
    public org.telegram.ui.Cells.i6 N;
    public org.telegram.ui.Cells.b9 O;
    public TextView P;
    public org.telegram.ui.Cells.x1 Q;
    public org.telegram.ui.Cells.m4 R;
    public int S;
    public String T;
    public org.telegram.messenger.voip.l0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public TLRPC.TL_chatInviteExported Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.w0 f39101a;
    public org.telegram.ui.Cells.b9 f39102a0;
    public org.telegram.ui.Components.fr f39103b;
    public final ArrayList f39104b0;
    public org.telegram.ui.Components.ut f39105c;
    public org.telegram.ui.Cells.s4 f39106c0;
    public org.telegram.ui.Cells.z6 d;
    public final int f39107d0;
    public ih.d4 f39108e;
    public final long f39109e0;
    public kh.h6 f39110f;
    public boolean f39111f0;
    public final Boolean f39112g0;
    public fd h;
    public TLRPC.InputFile f39113h0;
    public TLRPC.InputFile f39114i0;
    public TLRPC.VideoSize f39115j0;
    public String f39116k0;
    public double f39117l0;
    public boolean m0;
    public AnimatorSet f39118n;
    public boolean f39119n0;
    public Integer f39120o0;
    public Utilities.Callback2 f39121p0;
    public org.telegram.ui.ActionBar.c2 f39122q0;
    public gd f39123r;
    public final zc f39124r0;
    public final org.telegram.ui.Components.z8 f39125s;
    public ValueAnimator f39126s0;
    public final org.telegram.ui.Components.e40 v;
    public EditTextBoldCursor f39127w;
    public TLRPC.FileLocation f39128x;
    public TLRPC.FileLocation f39129y;

    public id(Bundle bundle) {
        super(bundle);
        this.f39104b0 = new ArrayList();
        this.f39111f0 = true;
        this.f39124r0 = new zc(this, 2);
        int i9 = bundle.getInt("step", 0);
        this.f39107d0 = i9;
        if (bundle.containsKey("forcePublic")) {
            this.f39112g0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i9 == 0) {
            this.f39125s = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            this.v = new org.telegram.ui.Components.e40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new yc(this, 2));
            return;
        }
        if (i9 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f39111f0 = z10;
            this.W = !z10;
            if (!z10 && !this.Z) {
                this.Z = true;
                g0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new yc(this, 0));
            }
        }
        this.f39109e0 = bundle.getLong("chat_id", 0L);
    }

    public static void T(id idVar, org.telegram.ui.ActionBar.c2 c2Var) {
        idVar.f39119n0 = false;
        idVar.m0 = false;
        if (idVar.f39120o0 != null) {
            ConnectionsManager.getInstance(idVar.currentAccount).cancelRequest(idVar.f39120o0.intValue(), true);
            idVar.f39120o0 = null;
        }
        idVar.f0(false);
        c2Var.dismiss();
    }

    public static void U(id idVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(idVar.currentAccount).sendRequest(tL_channels_updateUsername, new yc(idVar, 1), 64);
    }

    public static void V(id idVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(idVar.currentAccount).getInputChannel(idVar.f39109e0);
        idVar.S = ConnectionsManager.getInstance(idVar.currentAccount).sendRequest(tL_channels_checkUsername, new y9(idVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void W(id idVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        if (currentChannel.megagroup) {
            int i9 = R.string.RevokeLinkAlert;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i9, MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i10 = R.string.RevokeLinkAlertChannel;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i10, MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ih.v3(13, idVar, currentChannel));
        idVar.showDialog(c2Var);
    }

    public static void X(id idVar) {
        if (idVar.f39122q0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new b1(idVar, 12));
        idVar.f39122q0 = alertDialog$Builder.o();
    }

    @Override
    public final void D(float f10) {
        gd gdVar = this.f39123r;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        gd gdVar = this.f39123r;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(0.0f);
    }

    @Override
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    public final boolean c0(String str) {
        if (str != null && str.length() > 0) {
            this.Q.setVisibility(0);
        } else {
            this.Q.setVisibility(8);
        }
        org.telegram.messenger.voip.l0 l0Var = this.U;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
            this.U = null;
            this.T = null;
            if (this.S != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.S, true);
            }
        }
        this.V = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i9 = 0; i9 < str.length(); i9++) {
                    char charAt = str.charAt(i9);
                    if (i9 == 0 && charAt >= '0' && charAt <= '9') {
                        this.Q.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        org.telegram.ui.Cells.x1 x1Var = this.Q;
                        int i10 = org.telegram.ui.ActionBar.f6.f23212p7;
                        x1Var.setTag(Integer.valueOf(i10));
                        this.Q.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.Q.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.x1 x1Var2 = this.Q;
                        int i11 = org.telegram.ui.ActionBar.f6.f23212p7;
                        x1Var2.setTag(Integer.valueOf(i11));
                        this.Q.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                        return false;
                    }
                }
            } else {
                this.Q.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.x1 x1Var3 = this.Q;
                int i12 = org.telegram.ui.ActionBar.f6.f23212p7;
                x1Var3.setTag(Integer.valueOf(i12));
                this.Q.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.Q.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.x1 x1Var4 = this.Q;
                int i13 = org.telegram.ui.ActionBar.f6.f23212p7;
                x1Var4.setTag(Integer.valueOf(i13));
                this.Q.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                return false;
            }
            this.Q.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.x1 x1Var5 = this.Q;
            int i14 = org.telegram.ui.ActionBar.f6.F6;
            x1Var5.setTag(Integer.valueOf(i14));
            this.Q.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            this.T = str;
            org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(28, this, str);
            this.U = l0Var2;
            AndroidUtilities.runOnUIThread(l0Var2, 300L);
            return true;
        }
        this.Q.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.x1 x1Var6 = this.Q;
        int i15 = org.telegram.ui.ActionBar.f6.f23212p7;
        x1Var6.setTag(Integer.valueOf(i15));
        this.Q.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        float f12;
        float f13;
        int i15;
        float f14;
        float f15;
        int i16;
        float f16;
        float f17;
        float f18;
        float f19;
        int i17;
        int i18;
        int i19;
        id idVar = this;
        org.telegram.ui.Components.ut utVar = idVar.f39105c;
        if (utVar != null) {
            utVar.o();
        }
        idVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        idVar.actionBar.setAllowOverlayTitle(true);
        idVar.actionBar.setActionBarMenuOnItemClick(new dd(idVar));
        org.telegram.ui.ActionBar.z n10 = idVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i20 = org.telegram.ui.ActionBar.f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i20, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i20, false)));
        idVar.f39103b = frVar;
        idVar.f39101a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), frVar);
        int i21 = idVar.f39107d0;
        if (i21 == 0) {
            idVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            ed edVar = new ed(0, context, idVar);
            edVar.setOnTouchListener(new jh.d(2));
            idVar.fragmentView = edVar;
            int i22 = org.telegram.ui.ActionBar.f6.f23001d6;
            edVar.setTag(Integer.valueOf(i22));
            idVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i22, false));
            LinearLayout linearLayout = new LinearLayout(context);
            idVar.G = linearLayout;
            linearLayout.setOrientation(1);
            edVar.addView(idVar.G, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            idVar.G.addView(frameLayout, g7.e6.n(-1, -2));
            ih.d4 d4Var = new ih.d4(idVar, context, 4);
            idVar.f39108e = d4Var;
            d4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.z8 z8Var = idVar.f39125s;
            z8Var.n(5L, null, null);
            idVar.f39108e.setImageDrawable(z8Var);
            ih.d4 d4Var2 = idVar.f39108e;
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i23 = i13 | 48;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 16.0f;
            }
            if (z11) {
                f11 = 16.0f;
            } else {
                f11 = 0.0f;
            }
            frameLayout.addView(d4Var2, g7.e6.d(64, 64.0f, i23, f10, 12.0f, f11, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            kh.h6 h6Var = new kh.h6(idVar, context, paint, 2);
            idVar.f39110f = h6Var;
            h6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            kh.h6 h6Var2 = idVar.f39110f;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i24 = i14 | 48;
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 16.0f;
            }
            if (z12) {
                f13 = 16.0f;
            } else {
                f13 = 0.0f;
            }
            frameLayout.addView(h6Var2, g7.e6.d(64, 64.0f, i24, f12, 12.0f, f13, 12.0f));
            idVar.f39110f.setOnClickListener(new ad(idVar, 1));
            int i25 = R.raw.camera;
            idVar.F = new org.telegram.ui.Components.mi0(i25, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            fd fdVar = new fd(idVar, context, 0);
            idVar.h = fdVar;
            fdVar.setScaleType(ImageView.ScaleType.CENTER);
            idVar.h.setAnimation(idVar.F);
            idVar.h.setEnabled(false);
            idVar.h.setClickable(false);
            idVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            fd fdVar2 = idVar.h;
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i26 = i15 | 48;
            if (z13) {
                f14 = 0.0f;
            } else {
                f14 = 15.0f;
            }
            if (z13) {
                f15 = 15.0f;
            } else {
                f15 = 0.0f;
            }
            frameLayout.addView(fdVar2, g7.e6.d(64, 64.0f, i26, f14, 12.0f, f15, 12.0f));
            gd gdVar = new gd(idVar, context, 0);
            idVar.f39123r = gdVar;
            gdVar.setSize(AndroidUtilities.dp(30.0f));
            idVar.f39123r.setProgressColor(-1);
            idVar.f39123r.setNoProgress(false);
            gd gdVar2 = idVar.f39123r;
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i27 = i16 | 48;
            if (z14) {
                f16 = 0.0f;
            } else {
                f16 = 16.0f;
            }
            if (z14) {
                f17 = 16.0f;
            } else {
                f17 = 0.0f;
            }
            frameLayout.addView(gdVar2, g7.e6.d(64, 64.0f, i27, f16, 12.0f, f17, 12.0f));
            idVar.d0(false, false);
            org.telegram.ui.Components.ut utVar2 = new org.telegram.ui.Components.ut(context, edVar, idVar, 0, false, null);
            idVar = idVar;
            idVar.f39105c = utVar2;
            utVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = idVar.A;
            if (str != null) {
                idVar.f39105c.setText(str);
                idVar.A = null;
            }
            idVar.f39105c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            idVar.f39105c.getEditText().setSingleLine(true);
            idVar.f39105c.getEditText().setImeOptions(5);
            idVar.f39105c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(idVar) {
                public final id f36828b;

                {
                    this.f36828b = idVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            id idVar2 = this.f36828b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(idVar2.f39105c.getEditText().getText())) {
                                    idVar2.f39127w.requestFocus();
                                    return true;
                                }
                            } else {
                                idVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (w0Var = this.f36828b.f39101a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.ut utVar3 = idVar.f39105c;
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                f18 = 5.0f;
            } else {
                f18 = 96.0f;
            }
            if (z15) {
                f19 = 96.0f;
            } else {
                f19 = 5.0f;
            }
            frameLayout.addView(utVar3, g7.e6.d(-1, -2.0f, 16, f18, 0.0f, f19, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            idVar.f39127w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            idVar.f39127w.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = idVar.f39127w;
            int i28 = org.telegram.ui.ActionBar.f6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i28, false));
            idVar.f39127w.setBackgroundDrawable(null);
            idVar.f39127w.setLineColors(idVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23127k6), idVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23144l6), idVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
            idVar.f39127w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = idVar.f39127w;
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            editTextBoldCursor3.setGravity(i17);
            idVar.f39127w.setInputType(180225);
            idVar.f39127w.setImeOptions(6);
            idVar.f39127w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            idVar.f39127w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            idVar.f39127w.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i28, false));
            idVar.f39127w.setCursorSize(AndroidUtilities.dp(20.0f));
            idVar.f39127w.setCursorWidth(1.5f);
            idVar.G.addView(idVar.f39127w, g7.e6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            idVar.f39127w.setOnEditorActionListener(new TextView.OnEditorActionListener(idVar) {
                public final id f36828b;

                {
                    this.f36828b = idVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            id idVar2 = this.f36828b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(idVar2.f39105c.getEditText().getText())) {
                                    idVar2.f39127w.requestFocus();
                                    return true;
                                }
                            } else {
                                idVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (w0Var = this.f36828b.f39101a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            idVar.f39127w.addTextChangedListener(new hd(0));
            TextView textView = new TextView(context);
            idVar.P = textView;
            textView.setTextSize(1, 15.0f);
            idVar.P.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.F6, false));
            TextView textView2 = idVar.P;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView2.setGravity(i18);
            idVar.P.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = idVar.G;
            TextView textView3 = idVar.P;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            linearLayout2.addView(textView3, g7.e6.t(-2, -2, i19, 24, 10, 24, 20));
        } else if (i21 == 1) {
            ScrollView scrollView = new ScrollView(context);
            idVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            idVar.G = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(idVar.G, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = idVar.getMessagesController();
            long j10 = idVar.f39109e0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            idVar.E = z10;
            org.telegram.ui.ActionBar.k kVar = idVar.actionBar;
            if (z10) {
                i9 = R.string.GroupSettingsTitle;
            } else {
                i9 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i9));
            View view = idVar.fragmentView;
            int i29 = org.telegram.ui.ActionBar.f6.f22947a7;
            view.setTag(Integer.valueOf(i29));
            idVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i29, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            idVar.C = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = idVar.C;
            int i30 = org.telegram.ui.ActionBar.f6.f23001d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i30, false));
            org.telegram.ui.Cells.m4 m4Var3 = idVar.C;
            if (idVar.E) {
                i10 = R.string.GroupTypeHeader;
            } else {
                i10 = R.string.ChannelTypeHeader;
            }
            m4Var3.setText(LocaleController.getString(i10));
            idVar.G.addView(idVar.C);
            LinearLayout linearLayout4 = new LinearLayout(context);
            idVar.B = linearLayout4;
            linearLayout4.setOrientation(1);
            idVar.B.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i30, false));
            idVar.G.addView(idVar.B, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            idVar.M = i6Var;
            i6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
            Boolean bool = idVar.f39112g0;
            if (bool != null && !bool.booleanValue()) {
                idVar.W = true;
            }
            if (idVar.E) {
                idVar.M.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !idVar.W);
            } else {
                idVar.M.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !idVar.W);
            }
            idVar.M.setOnClickListener(new ad(idVar, 2));
            if (bool == null || bool.booleanValue()) {
                idVar.B.addView(idVar.M, g7.e6.n(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            idVar.N = i6Var2;
            i6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
            if (bool != null && bool.booleanValue()) {
                idVar.W = false;
            }
            if (idVar.E) {
                idVar.N.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, idVar.W);
            } else {
                idVar.N.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, idVar.W);
            }
            idVar.N.setOnClickListener(new ad(idVar, 3));
            if (bool == null || !bool.booleanValue()) {
                idVar.B.addView(idVar.N, g7.e6.n(-1, -2));
            }
            org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            idVar.d = z6Var;
            idVar.G.addView(z6Var, g7.e6.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            idVar.I = linearLayout5;
            linearLayout5.setOrientation(1);
            idVar.I.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i30, false));
            idVar.G.addView(idVar.I, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
            idVar.R = m4Var4;
            idVar.I.addView(m4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            idVar.J = linearLayout6;
            linearLayout6.setOrientation(0);
            idVar.I.addView(idVar.J, g7.e6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            idVar.D = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/");
            idVar.D.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = idVar.D;
            int i31 = org.telegram.ui.ActionBar.f6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = idVar.D;
            int i32 = org.telegram.ui.ActionBar.f6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i32, false));
            idVar.D.setMaxLines(1);
            idVar.D.setLines(1);
            idVar.D.setEnabled(false);
            idVar.D.setBackgroundDrawable(null);
            idVar.D.setPadding(0, 0, 0, 0);
            idVar.D.setSingleLine(true);
            idVar.D.setInputType(163840);
            idVar.D.setImeOptions(6);
            idVar.J.addView(idVar.D, g7.e6.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            idVar.f39127w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            idVar.f39127w.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i31, false));
            idVar.f39127w.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i32, false));
            idVar.f39127w.setMaxLines(1);
            idVar.f39127w.setLines(1);
            idVar.f39127w.setBackgroundDrawable(null);
            idVar.f39127w.setPadding(0, 0, 0, 0);
            idVar.f39127w.setSingleLine(true);
            idVar.f39127w.setInputType(163872);
            idVar.f39127w.setImeOptions(6);
            idVar.f39127w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            idVar.f39127w.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i32, false));
            idVar.f39127w.setCursorSize(AndroidUtilities.dp(20.0f));
            idVar.f39127w.setCursorWidth(1.5f);
            idVar.J.addView(idVar.f39127w, g7.e6.n(-1, 36));
            idVar.f39127w.addTextChangedListener(new o0(idVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            idVar.K = linearLayout7;
            linearLayout7.setOrientation(1);
            idVar.I.addView(idVar.K, g7.e6.n(-1, -2));
            org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(context, idVar, null, true, ChatObject.isChannel(idVar.getMessagesController().getChat(Long.valueOf(j10))));
            idVar.L = e80Var;
            e80Var.b(true);
            idVar.L.d(0, null, false);
            idVar.K.addView(idVar.L);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(idVar, context, 3);
            idVar.Q = x1Var;
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
            idVar.Q.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.K6, false));
            idVar.Q.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.x1 x1Var2 = idVar.Q;
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            x1Var2.setGravity(i11);
            idVar.Q.setVisibility(8);
            idVar.Q.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = idVar.I;
            org.telegram.ui.Cells.x1 x1Var3 = idVar.Q;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            linearLayout8.addView(x1Var3, g7.e6.t(-2, -2, i12, 18, 3, 18, 7));
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            idVar.O = b9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.f6.f22966b7;
            b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i33, i34));
            idVar.G.addView(idVar.O, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            idVar.f39106c0 = s4Var;
            idVar.G.addView(s4Var, g7.e6.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            idVar.H = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i30, false));
            idVar.H.setOrientation(1);
            idVar.G.addView(idVar.H, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            idVar.f39102a0 = b9Var2;
            b9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i34));
            idVar.G.addView(idVar.f39102a0, g7.e6.n(-1, -2));
            idVar.g0();
        }
        return idVar.fragmentView;
    }

    public final void d0(boolean z10, boolean z11) {
        if (this.h == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39118n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f39118n.cancel();
            this.f39118n = null;
        }
        if (z11) {
            this.f39118n = new AnimatorSet();
            if (z10) {
                this.f39123r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f39118n;
                fd fdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(fdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f39123r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39118n;
                fd fdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(fdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f39123r, property2, 0.0f));
            }
            this.f39118n.setDuration(180L);
            this.f39118n.addListener(new hg.b0(27, this, z10));
            this.f39118n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f39123r.setAlpha(1.0f);
            this.f39123r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f39123r.setAlpha(0.0f);
            this.f39123r.setVisibility(4);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.c2 c2Var = this.f39122q0;
            if (c2Var != null) {
                try {
                    c2Var.dismiss();
                    this.f39122q0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f0(false);
            this.f39119n0 = false;
        } else if (i9 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.c2 c2Var2 = this.f39122q0;
            if (c2Var2 != null) {
                try {
                    c2Var2.dismiss();
                    this.f39122q0 = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f39111f0);
            Boolean bool = this.f39112g0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f39113h0 != null || this.f39114i0 != null || this.f39115j0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f39113h0, this.f39114i0, this.f39115j0, this.f39117l0, this.f39116k0, this.f39128x, this.f39129y, null);
            }
            id idVar = new id(bundle);
            idVar.f39121p0 = this.f39121p0;
            presentFragment(idVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e40 e40Var = this.v;
        if (e40Var != null && e40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e40 e40Var = this.v;
        if ((e40Var == null || dialog != e40Var.f27911c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0() {
        if (getParentActivity() == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f50548r0 = true;
        j0Var.D0 = new zc(this, 0);
        showDialog(j0Var);
    }

    public final void f0(boolean z10) {
        float f10;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f39124r0);
        }
        if (this.f39103b != null) {
            ValueAnimator valueAnimator = this.f39126s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f39103b.f28558c;
            float f12 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f39126s0 = ofFloat;
            ofFloat.addUpdateListener(new f3(this, 4));
            ValueAnimator valueAnimator2 = this.f39126s0;
            float f13 = this.f39103b.f28558c;
            if (z10) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f39126s0.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.f39126s0.start();
        }
    }

    public final void g0() {
        int i9;
        int i10;
        int i11;
        int i12;
        int dp;
        int i13;
        int i14;
        if (this.d == null) {
            return;
        }
        String str = null;
        int i15 = 8;
        if (!this.W && !this.f39111f0) {
            this.O.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.b9 b9Var = this.O;
            int i16 = org.telegram.ui.ActionBar.f6.f23212p7;
            b9Var.setTag(Integer.valueOf(i16));
            this.O.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
            this.I.setVisibility(8);
            this.d.setVisibility(8);
            if (this.Z) {
                this.f39106c0.setVisibility(0);
                this.H.setVisibility(8);
                org.telegram.ui.Cells.b9 b9Var2 = this.O;
                b9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(b9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                this.f39102a0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.b9 b9Var3 = this.O;
                b9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(b9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7));
                this.f39106c0.setVisibility(8);
                this.H.setVisibility(0);
                this.f39102a0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var4 = this.O;
            int i17 = org.telegram.ui.ActionBar.f6.B6;
            b9Var4.setTag(Integer.valueOf(i17));
            this.O.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
            this.d.setVisibility(0);
            this.f39102a0.setVisibility(8);
            this.H.setVisibility(8);
            org.telegram.ui.Cells.b9 b9Var5 = this.O;
            b9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(b9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
            this.I.setVisibility(0);
            this.f39106c0.setVisibility(8);
            if (this.E) {
                org.telegram.ui.Cells.b9 b9Var6 = this.O;
                if (this.W) {
                    i13 = R.string.MegaPrivateLinkHelp;
                } else {
                    i13 = R.string.MegaUsernameHelp;
                }
                b9Var6.setText(LocaleController.getString(i13));
                org.telegram.ui.Cells.m4 m4Var = this.R;
                if (this.W) {
                    i14 = R.string.ChannelInviteLinkTitle;
                } else {
                    i14 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i14));
            } else {
                org.telegram.ui.Cells.b9 b9Var7 = this.O;
                if (this.W) {
                    i9 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i9 = R.string.ChannelUsernameHelp;
                }
                b9Var7.setText(LocaleController.getString(i9));
                org.telegram.ui.Cells.m4 m4Var2 = this.R;
                if (this.W) {
                    i10 = R.string.ChannelInviteLinkTitle;
                } else {
                    i10 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i10));
            }
            LinearLayout linearLayout = this.J;
            if (this.W) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
            LinearLayout linearLayout2 = this.K;
            if (this.W) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            linearLayout2.setVisibility(i12);
            LinearLayout linearLayout3 = this.I;
            if (this.W) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.e80 e80Var = this.L;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.Y;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            e80Var.setLink(str);
            org.telegram.ui.Cells.x1 x1Var = this.Q;
            if (!this.W && x1Var.length() != 0) {
                i15 = 0;
            }
            x1Var.setVisibility(i15);
        }
        this.M.a(!this.W);
        this.N.a(this.W);
        this.f39127w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f39127w);
    }

    @Override
    public final bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f39105c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 262145, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        org.telegram.ui.Components.ut utVar = this.f39105c;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(utVar, 4, null, null, null, null, i10));
        org.telegram.ui.Components.ut utVar2 = this.f39105c;
        int i11 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(utVar2, 8388608, null, null, null, null, i11));
        org.telegram.ui.Components.ut utVar3 = this.f39105c;
        int i12 = org.telegram.ui.ActionBar.f6.f23127k6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(utVar3, 32, null, null, null, null, i12));
        org.telegram.ui.Components.ut utVar4 = this.f39105c;
        int i13 = org.telegram.ui.ActionBar.f6.f23144l6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(utVar4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39127w, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39127w, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39127w, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39127w, 65568, null, null, null, null, i13));
        TextView textView = this.P;
        int i14 = org.telegram.ui.ActionBar.f6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I, 1, null, null, null, null, i9));
        org.telegram.ui.Cells.z6 z6Var = this.d;
        int i15 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(z6Var, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.f6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 8388608, null, null, null, null, i11));
        org.telegram.ui.Cells.x1 x1Var = this.Q;
        int i17 = org.telegram.ui.ActionBar.f6.f23212p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(x1Var, 262148, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 262148, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 262148, null, null, null, null, org.telegram.ui.ActionBar.f6.f23334w6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39102a0, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 1, null, null, null, null, i9));
        LinearLayout linearLayout = this.K;
        int i18 = org.telegram.ui.ActionBar.f6.f23092i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 4096, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39106c0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 4096, null, null, null, null, i18));
        int i19 = org.telegram.ui.ActionBar.f6.f23056g7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.f6.f23074h7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i21 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 4096, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        int i22 = org.telegram.ui.ActionBar.f6.f23369y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.f23242r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        org.telegram.ui.Components.e40 e40Var = this.v;
        if (e40Var != null) {
            e40Var.i(i9, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut utVar = this.f39105c;
        if (utVar == null || !utVar.f33124e) {
            return true;
        }
        if (z10) {
            utVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f39107d0 == 1 && !this.X && this.Y == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f39109e0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.Y = chatFull.exported_invite;
            }
            if (this.Y == null) {
                this.X = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new yc(this, 3));
            }
        }
        org.telegram.ui.Components.e40 e40Var = this.v;
        if (e40Var != null) {
            e40Var.f27909a = this;
            e40Var.f27910b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f39120o0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39120o0.intValue(), true);
            this.f39120o0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e40 e40Var = this.v;
        if (e40Var != null) {
            e40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.ut utVar = this.f39105c;
        if (utVar != null) {
            utVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ut utVar = this.f39105c;
        if (utVar != null) {
            utVar.r();
        }
        org.telegram.ui.Components.e40 e40Var = this.v;
        if (e40Var != null) {
            e40Var.j();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.e40 e40Var = this.v;
        if (e40Var != null) {
            e40Var.k(i9, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ut utVar = this.f39105c;
        if (utVar != null) {
            utVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.e40 e40Var = this.v;
        if (e40Var != null) {
            e40Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f39107d0 != 1) {
            this.f39105c.requestFocus();
            org.telegram.ui.Components.pt ptVar = this.f39105c.f33121a;
            ptVar.requestFocus();
            AndroidUtilities.showKeyboard(ptVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f39107d0 == 0) {
            org.telegram.ui.Components.e40 e40Var = this.v;
            if (e40Var != null) {
                e40Var.f27913f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.ut utVar = this.f39105c;
                if (utVar != null) {
                    utVar.setText(string);
                } else {
                    this.A = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f39107d0 == 0) {
            org.telegram.ui.Components.e40 e40Var = this.v;
            if (e40Var != null && (str = e40Var.f27913f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.ut utVar = this.f39105c;
            if (utVar != null) {
                String obj = utVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void O() {
    }
}
