package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

public final class g2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.i9 {
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

    public final d70 f38274a;

    public final k4 f38275b;

    public f3 f38276c;
    public f3 d;

    public final ImageReceiver f38277e;

    public final RadialProgress2 f38278f;
    public final g1 h;

    public final int f38279n;

    public boolean f38280r;

    public int f38281s;
    public int v;

    public int f38282w;

    public int f38283x;

    public int f38284y;

    public g2(Context context, d70 d70Var, k4 k4Var, int i10) {
        super(context);
        this.f38274a = d70Var;
        this.f38275b = k4Var;
        setWillNotDraw(false);
        this.f38277e = new ImageReceiver(this);
        g1 g1Var = new g1(context, d70Var, k4Var, 1);
        this.h = g1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f38278f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.I = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        addView(g1Var, h7.z5.c(-2.0f, -1));
        this.f38279n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.B;
        if (i10 == 0) {
            return 2;
        }
        return i10 == 1 ? 3 : 4;
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.L = null;
        this.J = pageblockphoto;
        this.K = tLObject;
        this.M = z10;
        this.f38280r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.J.url)) {
            this.O = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.J;
        if (pageblockphoto2 != null) {
            TLRPC.Photo photoD = j4.d(pageblockphoto2.photo_id, this.K);
            if (photoD != null) {
                this.D = FileLoader.getClosestPhotoSizeWithSize(photoD.sizes, AndroidUtilities.getPhotoSize());
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
        int i10 = ((m4) this.f38274a).T;
        String attachFileName = FileLoader.getAttachFileName(this.D);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.D, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.D, false);
        boolean z11 = pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
        boolean zIsEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f38278f;
        if (zIsEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.B = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            float fFloatValue = 0.0f;
            if (this.P || FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.B = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    fFloatValue = fileProgress.floatValue();
                }
            } else {
                this.B = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.o(fFloatValue, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f38276c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
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
        return this.f38277e;
    }

    @Override
    public int getObserverTag() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38277e.onAttachedToWindow();
        b(false);
        f3 f3Var = this.f38276c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38277e.onDetachedFromWindow();
        DownloadController.getInstance(((m4) this.f38274a).T).removeLoadingFileObserver(this);
        f3 f3Var = this.f38276c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.J == null) {
            return;
        }
        ImageReceiver imageReceiver = this.f38277e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), m4.f40319k1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f38278f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.J.url) && !(this.H instanceof org.telegram.ui.web.d2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.O.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.O.draw(canvas2);
        }
        f3 f3Var = this.f38276c;
        d70 d70Var = this.f38274a;
        int i10 = 0;
        if (f3Var != null) {
            canvas2.save();
            canvas2.translate(this.f38281s, this.v);
            m4.v(d70Var, canvas2, this, 0);
            this.f38276c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f38281s, this.v + this.f38282w);
            m4.v(d70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        m4.u(canvas2, d70Var, this.J, getMeasuredHeight());
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
        if (this.f38276c != null) {
            sb2.append(", ");
            sb2.append(this.f38276c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int iCeil;
        TL_iv.pageBlockPhoto pageblockphoto;
        ImageReceiver imageReceiver;
        int iDp;
        int iDp2;
        int iDp3;
        TLRPC.Photo photo;
        k4 k4Var;
        int iDp4;
        int imageHeight;
        k4 k4Var2;
        boolean z10;
        f3 f3Var;
        f3 f3Var2;
        ArrayList arrayList;
        f3 f3VarQ;
        int i13;
        Layout.Alignment alignmentA;
        f3 f3VarP;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float fDp;
        m4 m4Var;
        boolean z11;
        int i19;
        int size = View.MeasureSpec.getSize(i10);
        int i20 = this.f38279n;
        int iDp5 = 1;
        if (i20 != 1) {
            if (i20 == 2) {
                float f10 = this.N.f19619ph;
                Point point = AndroidUtilities.displaySize;
                iCeil = (int) Math.ceil(f10 * Math.max(point.x, point.y) * 0.5f);
            } else {
                i12 = size;
                iCeil = 0;
            }
            pageblockphoto = this.J;
            imageReceiver = this.f38277e;
            if (pageblockphoto != null) {
                this.H = j4.d(pageblockphoto.photo_id, this.K);
                int iDp6 = AndroidUtilities.dp(48.0f);
                if (i20 == 0 || (i19 = this.J.level) <= 0) {
                    this.f38281s = AndroidUtilities.dp(18.0f);
                    iDp = i12 - AndroidUtilities.dp(36.0f);
                    iDp2 = i12;
                    iDp3 = 0;
                } else {
                    iDp3 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i19 * 14);
                    this.f38281s = iDp3;
                    iDp2 = org.telegram.messenger.rl.u(18.0f, iDp3, i12);
                    iDp = iDp2;
                }
                photo = this.H;
                k4Var = this.f38275b;
                if (photo != null || (this.D == null && !(photo instanceof org.telegram.ui.web.d2))) {
                    iDp4 = iCeil;
                } else {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40, true);
                    this.F = closestPhotoSizeWithSize;
                    TLRPC.PhotoSize photoSize = this.D;
                    if (photoSize == closestPhotoSizeWithSize) {
                        this.F = null;
                    }
                    TLRPC.Photo photo2 = this.H;
                    if (photo2 instanceof org.telegram.ui.web.d2) {
                        org.telegram.ui.web.d2 d2Var = (org.telegram.ui.web.d2) photo2;
                        i14 = d2Var.d;
                        i15 = d2Var.f43815e;
                    } else {
                        int i21 = photoSize.f22405w;
                        int i22 = photoSize.h;
                        i14 = i21;
                        i15 = i22;
                    }
                    if (i20 == 0) {
                        float f11 = i14;
                        float f12 = i15;
                        iCeil = (int) ((iDp2 / f11) * f12);
                        if (this.L instanceof TL_iv.pageBlockCover) {
                            iCeil = Math.min(iCeil, iDp2);
                        } else {
                            Point point2 = AndroidUtilities.displaySize;
                            int iMax = (int) ((Math.max(point2.x, point2.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                            if (iCeil > iMax) {
                                iDp2 = (int) ((iMax / f12) * f11);
                                iDp3 += ((i12 - iDp3) - iDp2) / 2;
                                iCeil = iMax;
                            }
                        }
                    } else {
                        if (i20 == 2) {
                            if ((this.N.flags & 2) == 0) {
                                iDp2 -= AndroidUtilities.dp(2.0f);
                            }
                            int iDp7 = (this.N.flags & 8) == 0 ? iCeil - AndroidUtilities.dp(2.0f) : iCeil;
                            int i23 = this.N.leftSpanOffset;
                            if (i23 != 0) {
                                int iCeil2 = (int) Math.ceil((i23 * i12) / 1000.0f);
                                iDp2 -= iCeil2;
                                iDp3 += iCeil2;
                            }
                            int i24 = iDp2;
                            i16 = iCeil;
                            iCeil = iDp7;
                            i17 = iDp3;
                            i18 = i24;
                        }
                        float f13 = i17;
                        if (!this.f38280r || i20 == 1 || i20 == 2 || this.J.level > 0) {
                            fDp = 0.0f;
                        } else {
                            fDp = AndroidUtilities.dp(8.0f);
                        }
                        imageReceiver.setImageCoords(f13, fDp, i18, iCeil);
                        if (i20 == 0) {
                            this.E = null;
                        } else {
                            Locale locale = Locale.US;
                            this.E = com.google.android.recaptcha.internal.a.l(i18, "_", iCeil);
                        }
                        this.G = "80_80_b";
                        m4Var = (m4) this.f38274a;
                        if ((DownloadController.getInstance(m4Var.T).getCurrentDownloadMask() & 1) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.P = z11;
                        if (!this.M) {
                            if (this.H instanceof org.telegram.ui.web.d2) {
                                this.P = true;
                                imageReceiver.setStrippedLocation(null);
                                org.telegram.ui.web.e2.g((org.telegram.ui.web.d2) this.H, imageReceiver, new lt0(this, 9));
                            } else {
                                File pathToAttach = FileLoader.getInstance(m4Var.T).getPathToAttach(this.D, true);
                                if (!this.P || pathToAttach.exists()) {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(this.D, this.H), this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, k4Var != null ? k4Var.A : null, 1);
                                } else {
                                    imageReceiver.setStrippedLocation(ImageLocation.getForPhoto(this.D, this.H));
                                    imageReceiver.setImage(null, this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, k4Var != null ? k4Var.A : null, 1);
                                }
                            }
                        }
                        float f14 = iDp6;
                        this.f38283x = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f14, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f14) / 2.0f) + imageReceiver.getImageY());
                        this.f38284y = imageHeight2;
                        int i25 = this.f38283x;
                        this.f38278f.q(i25, imageHeight2, i25 + iDp6, iDp6 + imageHeight2);
                        iDp4 = i16;
                    }
                    i17 = iDp3;
                    i18 = iDp2;
                    i16 = iCeil;
                    float f15 = i17;
                    if (this.f38280r) {
                        fDp = 0.0f;
                    } else {
                        fDp = 0.0f;
                    }
                    imageReceiver.setImageCoords(f15, fDp, i18, iCeil);
                    if (i20 == 0) {
                        this.E = null;
                    } else {
                        Locale locale2 = Locale.US;
                        this.E = com.google.android.recaptcha.internal.a.l(i18, "_", iCeil);
                    }
                    this.G = "80_80_b";
                    m4Var = (m4) this.f38274a;
                    if ((DownloadController.getInstance(m4Var.T).getCurrentDownloadMask() & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.P = z11;
                    if (!this.M) {
                        if (this.H instanceof org.telegram.ui.web.d2) {
                            this.P = true;
                            imageReceiver.setStrippedLocation(null);
                            org.telegram.ui.web.e2.g((org.telegram.ui.web.d2) this.H, imageReceiver, new lt0(this, 9));
                        } else {
                            File pathToAttach2 = FileLoader.getInstance(m4Var.T).getPathToAttach(this.D, true);
                            if (this.P) {
                                imageReceiver.setStrippedLocation(null);
                                imageReceiver.setImage(ImageLocation.getForPhoto(this.D, this.H), this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, k4Var != null ? k4Var.A : null, 1);
                            } else {
                                imageReceiver.setStrippedLocation(null);
                                imageReceiver.setImage(ImageLocation.getForPhoto(this.D, this.H), this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, k4Var != null ? k4Var.A : null, 1);
                            }
                        }
                    }
                    float f16 = iDp6;
                    this.f38283x = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f16, 2.0f, imageReceiver.getImageX());
                    int imageHeight3 = (int) (((imageReceiver.getImageHeight() - f16) / 2.0f) + imageReceiver.getImageY());
                    this.f38284y = imageHeight3;
                    int i26 = this.f38283x;
                    this.f38278f.q(i26, imageHeight3, i26 + iDp6, iDp6 + imageHeight3);
                    iDp4 = i16;
                }
                imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                this.v = imageHeight;
                if (i20 == 0) {
                    TL_iv.pageBlockPhoto pageblockphoto2 = this.J;
                    f3VarQ = m4.q(this.f38274a, this, null, pageblockphoto2.caption.text, iDp, imageHeight, pageblockphoto2, this.f38275b);
                    this.f38276c = f3VarQ;
                    if (f3VarQ != null) {
                        int height = this.f38276c.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f38282w = height;
                        iDp4 = org.telegram.messenger.y1.C(4.0f, height, iDp4);
                    }
                    i13 = iDp4;
                    TL_iv.pageBlockPhoto pageblockphoto3 = this.J;
                    TL_iv.RichText richText = pageblockphoto3.caption.credit;
                    int i27 = this.v + this.f38282w;
                    if (k4Var == null && k4Var.C) {
                        alignmentA = org.telegram.ui.Components.tv0.a();
                    } else {
                        alignmentA = Layout.Alignment.ALIGN_NORMAL;
                    }
                    k4Var2 = k4Var;
                    f3VarP = m4.p(this.f38274a, this, null, richText, iDp, i27, pageblockphoto3, alignmentA, 0, this.f38275b);
                    this.d = f3VarP;
                    if (f3VarP != null) {
                        iDp4 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i13;
                    } else {
                        iDp4 = i13;
                    }
                } else {
                    k4Var2 = k4Var;
                }
                if (!this.f38280r && i20 == 0 && this.J.level <= 0) {
                    iDp4 += AndroidUtilities.dp(8.0f);
                }
                if ((this.L instanceof TL_iv.pageBlockCover) || k4Var2 == null || (arrayList = k4Var2.f39590e) == null || arrayList.size() <= 1 || !(arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i20 != 2 || z10) {
                    iDp5 = iDp4;
                } else {
                    iDp5 = AndroidUtilities.dp(8.0f) + iDp4;
                }
                f3Var = this.f38276c;
                if (f3Var != null) {
                    f3Var.f37923s = this.f38281s;
                    f3Var.v = this.v;
                }
                f3Var2 = this.d;
                if (f3Var2 != null) {
                    f3Var2.f37923s = this.f38281s;
                    f3Var2.v = this.v + this.f38282w;
                }
            }
            g1 g1Var = this.h;
            g1Var.measure(i10, i11);
            g1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
            setMeasuredDimension(i12, iDp5);
        }
        size = ((View) getParent()).getMeasuredWidth();
        iCeil = ((View) getParent()).getMeasuredHeight();
        i12 = size;
        pageblockphoto = this.J;
        imageReceiver = this.f38277e;
        if (pageblockphoto != null) {
            this.H = j4.d(pageblockphoto.photo_id, this.K);
            int iDp8 = AndroidUtilities.dp(48.0f);
            if (i20 == 0) {
                this.f38281s = AndroidUtilities.dp(18.0f);
                iDp = i12 - AndroidUtilities.dp(36.0f);
                iDp2 = i12;
                iDp3 = 0;
            } else {
                this.f38281s = AndroidUtilities.dp(18.0f);
                iDp = i12 - AndroidUtilities.dp(36.0f);
                iDp2 = i12;
                iDp3 = 0;
            }
            photo = this.H;
            k4Var = this.f38275b;
            if (photo != null) {
                iDp4 = iCeil;
            } else {
                iDp4 = iCeil;
            }
            imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.v = imageHeight;
            if (i20 == 0) {
                TL_iv.pageBlockPhoto pageblockphoto4 = this.J;
                f3VarQ = m4.q(this.f38274a, this, null, pageblockphoto4.caption.text, iDp, imageHeight, pageblockphoto4, this.f38275b);
                this.f38276c = f3VarQ;
                if (f3VarQ != null) {
                    int height2 = this.f38276c.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f38282w = height2;
                    iDp4 = org.telegram.messenger.y1.C(4.0f, height2, iDp4);
                }
                i13 = iDp4;
                TL_iv.pageBlockPhoto pageblockphoto5 = this.J;
                TL_iv.RichText richText2 = pageblockphoto5.caption.credit;
                int i28 = this.v + this.f38282w;
                if (k4Var == null) {
                    alignmentA = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignmentA = Layout.Alignment.ALIGN_NORMAL;
                }
                k4Var2 = k4Var;
                f3VarP = m4.p(this.f38274a, this, null, richText2, iDp, i28, pageblockphoto5, alignmentA, 0, this.f38275b);
                this.d = f3VarP;
                if (f3VarP != null) {
                    iDp4 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i13;
                } else {
                    iDp4 = i13;
                }
            } else {
                k4Var2 = k4Var;
            }
            if (!this.f38280r) {
                iDp4 += AndroidUtilities.dp(8.0f);
            }
            if (this.L instanceof TL_iv.pageBlockCover) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (i20 != 2) {
                iDp5 = iDp4;
            } else {
                iDp5 = iDp4;
            }
            f3Var = this.f38276c;
            if (f3Var != null) {
                f3Var.f37923s = this.f38281s;
                f3Var.v = this.v;
            }
            f3Var2 = this.d;
            if (f3Var2 != null) {
                f3Var2.f37923s = this.f38281s;
                f3Var2.v = this.v + this.f38282w;
            }
        }
        g1 g1Var2 = this.h;
        g1Var2.measure(i10, i11);
        g1Var2.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
        setMeasuredDimension(i12, iDp5);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f38278f.o(Math.min(1.0f, j10 / j11), true);
        if (this.B != 1) {
            b(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f38278f.o(1.0f, true);
        b(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        g1 g1Var = this.h;
        int visibility = g1Var.getVisibility();
        k4 k4Var = this.f38275b;
        if (visibility != 0 || y10 <= g1Var.getTranslationY() || y10 >= g1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.f38277e;
            if (action == 0 && imageReceiver.isInsideImage(x8, y10)) {
                if (this.B != -1) {
                    int i10 = this.f38283x;
                    if (x8 >= i10 && x8 <= AndroidUtilities.dp(48.0f) + i10) {
                        int i11 = this.f38284y;
                        if (y10 >= i11 && y10 <= AndroidUtilities.dp(48.0f) + i11) {
                            this.C = 1;
                            invalidate();
                        } else if (this.B == 0) {
                            this.C = 1;
                            invalidate();
                        } else {
                            this.A = true;
                        }
                    } else if (this.B == 0) {
                        this.C = 1;
                        invalidate();
                    } else {
                        this.A = true;
                    }
                } else if (this.B == 0) {
                    this.C = 1;
                    invalidate();
                } else {
                    this.A = true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.A) {
                    this.A = false;
                    this.f38274a.d(this.J, k4Var);
                } else if (this.C == 1) {
                    this.C = 0;
                    playSoundEffect(0);
                    if (this.D != null) {
                        int i12 = this.B;
                        RadialProgress2 radialProgress2 = this.f38278f;
                        if (i12 == 0) {
                            radialProgress2.o(0.0f, true);
                            imageReceiver.setImage(ImageLocation.getForPhoto(this.D, this.H), this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, this.K, 1);
                            this.B = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i12 == 1) {
                            imageReceiver.cancelLoadImage();
                            this.B = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.A = false;
                this.C = 0;
            }
            if (!this.A && this.C == 0) {
                if (!m4.l(this.f38274a, this.f38275b, motionEvent, this, this.f38276c, this.f38281s, this.v)) {
                    if (!m4.l(this.f38274a, this.f38275b, motionEvent, this, this.d, this.f38281s, this.v + this.f38282w) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (k4Var != null && k4Var.B != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.L = pageBlock;
        k4 k4Var = this.f38275b;
        if (k4Var == null || (pageblockchannel = k4Var.B) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        g1 g1Var = this.h;
        g1Var.setBlock(pageblockchannel);
        g1Var.setVisibility(0);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
