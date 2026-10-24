package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class q80 extends org.telegram.ui.ActionBar.h3 {
    public static ArrayList I;
    public static long J;
    public static long K;
    public static int L;
    public TLRPC.InputPeer E;
    public boolean F;
    public boolean G;
    public o80 H;
    public Drawable f29822b;
    public boolean f29823c;
    public int d;
    public r00 e;
    public m80 f29824f;
    public TextView h;
    public TextView f29825n;
    public ArrayList f29826r;
    public boolean f29827s;
    public int v;
    public int f29828w;
    public TLRPC.Peer f29829x;
    public TLRPC.Peer f29830y;

    public static void m(q80 q80Var, o80 o80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(q80Var.currentAccount).getInputPeer(MessageObject.getPeerId(q80Var.f29829x));
        if (q80Var.f29828w == 2) {
            if (q80Var.f29829x != q80Var.f29830y) {
                boolean z10 = true;
                if (q80Var.f29826r.size() <= 1) {
                    z10 = false;
                }
                o80Var.a(inputPeer, z10, false, false);
            }
        } else {
            q80Var.E = inputPeer;
        }
        q80Var.dismiss();
    }

    public static void n(q80 q80Var) {
        q80Var.E = MessagesController.getInstance(q80Var.currentAccount).getInputPeer(MessageObject.getPeerId(q80Var.f29829x));
        q80Var.F = true;
        q80Var.dismiss();
    }

    public static void p(q80 q80Var) {
        m80 m80Var = q80Var.f29824f;
        if (q80Var.f29828w != 0) {
            if (m80Var.getChildCount() <= 0) {
                int paddingTop = m80Var.getPaddingTop();
                q80Var.v = paddingTop;
                m80Var.setTopGlowOffset(paddingTop);
                q80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = m80Var.getChildAt(0);
            vl0 vl0Var = (vl0) m80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
                i10 = top;
            }
            if (q80Var.v != i10) {
                q80Var.h.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                q80Var.f29825n.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                q80Var.v = i10;
                m80Var.setTopGlowOffset(i10);
                q80Var.containerView.invalidate();
            }
        }
    }

    public static void u(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 240000) {
            boolean z10 = true;
            if (I.size() != 1) {
                z10 = false;
            }
            booleanCallback.run(z10);
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        c2Var.setOnCancelListener(new j80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new ai.d0(c2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            c2Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void v(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, o80 o80Var) {
        if (context != null) {
            if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 300000) {
                if (I.size() == 1 && i10 != 0) {
                    o80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) I.get(0))), false, false, false);
                    return;
                } else {
                    w(context, j10, I, o2Var, i10, peer, o80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            c2Var.setOnCancelListener(new j80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new i80(c2Var, accountInstance, o80Var, j10, context, o2Var, i10, peer)), 0));
            try {
                c2Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void w(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, o80 o80Var) {
        int i11;
        l80 l80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                pr prVar = new pr(o2Var, arrayList, j10, o80Var);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(prVar);
                    return;
                } else {
                    prVar.show();
                    return;
                }
            }
            return;
        }
        ?? h3Var = new org.telegram.ui.ActionBar.h3(context, false);
        h3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        h3Var.f29826r = arrayList2;
        h3Var.H = o80Var;
        h3Var.f29828w = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        h3Var.f29822b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) h3Var.f29826r.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        h3Var.f29830y = peer2;
                        h3Var.f29829x = peer2;
                        break;
                    }
                    i15++;
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) h3Var.f29826r.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        h3Var.f29830y = peer3;
                        h3Var.f29829x = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                h3Var.f29829x = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = h3Var.f29822b;
            i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            h3Var.f29823c = true;
            h3Var.d = x02;
            h3Var.f29829x = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        h3Var.fixNavigationBar(i11);
        if (h3Var.f29828w == 0) {
            ?? k80Var = new k80(h3Var, context);
            k80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(k80Var);
            h3Var.setCustomView(nestedScrollView);
            l80Var = k80Var;
        } else {
            l80 l80Var2 = new l80(h3Var, context);
            h3Var.containerView = l80Var2;
            l80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = h3Var.containerView;
            int i17 = h3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            l80Var = l80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(h3Var.currentAccount).getChat(Long.valueOf(-j10));
        m80 m80Var = new m80(h3Var, context);
        h3Var.f29824f = m80Var;
        h3Var.getContext();
        if (h3Var.f29828w == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        m80Var.setLayoutManager(new s4.b0(i12, false));
        m80Var.setAdapter(new p80(h3Var, context));
        m80Var.setVerticalScrollBarEnabled(false);
        m80Var.setClipToPadding(false);
        m80Var.setEnabled(true);
        m80Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.r6.m(m80Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        m80Var.setOnScrollListener(new n80(h3Var));
        m80Var.setOnItemClickListener(new ci.x4(11, h3Var, chat));
        if (i10 != 0) {
            l80Var.addView(m80Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            m80Var.setSelectorDrawableColor(0);
            m80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            l80Var.addView(imageView, w7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        h3Var.h = textView;
        org.telegram.messenger.tl.k(20.0f, 1, textView);
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21377ng, null);
        } else {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            l80Var.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            l80Var.addView(textView, w7.z5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(h3Var.getContext());
        h3Var.f29825n = textView2;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21395og, null);
        } else {
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21440r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = h3Var.f29826r.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) h3Var.f29826r.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(h3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        h3Var.f29825n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.r6.I(h3Var.f29825n, org.telegram.ui.ActionBar.k6.f21310k5, null);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (h3Var.f29826r.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                h3Var.f29824f.setVisibility(8);
            }
            h3Var.f29825n.setText(sb2);
            h3Var.f29825n.setGravity(49);
            l80Var.addView(h3Var.f29825n, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                h3Var.f29825n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                h3Var.f29825n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = h3Var.f29825n;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            l80Var.addView(h3Var.f29825n, w7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            m80 m80Var2 = h3Var.f29824f;
            if (h3Var.f29826r.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            l80Var.addView(m80Var2, w7.z5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        r00 r00Var = new r00(h3Var, context, false);
        h3Var.e = r00Var;
        ((View) r00Var.f30029c).setOnClickListener(new aa(20, h3Var, o80Var));
        if (h3Var.f29828w == 0) {
            l80Var.addView(r00Var, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            r00 r00Var2 = new r00(h3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                r00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                r00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) r00Var2.f30029c).setOnClickListener(new f0((Object) h3Var, 28));
            l80Var.addView(r00Var2, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            l80Var.addView(r00Var, w7.z5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        h3Var.x(chat, false);
        if (o2Var != 0) {
            if (o2Var.getParentActivity() != null) {
                o2Var.showDialog(h3Var);
                return;
            }
            return;
        }
        h3Var.show();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.E;
        if (inputPeer != null) {
            o80 o80Var = this.H;
            boolean z10 = true;
            if (this.f29826r.size() <= 1) {
                z10 = false;
            }
            o80Var.a(inputPeer, z10, this.F, false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        Drawable drawable;
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
            if (this.f29823c && (drawable = this.f29822b) != null && x02 != this.d) {
                this.d = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void x(TLRPC.Chat chat, boolean z10) {
        String str;
        r00 r00Var = this.e;
        if (this.f29828w == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                r00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                r00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.f29829x);
        if (DialogObject.isUserDialog(peerId)) {
            r00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        r00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
