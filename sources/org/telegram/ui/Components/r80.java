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
public final class r80 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public p80 F;
    public Drawable f29868b;
    public t00 f29869c;
    public n80 d;
    public TextView e;
    public TextView f29870f;
    public ArrayList h;
    public boolean f29871n;
    public int f29872r;
    public int f29873s;
    public TLRPC.Peer v;
    public TLRPC.Peer f29874w;
    public TLRPC.InputPeer f29875x;
    public boolean f29876y;

    public static void n(r80 r80Var, p80 p80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(r80Var.currentAccount).getInputPeer(MessageObject.getPeerId(r80Var.v));
        if (r80Var.f29873s == 2) {
            if (r80Var.v != r80Var.f29874w) {
                boolean z10 = true;
                if (r80Var.h.size() <= 1) {
                    z10 = false;
                }
                p80Var.a(inputPeer, z10, false, false);
            }
        } else {
            r80Var.f29875x = inputPeer;
        }
        r80Var.dismiss();
    }

    public static void o(r80 r80Var) {
        r80Var.f29875x = MessagesController.getInstance(r80Var.currentAccount).getInputPeer(MessageObject.getPeerId(r80Var.v));
        r80Var.f29876y = true;
        r80Var.dismiss();
    }

    public static void p(r80 r80Var) {
        n80 n80Var = r80Var.d;
        if (r80Var.f29873s != 0) {
            if (n80Var.getChildCount() <= 0) {
                int paddingTop = n80Var.getPaddingTop();
                r80Var.f29872r = paddingTop;
                n80Var.setTopGlowOffset(paddingTop);
                r80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = n80Var.getChildAt(0);
            tl0 tl0Var = (tl0) n80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && tl0Var != null && tl0Var.b() == 0) {
                i10 = top;
            }
            if (r80Var.f29872r != i10) {
                r80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                r80Var.f29870f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                r80Var.f29872r = i10;
                n80Var.setTopGlowOffset(i10);
                r80Var.containerView.invalidate();
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
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        b2Var.setOnCancelListener(new k80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new ai.d0(b2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            b2Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, p80 p80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j10 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    p80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    x(context, j10, G, n2Var, i10, peer, p80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            b2Var.setOnCancelListener(new k80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new j80(b2Var, accountInstance, p80Var, j10, context, n2Var, i10, peer)), 0));
            try {
                b2Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, p80 p80Var) {
        int i11;
        m80 m80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                rr rrVar = new rr(n2Var, arrayList, j10, p80Var);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(rrVar);
                    return;
                } else {
                    rrVar.show();
                    return;
                }
            }
            return;
        }
        ?? f3Var = new org.telegram.ui.ActionBar.f3(context, false);
        f3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        f3Var.h = arrayList2;
        f3Var.F = p80Var;
        f3Var.f29873s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        f3Var.f29868b = mutate;
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
                        f3Var.f29874w = peer2;
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
                        f3Var.f29874w = peer3;
                        f3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = f3Var.f29868b;
            i11 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        f3Var.fixNavigationBar(i11);
        if (f3Var.f29873s == 0) {
            ?? l80Var = new l80(f3Var, context);
            l80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(l80Var);
            f3Var.setCustomView(nestedScrollView);
            m80Var = l80Var;
        } else {
            m80 m80Var2 = new m80(f3Var, context);
            f3Var.containerView = m80Var2;
            m80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = f3Var.containerView;
            int i17 = f3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            m80Var = m80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-j10));
        n80 n80Var = new n80(f3Var, context);
        f3Var.d = n80Var;
        f3Var.getContext();
        if (f3Var.f29873s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        n80Var.setLayoutManager(new s4.b0(i12, false));
        n80Var.setAdapter(new q80(f3Var, context));
        n80Var.setVerticalScrollBarEnabled(false);
        n80Var.setClipToPadding(false);
        n80Var.setEnabled(true);
        n80Var.setSelectorDrawableColor(0);
        n80Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        n80Var.setOnScrollListener(new o80(f3Var));
        n80Var.setOnItemClickListener(new ci.y4(11, f3Var, chat));
        if (i10 != 0) {
            m80Var.addView(n80Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            n80Var.setSelectorDrawableColor(0);
            n80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            m80Var.addView(imageView, w7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        f3Var.e = textView;
        org.telegram.messenger.mk.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21183ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21096j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            m80Var.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            m80Var.addView(textView, w7.z5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(f3Var.getContext());
        f3Var.f29870f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21201og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21246r5, false));
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
        f3Var.f29870f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f3Var.f29870f.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21116k5, false));
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
            f3Var.f29870f.setText(sb2);
            f3Var.f29870f.setGravity(49);
            m80Var.addView(f3Var.f29870f, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                f3Var.f29870f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                f3Var.f29870f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = f3Var.f29870f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            m80Var.addView(f3Var.f29870f, w7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            n80 n80Var2 = f3Var.d;
            if (f3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            m80Var.addView(n80Var2, w7.z5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        t00 t00Var = new t00(f3Var, context, false);
        f3Var.f29869c = t00Var;
        ((View) t00Var.f30384c).setOnClickListener(new ca(19, f3Var, p80Var));
        if (f3Var.f29873s == 0) {
            m80Var.addView(t00Var, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            t00 t00Var2 = new t00(f3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                t00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) t00Var2.f30384c).setOnClickListener(new f0((Object) f3Var, 28));
            m80Var.addView(t00Var2, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            m80Var.addView(t00Var, w7.z5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
        TLRPC.InputPeer inputPeer = this.f29875x;
        if (inputPeer != null) {
            p80 p80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            p80Var.a(inputPeer, z10, this.f29876y, false);
        }
    }

    public final void y(TLRPC.Chat chat, boolean z10) {
        String str;
        t00 t00Var = this.f29869c;
        if (this.f29873s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                t00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
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
