package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class f2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.m9 {
    public boolean A;
    public int B;
    public int C;
    public TLRPC.PhotoSize D;
    public String E;
    public TLRPC.PhotoSize F;
    public String G;
    public TLRPC.Photo H;
    public final int I;
    public TL_iv.pageBlockPhoto J;
    public TLObject K;
    public TL_iv.PageBlock L;
    public boolean M;
    public MessageObject.GroupedMessagePosition N;
    public Drawable O;
    public boolean P;
    public final a70 f38110a;
    public final j4 f38111b;
    public e3 f38112c;
    public e3 d;
    public final ImageReceiver f38113e;
    public final RadialProgress2 f38114f;
    public final f1 h;
    public final int f38115n;
    public boolean f38116r;
    public int f38117s;
    public int v;
    public int f38118w;
    public int f38119x;
    public int f38120y;

    public f2(Context context, a70 a70Var, j4 j4Var, int i9) {
        super(context);
        this.f38110a = a70Var;
        this.f38111b = j4Var;
        setWillNotDraw(false);
        this.f38113e = new ImageReceiver(this);
        f1 f1Var = new f1(context, a70Var, j4Var, 1);
        this.h = f1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f38114f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.I = DownloadController.getInstance(((l4) a70Var).T).generateObserverTag();
        addView(f1Var, g7.e6.c(-2.0f, -1));
        this.f38115n = i9;
    }

    private int getIconForCurrentState() {
        int i9 = this.B;
        if (i9 == 0) {
            return 2;
        }
        if (i9 == 1) {
            return 3;
        }
        return 4;
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.L = null;
        this.J = pageblockphoto;
        this.K = tLObject;
        this.M = z10;
        this.f38116r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.J.url)) {
            this.O = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.J;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = i4.d(pageblockphoto2.photo_id, this.K);
            if (d != null) {
                this.D = FileLoader.getClosestPhotoSizeWithSize(d.sizes, AndroidUtilities.getPhotoSize());
            } else {
                this.D = null;
            }
        } else {
            this.D = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        boolean z11;
        int i9 = ((l4) this.f38110a).T;
        String attachFileName = FileLoader.getAttachFileName(this.D);
        File pathToAttach = FileLoader.getInstance(i9).getPathToAttach(this.D, true);
        File pathToAttach2 = FileLoader.getInstance(i9).getPathToAttach(this.D, false);
        if (!pathToAttach.exists() && (pathToAttach2 == null || !pathToAttach2.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f38114f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            this.B = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, null, this);
            float f10 = 0.0f;
            if (!this.P && !FileLoader.getInstance(i9).isLoadingFile(attachFileName)) {
                this.B = 0;
            } else {
                this.B = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f10 = fileProgress.floatValue();
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.o(f10, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f38112c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.J;
    }

    public TLObject getCurrentPage() {
        return this.K;
    }

    public ImageReceiver getImageView() {
        return this.f38113e;
    }

    @Override
    public int getObserverTag() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38113e.onAttachedToWindow();
        b(false);
        e3 e3Var = this.f38112c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38113e.onDetachedFromWindow();
        DownloadController.getInstance(((l4) this.f38110a).T).removeLoadingFileObserver(this);
        e3 e3Var = this.f38112c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.J == null) {
            return;
        }
        ImageReceiver imageReceiver = this.f38113e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), l4.f39998k1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f38114f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.J.url) && !(this.H instanceof org.telegram.ui.web.c2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.O.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.O.draw(canvas2);
        }
        e3 e3Var = this.f38112c;
        a70 a70Var = this.f38110a;
        int i9 = 0;
        if (e3Var != null) {
            canvas2.save();
            canvas2.translate(this.f38117s, this.v);
            l4.v(a70Var, canvas2, this, 0);
            this.f38112c.draw(canvas2, this);
            canvas2.restore();
            i9 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f38117s, this.v + this.f38118w);
            l4.v(a70Var, canvas2, this, i9);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        l4.u(canvas2, a70Var, this.J, getMeasuredHeight());
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        b(false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AttachPhoto));
        if (this.f38112c != null) {
            sb2.append(", ");
            sb2.append(this.f38112c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f38114f.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.B != 1) {
            b(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f38114f.o(1.0f, true);
        b(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.L = pageBlock;
        j4 j4Var = this.f38111b;
        if (j4Var != null && (pageblockchannel = j4Var.B) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            f1 f1Var = this.h;
            f1Var.setBlock(pageblockchannel);
            f1Var.setVisibility(0);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
