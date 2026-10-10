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
public final class hi0 extends FrameLayout {
    public final ArrayList f38395a;
    public final ArrayList f38396b;
    public final ArrayList f38397c;
    public final org.telegram.ui.Components.m9 d;
    public final org.telegram.ui.ActionBar.j5 f38398e;
    public final int f38399f;
    public final boolean h;
    public final org.telegram.ui.Components.k10 f38400n;
    public boolean f38401r;
    public fc1 f38402s;

    public hi0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j3;
        this.f38395a = new ArrayList();
        this.f38396b = new ArrayList();
        this.f38397c = new ArrayList();
        this.f38399f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        this.f38400n = k10Var;
        k10Var.f(org.telegram.ui.ActionBar.i6.G8, org.telegram.ui.ActionBar.i6.f20892i6, -1);
        k10Var.setViewType(13);
        k10Var.setIsSingleCell(false);
        addView(k10Var, w7.x5.d(-1.0f, -2));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f38398e = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(j5Var, w7.x5.a(-2.0f, 40.0f, 0.0f, 0.0f, 0.0f, 0, 19));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.d = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(m9Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 56, 21));
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.x5.a(24.0f, 11.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        m9Var.setAlpha(0.0f);
        j5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.l8(this, j3, i10, chat));
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.rm0 a() {
        fc1 fc1Var = this.f38402s;
        if (fc1Var != null) {
            return fc1Var;
        }
        fc1 fc1Var2 = new fc1(getContext(), 10, null);
        this.f38402s = fc1Var2;
        getContext();
        fc1Var2.setLayoutManager(new s4.d0());
        this.f38402s.i(new ci.q1(this, 5));
        this.f38402s.setAdapter(new gg.m0(this, 3));
        return this.f38402s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.m9 m9Var;
        String str;
        ArrayList arrayList = this.f38397c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            m9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f38399f;
            if (i10 < size) {
                m9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                m9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            m9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            m9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            m9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.j5 j5Var = this.f38398e;
        j5Var.setRightPadding(dp);
        m9Var.a(false);
        ArrayList arrayList2 = this.f38395a;
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
        m9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.k10 k10Var = this.f38400n;
        k10Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.fa(k10Var)).start();
        fc1 fc1Var = this.f38402s;
        if (fc1Var != null) {
            fc1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f38401r = true;
        org.telegram.ui.Components.k10 k10Var = this.f38400n;
        if (k10Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f38398e;
        j5Var.setVisibility(8);
        if (z10) {
            k10Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            k10Var.getLayoutParams().width = getMeasuredWidth();
            k10Var.setVisibility(0);
        }
        j5Var.setVisibility(0);
        j5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f38401r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f38401r) {
            return;
        }
        super.requestLayout();
    }
}
