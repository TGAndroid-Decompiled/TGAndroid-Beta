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
public final class oh0 extends FrameLayout {
    public final ArrayList f41127a;
    public final ArrayList f41128b;
    public final ArrayList f41129c;
    public final org.telegram.ui.Components.h9 d;
    public final org.telegram.ui.ActionBar.h5 f41130e;
    public final int f41131f;
    public final boolean h;
    public final org.telegram.ui.Components.p00 f41132n;
    public boolean f41133r;
    public wa1 f41134s;

    public oh0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j10;
        this.f41127a = new ArrayList();
        this.f41128b = new ArrayList();
        this.f41129c = new ArrayList();
        this.f41131f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.f41132n = p00Var;
        p00Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f23152i6, -1);
        p00Var.setViewType(13);
        p00Var.setIsSingleCell(false);
        addView(p00Var, i7.f6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41130e = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(h5Var, i7.f6.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(context, false);
        this.d = h9Var;
        h9Var.setStyle(11);
        h9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(h9Var, i7.f6.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, i7.f6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        h9Var.setAlpha(0.0f);
        h5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new jh.u(this, j10, i10, chat));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.jl0 a() {
        wa1 wa1Var = this.f41134s;
        if (wa1Var != null) {
            return wa1Var;
        }
        wa1 wa1Var2 = new wa1(getContext(), 9, null);
        this.f41134s = wa1Var2;
        getContext();
        wa1Var2.setLayoutManager(new f2.j0());
        this.f41134s.i(new eg.f2(this, 6));
        this.f41134s.setAdapter(new cg.g(this, 4));
        return this.f41134s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.h9 h9Var;
        String str;
        ArrayList arrayList = this.f41129c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            h9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f41131f;
            if (i10 < size) {
                h9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                h9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            h9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            h9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            h9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.h5 h5Var = this.f41130e;
        h5Var.setRightPadding(dp);
        h9Var.a(false);
        ArrayList arrayList2 = this.f41127a;
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
        h9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.p00 p00Var = this.f41132n;
        p00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.z9(p00Var)).start();
        wa1 wa1Var = this.f41134s;
        if (wa1Var != null) {
            wa1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f41133r = true;
        org.telegram.ui.Components.p00 p00Var = this.f41132n;
        if (p00Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f41130e;
        h5Var.setVisibility(8);
        if (z10) {
            p00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            p00Var.getLayoutParams().width = getMeasuredWidth();
            p00Var.setVisibility(0);
        }
        h5Var.setVisibility(0);
        h5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f41133r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f41133r) {
            return;
        }
        super.requestLayout();
    }
}
