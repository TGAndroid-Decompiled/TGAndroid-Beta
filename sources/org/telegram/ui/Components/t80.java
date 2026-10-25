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
public final class t80 extends org.telegram.ui.ActionBar.k3 {
    public static ArrayList I;
    public static long J;
    public static long K;
    public static int L;
    public TLRPC.InputPeer E;
    public boolean F;
    public boolean G;
    public r80 H;
    public Drawable f32903b;
    public boolean f32904c;
    public int d;
    public t00 e;
    public p80 f32905f;
    public TextView h;
    public TextView f32906n;
    public ArrayList f32907r;
    public boolean f32908s;
    public int v;
    public int f32909w;
    public TLRPC.Peer f32910x;
    public TLRPC.Peer f32911y;

    public static void m(t80 t80Var, r80 r80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(t80Var.currentAccount).getInputPeer(MessageObject.getPeerId(t80Var.f32910x));
        if (t80Var.f32909w == 2) {
            if (t80Var.f32910x != t80Var.f32911y) {
                boolean z10 = true;
                if (t80Var.f32907r.size() <= 1) {
                    z10 = false;
                }
                r80Var.a(inputPeer, z10, false, false);
            }
        } else {
            t80Var.E = inputPeer;
        }
        t80Var.dismiss();
    }

    public static void n(t80 t80Var) {
        t80Var.E = MessagesController.getInstance(t80Var.currentAccount).getInputPeer(MessageObject.getPeerId(t80Var.f32910x));
        t80Var.F = true;
        t80Var.dismiss();
    }

    public static void o(t80 t80Var) {
        p80 p80Var = t80Var.f32905f;
        if (t80Var.f32909w != 0) {
            if (p80Var.getChildCount() <= 0) {
                int paddingTop = p80Var.getPaddingTop();
                t80Var.v = paddingTop;
                p80Var.setTopGlowOffset(paddingTop);
                t80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = p80Var.getChildAt(0);
            vl0 vl0Var = (vl0) p80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
                i10 = top;
            }
            if (t80Var.v != i10) {
                t80Var.h.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                t80Var.f32906n.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                t80Var.v = i10;
                p80Var.setTopGlowOffset(i10);
                t80Var.containerView.invalidate();
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
        e2Var.setOnCancelListener(new m80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new bi.e0(e2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            e2Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer, r80 r80Var) {
        if (context != null) {
            if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 300000) {
                if (I.size() == 1 && i10 != 0) {
                    r80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) I.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j10, I, r2Var, i10, peer, r80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            e2Var.setOnCancelListener(new m80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new l80(e2Var, accountInstance, r80Var, j10, context, r2Var, i10, peer)), 0));
            try {
                e2Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer, r80 r80Var) {
        int i11;
        o80 o80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                tr trVar = new tr(r2Var, arrayList, j10, r80Var);
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
        k3Var.f32907r = arrayList2;
        k3Var.H = r80Var;
        k3Var.f32909w = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        k3Var.f32903b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) k3Var.f32907r.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        k3Var.f32911y = peer2;
                        k3Var.f32910x = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) k3Var.f32907r.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        k3Var.f32911y = peer3;
                        k3Var.f32910x = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                k3Var.f32910x = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = k3Var.f32903b;
            i11 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23400fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            k3Var.f32904c = true;
            k3Var.d = x02;
            k3Var.f32910x = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        k3Var.fixNavigationBar(i11);
        if (k3Var.f32909w == 0) {
            ?? n80Var = new n80(k3Var, context);
            n80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(n80Var);
            k3Var.setCustomView(nestedScrollView);
            o80Var = n80Var;
        } else {
            o80 o80Var2 = new o80(k3Var, context);
            k3Var.containerView = o80Var2;
            o80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = k3Var.containerView;
            int i17 = k3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            o80Var = o80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(k3Var.currentAccount).getChat(Long.valueOf(-j10));
        p80 p80Var = new p80(k3Var, context);
        k3Var.f32905f = p80Var;
        k3Var.getContext();
        if (k3Var.f32909w == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        p80Var.setLayoutManager(new s4.c0(i12, false));
        p80Var.setAdapter(new s80(k3Var, context));
        p80Var.setVerticalScrollBarEnabled(false);
        p80Var.setClipToPadding(false);
        p80Var.setEnabled(true);
        p80Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.f7.m(p80Var, 21, org.telegram.ui.ActionBar.y6.A5, null);
        p80Var.setOnScrollListener(new q80(k3Var));
        p80Var.setOnItemClickListener(new di.x4(11, k3Var, chat));
        if (i10 != 0) {
            o80Var.addView(p80Var, gb1.h(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            p80Var.setSelectorDrawableColor(0);
            p80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            o80Var.addView(imageView, gb1.x(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        k3Var.h = textView;
        org.telegram.messenger.vh.j(20.0f, 1, textView);
        if (i10 == 2) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23548ng, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            o80Var.addView(textView, gb1.x(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            o80Var.addView(textView, gb1.h(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(k3Var.getContext());
        k3Var.f32906n = textView2;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23568og, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23612r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = k3Var.f32907r.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) k3Var.f32907r.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(k3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        k3Var.f32906n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.f7.H(k3Var.f32906n, org.telegram.ui.ActionBar.y6.f23481k5, null);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (k3Var.f32907r.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                k3Var.f32905f.setVisibility(8);
            }
            k3Var.f32906n.setText(sb2);
            k3Var.f32906n.setGravity(49);
            o80Var.addView(k3Var.f32906n, gb1.x(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                k3Var.f32906n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                k3Var.f32906n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = k3Var.f32906n;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            o80Var.addView(k3Var.f32906n, gb1.h(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            p80 p80Var2 = k3Var.f32905f;
            if (k3Var.f32907r.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            o80Var.addView(p80Var2, gb1.x(i14, 95, 49, 0, 6, 0, 0));
        }
        t00 t00Var = new t00(k3Var, context, false);
        k3Var.e = t00Var;
        ((View) t00Var.f32804c).setOnClickListener(new ga(21, k3Var, r80Var));
        if (k3Var.f32909w == 0) {
            o80Var.addView(t00Var, gb1.x(-1, 50, 51, 0, 0, 0, 0));
            t00 t00Var2 = new t00(k3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                t00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) t00Var2.f32804c).setOnClickListener(new f0((Object) k3Var, 28));
            o80Var.addView(t00Var2, gb1.x(-1, 50, 51, 0, 0, 0, 0));
        } else {
            o80Var.addView(t00Var, gb1.h(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
            r80 r80Var = this.H;
            boolean z10 = true;
            if (this.f32907r.size() <= 1) {
                z10 = false;
            }
            r80Var.a(inputPeer, z10, this.F, false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        Drawable drawable;
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false);
            if (this.f32904c && (drawable = this.f32903b) != null && x02 != this.d) {
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
        if (this.f32909w == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                t00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.f32910x);
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
