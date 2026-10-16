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
public final class ki0 extends FrameLayout {
    public final ArrayList f37433a;
    public final ArrayList f37434b;
    public final ArrayList f37435c;
    public final org.telegram.ui.Components.n9 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final int f37436f;
    public final boolean h;
    public final org.telegram.ui.Components.f10 f37437n;
    public boolean f37438r;
    public kc1 f37439s;

    public ki0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j10;
        this.f37433a = new ArrayList();
        this.f37434b = new ArrayList();
        this.f37435c = new ArrayList();
        this.f37436f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        this.f37437n = f10Var;
        f10Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f19690i6, -1);
        f10Var.setViewType(13);
        f10Var.setIsSingleCell(false);
        addView(f10Var, w7.z5.d(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(h5Var, w7.z5.a(-2.0f, 40.0f, 0.0f, 0.0f, 0.0f, 0, 19));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context, false);
        this.d = n9Var;
        n9Var.setStyle(11);
        n9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(n9Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 56, 21));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.z5.a(24.0f, 11.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        n9Var.setAlpha(0.0f);
        h5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new bi.w7(this, j10, i10, chat));
        setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.mm0 a() {
        kc1 kc1Var = this.f37439s;
        if (kc1Var != null) {
            return kc1Var;
        }
        kc1 kc1Var2 = new kc1(getContext(), 10, null);
        this.f37439s = kc1Var2;
        getContext();
        kc1Var2.setLayoutManager(new s4.b0());
        this.f37439s.i(new di.q1(this, 5));
        this.f37439s.setAdapter(new hg.m0(this, 3));
        return this.f37439s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.n9 n9Var;
        String str;
        ArrayList arrayList = this.f37435c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            n9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f37436f;
            if (i10 < size) {
                n9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                n9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            n9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            n9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            n9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        h5Var.setRightPadding(dp);
        n9Var.a(false);
        ArrayList arrayList2 = this.f37433a;
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
        n9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.f10 f10Var = this.f37437n;
        f10Var.animate().alpha(0.0f).setDuration(220L).setListener(new vo(f10Var)).start();
        kc1 kc1Var = this.f37439s;
        if (kc1Var != null) {
            kc1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f37438r = true;
        org.telegram.ui.Components.f10 f10Var = this.f37437n;
        if (f10Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        h5Var.setVisibility(8);
        if (z10) {
            f10Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            f10Var.getLayoutParams().width = getMeasuredWidth();
            f10Var.setVisibility(0);
        }
        h5Var.setVisibility(0);
        h5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f37438r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f37438r) {
            return;
        }
        super.requestLayout();
    }
}
