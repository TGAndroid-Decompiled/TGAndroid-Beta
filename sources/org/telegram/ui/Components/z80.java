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
public final class z80 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public x80 F;
    public Drawable f33521b;
    public c10 f33522c;
    public v80 d;
    public TextView f33523e;
    public TextView f33524f;
    public ArrayList h;
    public boolean f33525n;
    public int f33526r;
    public int f33527s;
    public TLRPC.Peer v;
    public TLRPC.Peer f33528w;
    public TLRPC.InputPeer f33529x;
    public boolean f33530y;

    public static void o(z80 z80Var, x80 x80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(z80Var.currentAccount).getInputPeer(MessageObject.getPeerId(z80Var.v));
        if (z80Var.f33527s == 2) {
            if (z80Var.v != z80Var.f33528w) {
                boolean z10 = true;
                if (z80Var.h.size() <= 1) {
                    z10 = false;
                }
                x80Var.a(inputPeer, z10, false, false);
            }
        } else {
            z80Var.f33529x = inputPeer;
        }
        z80Var.dismiss();
    }

    public static void p(z80 z80Var) {
        z80Var.f33529x = MessagesController.getInstance(z80Var.currentAccount).getInputPeer(MessageObject.getPeerId(z80Var.v));
        z80Var.f33530y = true;
        z80Var.dismiss();
    }

    public static void q(z80 z80Var) {
        v80 v80Var = z80Var.d;
        if (z80Var.f33527s != 0) {
            if (v80Var.getChildCount() <= 0) {
                int paddingTop = v80Var.getPaddingTop();
                z80Var.f33526r = paddingTop;
                v80Var.setTopGlowOffset(paddingTop);
                z80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = v80Var.getChildAt(0);
            bm0 bm0Var = (bm0) v80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && bm0Var != null && bm0Var.b() == 0) {
                i10 = top;
            }
            if (z80Var.f33526r != i10) {
                z80Var.f33523e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                z80Var.f33524f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                z80Var.f33526r = i10;
                v80Var.setTopGlowOffset(i10);
                z80Var.containerView.invalidate();
            }
        }
    }

    public static void v(Activity activity, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            boolean z10 = true;
            if (G.size() != 1) {
                z10 = false;
            }
            booleanCallback.run(z10);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        b2Var.setOnCancelListener(new s80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ma(b2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, x80 x80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    x80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    x(context, j3, G, n2Var, i10, peer, x80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            b2Var.setOnCancelListener(new s80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new r80(b2Var, accountInstance, x80Var, j3, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, x80 x80Var) {
        int i11;
        u80 u80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                xr xrVar = new xr(n2Var, arrayList, j3, x80Var);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(xrVar);
                    return;
                } else {
                    xrVar.show();
                    return;
                }
            }
            return;
        }
        ?? f3Var = new org.telegram.ui.ActionBar.f3(context, false);
        f3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        f3Var.h = arrayList2;
        f3Var.F = x80Var;
        f3Var.f33527s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        f3Var.f33521b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) f3Var.h.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        f3Var.f33528w = peer2;
                        f3Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) f3Var.h.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        f3Var.f33528w = peer3;
                        f3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = f3Var.f33521b;
            i11 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20847fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        f3Var.fixNavigationBar(i11);
        if (f3Var.f33527s == 0) {
            ?? t80Var = new t80(f3Var, context);
            t80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(t80Var);
            f3Var.setCustomView(nestedScrollView);
            u80Var = t80Var;
        } else {
            u80 u80Var2 = new u80(f3Var, context);
            f3Var.containerView = u80Var2;
            u80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = f3Var.containerView;
            int i17 = f3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            u80Var = u80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-j3));
        v80 v80Var = new v80(f3Var, context);
        f3Var.d = v80Var;
        f3Var.getContext();
        if (f3Var.f33527s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        v80Var.setLayoutManager(new s4.d0(i12, false));
        v80Var.setAdapter(new y80(f3Var, context));
        v80Var.setVerticalScrollBarEnabled(false);
        v80Var.setClipToPadding(false);
        v80Var.setEnabled(true);
        v80Var.setSelectorDrawableColor(0);
        v80Var.setGlowColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A5, false));
        v80Var.setOnScrollListener(new w80(f3Var));
        v80Var.setOnItemClickListener(new ai.o6(11, f3Var, chat));
        if (i10 != 0) {
            u80Var.addView(v80Var, w7.x5.a(-1.0f, 0.0f, 100.0f, 0.0f, 80.0f, -1, 51));
        } else {
            v80Var.setSelectorDrawableColor(0);
            v80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            u80Var.addView(imageView, w7.x5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        f3Var.f33523e = textView;
        org.telegram.messenger.bi.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20994ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            u80Var.addView(textView, w7.x5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            u80Var.addView(textView, w7.x5.a(-2.0f, 23.0f, 8.0f, 23.0f, 0.0f, -2, 51));
        }
        TextView textView2 = new TextView(f3Var.getContext());
        f3Var.f33524f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21012og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21058r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = f3Var.h.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) f3Var.h.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        f3Var.f33524f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f3Var.f33524f.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20928k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (f3Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                f3Var.d.setVisibility(8);
            }
            f3Var.f33524f.setText(sb2);
            f3Var.f33524f.setGravity(49);
            u80Var.addView(f3Var.f33524f, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                f3Var.f33524f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                f3Var.f33524f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = f3Var.f33524f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            u80Var.addView(f3Var.f33524f, w7.x5.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            v80 v80Var2 = f3Var.d;
            if (f3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            u80Var.addView(v80Var2, w7.x5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        c10 c10Var = new c10(f3Var, context, false);
        f3Var.f33522c = c10Var;
        ((View) c10Var.f25128c).setOnClickListener(new vt(9, f3Var, x80Var));
        if (f3Var.f33527s == 0) {
            u80Var.addView(c10Var, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
            c10 c10Var2 = new c10(f3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                c10Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                c10Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) c10Var2.f25128c).setOnClickListener(new f0((Object) f3Var, 28));
            u80Var.addView(c10Var2, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            u80Var.addView(c10Var, w7.x5.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        }
        f3Var.y(chat, false);
        if (n2Var != 0) {
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(f3Var);
                return;
            }
            return;
        }
        f3Var.show();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f33529x;
        if (inputPeer != null) {
            x80 x80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            x80Var.a(inputPeer, z10, this.f33530y, false);
        }
    }

    public final void y(TLRPC.Chat chat, boolean z10) {
        String str;
        c10 c10Var = this.f33522c;
        if (this.f33527s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                c10Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                c10Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            c10Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        c10Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
