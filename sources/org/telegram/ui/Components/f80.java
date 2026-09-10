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
public final class f80 extends org.telegram.ui.ActionBar.h3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public d80 F;
    public Drawable f22926b;
    public s00 f22927c;
    public b80 d;
    public TextView e;
    public TextView f22928f;
    public ArrayList h;
    public boolean f22929n;
    public int f22930r;
    public int f22931s;
    public TLRPC.Peer v;
    public TLRPC.Peer f22932w;
    public TLRPC.InputPeer f22933x;
    public boolean f22934y;

    public static void m(f80 f80Var, d80 d80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(f80Var.currentAccount).getInputPeer(MessageObject.getPeerId(f80Var.v));
        if (f80Var.f22931s == 2) {
            if (f80Var.v != f80Var.f22932w) {
                boolean z10 = true;
                if (f80Var.h.size() <= 1) {
                    z10 = false;
                }
                d80Var.a(inputPeer, z10, false, false);
            }
        } else {
            f80Var.f22933x = inputPeer;
        }
        f80Var.dismiss();
    }

    public static void n(f80 f80Var) {
        f80Var.f22933x = MessagesController.getInstance(f80Var.currentAccount).getInputPeer(MessageObject.getPeerId(f80Var.v));
        f80Var.f22934y = true;
        f80Var.dismiss();
    }

    public static void o(f80 f80Var) {
        b80 b80Var = f80Var.d;
        if (f80Var.f22931s != 0) {
            if (b80Var.getChildCount() <= 0) {
                int paddingTop = b80Var.getPaddingTop();
                f80Var.f22930r = paddingTop;
                b80Var.setTopGlowOffset(paddingTop);
                f80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = b80Var.getChildAt(0);
            fl0 fl0Var = (fl0) b80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
                i10 = top;
            }
            if (f80Var.f22930r != i10) {
                f80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                f80Var.f22928f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                f80Var.f22930r = i10;
                b80Var.setTopGlowOffset(i10);
                f80Var.containerView.invalidate();
            }
        }
    }

    public static void t(Activity activity, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            boolean z10 = true;
            if (G.size() != 1) {
                z10 = false;
            }
            booleanCallback.run(z10);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        d2Var.setOnCancelListener(new y70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.qa(d2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            d2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, d80 d80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    d80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j3, G, p2Var, i10, peer, d80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            d2Var.setOnCancelListener(new y70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new x70(d2Var, accountInstance, d80Var, j3, context, p2Var, i10, peer)), 0));
            try {
                d2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, d80 d80Var) {
        int i11;
        a80 a80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                mr mrVar = new mr(p2Var, arrayList, j3, d80Var);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(mrVar);
                    return;
                } else {
                    mrVar.show();
                    return;
                }
            }
            return;
        }
        ?? h3Var = new org.telegram.ui.ActionBar.h3(context, false);
        h3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        h3Var.h = arrayList2;
        h3Var.F = d80Var;
        h3Var.f22931s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        h3Var.f22926b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) h3Var.h.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        h3Var.f22932w = peer2;
                        h3Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) h3Var.h.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        h3Var.f22932w = peer3;
                        h3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                h3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = h3Var.f22926b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17972fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            h3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        h3Var.fixNavigationBar(i11);
        if (h3Var.f22931s == 0) {
            ?? z70Var = new z70(h3Var, context);
            z70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(z70Var);
            h3Var.setCustomView(nestedScrollView);
            a80Var = z70Var;
        } else {
            a80 a80Var2 = new a80(h3Var, context);
            h3Var.containerView = a80Var2;
            a80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = h3Var.containerView;
            int i17 = h3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            a80Var = a80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(h3Var.currentAccount).getChat(Long.valueOf(-j3));
        b80 b80Var = new b80(h3Var, context);
        h3Var.d = b80Var;
        h3Var.getContext();
        if (h3Var.f22931s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        b80Var.setLayoutManager(new s4.c0(i12, false));
        b80Var.setAdapter(new e80(h3Var, context));
        b80Var.setVerticalScrollBarEnabled(false);
        b80Var.setClipToPadding(false);
        b80Var.setEnabled(true);
        b80Var.setSelectorDrawableColor(0);
        b80Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        b80Var.setOnScrollListener(new c80(h3Var));
        b80Var.setOnItemClickListener(new ai.b0(10, h3Var, chat));
        if (i10 != 0) {
            a80Var.addView(b80Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            b80Var.setSelectorDrawableColor(0);
            b80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            a80Var.addView(imageView, w7.a6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        h3Var.e = textView;
        org.telegram.messenger.em.j(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18117ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            a80Var.addView(textView, w7.a6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            a80Var.addView(textView, w7.a6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(h3Var.getContext());
        h3Var.f22928f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18135og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18179r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = h3Var.h.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) h3Var.h.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(h3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        h3Var.f22928f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        h3Var.f22928f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18054k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (h3Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                h3Var.d.setVisibility(8);
            }
            h3Var.f22928f.setText(sb2);
            h3Var.f22928f.setGravity(49);
            a80Var.addView(h3Var.f22928f, w7.a6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                h3Var.f22928f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                h3Var.f22928f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = h3Var.f22928f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            a80Var.addView(h3Var.f22928f, w7.a6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            b80 b80Var2 = h3Var.d;
            if (h3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            a80Var.addView(b80Var2, w7.a6.t(i14, 95, 49, 0, 6, 0, 0));
        }
        s00 s00Var = new s00(h3Var, context, false);
        h3Var.f22927c = s00Var;
        ((View) s00Var.f26890c).setOnClickListener(new u10(6, h3Var, d80Var));
        if (h3Var.f22931s == 0) {
            a80Var.addView(s00Var, w7.a6.t(-1, 50, 51, 0, 0, 0, 0));
            s00 s00Var2 = new s00(h3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                s00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                s00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) s00Var2.f26890c).setOnClickListener(new h0((Object) h3Var, 29));
            a80Var.addView(s00Var2, w7.a6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            a80Var.addView(s00Var, w7.a6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        h3Var.w(chat, false);
        if (p2Var != 0) {
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(h3Var);
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
        TLRPC.InputPeer inputPeer = this.f22933x;
        if (inputPeer != null) {
            d80 d80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            d80Var.a(inputPeer, z10, this.f22934y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        s00 s00Var = this.f22927c;
        if (this.f22931s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                s00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                s00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            s00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        s00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
