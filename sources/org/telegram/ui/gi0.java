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
public final class gi0 extends FrameLayout {
    public final ArrayList f38132a;
    public final ArrayList f38133b;
    public final ArrayList f38134c;
    public final org.telegram.ui.Components.m9 d;
    public final org.telegram.ui.ActionBar.h5 f38135e;
    public final int f38136f;
    public final boolean h;
    public final org.telegram.ui.Components.k10 f38137n;
    public boolean f38138r;
    public ec1 f38139s;

    public gi0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j3;
        this.f38132a = new ArrayList();
        this.f38133b = new ArrayList();
        this.f38134c = new ArrayList();
        this.f38136f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        this.f38137n = k10Var;
        k10Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f20913i6, -1);
        k10Var.setViewType(13);
        k10Var.setIsSingleCell(false);
        addView(k10Var, w7.x5.d(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f38135e = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(h5Var, w7.x5.a(-2.0f, 40.0f, 0.0f, 0.0f, 0.0f, 0, 19));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.d = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(m9Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 56, 21));
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
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
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        m9Var.setAlpha(0.0f);
        h5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.l8(this, j3, i10, chat));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.rm0 a() {
        ec1 ec1Var = this.f38139s;
        if (ec1Var != null) {
            return ec1Var;
        }
        ec1 ec1Var2 = new ec1(getContext(), 10, null);
        this.f38139s = ec1Var2;
        getContext();
        ec1Var2.setLayoutManager(new s4.d0());
        this.f38139s.i(new ci.q1(this, 5));
        this.f38139s.setAdapter(new gg.m0(this, 3));
        return this.f38139s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.m9 m9Var;
        String str;
        ArrayList arrayList = this.f38134c;
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
            int i11 = this.f38136f;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f38135e;
        h5Var.setRightPadding(dp);
        m9Var.a(false);
        ArrayList arrayList2 = this.f38132a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            h5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            h5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            h5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        h5Var.animate().alpha(1.0f).setDuration(220L).start();
        m9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.k10 k10Var = this.f38137n;
        k10Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.ea(k10Var)).start();
        ec1 ec1Var = this.f38139s;
        if (ec1Var != null) {
            ec1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f38138r = true;
        org.telegram.ui.Components.k10 k10Var = this.f38137n;
        if (k10Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f38135e;
        h5Var.setVisibility(8);
        if (z10) {
            k10Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            k10Var.getLayoutParams().width = getMeasuredWidth();
            k10Var.setVisibility(0);
        }
        h5Var.setVisibility(0);
        h5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f38138r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f38138r) {
            return;
        }
        super.requestLayout();
    }
}
