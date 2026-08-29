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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final lm0 E;
    public n0 F;
    public ha G;
    public final s1 f24767a;
    public int f24768b;
    public long f24769c;
    public MessageObject d;
    public long f24770e;
    public StaticLayout f24772g;
    public float h;
    public float f24773i;
    public int f24774j;
    public float f24779o;
    public float f24780p;
    public c90 f24783s;
    public final org.telegram.ui.Components.d6 f24785u;
    public zz0 v;
    public final uc f24788y;
    public final TextPaint f24771f = new TextPaint(1);
    public final Paint f24775k = new Paint(1);
    public final Path f24776l = new Path();
    public final float f24777m = -1.0f;
    public int f24778n = AndroidUtilities.dp(66.0f);
    public final ArrayList f24781q = new ArrayList();
    public final Path f24782r = new Path();
    public final RectF f24786w = new RectF();
    public final RectF f24787x = new RectF();
    public final Paint f24789z = new Paint(1);
    public boolean f24784t = true;

    public o0(s1 s1Var) {
        this.f24767a = s1Var;
        this.E = new lm0(s1Var.getContext(), null);
        this.f24788y = new uc(s1Var);
        this.f24785u = new org.telegram.ui.Components.d6(s1Var, 350L, jr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        lm0 lm0Var = this.E;
        if (lm0Var.b()) {
            float f9 = lm0Var.f30388j;
            this.f24779o = f9;
            this.f24779o = Utilities.clamp(f9, this.f24780p - (this.f24786w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f24767a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f24781q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        int i11;
        int i12;
        this.f24768b = messageObject.currentAccount;
        this.d = messageObject;
        this.f24769c = messageObject.getDialogId();
        MessagesController.getInstance(this.f24768b).getChat(Long.valueOf(-this.f24769c));
        this.f24770e = -this.f24769c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f24771f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.g6.f23158ic;
        s1 s1Var = this.f24767a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i13, s1Var.Ed));
        this.f24772g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f24773i = 0.0f;
        for (int i14 = 0; i14 < this.f24772g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f24772g.getLineLeft(i14));
            this.f24773i = Math.max(this.f24773i, this.f24772g.getLineRight(i14));
        }
        this.f24774j = this.f24772g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f24789z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, s1Var.Ed));
        s1Var.f25465o0 = AndroidUtilities.dp(14.66f) + this.f24774j;
        int i15 = 0;
        while (true) {
            arrayList = this.f24781q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f24731c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f24768b).getChannelRecommendations(this.f24769c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f24768b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f24784t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f24768b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f24768b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f24768b, s1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f24768b, s1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f24769c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            zz0 zz0Var = new zz0(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            zz0Var.f35472o = true;
            this.v = zz0Var;
        }
        if (d()) {
            s1Var.f25465o0 = AndroidUtilities.dp(144.0f) + s1Var.f25465o0;
            this.f24775k.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23313ra, s1Var.Ed));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f24778n);
        this.f24780p = size2;
        this.f24779o = Utilities.clamp(this.f24779o, size2, 0.0f);
    }
}
