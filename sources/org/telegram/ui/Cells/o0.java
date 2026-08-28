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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.yl0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final yl0 E;
    public n0 F;
    public ka G;
    public final t1 f24787a;
    public int f24788b;
    public long f24789c;
    public MessageObject d;
    public long f24790e;
    public StaticLayout f24792g;
    public float h;
    public float f24793i;
    public int f24794j;
    public float f24799o;
    public float f24800p;
    public p80 f24803s;
    public final org.telegram.ui.Components.y5 f24805u;
    public nz0 v;
    public final pc f24808y;
    public final TextPaint f24791f = new TextPaint(1);
    public final Paint f24795k = new Paint(1);
    public final Path f24796l = new Path();
    public final float f24797m = -1.0f;
    public int f24798n = AndroidUtilities.dp(66.0f);
    public final ArrayList f24801q = new ArrayList();
    public final Path f24802r = new Path();
    public final RectF f24806w = new RectF();
    public final RectF f24807x = new RectF();
    public final Paint f24809z = new Paint(1);
    public boolean f24804t = true;

    public o0(t1 t1Var) {
        this.f24787a = t1Var;
        this.E = new yl0(t1Var.getContext(), null);
        this.f24808y = new pc(t1Var);
        this.f24805u = new org.telegram.ui.Components.y5(t1Var, 350L, gr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        yl0 yl0Var = this.E;
        if (yl0Var.b()) {
            float f10 = yl0Var.f35015j;
            this.f24799o = f10;
            this.f24799o = Utilities.clamp(f10, this.f24800p - (this.f24806w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f24787a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f24801q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i9;
        TLObject tLObject;
        TLObject tLObject2;
        int i10;
        int i11;
        this.f24788b = messageObject.currentAccount;
        this.d = messageObject;
        this.f24789c = messageObject.getDialogId();
        MessagesController.getInstance(this.f24788b).getChat(Long.valueOf(-this.f24789c));
        this.f24790e = -this.f24789c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f24791f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i12 = org.telegram.ui.ActionBar.f6.f23097ic;
        t1 t1Var = this.f24787a;
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i12, t1Var.Ed));
        this.f24792g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f24793i = 0.0f;
        for (int i13 = 0; i13 < this.f24792g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f24792g.getLineLeft(i13));
            this.f24793i = Math.max(this.f24793i, this.f24792g.getLineRight(i13));
        }
        this.f24794j = this.f24792g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f24809z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, t1Var.Ed));
        t1Var.f25500o0 = AndroidUtilities.dp(14.66f) + this.f24794j;
        int i14 = 0;
        while (true) {
            arrayList = this.f24801q;
            if (i14 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f24732c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].onDetachedFromWindow();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f24788b).getChannelRecommendations(this.f24789c);
        if (channelRecommendations != null && channelRecommendations.chats != null) {
            arrayList2 = new ArrayList(channelRecommendations.chats);
        } else {
            arrayList2 = new ArrayList();
        }
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            TLObject tLObject3 = (TLObject) arrayList2.get(i16);
            if ((tLObject3 instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject3)) {
                arrayList2.remove(i16);
                i16--;
            }
            i16++;
        }
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f24788b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f24804t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f24788b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f24788b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i17 = 0; i17 < min; i17++) {
                arrayList.add(new n0(this.f24788b, t1Var, (TLObject) arrayList2.get(i17)));
            }
            if (min < arrayList2.size()) {
                TLObject tLObject4 = null;
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i11 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i11);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i10 = min + 2) < arrayList2.size()) {
                    tLObject4 = (TLObject) arrayList2.get(i10);
                }
                arrayList.add(new n0(this.f24788b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f24789c > 0) {
                i9 = R.string.SimilarBots;
            } else {
                i9 = R.string.SimilarChannels;
            }
            nz0 nz0Var = new nz0(LocaleController.getString(i9), 14.0f, AndroidUtilities.bold());
            nz0Var.f31233o = true;
            this.v = nz0Var;
        }
        if (d()) {
            t1Var.f25500o0 = AndroidUtilities.dp(144.0f) + t1Var.f25500o0;
            this.f24795k.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23252ra, t1Var.Ed));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f24798n);
        this.f24800p = size2;
        this.f24799o = Utilities.clamp(this.f24799o, size2, 0.0f);
    }
}
