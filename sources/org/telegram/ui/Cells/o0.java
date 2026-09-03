package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.um0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final um0 E;
    public n0 F;
    public ia G;
    public final s1 f21455a;
    public int f21456b;
    public long f21457c;
    public MessageObject d;
    public long e;
    public StaticLayout f21459g;
    public float h;
    public float f21460i;
    public int f21461j;
    public float f21466o;
    public float f21467p;
    public j90 f21470s;
    public final org.telegram.ui.Components.z5 f21472u;
    public k01 v;
    public final rc f21475y;
    public final TextPaint f21458f = new TextPaint(1);
    public final Paint f21462k = new Paint(1);
    public final Path f21463l = new Path();
    public final float f21464m = -1.0f;
    public int f21465n = AndroidUtilities.dp(66.0f);
    public final ArrayList f21468q = new ArrayList();
    public final Path f21469r = new Path();
    public final RectF f21473w = new RectF();
    public final RectF f21474x = new RectF();
    public final Paint f21476z = new Paint(1);
    public boolean f21471t = true;

    public o0(s1 s1Var) {
        this.f21455a = s1Var;
        this.E = new um0(s1Var.getContext(), null);
        this.f21475y = new rc(s1Var);
        this.f21472u = new org.telegram.ui.Components.z5(s1Var, 350L, mr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        um0 um0Var = this.E;
        if (um0Var.b()) {
            float f10 = um0Var.f29255j;
            this.f21466o = f10;
            this.f21466o = Utilities.clamp(f10, this.f21467p - (this.f21473w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f21455a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f21468q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z4;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        int i11;
        int i12;
        this.f21456b = messageObject.currentAccount;
        this.d = messageObject;
        this.f21457c = messageObject.getDialogId();
        MessagesController.getInstance(this.f21456b).getChat(Long.valueOf(-this.f21457c));
        this.e = -this.f21457c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f21458f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.j6.ic;
        s1 s1Var = this.f21455a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i13, s1Var.Fd));
        this.f21459g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f21460i = 0.0f;
        for (int i14 = 0; i14 < this.f21459g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f21459g.getLineLeft(i14));
            this.f21460i = Math.max(this.f21460i, this.f21459g.getLineRight(i14));
        }
        this.f21461j = this.f21459g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f21476z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, s1Var.Fd));
        s1Var.f22119p0 = AndroidUtilities.dp(14.66f) + this.f21461j;
        int i15 = 0;
        while (true) {
            arrayList = this.f21468q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f21391c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f21456b).getChannelRecommendations(this.f21457c);
        if (channelRecommendations != null && channelRecommendations.chats != null) {
            arrayList2 = new ArrayList(channelRecommendations.chats);
        } else {
            arrayList2 = new ArrayList();
        }
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            TLObject tLObject3 = (TLObject) arrayList2.get(i17);
            if ((tLObject3 instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject3)) {
                arrayList2.remove(i17);
                i17--;
            }
            i17++;
        }
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f21456b).isPremium() || arrayList2.size() != 1)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f21471t = z4;
        if (!z4) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f21456b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f21456b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f21456b, s1Var, (TLObject) arrayList2.get(i18)));
            }
            if (min < arrayList2.size()) {
                TLObject tLObject4 = null;
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i12 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i12);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i11 = min + 2) < arrayList2.size()) {
                    tLObject4 = (TLObject) arrayList2.get(i11);
                }
                arrayList.add(new n0(this.f21456b, s1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f21457c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            k01 k01Var = new k01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            k01Var.f26133o = true;
            this.v = k01Var;
        }
        if (d()) {
            s1Var.f22119p0 = AndroidUtilities.dp(144.0f) + s1Var.f22119p0;
            this.f21462k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20136ra, s1Var.Fd));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f21465n);
        this.f21467p = size2;
        this.f21466o = Utilities.clamp(this.f21466o, size2, 0.0f);
    }
}
