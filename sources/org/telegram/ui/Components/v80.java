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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class v80 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public t80 F;
    public Drawable f29596b;
    public x00 f29597c;
    public r80 d;
    public TextView e;
    public TextView f29598f;
    public ArrayList h;
    public boolean f29599n;
    public int f29600r;
    public int f29601s;
    public TLRPC.Peer v;
    public TLRPC.Peer f29602w;
    public TLRPC.InputPeer f29603x;
    public boolean f29604y;

    public static void n(v80 v80Var, t80 t80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(v80Var.currentAccount).getInputPeer(MessageObject.getPeerId(v80Var.v));
        if (v80Var.f29601s == 2) {
            if (v80Var.v != v80Var.f29602w) {
                boolean z10 = true;
                if (v80Var.h.size() <= 1) {
                    z10 = false;
                }
                t80Var.a(inputPeer, z10, false, false);
            }
        } else {
            v80Var.f29603x = inputPeer;
        }
        v80Var.dismiss();
    }

    public static void o(v80 v80Var) {
        v80Var.f29603x = MessagesController.getInstance(v80Var.currentAccount).getInputPeer(MessageObject.getPeerId(v80Var.v));
        v80Var.f29604y = true;
        v80Var.dismiss();
    }

    public static void q(v80 v80Var) {
        r80 r80Var = v80Var.d;
        if (v80Var.f29601s != 0) {
            if (r80Var.getChildCount() <= 0) {
                int paddingTop = r80Var.getPaddingTop();
                v80Var.f29600r = paddingTop;
                r80Var.setTopGlowOffset(paddingTop);
                v80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = r80Var.getChildAt(0);
            wl0 wl0Var = (wl0) r80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
                i10 = top;
            }
            if (v80Var.f29600r != i10) {
                v80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                v80Var.f29598f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                v80Var.f29600r = i10;
                r80Var.setTopGlowOffset(i10);
                v80Var.containerView.invalidate();
            }
        }
    }

    public static void v(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j10 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            boolean z10 = true;
            if (G.size() != 1) {
                z10 = false;
            }
            booleanCallback.run(z10);
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        a2Var.setOnCancelListener(new n80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new o80(a2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            a2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, t80 t80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j10 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    t80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    x(context, j10, G, m2Var, i10, peer, t80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            a2Var.setOnCancelListener(new n80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new m80(a2Var, accountInstance, t80Var, j10, context, m2Var, i10, peer)), 0));
            try {
                a2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, t80 t80Var) {
        int i11;
        q80 q80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                ur urVar = new ur(m2Var, arrayList, j10, t80Var);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(urVar);
                    return;
                } else {
                    urVar.show();
                    return;
                }
            }
            return;
        }
        ?? e3Var = new org.telegram.ui.ActionBar.e3(context, false);
        e3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        e3Var.h = arrayList2;
        e3Var.F = t80Var;
        e3Var.f29601s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        e3Var.f29596b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) e3Var.h.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        e3Var.f29602w = peer2;
                        e3Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) e3Var.h.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        e3Var.f29602w = peer3;
                        e3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = e3Var.f29596b;
            i11 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        e3Var.fixNavigationBar(i11);
        if (e3Var.f29601s == 0) {
            ?? p80Var = new p80(e3Var, context);
            p80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(p80Var);
            e3Var.setCustomView(nestedScrollView);
            q80Var = p80Var;
        } else {
            q80 q80Var2 = new q80(e3Var, context);
            e3Var.containerView = q80Var2;
            q80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = e3Var.containerView;
            int i17 = e3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            q80Var = q80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(e3Var.currentAccount).getChat(Long.valueOf(-j10));
        r80 r80Var = new r80(e3Var, context);
        e3Var.d = r80Var;
        e3Var.getContext();
        if (e3Var.f29601s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        r80Var.setLayoutManager(new s4.b0(i12, false));
        r80Var.setAdapter(new u80(e3Var, context));
        r80Var.setVerticalScrollBarEnabled(false);
        r80Var.setClipToPadding(false);
        r80Var.setEnabled(true);
        r80Var.setSelectorDrawableColor(0);
        r80Var.setGlowColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A5, false));
        r80Var.setOnScrollListener(new s80(e3Var));
        r80Var.setOnItemClickListener(new bi.z5(11, e3Var, chat));
        if (i10 != 0) {
            q80Var.addView(r80Var, w7.z5.a(-1.0f, 0.0f, 100.0f, 0.0f, 80.0f, -1, 51));
        } else {
            r80Var.setSelectorDrawableColor(0);
            r80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            q80Var.addView(imageView, w7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        e3Var.e = textView;
        org.telegram.messenger.sk.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19794ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            q80Var.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            q80Var.addView(textView, w7.z5.a(-2.0f, 23.0f, 8.0f, 23.0f, 0.0f, -2, 51));
        }
        TextView textView2 = new TextView(e3Var.getContext());
        e3Var.f29598f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19812og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19857r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = e3Var.h.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) e3Var.h.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(e3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        e3Var.f29598f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        e3Var.f29598f.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19727k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (e3Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                e3Var.d.setVisibility(8);
            }
            e3Var.f29598f.setText(sb2);
            e3Var.f29598f.setGravity(49);
            q80Var.addView(e3Var.f29598f, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                e3Var.f29598f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                e3Var.f29598f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = e3Var.f29598f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            q80Var.addView(e3Var.f29598f, w7.z5.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            r80 r80Var2 = e3Var.d;
            if (e3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            q80Var.addView(r80Var2, w7.z5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        x00 x00Var = new x00(e3Var, context, false);
        e3Var.f29597c = x00Var;
        ((View) x00Var.f30789c).setOnClickListener(new rt(9, e3Var, t80Var));
        if (e3Var.f29601s == 0) {
            q80Var.addView(x00Var, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            x00 x00Var2 = new x00(e3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                x00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                x00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) x00Var2.f30789c).setOnClickListener(new f0((Object) e3Var, 28));
            q80Var.addView(x00Var2, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            q80Var.addView(x00Var, w7.z5.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        }
        e3Var.y(chat, false);
        if (m2Var != 0) {
            if (m2Var.getParentActivity() != null) {
                m2Var.showDialog(e3Var);
                return;
            }
            return;
        }
        e3Var.show();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f29603x;
        if (inputPeer != null) {
            t80 t80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            t80Var.a(inputPeer, z10, this.f29604y, false);
        }
    }

    public final void y(TLRPC.Chat chat, boolean z10) {
        String str;
        x00 x00Var = this.f29597c;
        if (this.f29601s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                x00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                x00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            x00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        x00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
