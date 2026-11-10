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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.UndoView;
public final class nm implements org.telegram.ui.Cells.l1 {
    public final cn f48227a;

    public nm(cn cnVar) {
        this.f48227a = cnVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        cn cnVar = this.f48227a;
        if (cnVar.getParentActivity() != null && tLObject != null) {
            r4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                if (((ActionBarLayout) r4Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z10 = tLObject instanceof TLRPC.Chat;
            if (z10) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26960id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f27109id);
            } else {
                return;
            }
            if (z9 && z10) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, 2, cnVar.getParentActivity(), cnVar.getResourceProvider());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, cnVar.getResourceProvider());
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(cnVar.getParentActivity(), false, false);
                z0Var.j(org.telegram.messenger.id.M0(2131747811, null), 2131232088, null);
                z0Var.setMinimumWidth(160);
                z0Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(cnVar.getParentActivity(), false, false);
                z0Var2.j(org.telegram.messenger.id.M0(2131746662, null), 2131232044, null);
                z0Var2.setMinimumWidth(160);
                z0Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, q1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                cn cnVar2 = new cn(bundle);
                cnVar2.f44484ea = true;
                cnVar.presentFragmentAsPreviewWithMenu(cnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                cnVar.s7();
                return;
            }
            cnVar.presentFragment(new cn(bundle));
        }
    }

    @Override
    public final void A1(org.telegram.messenger.ij ijVar) {
        this.f48227a.f44652s.put(ijVar, Boolean.TRUE);
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        int i7 = messageObject.D;
        cn cnVar = this.f48227a;
        if (i7 == 16) {
            TLRPC.MessageAction messageAction = messageObject.f23266k.action;
            int i10 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(cnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.Peer peer = arrayList.get(i10);
                    i10++;
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, cnVar.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = cnVar.getMessagesController().P6;
                u1Var.setOnCancelListener(new bi.g0(this, cnVar.getConnectionsManager().sendRequest(getgroupcall, new bi.r8(this, u1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                u1Var.r(600L);
                return;
            }
            TLRPC.User user = cnVar.f44487f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = cnVar.f44633q8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.y1.m(user, J4, i10, cnVar.getParentActivity(), cnVar.getMessagesController().b2(cnVar.f44487f.f27109id), cnVar.getAccountInstance());
                return;
            }
            return;
        }
        cnVar.Y7(q1Var, true, false, f10, f11, messageObject.I3(), false, false);
    }

    @Override
    public final void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        Uri parse;
        boolean z10;
        jm jmVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z9 && vf.c.i(str, false, false)) {
            z10 = true;
        } else {
            z10 = z9;
        }
        cn cnVar = this.f48227a;
        vf.b bVar = cnVar.f44459cc;
        if (bVar != null) {
            bVar.a(true);
        }
        if (q1Var.getMessageObject() == null) {
            jmVar = null;
        } else {
            jmVar = new jm(this, q1Var);
        }
        cnVar.f44459cc = jmVar;
        if (!z10 && !vf.c.g(parse, false, null)) {
            org.telegram.ui.Components.u4.o0(cnVar, str, true, true, true, !z10, cnVar.f44459cc, webPage, cnVar.f44750za);
        } else {
            vf.c.s(cnVar.getParentActivity(), parse, true, true, false, cnVar.f44459cc, null, false, true, false, false);
        }
    }

    @Override
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar = this.f48227a;
        if (!cnVar.getMessagesController().S4()) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, cnVar.getParentActivity(), null);
            u1Var.r(200L);
            cnVar.getMessagesController().R0(new y(this, u1Var, q1Var, 6));
            return;
        }
        if (q1Var.getMessageObject() != null) {
            q1Var.getMessageObject().f23294r2 = Boolean.FALSE;
        }
        q1Var.H3();
    }

    @Override
    public final CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar;
        int i7;
        if (q1Var.getMessageObject() != null && (i7 = (cnVar = this.f48227a).Yb) != 0 && i7 == q1Var.getMessageObject().e1() && cnVar.Zb == 1) {
            return cnVar.f44430ac;
        }
        return null;
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject;
        if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null && messageObject.f23266k != null) {
            int e12 = messageObject.e1();
            cn cnVar = this.f48227a;
            if (cnVar.Yb != e12 || cnVar.Zb != 7) {
                TLRPC.InputPeer j12 = cnVar.getMessagesController().j1(org.telegram.messenger.ij.B0(messageObject.f23266k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = j12;
                getrichmessage.f27182id = e12;
                vf.b bVar = cnVar.f44459cc;
                if (bVar != null) {
                    bVar.a(true);
                    cnVar.f44459cc = null;
                }
                ji jiVar = new ji(cnVar, e12, q1Var, 2);
                jiVar.f57332b = new oe(6, cnVar, r3);
                cnVar.f44459cc = jiVar;
                jiVar.d();
                int[] iArr = {cnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new bi.t3(cnVar, jiVar, iArr, q1Var, messageObject, 3))};
            }
        }
    }

    @Override
    public final void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            cn cnVar = this.f48227a;
            org.telegram.ui.Components.vt.N0(cnVar, ijVar, cnVar.f44444bb, str2, str3, str4, str, i7, i10, -1, cnVar.U9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
        e(q1Var, z9, true, z10);
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        ie ieVar;
        bi.d3 d3Var;
        boolean z9;
        org.telegram.ui.ActionBar.h6 h6Var;
        long j3;
        bi.x5 x5Var;
        int i7;
        boolean z10;
        int i10;
        tz0 tz0Var;
        int i11;
        float f10;
        int i12;
        long j10;
        ArrayList arrayList = null;
        if (!ijVar.S4() && !ijVar.g4()) {
            if (!org.telegram.messenger.ij.R4(ijVar.f23266k) && !ijVar.h4()) {
                if (ijVar.I3()) {
                    MediaController B = MediaController.B();
                    ArrayList L = this.f48227a.C0.L();
                    cn cnVar = this.f48227a;
                    long j11 = cnVar.f44440b7;
                    boolean z11 = true ^ cnVar.C0.N;
                    if (cnVar.f44693v4) {
                        j10 = cnVar.b();
                    } else {
                        j10 = 0;
                    }
                    return B.o0(L, ijVar, j11, z11, null, j10);
                }
            } else {
                boolean S = MediaController.B().S(ijVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = this.f48227a.h8(ijVar, false);
                }
                B2.r0(arrayList, false);
                return S;
            }
        } else {
            vz0 vz0Var = this.f48227a.f44686ua;
            if (vz0Var == null || vz0Var.f50832b0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f25570b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!ijVar.P3()) {
                            org.telegram.ui.Components.gc.a0(this.f48227a).w(2131232787, org.telegram.messenger.id.M0(2131743513, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f48227a.f44686ua = new vz0(this.f48227a.getParentActivity());
                vz0 vz0Var2 = this.f48227a.f44686ua;
                if (!ijVar.P3()) {
                    ieVar = this.f48227a.Kb(ijVar, true);
                } else {
                    ieVar = null;
                }
                if (!ijVar.P3()) {
                    d3Var = cn.a5(this.f48227a, ijVar);
                } else {
                    d3Var = null;
                }
                Context context = vz0Var2.f50829a;
                bi.x5 x5Var2 = vz0Var2.f50833c;
                vz0Var2.X = ieVar;
                vz0Var2.Y = d3Var;
                tz0 tz0Var2 = vz0Var2.N;
                if (tz0Var2 != null) {
                    x5Var2.removeView(tz0Var2);
                    vz0Var2.N = null;
                }
                vz0Var2.O = q1Var;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                vz0Var2.M = messageObject;
                if (messageObject != null && messageObject.h4()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                vz0Var2.S = z9;
                org.telegram.ui.Cells.q1 q1Var2 = vz0Var2.O;
                if (q1Var2 != null) {
                    h6Var = q1Var2.getResourcesProvider();
                } else {
                    h6Var = null;
                }
                vz0Var2.L = h6Var;
                if (vz0Var2.O != null) {
                    vz0Var2.T = 0.0f;
                    vz0Var2.U = q1Var.f29948n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        vz0Var2.T = view.getY() + vz0Var2.T;
                        vz0Var2.U = view.getY() + vz0Var2.U;
                    }
                    int width = vz0Var2.O.getWidth();
                    int height = vz0Var2.O.getHeight();
                    if (vz0Var2.S) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.f22567q.y));
                    }
                    vz0Var2.K = height - vz0Var2.O.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.f22566p);
                    j3 = 0;
                    int i13 = height;
                    x5Var = x5Var2;
                    tz0 tz0Var3 = new tz0(vz0Var2, vz0Var2.getContext(), org.telegram.messenger.p10.f24474s0, vz0Var2.O.getResourcesProvider(), width, i13);
                    vz0Var2.N = tz0Var3;
                    vz0Var2.O.u0(tz0Var3);
                    vz0Var2.N.s0(vz0Var2.O);
                    vz0Var2.N.setDelegate(new pb.b(19));
                    tz0 tz0Var4 = vz0Var2.N;
                    org.telegram.messenger.ij ijVar2 = vz0Var2.M;
                    org.telegram.messenger.dj currentMessagesGroup = vz0Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = vz0Var2.O;
                    tz0Var4.w3(ijVar2, currentMessagesGroup, q1Var3.F, q1Var3.E, false, false);
                    if (!vz0Var2.S) {
                        org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8();
                        vz0Var2.V = b8Var;
                        tz0 tz0Var5 = vz0Var2.N;
                        b8Var.f32149i = tz0Var5;
                        tz0Var5.f30062vc = b8Var;
                        if (tz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.pm0 seekBarWaveform = vz0Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = vz0Var2.f50841s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.f37028n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    vz0Var2.H = false;
                    x5Var.addView(vz0Var2.N, new FrameLayout.LayoutParams(vz0Var2.O.getWidth(), i13, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    x5Var = x5Var2;
                    i7 = 360;
                }
                TextureView textureView = vz0Var2.P;
                if (textureView != null) {
                    x5Var.removeView(textureView);
                    vz0Var2.P = null;
                }
                if (vz0Var2.S) {
                    vz0Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    vz0Var2.P = textureView2;
                    x5Var.addView(textureView2, 0, c8.ha.c(i7, i7));
                }
                org.telegram.ui.Components.t51 t51Var = MediaController.B().f21276i0;
                if (t51Var != null) {
                    t51Var.g0();
                }
                org.telegram.ui.Components.t51 t51Var2 = vz0Var2.f50843x;
                if (t51Var2 != null) {
                    t51Var2.g0();
                    vz0Var2.f50843x.m0();
                    vz0Var2.f50843x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = vz0Var2.O;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(vz0Var2.O.getMessageObject().I1);
                    File I = org.telegram.messenger.w7.I(vz0Var2.O.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(vz0Var2.O.getMessageObject().I1);
                        I = org.telegram.messenger.w7.M(vz0Var2.O.getMessageObject().f23266k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && vz0Var2.O.getMessageObject().f23266k.attachPath != null) {
                        I = new File(vz0Var2.O.getMessageObject().f23266k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.t51 t51Var3 = new org.telegram.ui.Components.t51();
                        vz0Var2.f50843x = t51Var3;
                        t51Var3.J = new uz0(vz0Var2);
                        if (vz0Var2.V != null) {
                            t51Var3.K = new uz0(vz0Var2);
                        }
                        if (vz0Var2.S) {
                            t51Var3.A0(vz0Var2.P);
                        }
                        vz0Var2.f50843x.j0(Uri.fromFile(I), "other");
                        vz0Var2.f50843x.h0();
                        org.telegram.ui.Components.is isVar = vz0Var2.E;
                        if (isVar != null) {
                            isVar.f34732s = vz0Var2.f50843x;
                            isVar.a();
                        }
                    }
                    cn cnVar2 = this.f48227a;
                    cnVar2.showDialog(cnVar2.f44686ua);
                    return false;
                }
                fi.m3 m3Var = vz0Var2.f50844y;
                if (m3Var != null) {
                    x5Var.removeView(m3Var);
                    vz0Var2.f50844y = null;
                }
                org.telegram.messenger.ij ijVar3 = vz0Var2.M;
                if (ijVar3 != null && ijVar3.P3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.messenger.ij ijVar4 = vz0Var2.M;
                if (ijVar4 != null && org.telegram.messenger.ij.B0(ijVar4.f23266k) != org.telegram.messenger.p10.i(vz0Var2.M.I1).e()) {
                    fi.m3 m3Var2 = new fi.m3(context, 3);
                    vz0Var2.f50844y = m3Var2;
                    m3Var2.r(true);
                    if (z10) {
                        long B0 = org.telegram.messenger.ij.B0(vz0Var2.M.f23266k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User a22 = org.telegram.messenger.qp.s1(vz0Var2.M.I1).a2(Long.valueOf(B0));
                            if (a22 != null) {
                                str = org.telegram.messenger.t10.j(a22, true);
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(vz0Var2.M.I1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        fi.m3 m3Var3 = vz0Var2.f50844y;
                        if (vz0Var2.S) {
                            i12 = 2131743590;
                        } else {
                            i12 = 2131743514;
                        }
                        m3Var3.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i12, str)));
                    } else {
                        fi.m3 m3Var4 = vz0Var2.f50844y;
                        if (vz0Var2.S) {
                            i11 = 2131743591;
                        } else {
                            i11 = 2131743515;
                        }
                        m3Var4.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i11, null)));
                    }
                    vz0Var2.f50844y.s(12.0f);
                    fi.m3 m3Var5 = vz0Var2.f50844y;
                    if (!z10 && !vz0Var2.O.F) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    m3Var5.setPadding(org.telegram.messenger.g0.L(f10), 0, 0, 0);
                    if (vz0Var2.S) {
                        vz0Var2.f50844y.p(0.5f, 0.0f);
                        vz0Var2.f50844y.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        vz0Var2.f50844y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        vz0Var2.f50844y.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    vz0Var2.f50844y.v(14.0f);
                    fi.m3 m3Var6 = vz0Var2.f50844y;
                    m3Var6.h = fi.m3.a(m3Var6.getText(), vz0Var2.f50844y.getTextPaint());
                    if (vz0Var2.S) {
                        x5Var.addView(vz0Var2.f50844y, c8.ha.d((int) ((vz0Var2.O.getWidth() / org.telegram.messenger.g0.f22566p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((vz0Var2.O.getHeight() + vz0Var2.K) / org.telegram.messenger.g0.f22566p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        x5Var.addView(vz0Var2.f50844y, c8.ha.d((int) ((vz0Var2.O.getWidth() / org.telegram.messenger.g0.f22566p) * 0.6f), 150.0f, 17, ((((vz0Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + vz0Var2.O.getBoundsLeft()) / org.telegram.messenger.g0.f22566p) + 1.0f, ((-75.0f) - ((vz0Var2.O.getHeight() / org.telegram.messenger.g0.f22566p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    vz0Var2.f50844y.w();
                }
                TextView textView = vz0Var2.D;
                if (textView != null) {
                    x5Var.removeView(textView);
                    vz0Var2.D = null;
                }
                TextView textView2 = new TextView(context);
                vz0Var2.D = textView2;
                textView2.setTextColor(-1);
                vz0Var2.D.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    vz0Var2.D.setBackground(org.telegram.ui.ActionBar.m6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    vz0Var2.D.setBackground(org.telegram.ui.ActionBar.m6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                vz0Var2.D.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.ka.a(vz0Var2.D);
                TextView textView3 = vz0Var2.D;
                if (z10) {
                    i10 = 2131743519;
                } else {
                    i10 = 2131743516;
                }
                textView3.setText(org.telegram.messenger.id.M0(i10, null));
                vz0Var2.D.setOnClickListener(new rz0(vz0Var2, 1));
                x5Var.addView(vz0Var2.D, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (tz0Var = vz0Var2.N) != null && tz0Var.getMessageObject() != null && vz0Var2.N.getMessageObject().f23266k != null) {
                    vz0Var2.N.getMessageObject().f23266k.media_unread = false;
                    vz0Var2.N.invalidate();
                }
                cn cnVar22 = this.f48227a;
                cnVar22.showDialog(cnVar22.f44686ua);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void F1() {
        org.telegram.ui.ActionBar.h6 h6Var;
        cn cnVar = this.f48227a;
        if (cnVar.l1 != null && cnVar.getParentActivity() != null) {
            Context context = cnVar.l1.getContext();
            h6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
            wy0.d1(context, cnVar, false, h6Var, null);
        }
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
        TLRPC.Message message;
        int i7;
        int i10;
        int i11;
        int L;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f23266k) != null) {
            int i12 = o2Var.f24284a;
            TL_stars.StarsAmount starsAmount = null;
            cn cnVar = this.f48227a;
            if (i12 == 1) {
                long o4 = org.telegram.messenger.m5.o(message.from_id);
                org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(20, this, message);
                Pattern pattern = org.telegram.ui.Components.u4.f38507a;
                Activity parentActivity = cnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, null);
                String M0 = org.telegram.messenger.id.M0(2131744387, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744386, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).B1(o4, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.t6.U(editText, org.telegram.ui.ActionBar.m6.G6, null);
                editText.setHint(org.telegram.messenger.id.M0(2131744385, null));
                org.telegram.ui.ActionBar.t6.D(editText, org.telegram.ui.ActionBar.m6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.m6.U(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.l4(parentActivity)});
                if (org.telegram.messenger.id.f23161a0) {
                    i11 = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i11 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.id.f23161a0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                editText.setPadding(i11, L2, L, org.telegram.messenger.g0.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751604, null), new ni.c(26, kVar, editText));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                u1Var.N = new org.telegram.ui.Components.h1(editText, 0);
                frameLayout.addView(editText, c8.ha.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.wf(editText, 3), 100L);
                cnVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                }
            } else if (i12 == 2) {
                if (message.suggested_post != null) {
                    i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    boolean A = org.telegram.messenger.t3.A(i7, cnVar.f44473e, 24);
                    if (A) {
                        i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        org.telegram.messenger.t3.A(i10, cnVar.f44473e, 5);
                    }
                    aa.d0 d0Var = new aa.d0(this, message, A, messageObject, 28);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    cnVar.v7(d0Var, cg.a.l(starsAmount), !A);
                }
            } else if (i12 == 3) {
                cnVar.Y7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
            } else if (i12 == 4) {
                cnVar.f44490f2.n(messageObject.Y1(), true);
            }
        }
    }

    @Override
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.Message message = messageObject.f23266k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.g6(true);
        cn cnVar = this.f48227a;
        cnVar.getMessagesStorage().X1(org.telegram.messenger.ij.B0(messageObject.f23266k), messageObject.f23266k);
        cnVar.getMessagesController().f24900s7.h(messageObject, true, false);
        e(q1Var, true, false, true);
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar = this.f48227a;
        cnVar.Sa.k(q1Var, cnVar, true);
        cnVar.f44741z0.I0(false);
    }

    @Override
    public final void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ji jiVar;
        int i7;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        bg.m0 m0Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            cn cnVar = this.f48227a;
            vf.b bVar = cnVar.f44459cc;
            if (bVar != null) {
                bVar.a(true);
                cnVar.f44459cc = null;
            }
            if (q1Var.getMessageObject() == null) {
                cnVar.f44459cc = null;
                jiVar = null;
            } else {
                jiVar = new ji(cnVar, q1Var.getMessageObject().e1(), q1Var, 1);
                cnVar.f44459cc = jiVar;
            }
            i7 = ((org.telegram.ui.ActionBar.f2) this.f48227a).currentAccount;
            bi.ea y10 = bi.ea.y(i7, false);
            Objects.requireNonNull(jiVar);
            dh dhVar = new dh(jiVar, 8);
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = org.telegram.messenger.t0.f25570b;
            }
            org.telegram.ui.ActionBar.h6 I = bi.ea.I();
            if (messageObject != null && context != null) {
                long B0 = org.telegram.messenger.ij.B0(messageObject.f23266k);
                int e12 = messageObject.e1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = org.telegram.messenger.qp.s1(y10.f3804a).j1(B0);
                tL_inputInvoiceMessage.msg_id = e12;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u10 = hi.a3.u(I, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                m0Var = new bg.m0(y10, ConnectionsManager.getInstance(y10.f3804a).sendRequest(tL_payments_getPaymentForm, new bi.g2(y10, messageObject, tL_inputInvoiceMessage, dhVar, 2)), 1);
            }
            if (m0Var != null) {
                jiVar.f57332b = m0Var;
                jiVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.f23266k;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i10 = -1;
            for (int i11 = 0; i11 < tL_messageMediaPaidMedia.extended_media.size(); i11++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i11);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i10 = arrayList.size();
                    }
                    TLRPC.TL_message R7 = cn.R7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        R7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        R7.attachPath = message.attachPath;
                    }
                    R7.media = tL_messageExtendedMedia.media;
                    R7.noforwards = true;
                    arrayList.add(new org.telegram.messenger.ij(messageObject.I1, R7, false, true));
                }
            }
            if (i10 > -1 && !arrayList.isEmpty()) {
                PhotoViewer p12 = PhotoViewer.p1();
                cn cnVar2 = this.f48227a;
                p12.H2(null, cnVar2, cnVar2.f44750za);
                PhotoViewer.p1().Z1(arrayList, i10, this.f48227a.a(), 0L, 0L, this.f48227a.f44458cb);
            }
        }
    }

    @Override
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.fp fpVar;
        Integer num;
        org.telegram.messenger.hc b10;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        cn cnVar = this.f48227a;
        if (isEmpty) {
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            ug.f1 f1Var = new ug.f1(cnVar, i7, user, null, null, cnVar.f44750za);
            q1Var.getLocationOnScreen(new int[2]);
            f1Var.f56589q2 = q1Var.getNameStatusX();
            f1Var.f56590r2 = q1Var.getNameStatusY();
            f1Var.f56593u2 = q1Var.getScaleX();
            f1Var.f56591s2 = q1Var.getLeft();
            f1Var.f56592t2 = q1Var.getTop();
            f1Var.f56594v2 = q1Var;
            int e10 = org.telegram.messenger.t10.e(user);
            if (e10 >= 7) {
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(i10).f24878q4;
                if (gpVar != null) {
                    fpVar = gpVar.d(e10);
                } else {
                    fpVar = null;
                }
                if (fpVar != null) {
                    num = Integer.valueOf(fpVar.f());
                } else {
                    num = null;
                }
                f1Var.f56588p2 = num;
            } else {
                f1Var.f56588p2 = Integer.valueOf(cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.f28151r8[e10]));
            }
            org.telegram.ui.Components.f5 f5Var = q1Var.f29983pa;
            if (f5Var != null && (f5Var.f33464f[0] instanceof org.telegram.ui.Components.h5)) {
                f1Var.f56593u2 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(cnVar.getParentActivity());
                    org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f28055m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.hc.b(document);
                        if (d != null) {
                            d.f25386e = 512;
                            d.f25387f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.ij.K2(document, false)) {
                            d.f25386e = 512;
                            d.f25387f = 512;
                        }
                        b10 = org.telegram.messenger.hc.b(document);
                        str2 = "160_160";
                    }
                    org.telegram.messenger.hc hcVar = b10;
                    String str3 = str2;
                    k9Var.setLayerNum(7);
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    k9Var.m(hcVar, str3, org.telegram.messenger.hc.c(w10, document), "140_140", d, document);
                    if (org.telegram.messenger.ij.C4(document)) {
                        Integer num2 = f1Var.f56588p2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.f28225v6);
                        }
                        k9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        f1Var.f56596x2 = org.telegram.messenger.ij.i1(document);
                    } else {
                        f1Var.f56596x2 = org.telegram.messenger.ij.i1(document);
                    }
                    f1Var.f56595w2 = k9Var;
                    f1Var.f56598z2 = true;
                }
            }
            cnVar.showDialog(f1Var);
            return;
        }
        vf.c.t(cnVar.getParentActivity(), "https://" + cnVar.getMessagesController().U2 + "/nft/" + str);
    }

    @Override
    public final void J(org.telegram.messenger.fj fjVar) {
        StaticLayout staticLayout = fjVar.f22428e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = fjVar.f22428e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new ni.j(fjVar.K, charSequence, false), 0, spannableString.length(), 33);
            org.telegram.messenger.g0.g(spannableString);
            org.telegram.messenger.camera.q.r(null, 2131752022, org.telegram.ui.Components.gc.a0(this.f48227a));
        }
    }

    @Override
    public final boolean J0(long j3) {
        TLRPC.ChatFull N0;
        cn cnVar = this.f48227a;
        TLRPC.Chat chat = cnVar.f44473e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
        long j10 = cnVar.f44473e.f26960id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (messagesController.getUserConfig().e() == j3 && M0 != null && M0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.f24940x1.f(j10);
        if (hVar == null && (N0 = messagesController.N0(j10)) != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j3)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.q1 r51, org.telegram.tgnet.TLRPC.PollAnswer r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.J1(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7;
        if (q1Var != null && document != null) {
            cn cnVar = this.f48227a;
            if (cnVar.getParentLayout() != null && a0(q1Var)) {
                boolean J3 = org.telegram.messenger.ij.J3(document);
                q1Var.setScrimBlockBounds(rectF);
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(cnVar, q1Var);
                if (J3) {
                    i7 = 2131745911;
                } else {
                    i7 = 2131745931;
                }
                H.c(2131232114, org.telegram.messenger.id.M0(i7, null), new o1(this, q1Var, document, 26), false);
                H.f35214p = new zl(q1Var, rectF, 0);
                H.Z();
            }
        }
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij ijVar;
        long j3;
        int i7;
        ArrayList arrayList;
        bi.d3 d3Var;
        org.telegram.messenger.dj djVar;
        int i10;
        cn cnVar = this.f48227a;
        wh.i iVar = cnVar.f44661sa;
        if (iVar != null) {
            HashMap hashMap = iVar.f57926a;
            wh.h hVar = (wh.h) hashMap.get(wh.i.b(q1Var));
            org.telegram.ui.Components.bc bcVar = null;
            if (hVar != null) {
                ijVar = hVar.E;
            } else {
                ijVar = null;
            }
            wh.h hVar2 = (wh.h) cnVar.f44661sa.f57926a.get(wh.i.b(q1Var));
            if (hVar2 != null && (i10 = hVar2.R) != -1) {
                j3 = hVar2.f57924x[i10].d;
            } else {
                j3 = 0;
            }
            if (ijVar != null && j3 != 0) {
                Activity parentActivity = cnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                boolean z9 = false;
                if (!org.telegram.ui.Components.u4.h(parentActivity, i7, j3, false)) {
                    if (ijVar.c1() != 0 && (djVar = (org.telegram.messenger.dj) cnVar.N6.f(ijVar.c1())) != null) {
                        arrayList = djVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.k5.k(ijVar);
                    }
                    if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).f24493n) {
                        z9 = true;
                    }
                    long j10 = j3;
                    bi.d3 d3Var2 = new bi.d3(this, arrayList, j10, 17);
                    if (z9) {
                        d3Var2.run();
                        d3Var = null;
                    } else {
                        d3Var = d3Var2;
                    }
                    bcVar = org.telegram.ui.Components.gc.v(cnVar.getParentActivity(), cnVar, null, 1, j10, 1, cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.tj), cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.vj), 5000, false, d3Var);
                    bcVar.f32204k = true;
                    bcVar.k(bcVar.f32199e instanceof org.telegram.ui.Components.mb);
                }
            }
            wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(q1Var));
            if (hVar3 != null) {
                if (bcVar == null) {
                    hVar3.R = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.fb fbVar = bcVar.f32199e;
                if (!(fbVar instanceof org.telegram.ui.Components.jb)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) fbVar;
                hVar3.W = jbVar;
                jbVar.f34882a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new nw(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void K1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o10 o10Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            o10Var.run();
            return;
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.o4() || messageObject.Y2()) && (message = messageObject.f23266k) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f48227a;
            f2Var.getSendMessagesHelper().v(messageObject, messageObject.f23266k.rich_message, null, f2Var, true);
            return;
        }
        o10Var.run();
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        cn cnVar = this.f48227a;
        cnVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, cnVar);
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject.f23266k.send_state != 0) {
            this.f48227a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        this.f48227a.k8(characterStyle, z9, q1Var.getMessageObject(), q1Var);
    }

    @Override
    public final ir0 N1() {
        return this.f48227a.Ra;
    }

    @Override
    public final boolean O0(org.telegram.ui.Cells.q1 r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.O0(org.telegram.ui.Cells.q1, boolean):boolean");
    }

    @Override
    public final void P(org.telegram.messenger.ij ijVar) {
        if (org.telegram.messenger.ij.L4(ijVar.f23266k)) {
            this.f48227a.Kb(ijVar, true);
        }
    }

    @Override
    public final void P0(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar = this.f48227a;
        cnVar.getNotificationCenter().k(org.telegram.messenger.qs.f25047n3, Long.valueOf(cnVar.f44545j6), q1Var);
    }

    @Override
    public final void P1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ni.j(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.camera.q.r(null, 2131752022, org.telegram.ui.Components.gc.a0(this.f48227a));
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z9) {
        TLRPC.Peer peer;
        int i7;
        TLRPC.Peer peer2;
        int i10;
        boolean l32 = org.telegram.messenger.ij.l3(q1Var.getMessageObject().f23266k);
        cn cnVar = this.f48227a;
        if (l32) {
            TLRPC.Message message = q1Var.getMessageObject().f23266k;
            if (message != null) {
                peer2 = message.from_id;
            } else {
                peer2 = null;
            }
            long o4 = org.telegram.messenger.m5.o(peer2);
            org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(cnVar);
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            a02.Q(2131624112, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744087, org.telegram.messenger.m5.l(i10, o4)))).k(true);
            return false;
        } else if (!q1Var.getMessageObject().q()) {
            TLRPC.Message message2 = q1Var.getMessageObject().f23266k;
            if (message2 != null) {
                peer = message2.from_id;
            } else {
                peer = null;
            }
            long o10 = org.telegram.messenger.m5.o(peer);
            org.telegram.ui.Components.gc a03 = org.telegram.ui.Components.gc.a0(cnVar);
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            a03.Q(2131624112, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744088, org.telegram.messenger.m5.l(i7, o10)))).k(true);
            return false;
        } else if (!cnVar.getUserConfig().q()) {
            org.telegram.ui.Components.gc.a0(cnVar).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131744064, null), new vl(this, 9))).k(true);
            return false;
        } else {
            final long M = org.telegram.messenger.t3.M(cnVar.f44473e, cnVar.f44620p8, true);
            final org.telegram.messenger.gz sendMessagesHelper = cnVar.getSendMessagesHelper();
            final org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.ij.B0(messageObject.f23266k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.f27107id));
            sendMessagesHelper.H.put(Integer.valueOf(hash), Boolean.valueOf(z9));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().j1(org.telegram.messenger.ij.B0(messageObject.f23266k));
            if (z9) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.f27107id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.f27107id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    gz gzVar = gz.this;
                    final boolean z10 = z9;
                    if (tL_error == null) {
                        final yr messagesStorage = gzVar.getMessagesStorage();
                        ij ijVar = messageObject;
                        final long B0 = ij.B0(ijVar.f23266k);
                        final int e12 = ijVar.e1();
                        final int i11 = todoItem.f27107id;
                        final long e10 = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        p5 p5Var = messagesStorage.f26723a;
                        final long j3 = M;
                        p5Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fr.run():void");
                            }
                        });
                        gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    }
                    g0.h3(new bi.c9(gzVar, hash, z10, 3));
                }
            });
            return true;
        }
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.f23266k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String N0 = org.telegram.messenger.id.N0("PsaMessageInfo_" + messageObject.f23266k.fwd_from.psa_type);
            if (TextUtils.isEmpty(N0)) {
                N0 = org.telegram.messenger.id.M0(2131746594, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            org.telegram.messenger.ij.d(spannableStringBuilder, false);
            org.telegram.messenger.dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            cn cnVar = this.f48227a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.f22041e;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    } else if ((((org.telegram.messenger.aj) arrayList.get(i7)).f21455l & 1) != 0) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) currentMessagesGroup.d.get(i7);
                        if (ijVar != messageObject) {
                            int childCount = cnVar.f44741z0.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                View childAt = cnVar.f44741z0.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    if (ijVar.T(q1Var2.getMessageObject())) {
                                        q1Var = q1Var2;
                                    }
                                }
                            }
                            messageObject = ijVar;
                        }
                    } else {
                        i7++;
                    }
                }
            }
            cnVar.pc(messageObject, spannableStringBuilder, 1);
            q1Var.G3(1, false, true);
        }
    }

    @Override
    public final boolean Q1(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.Q1(long):boolean");
    }

    @Override
    public final boolean R() {
        cn cnVar = this.f48227a;
        if (cnVar.f44582m6[1].size() + cnVar.f44582m6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void R1(org.telegram.ui.Cells.q1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.R1(org.telegram.ui.Cells.q1, int, float, float, boolean):void");
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        org.telegram.messenger.ij messageObject;
        TLRPC.Message message;
        if (q1Var != null) {
            cn cnVar = this.f48227a;
            if (cnVar.getParentActivity() != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                if (org.telegram.messenger.qp.s1(i7).s4() && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f23266k) != null && message.rich_message != null) {
                    if (!messageObject.J2 || message.translatedRichMessage == null) {
                        return messageObject.u(cnVar.f44473e);
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
    public final boolean S1(org.telegram.ui.Cells.q1 r44, org.telegram.tgnet.TLRPC.TodoItem r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.S1(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final boolean T() {
        cn cnVar = this.f48227a;
        if (!org.telegram.messenger.t10.z(cnVar.f44487f) && !org.telegram.messenger.t10.B(cnVar.f44487f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.messenger.ij messageObject;
        if (chat == null) {
            return;
        }
        cn cnVar = this.f48227a;
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (!lVar.x() && !cnVar.X9()) {
            if (!z9 && chat.signature_profiles && (messageObject = q1Var.getMessageObject()) != null && org.telegram.messenger.ij.B0(messageObject.f23266k) != 1271266957) {
                cnVar.Pa(org.telegram.messenger.m5.o(messageObject.f23266k.from_id));
                return;
            } else {
                i(q1Var, chat, i7, z9);
                return;
            }
        }
        cn.k2(cnVar, q1Var, true, f10, f11);
    }

    @Override
    public final void U1(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        cn cnVar = this.f48227a;
        if (org.telegram.messenger.g0.E1(cnVar.getParentActivity()) && (chat = cnVar.f44473e) != null && currentUser != null && !org.telegram.messenger.t3.V(chat)) {
            org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
            long j3 = cnVar.f44473e.f26960id;
            long j10 = currentUser.f27109id;
            a0.h hVar = (a0.h) messagesController.f24940x1.f(j3);
            if (hVar == null && (N0 = messagesController.N0(j3)) != null && N0.participants != null) {
                for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                    chatParticipant = N0.participants.participants.get(i7);
                    if (chatParticipant.user_id == j10) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) hVar.f(j10);
            c(q1Var, chatParticipant);
        }
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
        e(q1Var, true, true, false);
    }

    @Override
    public final boolean W0(org.telegram.messenger.ij ijVar) {
        ll llVar;
        int i7 = (org.telegram.messenger.ij.B0(ijVar.f23266k) > 1271266957L ? 1 : (org.telegram.messenger.ij.B0(ijVar.f23266k) == 1271266957L ? 0 : -1));
        cn cnVar = this.f48227a;
        if ((i7 == 0 || ((llVar = cnVar.C0) != null && llVar.N)) && cnVar.f44492f4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.f2 f2Var = this.f48227a;
        if (f2Var.getMessagesController().E(j10, f2Var, q1Var.getMessageObject(), null)) {
            f2Var.presentFragment(new cn(j10));
        }
    }

    @Override
    public final int X() {
        return this.f48227a.f44492f4;
    }

    @Override
    public final jh.a Z() {
        return this.f48227a.f44663sc;
    }

    @Override
    public final void Z0() {
        cn cnVar = this.f48227a;
        cnVar.g8();
        UndoView undoView = cnVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, cnVar.f44545j6, null);
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        cn cnVar = this.f48227a;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            CharSequence fieldText = sjVar.getFieldText();
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
            String K = org.telegram.messenger.t3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                cnVar.Z.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.i3(new vl(this, 6), 200L);
            }
        }
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject;
        if (q1Var == null) {
            messageObject = null;
        } else {
            messageObject = q1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.f23266k != null) {
            cn cnVar = this.f48227a;
            if (cnVar.f44492f4 != 1 && !cnVar.V9() && !messageObject.f23266k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        cn cnVar = this.f48227a;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            CharSequence fieldText = sjVar.getFieldText();
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
            String n10 = org.telegram.messenger.t10.n(user);
            if (n10 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) n10).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(rf.b.r(org.telegram.messenger.t10.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.e41("" + user.f27109id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            cnVar.Z.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.i3(new vl(this, 7), 200L);
        }
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        char c10;
        int i7;
        w4 b10;
        int i10;
        wj wjVar;
        vj vjVar;
        if (!f()) {
            return false;
        }
        cn cnVar = this.f48227a;
        if (cnVar.f44473e != null && (((wjVar = cnVar.f44448c1) == null || wjVar.getVisibility() != 0) && ((vjVar = cnVar.S) == null || vjVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = cnVar.f44473e;
        if (chat != null && ((cnVar.f44643r4 == 0 || cnVar.f44693v4) && (!org.telegram.messenger.t3.T(chat) || cnVar.f44473e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        if (r22 != 0) {
            c5VarArr[2] = c5.f44237n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.f44238r;
        }
        TLRPC.UserFull b22 = cnVar.getMessagesController().b2(user.f27109id);
        if (b22 == null) {
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        } else {
            b10 = w4.c(user, b22, c5VarArr);
            if (!ab.q.i(b10)) {
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        }
        if (ab.q.i(b10)) {
            ab.q.o().C((ViewGroup) cnVar.fragmentView, cnVar.f44750za, b10, new a7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(cnVar, q1Var);
        H.c(2131232266, org.telegram.messenger.id.M0(2131747786, null), new Runnable(this) {
            public final nm f51390b;

            {
                this.f51390b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f51390b.q(user, false);
                        return;
                    case 1:
                        this.f51390b.b(user);
                        return;
                    default:
                        this.f51390b.f48227a.Oa(user);
                        return;
                }
            }
        }, false);
        H.c(2131232113, org.telegram.messenger.id.M0(2131745601, null), new o1(this, q1Var, user, 24), false);
        H.l(2131232222, org.telegram.messenger.id.M0(2131748609, null), new Runnable(this) {
            public final nm f51390b;

            {
                this.f51390b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f51390b.q(user, false);
                        return;
                    case 1:
                        this.f51390b.b(user);
                        return;
                    default:
                        this.f51390b.f48227a.Oa(user);
                        return;
                }
            }
        }, r22);
        H.l(2131232354, org.telegram.messenger.id.M0(2131753758, null), new Runnable(this) {
            public final nm f51390b;

            {
                this.f51390b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f51390b.q(user, false);
                        return;
                    case 1:
                        this.f51390b.b(user);
                        return;
                    default:
                        this.f51390b.f48227a.Oa(user);
                        return;
                }
            }
        }, r42);
        H.f35220t = false;
        H.f35201i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        cn cnVar = this.f48227a;
        if (!cnVar.W9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (cnVar.getParentActivity() != null) {
                if (cnVar.f44448c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    sj sjVar = cnVar.Z;
                    org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                    org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
                    ii iiVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    vf.b bVar = cnVar.f44459cc;
                    if (bVar != null) {
                        bVar.a(true);
                        cnVar.f44459cc = null;
                    }
                    if (str != null && q1Var.getMessageObject() != null) {
                        ii iiVar2 = new ii(cnVar, q1Var.getMessageObject().e1(), str, q1Var, 1);
                        cnVar.f44459cc = iiVar2;
                        iiVar = iiVar2;
                    } else {
                        cnVar.f44459cc = null;
                    }
                    sjVar.Z(keyboardButtonProto, messageObject, messageObject2, iiVar);
                }
            }
        }
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.ij messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            cn cnVar = this.f48227a;
            if (cnVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f23266k) != null && messageObject.f23313w2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.f23313w2.f23772g;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    org.telegram.messenger.fu fuVar = (org.telegram.messenger.fu) arrayList2.get(i7);
                    if (fuVar instanceof org.telegram.messenger.su) {
                        arrayList.add(((org.telegram.messenger.su) fuVar).f25526q0);
                    } else if (fuVar instanceof org.telegram.messenger.ev) {
                        arrayList.add(((org.telegram.messenger.ev) fuVar).f22282q0);
                    } else if (fuVar instanceof org.telegram.messenger.ku) {
                        ArrayList arrayList3 = ((org.telegram.messenger.ku) fuVar).X;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.yt) obj).f26740b);
                        }
                    } else if (fuVar instanceof org.telegram.messenger.wu) {
                        ArrayList arrayList4 = ((org.telegram.messenger.wu) fuVar).X;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.yt) obj2).f26740b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.H2(null, cnVar, null);
                    return p12.c2(null, null, null, null, null, null, null, indexOf, new tl(cnVar, arrayList), null, 0L, 0L, 0L, true, new sl(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    public final void c(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z9;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        cn cnVar = this.f48227a;
        cnVar.getUserConfig().f();
        if (org.telegram.messenger.g0.E1(cnVar.getParentActivity()) && (chat = cnVar.f44473e) != null && currentUser != null && !org.telegram.messenger.t3.V(chat)) {
            boolean z12 = true;
            boolean z13 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z9 = false;
                    z13 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == cnVar.getUserConfig().e()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                    z12 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z13 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == cnVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z12 = false;
                }
                str2 = channelParticipant2.rank;
                z11 = z10;
                boolean z14 = z12;
                boolean z15 = z13;
                Activity parentActivity = cnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                h6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                org.telegram.ui.Components.ey0.b(parentActivity, i7, -cnVar.f44473e.f26960id, currentUser, str2, z14, z15, z11, h6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z9 = false;
                    z13 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == cnVar.getUserConfig().e()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                    z12 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (org.telegram.messenger.t3.T(cnVar.f44473e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                cnVar.getMessagesController();
                tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(cnVar.f44473e);
                tL_channels_getParticipant.participant = cnVar.getMessagesController().j1(currentUser.f27109id);
                cnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.p5(11, this, q1Var));
                return;
            } else {
                return;
            }
            z11 = z9;
            str2 = str;
            boolean z142 = z12;
            boolean z152 = z13;
            Activity parentActivity2 = cnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            h6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
            org.telegram.ui.Components.ey0.b(parentActivity2, i7, -cnVar.f44473e.f26960id, currentUser, str2, z142, z152, z11, h6Var);
        }
    }

    @Override
    public final void c2(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f48227a.Yc(primaryMessageObject, false);
    }

    @Override
    public final boolean d() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z9;
        cn cnVar = this.f48227a;
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!lVar2.x() && !cnVar.X9()) {
                z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
                if (!z9) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d0(int i7) {
        CharSequence U2;
        int i10;
        SpannableStringBuilder X2;
        int i11;
        cn cnVar = this.f48227a;
        try {
            if (i7 == 0) {
                cnVar.w7();
                ok okVar = cnVar.N3;
                if (okVar != null) {
                    okVar.l(0L, 84, null, new vl(this, 1));
                    cnVar.N3.performHapticFeedback(3, 2);
                }
            } else if (i7 == 1) {
                String x10 = org.telegram.messenger.id.x(cnVar.getMessagesController().f24914u4, true);
                if (cnVar.getMessagesController().f24914u4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(org.telegram.ui.Components.s11.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(org.telegram.ui.Components.s11.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.gc.a0(cnVar).G(2131624299, 6, X2).k(true);
                cnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.id.x(cnVar.getMessagesController().f24914u4, true);
                org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(cnVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(cnVar.getMessagesController().f24898s4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i7 == 2) {
                    U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131743968, null), new vl(this, 2));
                } else if (cnVar.getMessagesController().f24914u4 <= 0) {
                    U2 = "";
                } else {
                    U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131743967, x11), new vl(this, 3));
                }
                SpannableStringBuilder append2 = append.append(U2);
                a02.getClass();
                org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(a02.W(), a02.f33873c);
                jbVar.c(2131624299, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i12 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i12 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i12++;
                    }
                }
                jbVar.f34883b.setText(append2);
                jbVar.f34883b.setSingleLine(false);
                jbVar.f34883b.setMaxLines(6);
                a02.b(jbVar, 7000).k(true);
                org.telegram.messenger.p2.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10, boolean z11) {
        org.telegram.messenger.ij primaryMessageObject;
        int i7;
        int i10;
        fj fjVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.K1 = true;
        cn cnVar = this.f48227a;
        cj cjVar = cnVar.f44741z0;
        if (cjVar != null && (fjVar = cnVar.B0) != null && fjVar.f57030y < 0) {
            for (int childCount = cjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = cnVar.f44741z0.getChildAt(childCount);
                cnVar.f44741z0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = cnVar.g9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        i10 = cnVar.g9(childAt);
                        break;
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        if (z9 && i7 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z11) {
                fj fjVar2 = cnVar.B0;
                cnVar.f44741z0.getClass();
                fjVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) cnVar.N9), false);
            } else {
                cnVar.B0.h1(i7, i10);
            }
        }
        cnVar.f44434b1 = z10;
        cnVar.Yc(primaryMessageObject, false);
        cnVar.f44434b1 = false;
    }

    @Override
    public final boolean e0() {
        if (this.f48227a.f44492f4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void e2() {
        this.f48227a.N9();
    }

    public final boolean f() {
        cn cnVar = this.f48227a;
        if (!org.telegram.messenger.t10.B(cnVar.f44487f)) {
            TLRPC.Chat chat = cnVar.f44473e;
            if (chat != null) {
                if (org.telegram.messenger.t3.T(chat) && !cnVar.f44473e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        this.f48227a.m8(q1Var, reactionCount, z9, f10, f11);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        this.f48227a.Y7(q1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String M0;
        int i12;
        TLRPC.User user2;
        int i13;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z9;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        boolean z10 = false;
        gm gmVar = null;
        gm gmVar2 = null;
        File file = null;
        gm gmVar3 = null;
        gm gmVar4 = null;
        cn cnVar = this.f48227a;
        if (i7 == 19) {
            vf.b bVar = cnVar.f44459cc;
            if (bVar != null) {
                bVar.a(true);
            }
            if (q1Var.getMessageObject() != null) {
                gmVar2 = new gm(this, q1Var, 2);
            }
            final gm gmVar5 = gmVar2;
            cnVar.f44459cc = gmVar5;
            final Activity parentActivity = cnVar.getParentActivity();
            final org.telegram.ui.ActionBar.h6 resourceProvider = cnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            gmVar5.d();
            gmVar5.f57332b = new wg.c(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.f23266k.media;
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
            final String b10 = wg.h.b(messageObject);
            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(-messageObject.Z0()));
            if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                z9 = true;
            } else {
                z9 = false;
            }
            final long j3 = messageObject.f23266k.date * 1000;
            wg.r.d(messageObject, new org.telegram.messenger.c20(atomicBoolean, gmVar5, z9, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f57706a;
                public final vf.b f57707b;
                public final boolean f57708c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f57709e;
                public final Context f57710f;
                public final h6 f57711g;

                {
                    this.f57709e = tL_messageMediaGiveaway2;
                    this.f57710f = parentActivity;
                    this.f57711g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f57706a.get()) {
                        this.f57707b.b();
                        boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z12 = this.f57708c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f57709e;
                        Context context = this.f57710f;
                        h6 h6Var = this.f57711g;
                        if (z11) {
                            h.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, h6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            h.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, h6Var);
                        }
                    }
                }
            }, new wg.e(atomicBoolean, gmVar5, 0));
        } else if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z11 = org.telegram.messenger.r2.f25216a;
            org.telegram.messenger.t0.r();
            vf.c.t(cnVar.getParentActivity(), org.telegram.messenger.r2.f25221g);
        } else if (i7 == 84) {
            cnVar.Va(q1Var);
        } else if (i7 == 80) {
            org.telegram.ui.Cells.o8 o8Var = org.telegram.ui.Components.qe0.L1;
            if (cnVar.getParentActivity() != null) {
                cnVar.showDialog(new org.telegram.ui.Components.qe0(cnVar.getContext(), cnVar.getCurrentAccount(), messageObject, cnVar.getResourceProvider()));
            }
        } else if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.f23266k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(messageObject) == null) {
                    cnVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i7 == 5) {
            long j10 = messageObject.f23266k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                user2 = org.telegram.messenger.qp.s1(i13).a2(Long.valueOf(j10));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.f23266k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.f27109id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File g12 = org.telegram.messenger.g0.g1();
                    g12.mkdirs();
                    file = new File(g12, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                cnVar.showDialog(new org.telegram.ui.Components.ad0(cnVar, null, user2, null, file, pf.b.d(str, false), str3, str4, cnVar.f44750za));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 30) {
            cnVar.presentFragment(new cn(a8.p0.j(messageObject.f23266k.media.user_id, "user_id")));
        } else if (i7 == 31) {
            long j11 = messageObject.f23266k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                user = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.X1)) {
                    M0 = messageObject.X1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    M0 = org.telegram.messenger.k5.i(new StringBuilder("+"), user.phone, pf.b.c());
                } else {
                    String str5 = org.telegram.messenger.ij.n1(messageObject.f23266k).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        M0 = pf.b.c().b(str5);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131747832, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.f27109id);
                bundle2.putString("phone", M0);
                bundle2.putBoolean("addContact", true);
                cnVar.presentFragment(new qr(bundle2));
            }
        } else if (i7 != 23 && i7 != 24) {
            if (messageObject.r4()) {
                cnVar.la(messageObject, false, false);
                if (messageObject.R0 != null) {
                    vf.b bVar2 = cnVar.f44459cc;
                    if (bVar2 != null) {
                        bVar2.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        gmVar3 = new gm(this, q1Var, 4);
                    }
                    cnVar.f44459cc = gmVar3;
                    vf.c.s(cnVar.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, cnVar.f44459cc, null, false, cnVar.getMessagesController().f24767d6, false, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage W1 = messageObject.W1();
            if (W1 == null && (message = messageObject.f23266k) != null && (messageMedia2 = message.media) != null) {
                W1 = messageMedia2.webpage;
            }
            if (W1 != null) {
                if (W1.attributes != null) {
                    for (int i14 = 0; i14 < W1.attributes.size(); i14++) {
                        if ((W1.attributes.get(i14) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) W1.attributes.get(i14)).storyItem) != null) {
                            storyItem.dialogId = org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            cnVar.getOrCreateStoryViewer().L(cnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, di.i7.a(cnVar.f44741z0));
                            return;
                        }
                    }
                }
                if (!cnVar.Ga(W1.url, q1Var, null, messageObject.e1(), 2)) {
                    vf.b bVar3 = cnVar.f44459cc;
                    if (bVar3 != null) {
                        bVar3.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        gmVar4 = new gm(this, q1Var, 5);
                    }
                    cnVar.f44459cc = gmVar4;
                    vf.c.s(cnVar.getParentActivity(), Uri.parse(W1.url), true, true, false, cnVar.f44459cc, null, false, true, false, false);
                }
            }
        } else {
            if (i7 == 24) {
                z10 = true;
            }
            TLRPC.Message message2 = messageObject.f23266k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                vf.b bVar4 = cnVar.f44459cc;
                if (bVar4 != null) {
                    bVar4.a(true);
                }
                if (q1Var.getMessageObject() != null) {
                    gmVar = new gm(this, q1Var, 3);
                }
                cnVar.f44459cc = gmVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    if (org.telegram.messenger.ui.b0(i10).p0(group) == null) {
                        cnVar.f44459cc.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        cnVar.f44459cc.f57332b = new bg.m0(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new fi.d3(3, this, z10)), 28);
                        return;
                    }
                }
                vf.c.s(cnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, cnVar.f44459cc, null, false, true, false, false);
            }
        }
    }

    @Override
    public final boolean g2(int i7) {
        boolean z9;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        if (i7 != 16 && i7 != 2131296267 && i7 != 2131296264) {
            return false;
        }
        cn cnVar = this.f48227a;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
        if (z9 && cnVar.f44484ea) {
            r4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                ((ActionBarLayout) r4Var2).r();
            }
            return true;
        }
        return !d();
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar;
        int i7;
        if (q1Var.getMessageObject() != null && (i7 = (cnVar = this.f48227a).Yb) != 0 && i7 == q1Var.getMessageObject().e1() && cnVar.Zb == 3) {
            return cnVar.f44445bc;
        }
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.q1 q1Var) {
        sh.c cVar;
        cn cnVar = this.f48227a;
        if (cnVar.f44460cd.f55499f && (cVar = cnVar.f44539id) != null && cVar.f55299n == q1Var && cVar.f55294a.getWidth() > 0) {
            return cnVar.f44539id.f55294a.getHeight();
        }
        return 0;
    }

    public final void i(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, boolean z9) {
        cn cnVar = this.f48227a;
        TLRPC.Chat chat2 = cnVar.f44473e;
        if (chat2 != null && chat.f26960id == chat2.f26960id) {
            wi wiVar = cnVar.f44601o1;
            if (wiVar != null && i7 == 0) {
                wiVar.e(false, false);
            } else if (q1Var.getMessageObject() != null) {
                cnVar.l(i7, q1Var.getMessageObject().e1(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f26960id != chat2.f26960id || cnVar.ea()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f26960id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            ji jiVar = null;
            if (z9) {
                vf.b bVar = cnVar.f44459cc;
                if (bVar != null) {
                    bVar.a(true);
                    cnVar.f44459cc = null;
                }
                if (q1Var != null && q1Var.getMessageObject() != null) {
                    ji jiVar2 = new ji(cnVar, q1Var.getMessageObject().e1(), q1Var, 0);
                    cnVar.f44459cc = jiVar2;
                    jiVar = jiVar2;
                } else {
                    cnVar.f44459cc = null;
                }
            }
            if (cnVar.getMessagesController().E(bundle, cnVar, q1Var.getMessageObject(), jiVar)) {
                ji jiVar3 = jiVar;
                cn cnVar2 = new cn(bundle);
                if (jiVar3 != null && i7 != 0) {
                    org.telegram.messenger.g0.i3(new bi.ub(this, jiVar3, chat, i7, cnVar2, 11), 5000L);
                    jiVar3.d();
                    return;
                }
                cnVar.presentFragment(cnVar2);
            }
        }
    }

    @Override
    public final void i0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        cn cnVar = this.f48227a;
        if (cnVar.getParentActivity() != null) {
            if (cnVar.f44661sa == null) {
                wh.i iVar = new wh.i(cnVar.getParentActivity());
                cnVar.f44661sa = iVar;
                cnVar.l1.addView(iVar, c8.ha.e(-1, -1, 48));
            }
            wh.i iVar2 = cnVar.f44661sa;
            HashMap hashMap = iVar2.f57926a;
            ArrayList arrayList = iVar2.f57928c;
            arrayList.clear();
            int i7 = iVar2.d;
            org.telegram.messenger.p10 i10 = org.telegram.messenger.p10.i(i7);
            long j3 = i10.f24493n;
            arrayList.add(Long.valueOf(j3));
            if (i10.V) {
                ArrayList arrayList2 = org.telegram.messenger.ui.b0(i7).f25825i1;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j10 = tL_topPeer.peer.user_id;
                    if (j10 != 0) {
                        int i12 = size;
                        if (org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        size = i12;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = org.telegram.messenger.qp.s1(i7).f24948y;
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j11 = dialog.f26964id;
                    if (j11 != j3 && !org.telegram.messenger.m5.C(j11)) {
                        if (org.telegram.messenger.m5.E(dialog.f26964id)) {
                            TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(dialog.f26964id));
                            if (a22 != null && !org.telegram.messenger.t10.t(a22) && !org.telegram.messenger.t10.x(a22) && !org.telegram.messenger.t10.A(a22.f27109id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f26964id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f26964id));
                                }
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-dialog.f26964id));
                            if (M0 != null && !M0.forum && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f26964id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f26964id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = wh.i.b(q1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    Long l10 = (Long) obj2;
                    if (hashSet.add(l10) && org.telegram.messenger.m5.E(l10.longValue())) {
                        arrayList5.add(l10);
                    }
                }
                wh.h hVar = new wh.h(iVar2, q1Var, arrayList5, new u9.f(23, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void i2() {
        cn cnVar = this.f48227a;
        if (cnVar.getUserConfig().q()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", cnVar.f44545j6);
            bundle.putInt("start_from", 10);
            cnVar.presentFragment(new org.telegram.ui.Components.v80(bundle, cnVar.f44601o1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.gc.a0(cnVar).Q(2131624216, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.id.H(',', "UnlockSimilarChannelsPremium", cnVar.getMessagesController().f24943x4), new vl(this, 4))).j();
    }

    @Override
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject != null) {
            int a10 = sh.h.a(messageObject);
            boolean a11 = c8.zc.a(a10, 7);
            cn cnVar = this.f48227a;
            if (a11) {
                org.telegram.ui.Components.gc.a0(cnVar).Q(2131624006, 36, sh.h.b(a10, messageObject)).j();
            } else if (i7 < 0 && !arrayList.isEmpty()) {
                cnVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
                q1Var.a0(true);
            } else if (cnVar.getParentActivity() != null) {
                if (cnVar.B2 == null) {
                    int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
                    if (indexOfChild == -1) {
                        return;
                    }
                    fi.m3 E6 = cnVar.E6(250.0f, 3, indexOfChild + 1, false);
                    cnVar.B2 = E6;
                    E6.f12444u0 = 0.0f;
                }
                if (arrayList.isEmpty() && i7 < 0) {
                    ArrayList<org.telegram.ui.Cells.p1> pollButtons = q1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i12 = 0;
                    float f10 = 0.0f;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i12);
                        float y10 = ((q1Var.getY() + p1Var.f29727b) - org.telegram.messenger.g0.L(4.0f)) - cnVar.N9;
                        cnVar.E2 = org.telegram.messenger.g0.L(13.3f) + p1Var.f29726a;
                        int D = org.telegram.messenger.camera.q.D(6.0f, p1Var.f29727b, i11);
                        cnVar.F2 = D;
                        if (y10 > 0.0f) {
                            i10 = cnVar.E2;
                            i11 = D;
                            f10 = 0.0f;
                            break;
                        }
                        i12++;
                        f10 = y10;
                    }
                    if (f10 != 0.0f) {
                        cnVar.f44741z0.w0(0, (int) f10, null);
                        cnVar.D2 = q1Var;
                        return;
                    }
                }
                cn.q2(cnVar, q1Var, i7, i10, i11);
            }
        }
    }

    @Override
    public final void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        wh.h hVar;
        int i7;
        boolean z9;
        boolean z10;
        float f12;
        wh.i iVar = this.f48227a.f44661sa;
        if (iVar != null && (hVar = (wh.h) iVar.f57926a.get(wh.i.b(q1Var))) != null) {
            wh.d[] dVarArr = hVar.f57924x;
            RectF rectF = hVar.f57921r;
            if (hVar.M) {
                float f13 = (f10 - rectF.left) + hVar.U;
                float f14 = (f11 - rectF.top) + hVar.V;
                int i10 = wh.g.f57907a;
                int floor = (int) Math.floor((f13 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(wh.g.f57907a + 11));
                if ((-org.telegram.messenger.g0.L(37)) < f14 && f14 < rectF.height()) {
                    i7 = c8.j9.b(floor, 0, dVarArr.length - 1);
                } else {
                    i7 = -1;
                }
                if (hVar.R != i7) {
                    hVar.f57914a.performHapticFeedback(3, 1);
                    hVar.R = i7;
                    for (int i11 = 0; i11 < dVarArr.length; i11++) {
                        wh.d dVar = dVarArr[i11];
                        if (i7 == i11) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f57885p != z9) {
                            ValueAnimator valueAnimator = dVar.f57883n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f57885p = z9;
                            float f16 = dVar.f57884o;
                            if (z9) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f57883n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f57883n.addUpdateListener(dVar);
                            dVar.f57883n.setInterpolator(wh.f.f57889a);
                            dVar.f57883n.start();
                        }
                        wh.d dVar2 = dVarArr[i11];
                        if (i7 != i11 && i7 != -1) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (dVar2.f57882m != z10) {
                            ValueAnimator valueAnimator2 = dVar2.f57880k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f57882m = z10;
                            float f17 = dVar2.f57881l;
                            if (!z10) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f57880k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f57880k.addUpdateListener(dVar2);
                            dVar2.f57880k.setInterpolator(wh.f.f57889a);
                            dVar2.f57880k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        org.telegram.messenger.ij messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        cn cnVar = this.f48227a;
        fi.m3 m3Var = cnVar.O1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (cnVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.id.E0().f23189y);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = R0.country;
            }
            fi.m3 m3Var2 = new fi.m3(cnVar.getParentActivity(), 3);
            m3Var2.r(true);
            m3Var2.K = Layout.Alignment.ALIGN_NORMAL;
            m3Var2.d = -1L;
            m3Var2.T = true;
            m3Var2.f12424e = true;
            m3Var2.s(12.0f);
            cnVar.O1 = m3Var2;
            m3Var2.f12438q0 = new oe(18, this, m3Var2);
            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750848, str)));
            cnVar.O1.l(cnVar.K);
            cnVar.l1.addView(cnVar.O1, c8.ha.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            cnVar.l1.post(new l2.z(this, q1Var, i10, i7, 12));
        }
    }

    @Override
    public final void k() {
        org.telegram.messenger.t0.u();
        boolean z9 = org.telegram.messenger.r2.f25216a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.f48227a.getParentActivity(), org.telegram.messenger.r2.f25221g);
    }

    @Override
    public final boolean k0() {
        boolean z9;
        cn cnVar = this.f48227a;
        if (!cnVar.X9()) {
            z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
            if (!z9) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.j9 k2() {
        return this.f48227a.s9;
    }

    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27109id);
            org.telegram.ui.ActionBar.f2 f2Var = this.f48227a;
            if (f2Var.getMessagesController().E(bundle, f2Var, q1Var.getMessageObject(), null)) {
                f2Var.presentFragment(new cn(bundle));
            }
        }
    }

    public final void m(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f26960id);
            bundle.putBoolean("expandPhoto", false);
            this.f48227a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void m0(String str) {
        cn cnVar = this.f48227a;
        wj wjVar = cnVar.f44448c1;
        if (wjVar == null || wjVar.getVisibility() != 0) {
            vj vjVar = cnVar.S;
            if ((vjVar == null || vjVar.getVisibility() != 0) && cnVar.Z != null && str != null && str.length() > 0) {
                sj sjVar = cnVar.Z;
                sjVar.setFieldText("@" + str + " ");
                cnVar.Z.H0();
            }
        }
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10;
        TLRPC.Document document;
        int i11;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i12;
        TLRPC.Document document3;
        int i13;
        int i14;
        int i15;
        long j3;
        long j10;
        int i16;
        boolean z9;
        boolean z10;
        int i17;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                B1(q1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            cn cnVar = this.f48227a;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(cnVar)) {
                    sa0 sa0Var = new sa0(3);
                    h6Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                    sa0Var.setResourceProvider(h6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = cnVar.getMessagesController().z1(cnVar.a());
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
                    sa0Var.P0 = false;
                    sa0Var.G0(new org.telegram.messenger.ij(org.telegram.messenger.p10.f24474s0, tL_message, false, false));
                    cnVar.presentFragment(sa0Var);
                }
            } else if (org.telegram.messenger.ij.N2(messageMedia.document)) {
                ns.p().v(cnVar.getParentActivity());
                ns.p().u(new lm(this, tL_messageMediaPoll, pollAnswer, q1Var));
                ns p10 = ns.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.ij.H2(document4)) {
                    i17 = 2;
                } else {
                    i17 = 0;
                }
                org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
                h6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                p10.s(document4, null, "", null, null, i17, false, messageObject2, h6Var, 200);
            } else if (org.telegram.messenger.ij.J3(messageMedia.document)) {
                org.telegram.messenger.ij ijVar = MediaController.B().f21300u0;
                if (MediaController.B().I(messageObject) && ijVar != null) {
                    boolean z11 = ijVar.f23267k0;
                    if (i7 == -3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11 == z10) {
                        if (MediaController.B().H()) {
                            MediaController.B().S(ijVar);
                            return;
                        } else {
                            MediaController.B().R(ijVar, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.f23266k;
                TLRPC.TL_message R7 = cn.R7(message);
                R7.media = messageMedia;
                R7.attachPath = sh.e.c(i7, message);
                ArrayList arrayList = new ArrayList();
                i16 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i16, R7, false, true);
                if (i7 == -3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ijVar2.f23267k0 = z9;
                arrayList.add(ijVar2);
                if (MediaController.B().I(messageObject)) {
                    MediaController.B().q(false, true, false, false);
                }
                MediaController.B().o0(arrayList, ijVar2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !org.telegram.messenger.ij.K4(document5)) {
                    i14 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    sh.a aVar = new sh.a(i14, messageObject, document6, sh.e.c(i7, messageObject.f23266k));
                    if (aVar.f55291g) {
                        org.telegram.messenger.w7.G(i14).f(document6);
                        aVar.a();
                        q1Var.Z();
                        return;
                    } else if (!aVar.f55290f) {
                        org.telegram.messenger.w7.G(i14).W(document6, messageObject, 2, 0);
                        aVar.a();
                        q1Var.Z();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.f23266k;
                        TLRPC.TL_message R72 = cn.R7(message2);
                        R72.media = messageMedia;
                        R72.attachPath = sh.e.c(i7, message2);
                        i15 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        org.telegram.messenger.ij ijVar3 = new org.telegram.messenger.ij(i15, R72, false, true);
                        if (org.telegram.messenger.ij.y(messageMedia.document)) {
                            PhotoViewer.p1().H2(null, cnVar, cnVar.f44750za);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i18 = ijVar3.D;
                            long j11 = 0;
                            if (i18 != 0) {
                                j3 = cnVar.f44545j6;
                            } else {
                                j3 = 0;
                            }
                            if (i18 != 0) {
                                j10 = cnVar.f44440b7;
                            } else {
                                j10 = 0;
                            }
                            if (i18 != 0) {
                                j11 = cnVar.b();
                            }
                            p12.d2(ijVar3, cnVar, j3, j10, j11, cnVar.f44444bb);
                            return;
                        }
                        try {
                            org.telegram.messenger.g0.u2(ijVar3, cnVar.getParentActivity(), cnVar.f44750za, false);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            cnVar.M6(ijVar3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.f23266k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.ij.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList3.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message R73 = cn.R7(message3);
                    R73.media = messageMedia3;
                    R73.attachPath = sh.e.c(-2, message3);
                    i13 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.ij(i13, R73, false, true));
                    arrayList2.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.ij.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList3.size();
                    }
                    TLRPC.TL_message R74 = cn.R7(message3);
                    R74.media = messageMedia2;
                    R74.attachPath = sh.e.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    R74.message = pollResults2.solution;
                    R74.entities = pollResults2.solution_entities;
                    i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.ij(i12, R74, false, true));
                    arrayList2.add(-3);
                }
                cg.d.b(tL_messageMediaPoll.poll, cnVar.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.ij.K4(document))) {
                        if (pollAnswer2.unshuffled_index == i7) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message R75 = cn.R7(message3);
                        R75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        R75.message = tL_textWithEntities2.text;
                        R75.entities = tL_textWithEntities2.entities;
                        R75.attachPath = sh.e.c(pollAnswer2.unshuffled_index, message3);
                        i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        arrayList3.add(new org.telegram.messenger.ij(i11, R75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.f23288q0 = arrayList2;
                    PhotoViewer.p1().H2(null, cnVar, cnVar.f44750za);
                    PhotoViewer.p1().Z1(arrayList3, i10, cnVar.a(), 0L, 0L, cnVar.f44458cb);
                }
            }
        }
    }

    @Override
    public final boolean n0(org.telegram.ui.Components.q5 q5Var) {
        TLRPC.InputStickerSet i12;
        int i7;
        cn cnVar = this.f48227a;
        if (!cnVar.getMessagesController().D3() && q5Var != null && !q5Var.standard) {
            long documentId = q5Var.getDocumentId();
            TLRPC.Document document = q5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                document = org.telegram.ui.Components.h5.e(i7, documentId);
            }
            if (document != null && (i12 = org.telegram.messenger.ij.i1(document)) != null) {
                org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).m0(i12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i12);
                org.telegram.ui.Components.qu quVar = new org.telegram.ui.Components.qu(cnVar, cnVar.getParentActivity(), cnVar.f44750za, arrayList);
                org.telegram.ui.Components.iu iuVar = quVar.f37398p1;
                iuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(iuVar);
                iuVar.f34768w = imageReceiver;
                if (iuVar.d) {
                    imageReceiver.P();
                }
                iuVar.f34769x = true;
                iuVar.f34770y.e(true, 1.0f);
                iuVar.f34768w.r0(org.telegram.messenger.hc.b(document), "140_140", org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f28055m6, 0.2f, true), 0L, null, null, 0);
                iuVar.f34768w.E0(7);
                ImageReceiver imageReceiver2 = iuVar.f34768w;
                imageReceiver2.f21227u0 = true;
                imageReceiver2.f21225t0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = iuVar.f34768w;
                imageReceiver3.f21232w0 = true;
                imageReceiver3.H0(iuVar);
                boolean U9 = cnVar.U9();
                quVar.f28688h0 = U9;
                quVar.f28696n = U9;
                cnVar.showDialog(quVar);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean n1() {
        cn cnVar = this.f48227a;
        if (cnVar.l1.getMeasuredWidth() > cnVar.l1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
        float f10;
        if (q1Var.getMessageObject().y3()) {
            Z0();
            return;
        }
        cn cnVar = this.f48227a;
        if (!cnVar.f44744z3 && cnVar.f44741z0 != null && cnVar.getParentActivity() != null && cnVar.fragmentView != null) {
            if (cnVar.I2 == null) {
                int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
                if (indexOfChild != -1) {
                    fi.m3 E6 = cnVar.E6(250.0f, 3, indexOfChild + 1, false);
                    cnVar.I2 = E6;
                    E6.u(org.telegram.messenger.id.M0(2131749329, null));
                } else {
                    return;
                }
            }
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = q1Var.getCurrentUser();
                if (currentUser != null && currentUser.f27109id == 0) {
                    f10 = (q1Var.getMeasuredHeight() - Math.max(0, q1Var.getBottom() - ((View) q1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
                } else {
                    float L = org.telegram.messenger.g0.L(22.0f);
                    if (!messageObject.P3() && q1Var.f29910j9 && q1Var.U8 != null) {
                        f10 = org.telegram.messenger.g0.L(20.0f) + L;
                    } else {
                        f10 = L;
                    }
                }
                if (cnVar.v9(q1Var, f10) > org.telegram.messenger.g0.L(80.0f)) {
                    cnVar.I2.x(cnVar.u9(q1Var, q1Var.getForwardNameCenterX()), cnVar.v9(q1Var, f10) - org.telegram.messenger.g0.L(4.0f), true);
                }
            }
        }
    }

    @Override
    public final void p() {
        this.f48227a.l1.getClass();
    }

    @Override
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        cn cnVar = this.f48227a;
        cnVar.Y7(q1Var, false, false, f10, f11, true, false, false);
        cnVar.f44741z0.getClass();
        cn.l2(cnVar, RecyclerView.R(q1Var));
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        cn cnVar = this.f48227a;
        if (cnVar.Yb != 0 && q1Var.getMessageObject() != null && cnVar.Yb == q1Var.getMessageObject().e1() && cnVar.Zb == i7) {
            return true;
        }
        return false;
    }

    public final void q(TLRPC.User user, boolean z9) {
        int i7;
        if (user != null && user.f27109id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i10 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z9 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27109id);
            bundle.putBoolean("expandPhoto", z9);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            cn cnVar = this.f48227a;
            TLRPC.User user2 = cnVar.f44487f;
            if (user2 != null && user2.f27109id == user.f27109id) {
                i10 = 1;
            }
            profileActivity.j5(i10);
            Activity parentActivity = cnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i7);
            cnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
        e(q1Var, z9, false, z10);
    }

    @Override
    public final void r(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.r(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final void r1(org.telegram.ui.Cells.q1 q1Var) {
        cn.f5(this.f48227a, q1Var);
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.l lVar;
        cn cnVar = this.f48227a;
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        boolean z9 = true;
        if (!lVar.x() && !cnVar.X9()) {
            if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().r4()) {
                g1(q1Var, 10);
                return;
            }
            if (!org.telegram.messenger.t3.c0(cnVar.f44473e) && !cnVar.ea()) {
                z9 = false;
            }
            q(user, z9);
            return;
        }
        cn.k2(cnVar, q1Var, true, f10, f11);
    }

    @Override
    public final void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        e(q1Var, z9, false, false);
    }

    @Override
    public final void u() {
        this.f48227a.Ec();
    }

    @Override
    public final void u0(org.telegram.ui.Cells.q1 r28, float r29, float r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.u0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        BitmapDrawable bitmapDrawable;
        boolean z9;
        int i14;
        int i15;
        String str2;
        boolean z10;
        w4 w4Var;
        int i16;
        int i17;
        c5 c5Var;
        wj wjVar;
        vj vjVar;
        if (!f()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.t3.K(chat, false));
        cn cnVar = this.f48227a;
        if (!isEmpty && cnVar.f44473e != null && (((wjVar = cnVar.f44448c1) == null || wjVar.getVisibility() != 0) && ((vjVar = cnVar.S) == null || vjVar.getVisibility() != 0))) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        TLRPC.Chat chat2 = cnVar.f44473e;
        if (chat2 != null && ((cnVar.f44643r4 == 0 || cnVar.f44693v4) && (!org.telegram.messenger.t3.T(chat2) || cnVar.f44473e.megagroup))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat3 = cnVar.f44473e;
        if (chat3 != null && chat3.f26960id == chat.f26960id && !cnVar.ea()) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c5[] c5VarArr = new c5[i11 + 1 + i7 + i10];
        c5VarArr[0] = c5.d;
        if (i11 != 0) {
            if (chat.broadcast) {
                c5Var = c5.f44235e;
            } else {
                c5Var = c5.f44236f;
            }
            c5VarArr[1] = c5Var;
            i12 = 2;
        } else {
            i12 = 1;
        }
        if (i7 != 0) {
            c5VarArr[i12] = c5.f44237n;
            i12++;
        }
        if (i10 != 0) {
            c5VarArr[i12] = c5.f44238r;
        }
        TLRPC.ChatFull N0 = cnVar.getMessagesController().N0(chat.f26960id);
        if (N0 == null) {
            i13 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24474s0, 0, chat);
            org.telegram.messenger.hc m11 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24474s0, 1, chat);
            if (m11 != null && (m11.f22877k instanceof TLRPC.TL_photoStrippedSize)) {
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
            z9 = true;
            i14 = i7;
            i15 = i10;
            str2 = null;
            z10 = i11;
            w4Var = new w4(m10, m11, null, str, null, null, bitmapDrawable, chat, c5VarArr, new y4(i13, org.telegram.messenger.qs.T, chat));
        } else {
            w4Var = w4.a(chat, N0, c5VarArr);
            i14 = i7;
            i15 = i10;
            z9 = true;
            str2 = null;
            z10 = i11;
        }
        if (ab.q.i(w4Var)) {
            ab.q.o().C((ViewGroup) cnVar.fragmentView, cnVar.f44750za, w4Var, new a7(this, chat, q1Var, 7));
            return z9;
        }
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(cnVar, q1Var);
        H.c(2131232266, org.telegram.messenger.id.M0(2131747786, str2), new yl(this, chat, 0), false);
        boolean z11 = chat.broadcast;
        if (z11) {
            i16 = 2131232088;
        } else {
            i16 = 2131232113;
        }
        if (z11) {
            i17 = 2131747811;
        } else {
            i17 = 2131747799;
        }
        H.l(i16, org.telegram.messenger.id.M0(i17, str2), new o1(this, q1Var, chat, 25), z10);
        H.l(2131232222, org.telegram.messenger.id.M0(2131748609, str2), new yl(this, chat, z9 ? 1 : 0), i14);
        H.l(2131232354, org.telegram.messenger.id.M0(2131753758, str2), new yl(this, chat, 2), i15);
        H.f35220t = false;
        H.f35201i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void v(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        int i10;
        fj fjVar;
        org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.f23224a3 = !primaryMessageObject.f23224a3;
            primaryMessageObject.K1 = true;
            cn cnVar = this.f48227a;
            cj cjVar = cnVar.f44741z0;
            if (cjVar != null && (fjVar = cnVar.B0) != null && fjVar.f57030y < 0) {
                for (int childCount = cjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = cnVar.f44741z0.getChildAt(childCount);
                    cnVar.f44741z0.getClass();
                    i7 = RecyclerView.R(childAt);
                    if (i7 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                                i10 = cnVar.g9(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = cnVar.g9(childAt);
                            break;
                        }
                    }
                }
            }
            i7 = -1;
            i10 = 0;
            cnVar.Yc(primaryMessageObject, false);
            fi.m3 m3Var = cnVar.O1;
            if (m3Var != null) {
                m3Var.f(true);
            }
            if (i7 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
                cnVar.B0.h1(i7, i10);
            }
        }
    }

    @Override
    public final void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        cn cnVar = this.f48227a;
        if (!cnVar.W9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (cnVar.getParentActivity() != null) {
                if (cnVar.f44448c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) cnVar.getParentActivity(), (org.telegram.ui.ActionBar.h6) cnVar.f44750za, false);
                        w2Var.N();
                        w2Var.O = str;
                        w2Var.P = false;
                        w2Var.Q = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131751767, null)};
                        og.j jVar = new og.j(3, cnVar, str);
                        w2Var.L = charSequenceArr;
                        w2Var.K = jVar;
                        cnVar.showDialog(w2Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        cnVar.Ba(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
                        try {
                            q1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean w1() {
        cn cnVar = this.f48227a;
        if (cnVar.l1.getKeyboardHeight() + cnVar.Ja >= org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void x(org.telegram.ui.Cells.q1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.x(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final boolean x0(org.telegram.messenger.ij ijVar) {
        return !this.f48227a.f44652s.containsKey(ijVar);
    }

    @Override
    public final void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        boolean z9 = q1Var.getMessageObject().f23266k.media instanceof TLRPC.TL_messageMediaGiveaway;
        cn cnVar = this.f48227a;
        if (z9) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().f23266k.media).channels.get(i7).longValue();
            if (cnVar.f44545j6 != j3) {
                cnVar.presentFragment(cn.ta(j3));
            } else {
                cnVar.f44601o1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().f23266k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            cnVar.presentFragment(ProfileActivity.D4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().f23266k.media).winners.get(i7).longValue()));
        }
    }

    @Override
    public final String y(long j3) {
        TLRPC.Peer peer;
        String C0;
        cn cnVar = this.f48227a;
        if (org.telegram.messenger.t10.u(cnVar.f44487f)) {
            return null;
        }
        TLRPC.Chat chat = cnVar.f44473e;
        if (chat != null && !org.telegram.messenger.t3.V(chat) && (C0 = cnVar.getMessagesController().C0(cnVar.f44473e.f26960id, j3)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = cnVar.f44629q4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return org.telegram.messenger.id.M0(2131744020, null);
    }

    @Override
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
        sh.c cVar = this.f48227a.f44539id;
        if (cVar != null && cVar.f55299n == q1Var) {
            cVar.f55303x.getClass();
        }
    }

    @Override
    public final void y1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        cn cnVar = this.f48227a;
        cnVar.f44669t5 = messageObject;
        cnVar.B9();
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.Y5();
            messageObject.K1 = true;
            q1Var.G1();
            q1Var.requestLayout();
            this.f48227a.C0.R(messageObject, false, false);
        }
    }

    @Override
    public final void z0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Components.u5 m10;
        cn cnVar = this.f48227a;
        if (!cnVar.f44744z3 && !org.telegram.messenger.iz.A0 && cnVar.f44741z0 != null && cnVar.getParentActivity() != null && cnVar.fragmentView != null) {
            fi.m3 m3Var = cnVar.H2;
            if (m3Var == null || !m3Var.V) {
                if (m3Var == null) {
                    int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
                    if (indexOfChild != -1) {
                        fi.m3 E6 = cnVar.E6(250.0f, 3, indexOfChild + 1, false);
                        cnVar.H2 = E6;
                        E6.d = 10000L;
                        E6.m(cnVar.getParentActivity().getResources().getDrawable(2131232787).mutate());
                        cnVar.H2.u(org.telegram.messenger.id.M0(2131753762, null));
                    } else {
                        return;
                    }
                }
                int childCount = cnVar.f44741z0.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = cnVar.f44741z0.getChildAt(i7);
                    if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.ij.L4(messageObject.f23266k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !cnVar.H2.V) {
                        ImageReceiver photoImage = q1Var.getPhotoImage();
                        float v92 = cnVar.v9(q1Var, photoImage.L0);
                        float f10 = photoImage.N0;
                        View view = (View) q1Var.getParent();
                        float v93 = cnVar.v9(q1Var, -q1Var.getTop());
                        if (v92 <= org.telegram.messenger.g0.L(80.0f)) {
                            continue;
                        } else if ((v92 + f10) - v93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                            cnVar.Jb = q1Var;
                            fi.m3 m3Var2 = cnVar.H2;
                            m3Var2.f12438q0 = new bf(cnVar, 23);
                            m3Var2.x(cnVar.u9(q1Var, q1Var.getNoSoundIconCenterX()), v92, true);
                            org.telegram.messenger.iz.D(true);
                            return;
                        }
                    }
                }
            }
        }
    }
}
