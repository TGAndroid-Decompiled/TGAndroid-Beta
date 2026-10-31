package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.UndoView;
public final class fn implements org.telegram.ui.Cells.l1 {
    public final un f37301a;

    public fn(un unVar) {
        this.f37301a = unVar;
    }

    @Override
    public final void A(org.telegram.ui.Cells.q1 q1Var) {
        un unVar = this.f37301a;
        if (!unVar.getMessagesController().P4()) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), null);
            x1Var.r(200L);
            unVar.getMessagesController().Q0(new w(this, x1Var, q1Var, 6));
            return;
        }
        if (q1Var.getMessageObject() != null) {
            q1Var.getMessageObject().f16366r2 = Boolean.FALSE;
        }
        q1Var.D3();
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        int i10 = messageObject.D;
        un unVar = this.f37301a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.f16337k.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(unVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.f1();
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = unVar.getMessagesController().Q6;
                x1Var.setOnCancelListener(new ba(this, unVar.getConnectionsManager().sendRequest(getgroupcall, new mg.z(this, x1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 5)), 1));
                x1Var.r(600L);
                return;
            }
            TLRPC.User user = unVar.f42243f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = unVar.f42385q8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.m1.m(user, J4, i11, unVar.getParentActivity(), unVar.getMessagesController().a2(unVar.f42243f.f19942id), unVar.getAccountInstance());
                return;
            }
            return;
        }
        unVar.Q7(q1Var, true, false, f7, f10, messageObject.I3(), false, false);
    }

    @Override
    public final boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        ue ueVar;
        a3.i0 i0Var;
        boolean z10;
        org.telegram.ui.ActionBar.p6 p6Var;
        fg.i iVar;
        int i10;
        boolean z11;
        int i11;
        g11 g11Var;
        int i12;
        float f7;
        int i13;
        un unVar;
        ArrayList arrayList = null;
        if (!jjVar.S4() && !jjVar.g4()) {
            if (!org.telegram.messenger.jj.R4(jjVar.f16337k) && !jjVar.h4()) {
                if (jjVar.I3()) {
                    return MediaController.B().o0(this.f37301a.C0.L(), jjVar, this.f37301a.f42199b7, !unVar.C0.N, null);
                }
            } else {
                boolean S = MediaController.B().S(jjVar);
                MediaController B = MediaController.B();
                if (S) {
                    arrayList = this.f37301a.Z7(jjVar, false);
                }
                B.r0(arrayList, false);
                return S;
            }
        } else {
            i11 i11Var = this.f37301a.f42413sa;
            if (i11Var == null || i11Var.f38085b0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.w0.f19025b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!jjVar.P3()) {
                            org.telegram.ui.Components.cc.a0(this.f37301a).w(2131232784, org.telegram.messenger.cd.L0(2131743539, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f37301a.f42413sa = new i11(this.f37301a.getParentActivity());
                i11 i11Var2 = this.f37301a.f42413sa;
                if (!jjVar.P3()) {
                    ueVar = this.f37301a.xb(jjVar, true);
                } else {
                    ueVar = null;
                }
                if (!jjVar.P3()) {
                    i0Var = un.V4(this.f37301a, jjVar);
                } else {
                    i0Var = null;
                }
                Context context = i11Var2.f38082a;
                fg.i iVar2 = i11Var2.f38086c;
                i11Var2.X = ueVar;
                i11Var2.Y = i0Var;
                g11 g11Var2 = i11Var2.N;
                if (g11Var2 != null) {
                    iVar2.removeView(g11Var2);
                    i11Var2.N = null;
                }
                i11Var2.O = q1Var;
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                i11Var2.M = messageObject;
                if (messageObject != null && messageObject.h4()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i11Var2.S = z10;
                org.telegram.ui.Cells.q1 q1Var2 = i11Var2.O;
                if (q1Var2 != null) {
                    p6Var = q1Var2.getResourcesProvider();
                } else {
                    p6Var = null;
                }
                i11Var2.L = p6Var;
                if (i11Var2.O != null) {
                    i11Var2.T = 0.0f;
                    i11Var2.U = q1Var.f22648n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        i11Var2.T = view.getY() + i11Var2.T;
                        i11Var2.U = view.getY() + i11Var2.U;
                    }
                    int width = i11Var2.O.getWidth();
                    int height = i11Var2.O.getHeight();
                    if (i11Var2.S) {
                        height = Math.min(org.telegram.messenger.i0.L(360.0f), Math.min(width, org.telegram.messenger.i0.f16026q.y));
                    }
                    int i14 = height;
                    i11Var2.K = i14 - i11Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / org.telegram.messenger.i0.f16025p);
                    iVar = iVar2;
                    g11 g11Var3 = new g11(i11Var2, i11Var2.getContext(), org.telegram.messenger.d20.f15147s0, i11Var2.O.getResourcesProvider(), width, i14);
                    i11Var2.N = g11Var3;
                    i11Var2.O.s0(g11Var3);
                    i11Var2.N.r0(i11Var2.O);
                    i11Var2.N.setDelegate(new hb.a(16));
                    g11 g11Var4 = i11Var2.N;
                    org.telegram.messenger.jj jjVar2 = i11Var2.M;
                    org.telegram.messenger.ej currentMessagesGroup = i11Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = i11Var2.O;
                    g11Var4.s3(jjVar2, currentMessagesGroup, q1Var3.F, q1Var3.E, false, false);
                    if (!i11Var2.S) {
                        org.telegram.ui.Components.x7 x7Var = new org.telegram.ui.Components.x7();
                        i11Var2.V = x7Var;
                        g11 g11Var5 = i11Var2.N;
                        x7Var.f32400i = g11Var5;
                        g11Var5.f22736tc = x7Var;
                        if (g11Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.qn0 seekBarWaveform = i11Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = i11Var2.f38093s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.f29698n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    i11Var2.H = false;
                    iVar.addView(i11Var2.N, new FrameLayout.LayoutParams(i11Var2.O.getWidth(), i14, 17));
                } else {
                    iVar = iVar2;
                    i10 = 360;
                }
                TextureView textureView = i11Var2.P;
                if (textureView != null) {
                    iVar.removeView(textureView);
                    i11Var2.P = null;
                }
                if (i11Var2.S) {
                    i11Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    i11Var2.P = textureView2;
                    iVar.addView(textureView2, 0, w7.b6.c(i10, i10));
                }
                org.telegram.ui.Components.u61 u61Var = MediaController.B().f14457i0;
                if (u61Var != null) {
                    u61Var.g0();
                }
                org.telegram.ui.Components.u61 u61Var2 = i11Var2.f38095x;
                if (u61Var2 != null) {
                    u61Var2.g0();
                    i11Var2.f38095x.m0();
                    i11Var2.f38095x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = i11Var2.O;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.b8.G(i11Var2.O.getMessageObject().I1);
                    File I = org.telegram.messenger.b8.I(i11Var2.O.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.b8.G(i11Var2.O.getMessageObject().I1);
                        I = org.telegram.messenger.b8.N(i11Var2.O.getMessageObject().f16337k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && i11Var2.O.getMessageObject().f16337k.attachPath != null) {
                        I = new File(i11Var2.O.getMessageObject().f16337k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.u61 u61Var3 = new org.telegram.ui.Components.u61();
                        i11Var2.f38095x = u61Var3;
                        u61Var3.J = new h11(i11Var2);
                        if (i11Var2.V != null) {
                            u61Var3.K = new h11(i11Var2);
                        }
                        if (i11Var2.S) {
                            u61Var3.A0(i11Var2.P);
                        }
                        i11Var2.f38095x.j0(Uri.fromFile(I), "other");
                        i11Var2.f38095x.h0();
                        org.telegram.ui.Components.us usVar = i11Var2.E;
                        if (usVar != null) {
                            usVar.f31027s = i11Var2.f38095x;
                            usVar.a();
                        }
                    }
                    un unVar2 = this.f37301a;
                    unVar2.showDialog(unVar2.f42413sa);
                    return false;
                }
                vh.p2 p2Var = i11Var2.f38096y;
                if (p2Var != null) {
                    iVar.removeView(p2Var);
                    i11Var2.f38096y = null;
                }
                org.telegram.messenger.jj jjVar3 = i11Var2.M;
                if (jjVar3 != null && jjVar3.P3()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.messenger.jj jjVar4 = i11Var2.M;
                if (jjVar4 != null && org.telegram.messenger.jj.B0(jjVar4.f16337k) != org.telegram.messenger.d20.i(i11Var2.M.I1).e()) {
                    vh.p2 p2Var2 = new vh.p2(context, 3);
                    i11Var2.f38096y = p2Var2;
                    p2Var2.p(true);
                    if (z11) {
                        long B0 = org.telegram.messenger.jj.B0(i11Var2.M.f16337k);
                        String str = "";
                        if (B0 > 0) {
                            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11Var2.M.I1).Z1(Long.valueOf(B0));
                            if (Z1 != null) {
                                str = org.telegram.messenger.h20.j(Z1, true);
                            }
                        } else {
                            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11Var2.M.I1).L0(Long.valueOf(-B0));
                            if (L0 != null) {
                                str = L0.title;
                            }
                        }
                        vh.p2 p2Var3 = i11Var2.f38096y;
                        if (i11Var2.S) {
                            i13 = 2131743616;
                        } else {
                            i13 = 2131743540;
                        }
                        p2Var3.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i13, str)));
                    } else {
                        vh.p2 p2Var4 = i11Var2.f38096y;
                        if (i11Var2.S) {
                            i12 = 2131743617;
                        } else {
                            i12 = 2131743541;
                        }
                        p2Var4.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i12, null)));
                    }
                    i11Var2.f38096y.q(12.0f);
                    vh.p2 p2Var5 = i11Var2.f38096y;
                    if (!z11 && !i11Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    p2Var5.setPadding(org.telegram.messenger.i0.L(f7), 0, 0, 0);
                    if (i11Var2.S) {
                        i11Var2.f38096y.m(0.5f, 0.0f);
                        i11Var2.f38096y.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        i11Var2.f38096y.m(0.0f, org.telegram.messenger.i0.L(34.0f));
                        i11Var2.f38096y.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    i11Var2.f38096y.t(14.0f);
                    vh.p2 p2Var6 = i11Var2.f38096y;
                    p2Var6.h = vh.p2.a(p2Var6.getText(), i11Var2.f38096y.getTextPaint());
                    if (i11Var2.S) {
                        iVar.addView(i11Var2.f38096y, w7.b6.d((int) ((i11Var2.O.getWidth() / org.telegram.messenger.i0.f16025p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((i11Var2.O.getHeight() + i11Var2.K) / org.telegram.messenger.i0.f16025p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        iVar.addView(i11Var2.f38096y, w7.b6.d((int) ((i11Var2.O.getWidth() / org.telegram.messenger.i0.f16025p) * 0.6f), 150.0f, 17, ((((i11Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + i11Var2.O.getBoundsLeft()) / org.telegram.messenger.i0.f16025p) + 1.0f, ((-75.0f) - ((i11Var2.O.getHeight() / org.telegram.messenger.i0.f16025p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    i11Var2.f38096y.u();
                }
                TextView textView = i11Var2.D;
                if (textView != null) {
                    iVar.removeView(textView);
                    i11Var2.D = null;
                }
                TextView textView2 = new TextView(context);
                i11Var2.D = textView2;
                textView2.setTextColor(-1);
                i11Var2.D.setTypeface(org.telegram.messenger.i0.o());
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    i11Var2.D.setBackground(org.telegram.ui.ActionBar.t6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    i11Var2.D.setBackground(org.telegram.ui.ActionBar.t6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                i11Var2.D.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
                w7.e6.a(i11Var2.D);
                TextView textView3 = i11Var2.D;
                if (z11) {
                    i11 = 2131743545;
                } else {
                    i11 = 2131743542;
                }
                textView3.setText(org.telegram.messenger.cd.L0(i11, null));
                i11Var2.D.setOnClickListener(new d11(i11Var2, 1));
                iVar.addView(i11Var2.D, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (g11Var = i11Var2.N) != null && g11Var.getMessageObject() != null && i11Var2.N.getMessageObject().f16337k != null) {
                    i11Var2.N.getMessageObject().f16337k.media_unread = false;
                    i11Var2.N.invalidate();
                }
                un unVar22 = this.f37301a;
                unVar22.showDialog(unVar22.f42413sa);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void B1() {
        org.telegram.ui.ActionBar.p6 p6Var;
        un unVar = this.f37301a;
        if (unVar.l1 != null && unVar.getParentActivity() != null) {
            Context context = unVar.l1.getContext();
            p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
            g01.d1(context, unVar, false, p6Var, null);
        }
    }

    @Override
    public final void C0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject;
        if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null && messageObject.f16337k != null) {
            int f12 = messageObject.f1();
            un unVar = this.f37301a;
            if (unVar.Rb != f12 || unVar.Sb != 7) {
                TLRPC.InputPeer i12 = unVar.getMessagesController().i1(org.telegram.messenger.jj.B0(messageObject.f16337k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = i12;
                getrichmessage.f20014id = f12;
                gf.e eVar = unVar.Vb;
                if (eVar != null) {
                    eVar.a(true);
                    unVar.Vb = null;
                }
                bj bjVar = new bj(unVar, f12, q1Var, 2);
                bjVar.f7485b = new h0(29, unVar, r3);
                unVar.Vb = bjVar;
                bjVar.d();
                int[] iArr = {unVar.getConnectionsManager().sendRequestTyped(getrichmessage, new a3.b(1), new af(unVar, bjVar, iArr, q1Var, messageObject, 2))};
            }
        }
    }

    @Override
    public final void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        bj bjVar;
        int i10;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        org.telegram.utils.twidget.v vVar = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            un unVar = this.f37301a;
            gf.e eVar = unVar.Vb;
            if (eVar != null) {
                eVar.a(true);
                unVar.Vb = null;
            }
            if (q1Var.getMessageObject() == null) {
                unVar.Vb = null;
                bjVar = null;
            } else {
                bjVar = new bj(unVar, q1Var.getMessageObject().f1(), q1Var, 1);
                unVar.Vb = bjVar;
            }
            i10 = ((org.telegram.ui.ActionBar.k2) this.f37301a).currentAccount;
            rh.e6 y3 = rh.e6.y(i10, false);
            Objects.requireNonNull(bjVar);
            rh rhVar = new rh(bjVar, 9);
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = org.telegram.messenger.w0.f19025b;
            }
            org.telegram.ui.ActionBar.p6 I = rh.e6.I();
            if (messageObject != null && context != null) {
                long B0 = org.telegram.messenger.jj.B0(messageObject.f16337k);
                int f12 = messageObject.f1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = org.telegram.messenger.vp.r1(y3.f46849a).i1(B0);
                tL_inputInvoiceMessage.msg_id = f12;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u10 = xh.m2.u(I, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                vVar = new org.telegram.utils.twidget.v(y3, ConnectionsManager.getInstance(y3.f46849a).sendRequest(tL_payments_getPaymentForm, new mb(y3, messageObject, tL_inputInvoiceMessage, rhVar, 14)), 2);
            }
            if (vVar != null) {
                bjVar.f7485b = vVar;
                bjVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.f16337k;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i11 = -1;
            for (int i12 = 0; i12 < tL_messageMediaPaidMedia.extended_media.size(); i12++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i12);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i11 = arrayList.size();
                    }
                    TLRPC.TL_message K7 = un.K7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        K7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        K7.attachPath = message.attachPath;
                    }
                    K7.media = tL_messageExtendedMedia.media;
                    K7.noforwards = true;
                    arrayList.add(new org.telegram.messenger.jj(messageObject.I1, K7, false, true));
                }
            }
            if (i11 > -1 && !arrayList.isEmpty()) {
                PhotoViewer v12 = PhotoViewer.v1();
                un unVar2 = this.f37301a;
                v12.N2(null, unVar2, unVar2.f42477xa);
                PhotoViewer.v1().e2(arrayList, i11, this.f37301a.a(), 0L, 0L, this.f37301a.f42189ab);
            }
        }
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        e(q1Var, z10, true, z11);
    }

    @Override
    public final void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        org.telegram.messenger.kp kpVar;
        Integer num;
        org.telegram.messenger.ic b10;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        un unVar = this.f37301a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            kg.v1 v1Var = new kg.v1(unVar, i10, user, null, null, unVar.f42477xa);
            q1Var.getLocationOnScreen(new int[2]);
            v1Var.f11305n2 = q1Var.getNameStatusX();
            v1Var.f11306o2 = q1Var.getNameStatusY();
            v1Var.f11309r2 = q1Var.getScaleX();
            v1Var.f11307p2 = q1Var.getLeft();
            v1Var.f11308q2 = q1Var.getTop();
            v1Var.f11310s2 = q1Var;
            int e = org.telegram.messenger.h20.e(user);
            if (e >= 7) {
                i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(i11).f18888r4;
                if (lpVar != null) {
                    kpVar = lpVar.d(e);
                } else {
                    kpVar = null;
                }
                if (kpVar != null) {
                    num = Integer.valueOf(kpVar.f());
                } else {
                    num = null;
                }
                v1Var.f11304m2 = num;
            } else {
                v1Var.f11304m2 = Integer.valueOf(unVar.getThemedColor(org.telegram.ui.ActionBar.t6.f21188r8[e]));
            }
            org.telegram.ui.Components.d5 d5Var = q1Var.f22672oa;
            if (d5Var != null && (d5Var.f25301f[0] instanceof org.telegram.ui.Components.f5)) {
                v1Var.f11309r2 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(unVar.getParentActivity());
                    org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f21095m6, 0.2f, false);
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.ic.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f14875f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.jj.K2(document, false)) {
                            d.e = 512;
                            d.f14875f = 512;
                        }
                        b10 = org.telegram.messenger.ic.b(document);
                        str2 = "160_160";
                    }
                    org.telegram.messenger.ic icVar = b10;
                    String str3 = str2;
                    g9Var.setLayerNum(7);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                    g9Var.m(icVar, str3, org.telegram.messenger.ic.c(w9, document), "140_140", d, document);
                    if (org.telegram.messenger.jj.C4(document)) {
                        Integer num2 = v1Var.f11304m2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = unVar.getThemedColor(org.telegram.ui.ActionBar.t6.f21259v6);
                        }
                        g9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        v1Var.f11312u2 = org.telegram.messenger.jj.j1(document);
                    } else {
                        v1Var.f11312u2 = org.telegram.messenger.jj.j1(document);
                    }
                    v1Var.f11311t2 = g9Var;
                    v1Var.f11314w2 = true;
                }
            }
            unVar.showDialog(v1Var);
            return;
        }
        gf.f.r(unVar.getParentActivity(), "https://" + unVar.getMessagesController().U2 + "/nft/" + str);
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.q1 r49, org.telegram.tgnet.TLRPC.PollAnswer r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.E1(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        TLRPC.Message message = messageObject.f16337k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.e6(true);
        un unVar = this.f37301a;
        unVar.getMessagesStorage().X1(org.telegram.messenger.jj.B0(messageObject.f16337k), messageObject.f16337k);
        unVar.getMessagesController().f18910t7.h(messageObject, true, false);
        e(q1Var, true, false, true);
    }

    @Override
    public final void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            c20Var.run();
            return;
        }
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.o4() || messageObject.Y2()) && (message = messageObject.f16337k) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f37301a;
            k2Var.getSendMessagesHelper().v(messageObject, messageObject.f16337k.rich_message, null, k2Var, true);
            return;
        }
        c20Var.run();
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
        TLRPC.Message message;
        int i10;
        int i11;
        int i12;
        int L;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f16337k) != null) {
            int i13 = s2Var.f17867a;
            TL_stars.StarsAmount starsAmount = null;
            un unVar = this.f37301a;
            if (i13 == 1) {
                long o10 = org.telegram.messenger.o5.o(message.from_id);
                ag.e0 e0Var = new ag.e0(27, this, message);
                Pattern pattern = org.telegram.ui.Components.s4.f30123a;
                Activity parentActivity = unVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, null);
                String L0 = org.telegram.messenger.cd.L0(2131744413, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744412, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).A1(o10, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.a7.V(editText, org.telegram.ui.ActionBar.t6.G6, null);
                editText.setHint(org.telegram.messenger.cd.L0(2131744411, null));
                org.telegram.ui.ActionBar.a7.E(editText, org.telegram.ui.ActionBar.t6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.t6.U(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.j4(parentActivity)});
                if (org.telegram.messenger.cd.X) {
                    i12 = org.telegram.messenger.i0.L(24.0f);
                } else {
                    i12 = 0;
                }
                int L2 = org.telegram.messenger.i0.L(8.0f);
                if (org.telegram.messenger.cd.X) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.i0.L(24.0f);
                }
                editText.setPadding(i12, L2, L, org.telegram.messenger.i0.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751605, null), new ng.d(26, e0Var, editText));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                x1Var.N = new org.telegram.ui.Components.i1(editText, 0);
                frameLayout.addView(editText, w7.b6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.tf(editText, 3), 100L);
                unVar.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    boolean A = org.telegram.messenger.w3.A(i10, unVar.e, 24);
                    if (A) {
                        i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        org.telegram.messenger.w3.A(i11, unVar.e, 5);
                    }
                    bi.n4 n4Var = new bi.n4(this, message, A, messageObject, 26);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    unVar.o7(n4Var, sf.a.l(starsAmount), !A);
                }
            } else if (i13 == 3) {
                unVar.Q7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                unVar.f42246f2.n(messageObject.Z1(), true);
            }
        }
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
        un unVar = this.f37301a;
        unVar.Qa.k(q1Var, unVar, true);
        unVar.f42492z0.I0(false);
    }

    @Override
    public final qs0 H1() {
        return this.f37301a.Pa;
    }

    @Override
    public final boolean I0(long j10) {
        TLRPC.ChatFull M0;
        un unVar = this.f37301a;
        TLRPC.Chat chat = unVar.e;
        if (chat == null || org.telegram.messenger.w3.V(chat)) {
            return false;
        }
        org.telegram.messenger.vp messagesController = unVar.getMessagesController();
        long j11 = unVar.e.f19793id;
        if (j11 == j10) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j11));
        if (messagesController.getUserConfig().e() == j10 && L0 != null && L0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.f18942x1.f(j11);
        if (hVar == null && (M0 = messagesController.M0(j11)) != null && M0.participants != null) {
            for (int i10 = 0; i10 < M0.participants.participants.size(); i10++) {
                TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i10);
                if (chatParticipant.user_id == j10) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j10)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final void J(org.telegram.messenger.gj gjVar) {
        StaticLayout staticLayout = gjVar.e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = gjVar.e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new di.i(gjVar.K, charSequence, false), 0, spannableString.length(), 33);
            org.telegram.messenger.i0.g(spannableString);
            org.telegram.messenger.z20.r(null, 2131752022, org.telegram.ui.Components.cc.a0(this.f37301a));
        }
    }

    @Override
    public final void J0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj jjVar;
        long j10;
        int i10;
        ArrayList arrayList;
        a3.i0 i0Var;
        org.telegram.messenger.ej ejVar;
        int i11;
        un unVar = this.f37301a;
        mh.l lVar = unVar.f42387qa;
        if (lVar != null) {
            HashMap hashMap = lVar.f13372a;
            mh.j jVar = (mh.j) hashMap.get(mh.l.b(q1Var));
            org.telegram.ui.Components.wb wbVar = null;
            if (jVar != null) {
                jjVar = jVar.E;
            } else {
                jjVar = null;
            }
            mh.j jVar2 = (mh.j) unVar.f42387qa.f13372a.get(mh.l.b(q1Var));
            if (jVar2 != null && (i11 = jVar2.R) != -1) {
                j10 = jVar2.f13367x[i11].d;
            } else {
                j10 = 0;
            }
            if (jjVar != null && j10 != 0) {
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.s4.h(parentActivity, i10, j10, false)) {
                    if (jjVar.d1() != 0 && (ejVar = (org.telegram.messenger.ej) unVar.N6.f(jjVar.d1())) != null) {
                        arrayList = ejVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.m5.j(jjVar);
                    }
                    if (j10 == org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f15165n) {
                        z10 = true;
                    }
                    long j11 = j10;
                    a3.i0 i0Var2 = new a3.i0(this, arrayList, j11, 8);
                    if (z10) {
                        i0Var2.run();
                        i0Var = null;
                    } else {
                        i0Var = i0Var2;
                    }
                    wbVar = org.telegram.ui.Components.cc.v(unVar.getParentActivity(), unVar, null, 1, j11, 1, unVar.getThemedColor(org.telegram.ui.ActionBar.t6.tj), unVar.getThemedColor(org.telegram.ui.ActionBar.t6.vj), 5000, false, i0Var);
                    wbVar.f32136k = true;
                    wbVar.k(wbVar.e instanceof org.telegram.ui.Components.hb);
                }
            }
            mh.j jVar3 = (mh.j) hashMap.get(mh.l.b(q1Var));
            if (jVar3 != null) {
                if (wbVar == null) {
                    jVar3.R = -1;
                    jVar3.c();
                    return;
                }
                org.telegram.ui.Components.bb bbVar = wbVar.e;
                if (!(bbVar instanceof org.telegram.ui.Components.eb)) {
                    jVar3.c();
                    return;
                }
                org.telegram.ui.Components.eb ebVar = (org.telegram.ui.Components.eb) bbVar;
                jVar3.W = ebVar;
                ebVar.f25744a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = jVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new mh.f(0, jVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void J1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new di.i(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.i0.g(spannableString);
        org.telegram.messenger.z20.r(null, 2131752022, org.telegram.ui.Components.cc.a0(this.f37301a));
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        un unVar = this.f37301a;
        unVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, unVar);
    }

    @Override
    public final boolean K1(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.K1(long):boolean");
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        this.f37301a.c8(characterStyle, z10, q1Var.getMessageObject(), q1Var);
    }

    @Override
    public final void L1(org.telegram.ui.Cells.q1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.L1(org.telegram.ui.Cells.q1, int, float, float, boolean):void");
    }

    @Override
    public final void M(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject.f16337k.send_state != 0) {
            this.f37301a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override
    public final boolean M0(org.telegram.ui.Cells.q1 r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.M0(org.telegram.ui.Cells.q1, boolean):boolean");
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
        un unVar = this.f37301a;
        unVar.getNotificationCenter().k(org.telegram.messenger.zs.f19656n3, Long.valueOf(unVar.f42297j6), q1Var);
    }

    @Override
    public final boolean N1(org.telegram.ui.Cells.q1 r38, org.telegram.tgnet.TLRPC.TodoItem r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.N1(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void O(org.telegram.messenger.jj jjVar) {
        if (org.telegram.messenger.jj.L4(jjVar.f16337k)) {
            this.f37301a.xb(jjVar, true);
        }
    }

    @Override
    public final void O0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.f16337k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String M0 = org.telegram.messenger.cd.M0("PsaMessageInfo_" + messageObject.f16337k.fwd_from.psa_type);
            if (TextUtils.isEmpty(M0)) {
                M0 = org.telegram.messenger.cd.L0(2131746609, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            org.telegram.messenger.jj.d(spannableStringBuilder, false);
            org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            un unVar = this.f37301a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.e;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((((org.telegram.messenger.bj) arrayList.get(i10)).f14783l & 1) != 0) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) currentMessagesGroup.d.get(i10);
                        if (jjVar != messageObject) {
                            int childCount = unVar.f42492z0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = unVar.f42492z0.getChildAt(i11);
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    if (jjVar.T(q1Var2.getMessageObject())) {
                                        q1Var = q1Var2;
                                    }
                                }
                            }
                            messageObject = jjVar;
                        }
                    } else {
                        i10++;
                    }
                }
            }
            unVar.cc(messageObject, spannableStringBuilder, 1);
            q1Var.C3(1, false, true);
        }
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        int i10;
        int i11;
        boolean l32 = org.telegram.messenger.jj.l3(q1Var.getMessageObject().f16337k);
        un unVar = this.f37301a;
        if (l32) {
            long o10 = org.telegram.messenger.o5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar);
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            a02.Q(2131624110, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744112, org.telegram.messenger.o5.l(i11, o10)))).k(true);
            return false;
        } else if (!q1Var.getMessageObject().q()) {
            long o11 = org.telegram.messenger.o5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(unVar);
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            a03.Q(2131624110, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744113, org.telegram.messenger.o5.l(i10, o11)))).k(true);
            return false;
        } else if (!unVar.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(unVar).Q(2131624214, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131744089, null), new pm(this, 9))).k(true);
            return false;
        } else {
            final long M = org.telegram.messenger.w3.M(unVar.e, unVar.f42374p8, true);
            final org.telegram.messenger.qz sendMessagesHelper = unVar.getSendMessagesHelper();
            final org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.jj.B0(messageObject.f16337k)), Integer.valueOf(messageObject.f1()), Integer.valueOf(todoItem.f19940id));
            sendMessagesHelper.H.put(Integer.valueOf(hash), Boolean.valueOf(z10));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.f1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().i1(org.telegram.messenger.jj.B0(messageObject.f16337k));
            if (z10) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.f19940id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.f19940id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    qz qzVar = qz.this;
                    final boolean z11 = z10;
                    if (tL_error == null) {
                        final hs messagesStorage = qzVar.getMessagesStorage();
                        jj jjVar = messageObject;
                        final long B0 = jj.B0(jjVar.f16337k);
                        final int f12 = jjVar.f1();
                        final int i12 = todoItem.f19940id;
                        final long e = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        r5 r5Var = messagesStorage.f15938a;
                        final long j10 = M;
                        r5Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mr.run():void");
                            }
                        });
                        qzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    }
                    i0.g3(new i2.j0(qzVar, hash, z11, 2));
                }
            });
            return true;
        }
    }

    @Override
    public final void P1(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull M0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        un unVar = this.f37301a;
        if (org.telegram.messenger.i0.E1(unVar.getParentActivity()) && (chat = unVar.e) != null && currentUser != null && !org.telegram.messenger.w3.V(chat)) {
            org.telegram.messenger.vp messagesController = unVar.getMessagesController();
            long j10 = unVar.e.f19793id;
            long j11 = currentUser.f19942id;
            a0.h hVar = (a0.h) messagesController.f18942x1.f(j10);
            if (hVar == null && (M0 = messagesController.M0(j10)) != null && M0.participants != null) {
                for (int i10 = 0; i10 < M0.participants.participants.size(); i10++) {
                    chatParticipant = M0.participants.participants.get(i10);
                    if (chatParticipant.user_id == j11) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) hVar.f(j11);
            d(q1Var, chatParticipant);
        }
    }

    @Override
    public final boolean Q() {
        un unVar = this.f37301a;
        if (unVar.f42333m6[1].size() + unVar.f42333m6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.q1 q1Var) {
        int i10;
        org.telegram.messenger.jj messageObject;
        TLRPC.Message message;
        if (q1Var != null) {
            un unVar = this.f37301a;
            if (unVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                if (org.telegram.messenger.vp.r1(i10).p4() && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f16337k) != null && message.rich_message != null) {
                    if (!messageObject.J2 || message.translatedRichMessage == null) {
                        return messageObject.u(unVar.e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean S() {
        un unVar = this.f37301a;
        if (!org.telegram.messenger.h20.z(unVar.f42243f) && !org.telegram.messenger.h20.B(unVar.f42243f)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean S0(org.telegram.messenger.jj jjVar) {
        fm fmVar;
        int i10 = (org.telegram.messenger.jj.B0(jjVar.f16337k) > 1271266957L ? 1 : (org.telegram.messenger.jj.B0(jjVar.f16337k) == 1271266957L ? 0 : -1));
        un unVar = this.f37301a;
        if ((i10 == 0 || ((fmVar = unVar.C0) != null && fmVar.N)) && unVar.f42248f4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
        Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "user_id");
        org.telegram.ui.ActionBar.k2 k2Var = this.f37301a;
        if (k2Var.getMessagesController().E(k10, k2Var, q1Var.getMessageObject(), null)) {
            k2Var.presentFragment(new un(k10));
        }
    }

    @Override
    public final void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.messenger.jj messageObject;
        if (chat == null) {
            return;
        }
        un unVar = this.f37301a;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (!lVar.u() && !unVar.M9()) {
            if (!z10 && chat.signature_profiles && (messageObject = q1Var.getMessageObject()) != null && org.telegram.messenger.jj.B0(messageObject.f16337k) != 1271266957) {
                unVar.Da(org.telegram.messenger.o5.o(messageObject.f16337k.from_id));
                return;
            } else {
                k(q1Var, chat, i10, z10);
                return;
            }
        }
        un.i2(unVar, q1Var, true, f7, f10);
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var) {
        e(q1Var, true, true, false);
    }

    @Override
    public final void U0() {
        un unVar = this.f37301a;
        unVar.Y7();
        UndoView undoView = unVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, unVar.f42297j6, null);
    }

    @Override
    public final int W() {
        return this.f37301a.f42248f4;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        un unVar = this.f37301a;
        if (!unVar.L9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (unVar.getParentActivity() != null) {
                if (unVar.f42207c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    mk mkVar = unVar.Z;
                    org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                    org.telegram.messenger.jj messageObject2 = q1Var.getMessageObject();
                    aj ajVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    gf.e eVar = unVar.Vb;
                    if (eVar != null) {
                        eVar.a(true);
                        unVar.Vb = null;
                    }
                    if (str != null && q1Var.getMessageObject() != null) {
                        aj ajVar2 = new aj(unVar, q1Var.getMessageObject().f1(), str, q1Var, 1);
                        unVar.Vb = ajVar2;
                        ajVar = ajVar2;
                    } else {
                        unVar.Vb = null;
                    }
                    mkVar.Y(keyboardButtonProto, messageObject, messageObject2, ajVar);
                }
            }
        }
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.jj messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            un unVar = this.f37301a;
            if (unVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f16337k) != null && messageObject.f16385w2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.f16385w2.f18990g;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    org.telegram.messenger.qu quVar = (org.telegram.messenger.qu) arrayList2.get(i10);
                    if (quVar instanceof org.telegram.messenger.dv) {
                        arrayList.add(((org.telegram.messenger.dv) quVar).f15312q0);
                    } else if (quVar instanceof org.telegram.messenger.pv) {
                        arrayList.add(((org.telegram.messenger.pv) quVar).f17482q0);
                    } else if (quVar instanceof org.telegram.messenger.vu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.vu) quVar).X;
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.ju) obj).f16436b);
                        }
                    } else if (quVar instanceof org.telegram.messenger.hv) {
                        ArrayList arrayList4 = ((org.telegram.messenger.hv) quVar).X;
                        int size2 = arrayList4.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList4.get(i12);
                            i12++;
                            arrayList.add(((org.telegram.messenger.ju) obj2).f16436b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.N2(null, unVar, null);
                    return v12.h2(null, null, null, null, null, null, null, indexOf, new nm(unVar, arrayList), null, 0L, 0L, 0L, true, new mm(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override
    public final void X1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f37301a.Lc(primaryMessageObject, false);
    }

    @Override
    public final zg.a Y() {
        return this.f37301a.f42327lc;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject;
        if (q1Var == null) {
            messageObject = null;
        } else {
            messageObject = q1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.f16337k != null) {
            un unVar = this.f37301a;
            if (unVar.f42248f4 != 1 && !unVar.K9() && !messageObject.f16337k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
        if (q1Var != null && document != null) {
            un unVar = this.f37301a;
            if (unVar.getParentLayout() != null && Z(q1Var)) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(unVar, q1Var);
                H.c(2131232113, org.telegram.messenger.cd.L0(2131745948, null), new p1(this, q1Var, document, 24), false);
                H.f32942t = false;
                H.Z();
            }
        }
    }

    @Override
    public final void Z1() {
        this.f37301a.C9();
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        un unVar = this.f37301a;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            CharSequence fieldText = mkVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = org.telegram.messenger.w3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                unVar.Z.setFieldText(spannableStringBuilder);
                org.telegram.messenger.i0.h3(new pm(this, 6), 200L);
            }
        }
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        char c10;
        int i10;
        v4 b10;
        int i11;
        qk qkVar;
        pk pkVar;
        if (!g()) {
            return false;
        }
        un unVar = this.f37301a;
        if (unVar.e != null && (((qkVar = unVar.f42207c1) == null || qkVar.getVisibility() != 0) && ((pkVar = unVar.S) == null || pkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && ((unVar.f42394r4 == 0 || unVar.f42445v4) && (!org.telegram.messenger.w3.T(chat) || unVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        b5[] b5VarArr = new b5[r22 + 2 + r42];
        b5VarArr[0] = b5.d;
        b5VarArr[1] = b5.h;
        if (r22 != 0) {
            b5VarArr[2] = b5.f35983n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            b5VarArr[c10] = b5.f35984r;
        }
        TLRPC.UserFull a2 = unVar.getMessagesController().a2(user.f19942id);
        if (a2 == null) {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            b10 = v4.b(user, i10, b5VarArr);
        } else {
            b10 = v4.c(user, a2, b5VarArr);
            if (!ac.a.h(b10)) {
                i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                b10 = v4.b(user, i11, b5VarArr);
            }
        }
        if (ac.a.h(b10)) {
            ac.a.n().A((ViewGroup) unVar.fragmentView, unVar.f42477xa, b10, new a7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(unVar, q1Var);
        H.c(2131232265, org.telegram.messenger.cd.L0(2131747802, null), new Runnable(this) {
            public final fn f41246b;

            {
                this.f41246b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f41246b.r(user, false);
                        return;
                    case 1:
                        this.f41246b.b(user);
                        return;
                    default:
                        this.f41246b.f37301a.Ca(user);
                        return;
                }
            }
        }, false);
        H.c(2131232112, org.telegram.messenger.cd.L0(2131745618, null), new p1(this, q1Var, user, 25), false);
        H.l(2131232221, org.telegram.messenger.cd.L0(2131748624, null), new Runnable(this) {
            public final fn f41246b;

            {
                this.f41246b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f41246b.r(user, false);
                        return;
                    case 1:
                        this.f41246b.b(user);
                        return;
                    default:
                        this.f41246b.f37301a.Ca(user);
                        return;
                }
            }
        }, r22);
        H.l(2131232353, org.telegram.messenger.cd.L0(2131753758, null), new Runnable(this) {
            public final fn f41246b;

            {
                this.f41246b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f41246b.r(user, false);
                        return;
                    case 1:
                        this.f41246b.b(user);
                        return;
                    default:
                        this.f41246b.f37301a.Ca(user);
                        return;
                }
            }
        }, r42);
        H.f32942t = false;
        H.f32923i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
        H.Z();
        return true;
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        un unVar = this.f37301a;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            CharSequence fieldText = mkVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String n10 = org.telegram.messenger.h20.n(user);
            if (n10 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) n10).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(sc.e.A(org.telegram.messenger.h20.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.h51("" + user.f19942id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            unVar.Z.setFieldText(spannableStringBuilder);
            org.telegram.messenger.i0.h3(new pm(this, 7), 200L);
        }
    }

    @Override
    public final void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f37301a.e8(q1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z10;
        un unVar = this.f37301a;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (!lVar2.u() && !unVar.M9()) {
                z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
                if (!z10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void c0(int i10) {
        CharSequence T2;
        int i11;
        SpannableStringBuilder W2;
        int i12;
        un unVar = this.f37301a;
        try {
            if (i10 == 0) {
                unVar.p7();
                il ilVar = unVar.N3;
                if (ilVar != null) {
                    ilVar.l(0L, 84, null, new pm(this, 1));
                    unVar.N3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String x10 = org.telegram.messenger.cd.x(unVar.getMessagesController().f18925v4, true);
                if (unVar.getMessagesController().f18925v4 > 0) {
                    i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(org.telegram.ui.Components.u21.g(i12), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(org.telegram.ui.Components.u21.g(i11), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.cc.a0(unVar).G(2131624297, 6, W2).k(true);
                unVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String x11 = org.telegram.messenger.cd.x(unVar.getMessagesController().f18925v4, true);
                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(unVar.getMessagesController().f18907t4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    T2 = org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131743993, null), new pm(this, 2));
                } else if (unVar.getMessagesController().f18925v4 <= 0) {
                    T2 = "";
                } else {
                    T2 = org.telegram.messenger.i0.T2(org.telegram.messenger.cd.a0(null, null, 2131743992, x11), new pm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(T2);
                a02.getClass();
                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), a02.f25043c);
                ebVar.c(2131624297, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i13 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i13 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i13++;
                    }
                }
                ebVar.f25745b.setText(append2);
                ebVar.f25745b.setSingleLine(false);
                ebVar.f25745b.setMaxLines(6);
                a02.b(ebVar, 7000).k(true);
                org.telegram.messenger.t2.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String L0;
        int i13;
        TLRPC.User user2;
        int i14;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z10;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        boolean z11 = false;
        ym ymVar = null;
        ym ymVar2 = null;
        File file = null;
        ym ymVar3 = null;
        ym ymVar4 = null;
        un unVar = this.f37301a;
        if (i10 == 19) {
            gf.e eVar = unVar.Vb;
            if (eVar != null) {
                eVar.a(true);
            }
            if (q1Var.getMessageObject() != null) {
                ymVar2 = new ym(this, q1Var, 2);
            }
            final ym ymVar5 = ymVar2;
            unVar.Vb = ymVar5;
            final Activity parentActivity = unVar.getParentActivity();
            final org.telegram.ui.ActionBar.p6 resourceProvider = unVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ymVar5.d();
            ymVar5.f7485b = new mg.i(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.f16337k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b10 = mg.p.b(messageObject);
            TLRPC.Chat L02 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(-messageObject.Z0()));
            if (L02 != null && org.telegram.messenger.w3.V(L02)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j10 = messageObject.f16337k.date * 1000;
            mg.k0.d(messageObject, new org.telegram.messenger.q20(atomicBoolean, ymVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f13163a;
                public final gf.e f13164b;
                public final boolean f13165c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f13166f;
                public final p6 f13167g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f13166f = parentActivity;
                    this.f13167g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f13163a.get()) {
                        this.f13164b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f13165c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f13166f;
                        p6 p6Var = this.f13167g;
                        if (z12) {
                            p.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, p6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            p.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, p6Var);
                        }
                    }
                }
            }, new mg.k(atomicBoolean, ymVar5, 0));
        } else if (i10 == 21) {
            org.telegram.messenger.w0.u();
            boolean z12 = org.telegram.messenger.v2.f18448a;
            org.telegram.messenger.w0.r();
            gf.f.r(unVar.getParentActivity(), org.telegram.messenger.v2.f18452g);
        } else if (i10 == 84) {
            unVar.Ja(q1Var);
        } else if (i10 == 80) {
            mh.g gVar = org.telegram.ui.Components.tf0.I1;
            if (unVar.getParentActivity() != null) {
                unVar.showDialog(new org.telegram.ui.Components.tf0(unVar.getContext(), unVar.getCurrentAccount(), messageObject, unVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.f16337k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(messageObject) == null) {
                    unVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.f16337k.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                user2 = org.telegram.messenger.vp.r1(i14).Z1(Long.valueOf(j11));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.f16337k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.f19942id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                unVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File g12 = org.telegram.messenger.i0.g1();
                    g12.mkdirs();
                    file = new File(g12, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                unVar.showDialog(new org.telegram.ui.Components.vd0(unVar, null, user2, null, file, af.b.d(str, false), str3, str4, unVar.f42477xa));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else if (i10 == 30) {
            unVar.presentFragment(new un(org.telegram.ui.Cells.f1.k(messageObject.f16337k.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.f16337k.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                user = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(j12));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.X1)) {
                    L0 = messageObject.X1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    L0 = org.telegram.messenger.m5.h(new StringBuilder("+"), user.phone, af.b.c());
                } else {
                    String str5 = org.telegram.messenger.jj.o1(messageObject.f16337k).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        L0 = af.b.c().b(str5);
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131747848, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.f19942id);
                bundle2.putString("phone", L0);
                bundle2.putBoolean("addContact", true);
                unVar.presentFragment(new ns(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.r4()) {
                unVar.Z9(messageObject, false, false);
                if (messageObject.R0 != null) {
                    gf.e eVar2 = unVar.Vb;
                    if (eVar2 != null) {
                        eVar2.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        ymVar3 = new ym(this, q1Var, 4);
                    }
                    unVar.Vb = ymVar3;
                    gf.f.q(unVar.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, unVar.Vb, null, false, unVar.getMessagesController().f18777e6, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage X1 = messageObject.X1();
            if (X1 == null && (message = messageObject.f16337k) != null && (messageMedia2 = message.media) != null) {
                X1 = messageMedia2.webpage;
            }
            if (X1 != null) {
                if (X1.attributes != null) {
                    for (int i15 = 0; i15 < X1.attributes.size(); i15++) {
                        if ((X1.attributes.get(i15) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) X1.attributes.get(i15)).storyItem) != null) {
                            storyItem.dialogId = org.telegram.messenger.o5.o(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.f1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            unVar.getOrCreateStoryViewer().U(unVar.getParentActivity(), tL_webPageAttributeStory.storyItem, th.n5.a(unVar.f42492z0));
                            return;
                        }
                    }
                }
                if (!unVar.ua(X1.url, q1Var, null, messageObject.f1(), 2)) {
                    gf.e eVar3 = unVar.Vb;
                    if (eVar3 != null) {
                        eVar3.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        ymVar4 = new ym(this, q1Var, 5);
                    }
                    unVar.Vb = ymVar4;
                    gf.f.q(unVar.getParentActivity(), Uri.parse(X1.url), true, true, false, unVar.Vb, null, false, true, false);
                }
            }
        } else {
            if (i10 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.f16337k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                gf.e eVar4 = unVar.Vb;
                if (eVar4 != null) {
                    eVar4.a(true);
                }
                if (q1Var.getMessageObject() != null) {
                    ymVar = new ym(this, q1Var, 3);
                }
                unVar.Vb = ymVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    if (org.telegram.messenger.ui.b0(i11).p0(group) == null) {
                        unVar.Vb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        unVar.Vb.f7485b = new ag.d3(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new org.telegram.messenger.voip.u0(2, this, z11)), 23);
                        return;
                    }
                }
                gf.f.q(unVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, unVar.Vb, null, false, true, false);
            }
        }
    }

    @Override
    public final boolean c2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        if (i10 != 16 && i10 != 2131296267 && i10 != 2131296264) {
            return false;
        }
        un unVar = this.f37301a;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        if (z10 && unVar.f42216ca) {
            z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
            if (z4Var != null) {
                z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                ((ActionBarLayout) z4Var2).r();
            }
            return true;
        }
        return !c();
    }

    public final void d(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        un unVar = this.f37301a;
        unVar.getUserConfig().f();
        if (org.telegram.messenger.i0.E1(unVar.getParentActivity()) && (chat = unVar.e) != null && currentUser != null && !org.telegram.messenger.w3.V(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == unVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == unVar.getUserConfig().e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                org.telegram.ui.Components.iz0.b(parentActivity, i10, -unVar.e.f19793id, currentUser, str2, z15, z16, z12, p6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == unVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (org.telegram.messenger.w3.T(unVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                unVar.getMessagesController();
                tL_channels_getParticipant.channel = org.telegram.messenger.vp.h1(unVar.e);
                tL_channels_getParticipant.participant = unVar.getMessagesController().i1(currentUser.f19942id);
                unVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new a3.b(1), new ih.s(5, this, q1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
            org.telegram.ui.Components.iz0.b(parentActivity2, i10, -unVar.e.f19793id, currentUser, str2, z152, z162, z12, p6Var);
        }
    }

    @Override
    public final boolean d0() {
        if (this.f37301a.f42248f4 == 0) {
            return true;
        }
        return false;
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.jj primaryMessageObject;
        int i10;
        int i11;
        yj yjVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.K1 = true;
        un unVar = this.f37301a;
        vj vjVar = unVar.f42492z0;
        if (vjVar != null && (yjVar = unVar.B0) != null && yjVar.f47877y < 0) {
            for (int childCount = vjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = unVar.f42492z0.getChildAt(childCount);
                unVar.f42492z0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = unVar.Y8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        i11 = unVar.Y8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                yj yjVar2 = unVar.B0;
                unVar.f42492z0.getClass();
                yjVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) unVar.L9), false);
            } else {
                unVar.B0.h1(i10, i11);
            }
        }
        unVar.f42193b1 = z11;
        unVar.Lc(primaryMessageObject, false);
        unVar.f42193b1 = false;
    }

    @Override
    public final void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        this.f37301a.Q7(q1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final void e2() {
        un unVar = this.f37301a;
        if (unVar.getUserConfig().q()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", unVar.f42297j6);
            bundle.putInt("start_from", 10);
            unVar.presentFragment(new org.telegram.ui.Components.n90(bundle, unVar.f42355o1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.cc.a0(unVar).Q(2131624214, 36, org.telegram.messenger.i0.T2(org.telegram.messenger.cd.H(',', "UnlockSimilarChannelsPremium", unVar.getMessagesController().f18954y4), new pm(this, 4))).j();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.q1 q1Var) {
        ih.d dVar;
        un unVar = this.f37301a;
        if (unVar.Sc.f7021f && (dVar = unVar.Yc) != null && dVar.f8527n == q1Var && dVar.f8523a.getWidth() > 0) {
            return unVar.Yc.f8523a.getHeight();
        }
        return 0;
    }

    @Override
    public final void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        mh.j jVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        mh.l lVar = this.f37301a.f42387qa;
        if (lVar != null && (jVar = (mh.j) lVar.f13372a.get(mh.l.b(q1Var))) != null) {
            mh.d[] dVarArr = jVar.f13367x;
            RectF rectF = jVar.f13364r;
            if (jVar.M) {
                float f12 = (f7 - rectF.left) + jVar.U;
                float f13 = (f10 - rectF.top) + jVar.V;
                int i11 = mh.i.f13351a;
                int floor = (int) Math.floor((f12 - (org.telegram.messenger.i0.L(9) - (org.telegram.messenger.i0.L(11) / 2.0f))) / org.telegram.messenger.i0.L(mh.i.f13351a + 11));
                if ((-org.telegram.messenger.i0.L(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.u.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (jVar.R != i10) {
                    jVar.f13358a.performHapticFeedback(3, 1);
                    jVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        mh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f13326p != z10) {
                            ValueAnimator valueAnimator = dVar.f13324n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f13326p = z10;
                            float f15 = dVar.f13325o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f13324n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f13324n.addUpdateListener(dVar);
                            dVar.f13324n.setInterpolator(mh.h.f13334a);
                            dVar.f13324n.start();
                        }
                        mh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f13323m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f13321k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f13323m = z11;
                            float f16 = dVar2.f13322l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f13321k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f13321k.addUpdateListener(dVar2);
                            dVar2.f13321k.setInterpolator(mh.h.f13334a);
                            dVar2.f13321k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
        org.telegram.messenger.jj messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        un unVar = this.f37301a;
        vh.p2 p2Var = unVar.O1;
        if (p2Var != null) {
            p2Var.e(true);
        }
        if (unVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.cd.D0().f15003y);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                str = R0.country;
            }
            vh.p2 p2Var2 = new vh.p2(unVar.getParentActivity(), 3);
            p2Var2.p(true);
            p2Var2.K = Layout.Alignment.ALIGN_NORMAL;
            p2Var2.d = -1L;
            p2Var2.T = true;
            p2Var2.e = true;
            p2Var2.q(12.0f);
            unVar.O1 = p2Var2;
            p2Var2.f51740l0 = new zg(11, this, p2Var2);
            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750849, str)));
            unVar.l1.addView(unVar.O1, w7.b6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            unVar.l1.post(new i2.a0(this, q1Var, i11, i10, 12));
        }
    }

    public final boolean g() {
        un unVar = this.f37301a;
        if (!org.telegram.messenger.h20.B(unVar.f42243f)) {
            TLRPC.Chat chat = unVar.e;
            if (chat != null) {
                if (org.telegram.messenger.w3.T(chat) && !unVar.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        un unVar = this.f37301a;
        if (unVar.getParentActivity() != null) {
            if (unVar.f42387qa == null) {
                mh.l lVar = new mh.l(unVar.getParentActivity());
                unVar.f42387qa = lVar;
                unVar.l1.addView(lVar, w7.b6.e(-1, -1, 48));
            }
            mh.l lVar2 = unVar.f42387qa;
            HashMap hashMap = lVar2.f13372a;
            ArrayList arrayList = lVar2.f13374c;
            arrayList.clear();
            int i10 = lVar2.d;
            org.telegram.messenger.d20 i11 = org.telegram.messenger.d20.i(i10);
            long j10 = i11.f15165n;
            arrayList.add(Long.valueOf(j10));
            if (i11.V) {
                ArrayList arrayList2 = org.telegram.messenger.ui.b0(i10).f18325i1;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j11 = tL_topPeer.peer.user_id;
                    if (j11 != 0) {
                        int i13 = size;
                        if (org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j11));
                        }
                        size = i13;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = org.telegram.messenger.vp.r1(i10).f18950y;
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i14);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j12 = dialog.f19797id;
                    if (j12 != j10 && !org.telegram.messenger.o5.C(j12)) {
                        if (org.telegram.messenger.o5.E(dialog.f19797id)) {
                            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(dialog.f19797id));
                            if (Z1 != null && !org.telegram.messenger.h20.t(Z1) && !org.telegram.messenger.h20.x(Z1) && !org.telegram.messenger.h20.A(Z1.f19942id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19797id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19797id));
                                }
                            }
                        } else {
                            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-dialog.f19797id));
                            if (L0 != null && !L0.forum && !org.telegram.messenger.w3.r0(L0) && ((!L0.gigagroup || org.telegram.messenger.w3.N(L0)) && (!org.telegram.messenger.w3.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19797id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19797id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = mh.l.b(q1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    Long l4 = (Long) obj2;
                    if (hashSet.add(l4) && org.telegram.messenger.o5.E(l4.longValue())) {
                        arrayList5.add(l4);
                    }
                }
                mh.j jVar = new mh.j(lVar2, q1Var, arrayList5, new mh.k(0, lVar2, b10));
                jVar.setBounds(0, 0, lVar2.getMeasuredWidth(), lVar2.getMeasuredHeight());
                jVar.setCallback(lVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, jVar);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.l9 g2() {
        return this.f37301a.f42386q9;
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        un unVar;
        int i10;
        if (q1Var.getMessageObject() != null && (i10 = (unVar = this.f37301a).Rb) != 0 && i10 == q1Var.getMessageObject().f1() && unVar.Sb == 3) {
            return unVar.Ub;
        }
        return null;
    }

    @Override
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = ih.j.a(messageObject);
            boolean a10 = v7.u7.a(a2, 7);
            un unVar = this.f37301a;
            if (a10) {
                org.telegram.ui.Components.cc.a0(unVar).Q(2131624006, 36, ih.j.b(a2, messageObject)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                unVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
                q1Var.a0(true);
            } else if (unVar.getParentActivity() != null) {
                if (unVar.B2 == null) {
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(5, unVar.getParentActivity(), unVar.f42477xa, false);
                    unVar.B2 = q30Var;
                    q30Var.setAlpha(0.0f);
                    unVar.B2.setVisibility(4);
                    int indexOfChild = unVar.l1.indexOfChild(unVar.T);
                    if (indexOfChild == -1) {
                        return;
                    }
                    unVar.l1.addView(unVar.B2, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.p1> pollButtons = q1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i16);
                            float y3 = ((q1Var.getY() + p1Var.f22422b) - org.telegram.messenger.i0.L(4.0f)) - unVar.L9;
                            unVar.E2 = org.telegram.messenger.i0.L(13.3f) + p1Var.f22421a;
                            int D = org.telegram.messenger.z20.D(6.0f, p1Var.f22422b, i12);
                            unVar.F2 = D;
                            if (y3 > 0.0f) {
                                i15 = unVar.E2;
                                i13 = D;
                                f7 = 0.0f;
                                break;
                            }
                            i16++;
                            f7 = y3;
                        } else {
                            i13 = i12;
                            i15 = i11;
                            break;
                        }
                    }
                    if (f7 != 0.0f) {
                        unVar.f42492z0.w0(0, (int) f7, null);
                        unVar.D2 = q1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                unVar.B2.e(q1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final boolean i0() {
        boolean z10;
        un unVar = this.f37301a;
        if (!unVar.M9()) {
            z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void j() {
        org.telegram.messenger.w0.u();
        boolean z10 = org.telegram.messenger.v2.f18448a;
        org.telegram.messenger.w0.r();
        gf.f.r(this.f37301a.getParentActivity(), org.telegram.messenger.v2.f18452g);
    }

    @Override
    public final boolean j1() {
        un unVar = this.f37301a;
        if (unVar.l1.getMeasuredWidth() > unVar.l1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, boolean z10) {
        un unVar = this.f37301a;
        TLRPC.Chat chat2 = unVar.e;
        if (chat2 != null && chat.f19793id == chat2.f19793id) {
            qj qjVar = unVar.f42355o1;
            if (qjVar != null && i10 == 0) {
                qjVar.e(false, false);
            } else if (q1Var.getMessageObject() != null) {
                unVar.k(i10, q1Var.getMessageObject().f1(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f19793id != chat2.f19793id || unVar.T9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19793id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            bj bjVar = null;
            if (z10) {
                gf.e eVar = unVar.Vb;
                if (eVar != null) {
                    eVar.a(true);
                    unVar.Vb = null;
                }
                if (q1Var != null && q1Var.getMessageObject() != null) {
                    bj bjVar2 = new bj(unVar, q1Var.getMessageObject().f1(), q1Var, 0);
                    unVar.Vb = bjVar2;
                    bjVar = bjVar2;
                } else {
                    unVar.Vb = null;
                }
            }
            if (unVar.getMessagesController().E(bundle, unVar, q1Var.getMessageObject(), bjVar)) {
                bj bjVar3 = bjVar;
                un unVar2 = new un(bundle);
                if (bjVar3 != null && i10 != 0) {
                    org.telegram.messenger.i0.h3(new i2.g1(this, bjVar3, chat, i10, unVar2, 7), 5000L);
                    bjVar3.d();
                    return;
                }
                unVar.presentFragment(unVar2);
            }
        }
    }

    @Override
    public final boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        un unVar = this.f37301a;
        if (unVar.Rb != 0 && q1Var.getMessageObject() != null && unVar.Rb == q1Var.getMessageObject().f1() && unVar.Sb == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Document document;
        int i12;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i13;
        TLRPC.Document document3;
        int i14;
        int i15;
        int i16;
        long j10;
        long j11;
        int i17;
        boolean z10;
        boolean z11;
        int i18;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(messageObject);
        if (messageMedia != null && messageObject != null && (n12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                w1(q1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            un unVar = this.f37301a;
            if (geoPoint != null) {
                if (org.telegram.messenger.i0.J1(unVar)) {
                    yb0 yb0Var = new yb0(3);
                    p6Var2 = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                    yb0Var.setResourceProvider(p6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = unVar.getMessagesController().y1(unVar.a());
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    yb0Var.W0 = false;
                    yb0Var.H0(new org.telegram.messenger.jj(org.telegram.messenger.d20.f15147s0, tL_message, false, false));
                    unVar.presentFragment(yb0Var);
                }
            } else if (org.telegram.messenger.jj.N2(messageMedia.document)) {
                lt.p().v(unVar.getParentActivity());
                lt.p().u(new dn(this, tL_messageMediaPoll, pollAnswer, q1Var));
                lt p5 = lt.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.jj.H2(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                org.telegram.messenger.jj messageObject2 = q1Var.getMessageObject();
                p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                p5.s(document4, null, "", null, null, i18, false, messageObject2, p6Var, 200);
            } else if (org.telegram.messenger.jj.J3(messageMedia.document)) {
                org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                if (MediaController.B().I(messageObject) && jjVar != null) {
                    boolean z12 = jjVar.f16338k0;
                    if (i10 == -3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 == z11) {
                        if (MediaController.B().H()) {
                            MediaController.B().S(jjVar);
                            return;
                        } else {
                            MediaController.B().R(jjVar, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.f16337k;
                TLRPC.TL_message K7 = un.K7(message);
                K7.media = messageMedia;
                K7.attachPath = ih.g.c(i10, message);
                ArrayList arrayList = new ArrayList();
                i17 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i17, K7, false, true);
                if (i10 == -3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jjVar2.f16338k0 = z10;
                arrayList.add(jjVar2);
                if (MediaController.B().I(messageObject)) {
                    MediaController.B().q(false, true, false, false);
                }
                MediaController.B().o0(arrayList, jjVar2, 0L, true, null);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !org.telegram.messenger.jj.K4(document5)) {
                    i15 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    ih.a aVar = new ih.a(i15, messageObject, document6, ih.g.c(i10, messageObject.f16337k));
                    if (aVar.f8519g) {
                        org.telegram.messenger.b8.G(i15).f(document6);
                        aVar.a();
                        q1Var.Z();
                        return;
                    } else if (!aVar.f8518f) {
                        org.telegram.messenger.b8.G(i15).X(document6, messageObject, 2, 0);
                        aVar.a();
                        q1Var.Z();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.f16337k;
                        TLRPC.TL_message K72 = un.K7(message2);
                        K72.media = messageMedia;
                        K72.attachPath = ih.g.c(i10, message2);
                        i16 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        org.telegram.messenger.jj jjVar3 = new org.telegram.messenger.jj(i16, K72, false, true);
                        if (org.telegram.messenger.jj.y(messageMedia.document)) {
                            PhotoViewer.v1().N2(null, unVar, unVar.f42477xa);
                            PhotoViewer v12 = PhotoViewer.v1();
                            int i19 = jjVar3.D;
                            long j12 = 0;
                            if (i19 != 0) {
                                j10 = unVar.f42297j6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = unVar.f42199b7;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = unVar.b();
                            }
                            v12.i2(jjVar3, unVar, j10, j11, j12, unVar.Za);
                            return;
                        }
                        try {
                            org.telegram.messenger.i0.u2(jjVar3, unVar.getParentActivity(), unVar.f42477xa, false);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            unVar.G6(jjVar3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.f16337k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.jj.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i11 = arrayList3.size();
                    } else {
                        i11 = -1;
                    }
                    TLRPC.TL_message K73 = un.K7(message3);
                    K73.media = messageMedia3;
                    K73.attachPath = ih.g.c(-2, message3);
                    i14 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.jj(i14, K73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.jj.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message K74 = un.K7(message3);
                    K74.media = messageMedia2;
                    K74.attachPath = ih.g.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    K74.message = pollResults2.solution;
                    K74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.jj(i13, K74, false, true));
                    arrayList2.add(-3);
                }
                sf.d.b(tL_messageMediaPoll.poll, unVar.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i20);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.jj.K4(document))) {
                        if (pollAnswer2.unshuffled_index == i10) {
                            i11 = arrayList3.size();
                        }
                        TLRPC.TL_message K75 = un.K7(message3);
                        K75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        K75.message = tL_textWithEntities2.text;
                        K75.entities = tL_textWithEntities2.entities;
                        K75.attachPath = ih.g.c(pollAnswer2.unshuffled_index, message3);
                        i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        arrayList3.add(new org.telegram.messenger.jj(i12, K75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.f16360q0 = arrayList2;
                    PhotoViewer.v1().N2(null, unVar, unVar.f42477xa);
                    PhotoViewer.v1().e2(arrayList3, i11, unVar.a(), 0L, 0L, unVar.f42189ab);
                }
            }
        }
    }

    @Override
    public final void l0(String str) {
        un unVar = this.f37301a;
        qk qkVar = unVar.f42207c1;
        if (qkVar == null || qkVar.getVisibility() != 0) {
            pk pkVar = unVar.S;
            if ((pkVar == null || pkVar.getVisibility() != 0) && unVar.Z != null && str != null && str.length() > 0) {
                mk mkVar = unVar.Z;
                mkVar.setFieldText("@" + str + " ");
                unVar.Z.F0();
            }
        }
    }

    @Override
    public final void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        e(q1Var, z10, false, z11);
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19942id);
            org.telegram.ui.ActionBar.k2 k2Var = this.f37301a;
            if (k2Var.getMessagesController().E(bundle, k2Var, q1Var.getMessageObject(), null)) {
                k2Var.presentFragment(new un(bundle));
            }
        }
    }

    @Override
    public final boolean m0(org.telegram.ui.Components.o5 o5Var) {
        TLRPC.InputStickerSet j12;
        int i10;
        un unVar = this.f37301a;
        if (!unVar.getMessagesController().A3() && o5Var != null && !o5Var.standard) {
            long documentId = o5Var.getDocumentId();
            TLRPC.Document document = o5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                document = org.telegram.ui.Components.f5.e(i10, documentId);
            }
            if (document != null && (j12 = org.telegram.messenger.jj.j1(document)) != null) {
                org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).m0(j12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(j12);
                org.telegram.ui.Components.cv cvVar = new org.telegram.ui.Components.cv(unVar, unVar.getParentActivity(), unVar.f42477xa, arrayList);
                org.telegram.ui.Components.uu uuVar = cvVar.f25164m1;
                uuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(uuVar);
                uuVar.f31045w = imageReceiver;
                if (uuVar.d) {
                    imageReceiver.P();
                }
                uuVar.f31046x = true;
                uuVar.f31047y.e(true, 1.0f);
                uuVar.f31045w.r0(org.telegram.messenger.ic.b(document), "140_140", org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f21095m6, 0.2f, true), 0L, null, null, 0);
                uuVar.f31045w.E0(7);
                ImageReceiver imageReceiver2 = uuVar.f31045w;
                imageReceiver2.f14410u0 = true;
                imageReceiver2.f14408t0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = uuVar.f31045w;
                imageReceiver3.f14415w0 = true;
                imageReceiver3.H0(uuVar);
                boolean J9 = unVar.J9();
                cvVar.f21601h0 = J9;
                cvVar.f21606n = J9;
                unVar.showDialog(cvVar);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void m1(org.telegram.ui.Cells.q1 q1Var) {
        un.a5(this.f37301a, q1Var);
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var) {
        if (q1Var.getMessageObject().y3()) {
            U0();
            return;
        }
        un unVar = this.f37301a;
        if (!unVar.f42495z3 && unVar.f42492z0 != null && unVar.getParentActivity() != null && unVar.fragmentView != null) {
            if (unVar.I2 == null) {
                km kmVar = unVar.l1;
                int indexOfChild = kmVar.indexOfChild(unVar.T);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(1, unVar.getParentActivity(), unVar.f42477xa, false);
                    unVar.I2 = q30Var;
                    kmVar.addView(q30Var, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    unVar.I2.setAlpha(0.0f);
                    unVar.I2.setVisibility(4);
                } else {
                    return;
                }
            }
            unVar.I2.e(q1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        e(q1Var, z10, false, false);
    }

    @Override
    public final void o() {
        this.f37301a.l1.getClass();
    }

    @Override
    public final void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        un unVar = this.f37301a;
        unVar.Q7(q1Var, false, false, f7, f10, true, false, false);
        unVar.f42492z0.getClass();
        un.j2(unVar, RecyclerView.R(q1Var));
    }

    public final void p(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19793id);
            bundle.putBoolean("expandPhoto", false);
            this.f37301a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        BitmapDrawable bitmapDrawable;
        boolean z10;
        int i15;
        int i16;
        String str2;
        boolean z11;
        v4 v4Var;
        int i17;
        int i18;
        b5 b5Var;
        qk qkVar;
        pk pkVar;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.w3.K(chat, false));
        un unVar = this.f37301a;
        if (!isEmpty && unVar.e != null && (((qkVar = unVar.f42207c1) == null || qkVar.getVisibility() != 0) && ((pkVar = unVar.S) == null || pkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = unVar.e;
        if (chat2 != null && ((unVar.f42394r4 == 0 || unVar.f42445v4) && (!org.telegram.messenger.w3.T(chat2) || unVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = unVar.e;
        if (chat3 != null && chat3.f19793id == chat.f19793id && !unVar.T9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        b5[] b5VarArr = new b5[i12 + 1 + i10 + i11];
        b5VarArr[0] = b5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                b5Var = b5.e;
            } else {
                b5Var = b5.f35982f;
            }
            b5VarArr[1] = b5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            b5VarArr[i13] = b5.f35983n;
            i13++;
        }
        if (i11 != 0) {
            b5VarArr[i13] = b5.f35984r;
        }
        TLRPC.ChatFull M0 = unVar.getMessagesController().M0(chat.f19793id);
        if (M0 == null) {
            i14 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            org.telegram.messenger.ic m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 0, chat);
            org.telegram.messenger.ic m11 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 1, chat);
            if (m11 != null && (m11.f16104k instanceof TLRPC.TL_photoStrippedSize)) {
                str = "b";
            } else {
                str = null;
            }
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            } else {
                bitmapDrawable = null;
            }
            z10 = true;
            i15 = i10;
            i16 = i11;
            str2 = null;
            z11 = i12;
            v4Var = new v4(m10, m11, null, str, null, null, bitmapDrawable, chat, b5VarArr, new x4(i14, org.telegram.messenger.zs.T, chat));
        } else {
            v4Var = v4.a(chat, M0, b5VarArr);
            i15 = i10;
            i16 = i11;
            z10 = true;
            str2 = null;
            z11 = i12;
        }
        if (ac.a.h(v4Var)) {
            ac.a.n().A((ViewGroup) unVar.fragmentView, unVar.f42477xa, v4Var, new a7(this, chat, q1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(unVar, q1Var);
        H.c(2131232265, org.telegram.messenger.cd.L0(2131747802, str2), new sm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i17 = 2131232087;
        } else {
            i17 = 2131232112;
        }
        if (z12) {
            i18 = 2131747827;
        } else {
            i18 = 2131747815;
        }
        H.l(i17, org.telegram.messenger.cd.L0(i18, str2), new p1(this, q1Var, chat, 26), z11);
        H.l(2131232221, org.telegram.messenger.cd.L0(2131748624, str2), new sm(this, chat, z10 ? 1 : 0), i15);
        H.l(2131232353, org.telegram.messenger.cd.L0(2131753758, str2), new sm(this, chat, 2), i16);
        H.f32942t = false;
        H.f32923i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void q(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.q(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        un unVar = this.f37301a;
        if (!unVar.L9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (unVar.getParentActivity() != null) {
                if (unVar.f42207c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) unVar.getParentActivity(), (org.telegram.ui.ActionBar.p6) unVar.f42477xa, false);
                        z2Var.O();
                        z2Var.O = str;
                        z2Var.P = false;
                        z2Var.Q = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131751767, null)};
                        eg.j jVar = new eg.j(4, unVar, str);
                        z2Var.L = charSequenceArr;
                        z2Var.K = jVar;
                        unVar.showDialog(z2Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        unVar.pa(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
                        try {
                            q1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    public final void r(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f19942id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19942id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            un unVar = this.f37301a;
            TLRPC.User user2 = unVar.f42243f;
            if (user2 != null && user2.f19942id == user.f19942id) {
                i11 = 1;
            }
            profileActivity.f5(i11);
            Activity parentActivity = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            org.telegram.messenger.i0.k3(parentActivity, i10);
            unVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.l lVar;
        un unVar = this.f37301a;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        boolean z10 = true;
        if (!lVar.u() && !unVar.M9()) {
            if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().r4()) {
                c1(q1Var, 10);
                return;
            }
            if (!org.telegram.messenger.w3.c0(unVar.e) && !unVar.T9()) {
                z10 = false;
            }
            r(user, z10);
            return;
        }
        un.i2(unVar, q1Var, true, f7, f10);
    }

    @Override
    public final boolean r1() {
        un unVar = this.f37301a;
        if (unVar.l1.getKeyboardHeight() + unVar.Ha >= org.telegram.messenger.i0.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        this.f37301a.rc();
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 r27, float r28, float r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.s0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        boolean z10 = q1Var.getMessageObject().f16337k.media instanceof TLRPC.TL_messageMediaGiveaway;
        un unVar = this.f37301a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().f16337k.media).channels.get(i10).longValue();
            if (unVar.f42297j6 != j10) {
                unVar.presentFragment(un.ha(j10));
            } else {
                unVar.f42355o1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().f16337k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            unVar.presentFragment(ProfileActivity.z4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().f16337k.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void t(org.telegram.ui.Cells.q1 q1Var) {
        int i10;
        int i11;
        yj yjVar;
        org.telegram.messenger.jj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.X2 = !primaryMessageObject.X2;
            primaryMessageObject.K1 = true;
            un unVar = this.f37301a;
            vj vjVar = unVar.f42492z0;
            if (vjVar != null && (yjVar = unVar.B0) != null && yjVar.f47877y < 0) {
                for (int childCount = vjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = unVar.f42492z0.getChildAt(childCount);
                    unVar.f42492z0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = unVar.Y8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                            i11 = unVar.Y8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            unVar.Lc(primaryMessageObject, false);
            vh.p2 p2Var = unVar.O1;
            if (p2Var != null) {
                p2Var.e(true);
            }
            if (i10 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
                unVar.B0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void u1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        un unVar = this.f37301a;
        unVar.f42421t5 = messageObject;
        unVar.q9();
    }

    @Override
    public final void v(org.telegram.ui.Cells.q1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.v(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final void v1(org.telegram.messenger.jj jjVar) {
        this.f37301a.f42402s.put(jjVar, Boolean.TRUE);
    }

    @Override
    public final boolean w0(org.telegram.messenger.jj jjVar) {
        return !this.f37301a.f42402s.containsKey(jjVar);
    }

    @Override
    public final void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        bn bnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && gf.f.g(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        un unVar = this.f37301a;
        gf.e eVar = unVar.Vb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (q1Var.getMessageObject() == null) {
            bnVar = null;
        } else {
            bnVar = new bn(this, q1Var);
        }
        unVar.Vb = bnVar;
        if (!z11 && !gf.f.e(parse, false, null)) {
            org.telegram.ui.Components.s4.q0(unVar, str, true, true, true, !z11, unVar.Vb, webPage, unVar.f42477xa);
        } else {
            gf.f.q(unVar.getParentActivity(), parse, true, true, false, unVar.Vb, null, false, true, false);
        }
    }

    @Override
    public final String x(long j10) {
        TLRPC.Peer peer;
        String C0;
        un unVar = this.f37301a;
        if (org.telegram.messenger.h20.u(unVar.f42243f)) {
            return null;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && !org.telegram.messenger.w3.V(chat) && (C0 = unVar.getMessagesController().C0(unVar.e.f19793id, j10)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = unVar.f42382q4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return org.telegram.messenger.cd.L0(2131744045, null);
    }

    @Override
    public final void x0(org.telegram.ui.Cells.q1 q1Var) {
        ih.d dVar = this.f37301a.Yc;
        if (dVar != null && dVar.f8527n == q1Var) {
            dVar.f8531x.getClass();
        }
    }

    @Override
    public final void y0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.Components.s5 m10;
        un unVar = this.f37301a;
        if (!unVar.f42495z3 && !org.telegram.messenger.tz.A0 && unVar.f42492z0 != null && unVar.getParentActivity() != null && unVar.fragmentView != null) {
            org.telegram.ui.Components.q30 q30Var = unVar.H2;
            if (q30Var == null || q30Var.getTag() == null) {
                if (unVar.H2 == null) {
                    km kmVar = unVar.l1;
                    int indexOfChild = kmVar.indexOfChild(unVar.T);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.q30 q30Var2 = new org.telegram.ui.Components.q30(0, unVar.getParentActivity(), unVar.f42477xa, false);
                        unVar.H2 = q30Var2;
                        q30Var2.setShowingDuration(10000L);
                        kmVar.addView(unVar.H2, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        unVar.H2.setAlpha(0.0f);
                        unVar.H2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = unVar.f42492z0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = unVar.f42492z0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.jj.L4(messageObject.f16337k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && unVar.H2.e(q1Var, null, 0, 0, true)) {
                        org.telegram.messenger.tz.D(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        un unVar;
        int i10;
        if (q1Var.getMessageObject() != null && (i10 = (unVar = this.f37301a).Rb) != 0 && i10 == q1Var.getMessageObject().f1() && unVar.Sb == 1) {
            return unVar.Tb;
        }
        return null;
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.W5();
            messageObject.K1 = true;
            q1Var.E1();
            q1Var.requestLayout();
            this.f37301a.C0.R(messageObject, false, false);
        }
    }

    @Override
    public final void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        un unVar = this.f37301a;
        if (unVar.getParentActivity() != null && tLObject != null) {
            z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
            if (z4Var != null) {
                z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                if (((ActionBarLayout) z4Var2).x()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19793id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f19942id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232564, 2, unVar.getParentActivity(), unVar.getResourceProvider());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, unVar.getResourceProvider());
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(unVar.getParentActivity(), false, false);
                b1Var.j(org.telegram.messenger.cd.L0(2131747827, null), 2131232087, null);
                b1Var.setMinimumWidth(160);
                b1Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(unVar.getParentActivity(), false, false);
                b1Var2.j(org.telegram.messenger.cd.L0(2131746677, null), 2131232043, null);
                b1Var2.setMinimumWidth(160);
                b1Var2.setOnClickListener(new x(this, (TLRPC.Chat) tLObject, q1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var2);
                un unVar2 = new un(bundle);
                unVar2.f42216ca = true;
                unVar.presentFragmentAsPreviewWithMenu(unVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                unVar.l7();
                return;
            }
            unVar.presentFragment(new un(bundle));
        }
    }

    @Override
    public final void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            un unVar = this.f37301a;
            org.telegram.ui.Components.hu.K0(unVar, jjVar, unVar.Za, str2, str3, str4, str, i10, i11, -1, unVar.J9());
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }
}
