package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qh0 extends FrameLayout {
    public final ArrayList f40580a;
    public final ArrayList f40581b;
    public final ArrayList f40582c;
    public final org.telegram.ui.Components.k9 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final int f40583f;
    public final boolean h;
    public final org.telegram.ui.Components.b10 f40584n;
    public boolean f40585r;
    public sa1 f40586s;

    public qh0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j10;
        this.f40580a = new ArrayList();
        this.f40581b = new ArrayList();
        this.f40582c = new ArrayList();
        this.f40583f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        this.f40584n = b10Var;
        b10Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f21082i6, -1);
        b10Var.setViewType(13);
        b10Var.setIsSingleCell(false);
        addView(b10Var, w7.z5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(j5Var, w7.z5.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.d = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.z5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        k9Var.setAlpha(0.0f);
        j5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.c0(this, j10, i10, chat));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.jm0 a() {
        sa1 sa1Var = this.f40586s;
        if (sa1Var != null) {
            return sa1Var;
        }
        sa1 sa1Var2 = new sa1(getContext(), 10, null);
        this.f40586s = sa1Var2;
        getContext();
        sa1Var2.setLayoutManager(new s4.b0());
        this.f40586s.i(new ei.q1(this, 5));
        this.f40586s.setAdapter(new ai.m5(this, 4));
        return this.f40586s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.k9 k9Var;
        String str;
        ArrayList arrayList = this.f40582c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            k9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f40583f;
            if (i10 < size) {
                k9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                k9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            k9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            k9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            k9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        j5Var.setRightPadding(dp);
        k9Var.a(false);
        ArrayList arrayList2 = this.f40580a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            j5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            j5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            j5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        j5Var.animate().alpha(1.0f).setDuration(220L).start();
        k9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.b10 b10Var = this.f40584n;
        b10Var.animate().alpha(0.0f).setDuration(220L).setListener(new fo(b10Var)).start();
        sa1 sa1Var = this.f40586s;
        if (sa1Var != null) {
            sa1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f40585r = true;
        org.telegram.ui.Components.b10 b10Var = this.f40584n;
        if (b10Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        j5Var.setVisibility(8);
        if (z10) {
            b10Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            b10Var.getLayoutParams().width = getMeasuredWidth();
            b10Var.setVisibility(0);
        }
        j5Var.setVisibility(0);
        j5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f40585r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40585r) {
            return;
        }
        super.requestLayout();
    }
}
