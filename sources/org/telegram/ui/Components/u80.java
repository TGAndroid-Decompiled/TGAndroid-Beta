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
public final class u80 extends org.telegram.ui.ActionBar.k3 {
    public static ArrayList I;
    public static long J;
    public static long K;
    public static int L;
    public TLRPC.InputPeer E;
    public boolean F;
    public boolean G;
    public s80 H;
    public Drawable f33282b;
    public boolean f33283c;
    public int d;
    public t00 e;
    public q80 f33284f;
    public TextView h;
    public TextView f33285n;
    public ArrayList f33286r;
    public boolean f33287s;
    public int v;
    public int f33288w;
    public TLRPC.Peer f33289x;
    public TLRPC.Peer f33290y;

    public static void m(u80 u80Var, s80 s80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(u80Var.currentAccount).getInputPeer(MessageObject.getPeerId(u80Var.f33289x));
        if (u80Var.f33288w == 2) {
            if (u80Var.f33289x != u80Var.f33290y) {
                boolean z10 = true;
                if (u80Var.f33286r.size() <= 1) {
                    z10 = false;
                }
                s80Var.a(inputPeer, z10, false, false);
            }
        } else {
            u80Var.E = inputPeer;
        }
        u80Var.dismiss();
    }

    public static void n(u80 u80Var) {
        u80Var.E = MessagesController.getInstance(u80Var.currentAccount).getInputPeer(MessageObject.getPeerId(u80Var.f33289x));
        u80Var.F = true;
        u80Var.dismiss();
    }

    public static void o(u80 u80Var) {
        q80 q80Var = u80Var.f33284f;
        if (u80Var.f33288w != 0) {
            if (q80Var.getChildCount() <= 0) {
                int paddingTop = q80Var.getPaddingTop();
                u80Var.v = paddingTop;
                q80Var.setTopGlowOffset(paddingTop);
                u80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = q80Var.getChildAt(0);
            wl0 wl0Var = (wl0) q80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
                i10 = top;
            }
            if (u80Var.v != i10) {
                u80Var.h.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                u80Var.f33285n.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                u80Var.v = i10;
                q80Var.setTopGlowOffset(i10);
                u80Var.containerView.invalidate();
            }
        }
    }

    public static void t(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 240000) {
            boolean z10 = true;
            if (I.size() != 1) {
                z10 = false;
            }
            booleanCallback.run(z10);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        e2Var.setOnCancelListener(new n80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new bi.e0(e2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            e2Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer, s80 s80Var) {
        if (context != null) {
            if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 300000) {
                if (I.size() == 1 && i10 != 0) {
                    s80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) I.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j10, I, r2Var, i10, peer, s80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            e2Var.setOnCancelListener(new n80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new m80(e2Var, accountInstance, s80Var, j10, context, r2Var, i10, peer)), 0));
            try {
                e2Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer, s80 s80Var) {
        int i11;
        p80 p80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                tr trVar = new tr(r2Var, arrayList, j10, s80Var);
                if (r2Var.getParentActivity() != null) {
                    r2Var.showDialog(trVar);
                    return;
                } else {
                    trVar.show();
                    return;
                }
            }
            return;
        }
        ?? k3Var = new org.telegram.ui.ActionBar.k3(context, false);
        k3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        k3Var.f33286r = arrayList2;
        k3Var.H = s80Var;
        k3Var.f33288w = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        k3Var.f33282b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) k3Var.f33286r.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        k3Var.f33290y = peer2;
                        k3Var.f33289x = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) k3Var.f33286r.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        k3Var.f33290y = peer3;
                        k3Var.f33289x = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                k3Var.f33289x = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = k3Var.f33282b;
            i11 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23403fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            k3Var.f33283c = true;
            k3Var.d = x02;
            k3Var.f33289x = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        k3Var.fixNavigationBar(i11);
        if (k3Var.f33288w == 0) {
            ?? o80Var = new o80(k3Var, context);
            o80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(o80Var);
            k3Var.setCustomView(nestedScrollView);
            p80Var = o80Var;
        } else {
            p80 p80Var2 = new p80(k3Var, context);
            k3Var.containerView = p80Var2;
            p80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = k3Var.containerView;
            int i17 = k3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            p80Var = p80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(k3Var.currentAccount).getChat(Long.valueOf(-j10));
        q80 q80Var = new q80(k3Var, context);
        k3Var.f33284f = q80Var;
        k3Var.getContext();
        if (k3Var.f33288w == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        q80Var.setLayoutManager(new s4.c0(i12, false));
        q80Var.setAdapter(new t80(k3Var, context));
        q80Var.setVerticalScrollBarEnabled(false);
        q80Var.setClipToPadding(false);
        q80Var.setEnabled(true);
        q80Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.f7.m(q80Var, 21, org.telegram.ui.ActionBar.y6.A5, null);
        q80Var.setOnScrollListener(new r80(k3Var));
        q80Var.setOnItemClickListener(new di.x4(11, k3Var, chat));
        if (i10 != 0) {
            p80Var.addView(q80Var, kb1.h(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            q80Var.setSelectorDrawableColor(0);
            q80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            p80Var.addView(imageView, kb1.x(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        k3Var.h = textView;
        org.telegram.messenger.wh.j(20.0f, 1, textView);
        if (i10 == 2) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23551ng, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            p80Var.addView(textView, kb1.x(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            p80Var.addView(textView, kb1.h(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(k3Var.getContext());
        k3Var.f33285n = textView2;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23571og, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23615r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = k3Var.f33286r.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) k3Var.f33286r.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(k3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        k3Var.f33285n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.f7.H(k3Var.f33285n, org.telegram.ui.ActionBar.y6.f23484k5, null);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (k3Var.f33286r.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                k3Var.f33284f.setVisibility(8);
            }
            k3Var.f33285n.setText(sb2);
            k3Var.f33285n.setGravity(49);
            p80Var.addView(k3Var.f33285n, kb1.x(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                k3Var.f33285n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                k3Var.f33285n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = k3Var.f33285n;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            p80Var.addView(k3Var.f33285n, kb1.h(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            q80 q80Var2 = k3Var.f33284f;
            if (k3Var.f33286r.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            p80Var.addView(q80Var2, kb1.x(i14, 95, 49, 0, 6, 0, 0));
        }
        t00 t00Var = new t00(k3Var, context, false);
        k3Var.e = t00Var;
        ((View) t00Var.f32797c).setOnClickListener(new ga(21, k3Var, s80Var));
        if (k3Var.f33288w == 0) {
            p80Var.addView(t00Var, kb1.x(-1, 50, 51, 0, 0, 0, 0));
            t00 t00Var2 = new t00(k3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                t00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) t00Var2.f32797c).setOnClickListener(new f0((Object) k3Var, 28));
            p80Var.addView(t00Var2, kb1.x(-1, 50, 51, 0, 0, 0, 0));
        } else {
            p80Var.addView(t00Var, kb1.h(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        k3Var.w(chat, false);
        if (r2Var != 0) {
            if (r2Var.getParentActivity() != null) {
                r2Var.showDialog(k3Var);
                return;
            }
            return;
        }
        k3Var.show();
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
            s80 s80Var = this.H;
            boolean z10 = true;
            if (this.f33286r.size() <= 1) {
                z10 = false;
            }
            s80Var.a(inputPeer, z10, this.F, false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        Drawable drawable;
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
            if (this.f33283c && (drawable = this.f33282b) != null && x02 != this.d) {
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

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        t00 t00Var = this.e;
        if (this.f33288w == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                t00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.f33289x);
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
