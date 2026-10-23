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
public final class s80 extends org.telegram.ui.ActionBar.h3 {
    public static ArrayList I;
    public static long J;
    public static long K;
    public static int L;
    public TLRPC.InputPeer E;
    public boolean F;
    public boolean G;
    public q80 H;
    public Drawable f30412b;
    public boolean f30413c;
    public int d;
    public t00 e;
    public o80 f30414f;
    public TextView h;
    public TextView f30415n;
    public ArrayList f30416r;
    public boolean f30417s;
    public int v;
    public int f30418w;
    public TLRPC.Peer f30419x;
    public TLRPC.Peer f30420y;

    public static void m(s80 s80Var, q80 q80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(s80Var.currentAccount).getInputPeer(MessageObject.getPeerId(s80Var.f30419x));
        if (s80Var.f30418w == 2) {
            if (s80Var.f30419x != s80Var.f30420y) {
                boolean z10 = true;
                if (s80Var.f30416r.size() <= 1) {
                    z10 = false;
                }
                q80Var.a(inputPeer, z10, false, false);
            }
        } else {
            s80Var.E = inputPeer;
        }
        s80Var.dismiss();
    }

    public static void n(s80 s80Var) {
        s80Var.E = MessagesController.getInstance(s80Var.currentAccount).getInputPeer(MessageObject.getPeerId(s80Var.f30419x));
        s80Var.F = true;
        s80Var.dismiss();
    }

    public static void p(s80 s80Var) {
        o80 o80Var = s80Var.f30414f;
        if (s80Var.f30418w != 0) {
            if (o80Var.getChildCount() <= 0) {
                int paddingTop = o80Var.getPaddingTop();
                s80Var.v = paddingTop;
                o80Var.setTopGlowOffset(paddingTop);
                s80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = o80Var.getChildAt(0);
            wl0 wl0Var = (wl0) o80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
                i10 = top;
            }
            if (s80Var.v != i10) {
                s80Var.h.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                s80Var.f30415n.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                s80Var.v = i10;
                o80Var.setTopGlowOffset(i10);
                s80Var.containerView.invalidate();
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
        c2Var.setOnCancelListener(new l80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new ai.d0(c2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            c2Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void v(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, q80 q80Var) {
        if (context != null) {
            if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 300000) {
                if (I.size() == 1 && i10 != 0) {
                    q80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) I.get(0))), false, false, false);
                    return;
                } else {
                    w(context, j10, I, o2Var, i10, peer, q80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            c2Var.setOnCancelListener(new l80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new k80(c2Var, accountInstance, q80Var, j10, context, o2Var, i10, peer)), 0));
            try {
                c2Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void w(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, q80 q80Var) {
        int i11;
        n80 n80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                rr rrVar = new rr(o2Var, arrayList, j10, q80Var);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(rrVar);
                    return;
                } else {
                    rrVar.show();
                    return;
                }
            }
            return;
        }
        ?? h3Var = new org.telegram.ui.ActionBar.h3(context, false);
        h3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        h3Var.f30416r = arrayList2;
        h3Var.H = q80Var;
        h3Var.f30418w = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        h3Var.f30412b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) h3Var.f30416r.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        h3Var.f30420y = peer2;
                        h3Var.f30419x = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) h3Var.f30416r.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        h3Var.f30420y = peer3;
                        h3Var.f30419x = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                h3Var.f30419x = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = h3Var.f30412b;
            i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            h3Var.f30413c = true;
            h3Var.d = x02;
            h3Var.f30419x = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        h3Var.fixNavigationBar(i11);
        if (h3Var.f30418w == 0) {
            ?? m80Var = new m80(h3Var, context);
            m80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(m80Var);
            h3Var.setCustomView(nestedScrollView);
            n80Var = m80Var;
        } else {
            n80 n80Var2 = new n80(h3Var, context);
            h3Var.containerView = n80Var2;
            n80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = h3Var.containerView;
            int i17 = h3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            n80Var = n80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(h3Var.currentAccount).getChat(Long.valueOf(-j10));
        o80 o80Var = new o80(h3Var, context);
        h3Var.f30414f = o80Var;
        h3Var.getContext();
        if (h3Var.f30418w == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        o80Var.setLayoutManager(new s4.b0(i12, false));
        o80Var.setAdapter(new r80(h3Var, context));
        o80Var.setVerticalScrollBarEnabled(false);
        o80Var.setClipToPadding(false);
        o80Var.setEnabled(true);
        o80Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.r6.m(o80Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        o80Var.setOnScrollListener(new p80(h3Var));
        o80Var.setOnItemClickListener(new ci.x4(11, h3Var, chat));
        if (i10 != 0) {
            n80Var.addView(o80Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            o80Var.setSelectorDrawableColor(0);
            o80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            n80Var.addView(imageView, w7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        h3Var.h = textView;
        org.telegram.messenger.sl.k(20.0f, 1, textView);
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21376ng, null);
        } else {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            n80Var.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            n80Var.addView(textView, w7.z5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(h3Var.getContext());
        h3Var.f30415n = textView2;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21394og, null);
        } else {
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21439r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = h3Var.f30416r.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) h3Var.f30416r.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(h3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        h3Var.f30415n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.r6.I(h3Var.f30415n, org.telegram.ui.ActionBar.k6.f21309k5, null);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (h3Var.f30416r.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                h3Var.f30414f.setVisibility(8);
            }
            h3Var.f30415n.setText(sb2);
            h3Var.f30415n.setGravity(49);
            n80Var.addView(h3Var.f30415n, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                h3Var.f30415n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                h3Var.f30415n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = h3Var.f30415n;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            n80Var.addView(h3Var.f30415n, w7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            o80 o80Var2 = h3Var.f30414f;
            if (h3Var.f30416r.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            n80Var.addView(o80Var2, w7.z5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        t00 t00Var = new t00(h3Var, context, false);
        h3Var.e = t00Var;
        ((View) t00Var.f30588c).setOnClickListener(new ca(20, h3Var, q80Var));
        if (h3Var.f30418w == 0) {
            n80Var.addView(t00Var, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            t00 t00Var2 = new t00(h3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                t00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) t00Var2.f30588c).setOnClickListener(new f0((Object) h3Var, 28));
            n80Var.addView(t00Var2, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            n80Var.addView(t00Var, w7.z5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
            q80 q80Var = this.H;
            boolean z10 = true;
            if (this.f30416r.size() <= 1) {
                z10 = false;
            }
            q80Var.a(inputPeer, z10, this.F, false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        Drawable drawable;
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false);
            if (this.f30413c && (drawable = this.f30412b) != null && x02 != this.d) {
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
        t00 t00Var = this.e;
        if (this.f30418w == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                t00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.f30419x);
        if (DialogObject.isUserDialog(peerId)) {
            t00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        t00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
