package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wr;
public final class n8 extends FrameLayout {
    public final TextView E;
    public final qg.s0 F;
    public final ImageView G;
    public AnimatorSet H;
    public final int f19572a;
    public final di.h f19573b;
    public final TextView f19574c;
    public final org.telegram.ui.Components.w9 d;
    public final tp e;
    public boolean f19575f;
    public final ImageView h;
    public final ImageView f19576n;
    public TLRPC.TL_messages_stickerSet f19577r;
    public boolean f19578s;
    public final Rect v;
    public boolean f19579w;
    public final FrameLayout f19580x;
    public final TextView f19581y;

    public n8(Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        float f12;
        int i17;
        int i18;
        int i19;
        this.v = new Rect();
        this.f19572a = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setLayerNum(1);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i20 = i11 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 13.0f;
        }
        if (z10) {
            f10 = 13.0f;
        } else {
            f10 = 0.0f;
        }
        addView(w9Var, w7.a6.d(40, 40.0f, i20, f7, 9.0f, f10, 0.0f));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vh, false), 1, -1));
            }
            if (i10 == 1) {
                int i21 = org.telegram.ui.ActionBar.j6.Uh;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i21, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                if (LocaleController.isRTL) {
                    i19 = 3;
                } else {
                    i19 = 5;
                }
                addView(imageView, w7.a6.e(40, 40, i19 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f19576n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i21, false), mode));
                addView(imageView2, w7.a6.h(58.0f, 58.0f, 8388613));
                tp tpVar = new tp(context, 21, null);
                this.e = tpVar;
                tpVar.b(-1, org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.f18056k7);
                tpVar.setDrawUnchecked(false);
                tpVar.setDrawBackgroundAsArc(3);
                addView(tpVar, w7.a6.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                int i22 = i17 | 48;
                if (z11) {
                    i18 = 10;
                } else {
                    i18 = 0;
                }
                addView(imageView, w7.a6.d(40, 40.0f, i22, i18, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f19580x = frameLayout;
        TextView textView = new TextView(context);
        this.f19581y = textView;
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        int i23 = org.telegram.ui.ActionBar.j6.Oh;
        textView.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{14.0f}, org.telegram.ui.ActionBar.j6.w0(null, i23, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false)));
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new h8(this, 0));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView, w7.a6.h(-2.0f, 28.0f, i12 | 16));
        w7.c6.a(textView);
        TextView textView2 = new TextView(context);
        this.E = textView2;
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Rh, false));
        textView2.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.j6.w0(null, i23, false) & 452984831));
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new h8(this, 0));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(textView2, w7.a6.i(-2.0f, 32.0f, i13 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        w7.c6.a(textView2);
        qg.s0 s0Var = new qg.s0(AndroidUtilities.dp(4.0f), context, null, false);
        this.F = s0Var;
        s0Var.setIcon(R.raw.unlock_icon);
        s0Var.a(LocaleController.getString(R.string.Unlock), new h8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) s0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            s0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f19580x;
        qg.s0 s0Var2 = this.F;
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        frameLayout2.addView(s0Var2, w7.a6.h(-2.0f, 28.0f, i14 | 16));
        w7.c6.a(this.F);
        this.f19580x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        View view = this.f19580x;
        if (LocaleController.isRTL) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        addView(view, w7.a6.d(-2, -1.0f, i15, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f19580x.setOnClickListener(new h8(this, 1));
        di.h hVar = new di.h(context, 7);
        this.f19573b = hVar;
        NotificationCenter.listenEmojiLoading(hVar);
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        hVar.setTextSize(1, 16.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        hVar.setLines(1);
        hVar.setMaxLines(1);
        hVar.setSingleLine(true);
        hVar.setEllipsize(TextUtils.TruncateAt.END);
        hVar.setGravity(w7.a6.y());
        addView(hVar, w7.a6.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f19574c = textView3;
        em.r(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false), 1, 13.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(w7.a6.y());
        addView(textView3, w7.a6.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.G = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false), PorterDuff.Mode.SRC_IN);
            imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 1, -1));
            imageView3.setVisibility(8);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            int i24 = i16 | 16;
            if (z12) {
                f11 = 4.0f;
            } else {
                f11 = 0.0f;
            }
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 4.0f;
            }
            addView(imageView3, w7.a6.d(-2, -2.0f, i24, f11, 0.0f, f12, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i10 = this.f19572a;
        if (i10 == 1) {
            return this.e.f27462a.f21057q;
        }
        if (i10 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f19579w || this.f19580x.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        int i10 = this.f19572a;
        if (i10 == 1) {
            this.e.a(z10, z11);
            return;
        }
        int i11 = 4;
        float f11 = 0.0f;
        float f12 = 0.1f;
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new k8(this, z10, 0));
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f11);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f12 = 1.0f;
                }
                scaleX.scaleY(f12).setDuration(150L).start();
                return;
            }
            if (z10) {
                i11 = 0;
            }
            imageView.setVisibility(i11);
            if (!z10) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.f19579w) {
            FrameLayout frameLayout = this.f19580x;
            if (z11) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new k8(this, z10, 1));
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                scaleX2.scaleY(f12).setDuration(150L).start();
                return;
            }
            if (z10) {
                i11 = 0;
            }
            frameLayout.setVisibility(i11);
            if (!z10) {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
                return;
            }
            frameLayout.setAlpha(1.0f);
            frameLayout.setScaleX(1.0f);
            frameLayout.setScaleY(1.0f);
        }
    }

    public final void c(final boolean z10) {
        float f7;
        float f10;
        if (this.f19572a == 1) {
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!z10) {
                f11 = 1.0f;
            }
            float[] fArr = {f7, f11};
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.66f;
            }
            if (z10) {
                f12 = 0.66f;
            }
            float[] fArr2 = {f10, f12};
            ImageView imageView = this.f19576n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            wr wrVar = pt.f26246a;
            duration.setInterpolator(wrVar).withEndAction(new Runnable(this) {
                public final n8 f19317b;

                {
                    this.f19317b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            n8 n8Var = this.f19317b;
                            if (!z11) {
                                n8Var.f19576n.setVisibility(8);
                                return;
                            } else {
                                n8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            n8 n8Var2 = this.f19317b;
                            if (z12) {
                                n8Var2.f19580x.setVisibility(8);
                                return;
                            } else {
                                n8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            n8 n8Var3 = this.f19317b;
                            if (z13) {
                                n8Var3.h.setVisibility(8);
                                return;
                            } else {
                                n8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f19579w) {
                FrameLayout frameLayout = this.f19580x;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(wrVar).withEndAction(new Runnable(this) {
                    public final n8 f19317b;

                    {
                        this.f19317b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z11 = z10;
                                n8 n8Var = this.f19317b;
                                if (!z11) {
                                    n8Var.f19576n.setVisibility(8);
                                    return;
                                } else {
                                    n8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z12 = z10;
                                n8 n8Var2 = this.f19317b;
                                if (z12) {
                                    n8Var2.f19580x.setVisibility(8);
                                    return;
                                } else {
                                    n8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z13 = z10;
                                n8 n8Var3 = this.f19317b;
                                if (z13) {
                                    n8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    n8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(wrVar).withEndAction(new Runnable(this) {
                public final n8 f19317b;

                {
                    this.f19317b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            n8 n8Var = this.f19317b;
                            if (!z11) {
                                n8Var.f19576n.setVisibility(8);
                                return;
                            } else {
                                n8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            n8 n8Var2 = this.f19317b;
                            if (z12) {
                                n8Var2.f19580x.setVisibility(8);
                                return;
                            } else {
                                n8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            n8 n8Var3 = this.f19317b;
                            if (z13) {
                                n8Var3.h.setVisibility(8);
                                return;
                            } else {
                                n8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        ImageLocation forSticker;
        int i11;
        String str2;
        this.f19575f = z10;
        this.f19577r = tL_messages_stickerSet;
        this.f19578s = z11;
        org.telegram.ui.Components.w9 w9Var = this.d;
        w9Var.setVisibility(0);
        di.h hVar = this.f19573b;
        hVar.setTranslationY(0.0f);
        hVar.setText(this.f19577r.set.title);
        boolean z12 = this.f19577r.set.archived;
        TextView textView = this.f19574c;
        if (z12) {
            hVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            w9Var.setAlpha(0.5f);
        } else {
            hVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            w9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f19579w = z13;
        int i12 = 8;
        if (z13) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f19580x.setVisibility(i10);
        if (!this.f19579w) {
            i12 = 0;
        }
        this.h.setVisibility(i12);
        TLRPC.Document document = null;
        w9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f19579w) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, arrayList.size(), new Object[0]));
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    TLRPC.Document document2 = arrayList.get(i13);
                    if (document2 != null && document2.f17201id == tL_messages_stickerSet.set.thumb_document_id) {
                        document = document2;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            LiteMode.isEnabled(1);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.j6.f17872a7, 1.0f);
            boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z14) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            }
            if (this.f19579w) {
                i11 = 16388;
            } else {
                i11 = 1;
            }
            if (!LiteMode.isEnabled(i11)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z14 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forSticker != null && forSticker.imageType == 1) {
                    w9Var.i(forSticker, concat, "tgs", svgThumb, tL_messages_stickerSet2);
                } else {
                    w9Var.i(forSticker, concat, "webp", svgThumb, tL_messages_stickerSet2);
                }
            } else {
                if (svgThumb != null) {
                    w9Var.n(ImageLocation.getForDocument(document), concat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    w9Var.j(ImageLocation.getForDocument(document), concat, forSticker, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    w9Var.setColorFilter(org.telegram.ui.ActionBar.j6.f18251v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, 0, new Object[0]));
            w9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.p5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.m5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        AndroidUtilities.runOnUIThread(new pa(7, n8.this, document3));
                    }
                });
            }
        }
        if (this.f19578s) {
            StringBuilder sb2 = new StringBuilder();
            if (tL_messages_stickerSet2.set.emojis) {
                str = "t.me/addemoji/";
            } else {
                str = "t.me/addstickers/";
            }
            sb2.append(str);
            sb2.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public final void e(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H = null;
        }
        int i13 = 0;
        qg.s0 s0Var = this.F;
        if (i10 == 1) {
            s0Var.a(LocaleController.getString(R.string.Unlock), new h8(this, 0), false);
        } else if (i10 == 2) {
            s0Var.a(LocaleController.getString(R.string.Restore), new h8(this, 0), false);
        }
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        s0Var.setEnabled(z10);
        if (i10 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView = this.f19581y;
        textView.setEnabled(z11);
        if (i10 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        TextView textView2 = this.E;
        textView2.setEnabled(z12);
        float f16 = 0.0f;
        float f17 = 1.0f;
        if (i10 != 1 && i10 != 2) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        s0Var.setAlpha(f7);
        if (i10 != 1 && i10 != 2) {
            f10 = 0.6f;
        } else {
            f10 = 1.0f;
        }
        s0Var.setScaleX(f10);
        if (i10 != 1 && i10 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        s0Var.setScaleY(f11);
        if (i10 != 1 && i10 != 2) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        s0Var.setVisibility(i11);
        if (i10 == 3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        textView.setAlpha(f12);
        if (i10 == 3) {
            f13 = 1.0f;
        } else {
            f13 = 0.6f;
        }
        textView.setScaleX(f13);
        if (i10 == 3) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        textView.setScaleY(f14);
        if (i10 == 3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 4) {
            f16 = 1.0f;
        }
        textView2.setAlpha(f16);
        if (i10 == 4) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        textView2.setScaleX(f15);
        if (i10 != 4) {
            f17 = 0.6f;
        }
        textView2.setScaleY(f17);
        if (i10 != 4) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824);
        FrameLayout frameLayout = this.f19580x;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z13 = LocaleController.isRTL;
        TextView textView3 = this.f19574c;
        di.h hVar = this.f19573b;
        if (z13) {
            ((ViewGroup.MarginLayoutParams) hVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) hVar.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f19577r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f19575f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        tp tpVar = this.e;
        if (tpVar != null && tpVar.f27462a.f21057q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.f19575f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.v;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f19579w && (frameLayout = this.f19580x) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z10) {
        b(z10, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        int i10;
        ImageView imageView = this.G;
        if (imageView != null) {
            if (onClickListener == null) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f19575f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f19576n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }
}
