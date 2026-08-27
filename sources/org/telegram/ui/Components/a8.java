package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class a8 extends yk0 {

    public final Context f26654c;
    public ArrayList d = new ArrayList();

    public String f26655e;

    public y7 f26656f;
    public boolean h;

    public final b8 f26657n;

    public a8(b8 b8Var, Context context) {
        this.f26657n = b8Var;
        this.f26654c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return (this.f26657n.f27032r0 && o1Var.b() == 0) ? false : true;
    }

    public final void E(String str) {
        if (this.f26656f != null) {
            Utilities.searchQueue.cancelRunnable(this.f26656f);
            this.f26656f = null;
        }
        if (str == null) {
            this.f26655e = null;
            this.d.clear();
            l();
        } else {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            y7 y7Var = new y7(this, str, 0);
            this.f26656f = y7Var;
            dispatchQueue.postRunnable(y7Var, 300L);
        }
    }

    @Override
    public final int h() {
        int size;
        b8 b8Var = this.f26657n;
        boolean z10 = b8Var.f27032r0;
        if (b8Var.f27018f) {
            size = this.d.size();
        } else {
            if (b8Var.f27035t0.size() <= 1) {
                return 0;
            }
            size = b8Var.f27035t0.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        return (this.f26657n.f27032r0 && i10 == 0) ? 1 : 0;
    }

    @Override
    public final void l() {
        super.l();
        b8 b8Var = this.f26657n;
        View view = b8Var.f27016e;
        i7 i7Var = b8Var.A;
        n7 n7Var = b8Var.f27026n;
        if ((b8Var.f27035t0.size() > 1) != this.h) {
            boolean z10 = b8Var.f27035t0.size() > 1;
            this.h = z10;
            if (z10) {
                n7Var.setVisibility(0);
                n7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i10 = 0;
                n7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                    public final a8 f34527b;

                    {
                        this.f34527b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                ((org.telegram.ui.ActionBar.e3) this.f34527b.f26657n).containerView.invalidate();
                                break;
                            default:
                                ((org.telegram.ui.ActionBar.e3) this.f34527b.f26657n).containerView.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(er.h).start();
            } else {
                final int i11 = 1;
                n7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                    public final a8 f34527b;

                    {
                        this.f34527b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                ((org.telegram.ui.ActionBar.e3) this.f34527b.f26657n).containerView.invalidate();
                                break;
                            default:
                                ((org.telegram.ui.ActionBar.e3) this.f34527b.f26657n).containerView.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(er.h).withEndAction(new bg(this, 9)).start();
            }
        }
        if (b8Var.f27035t0.size() > 1) {
            i7Var.setBackgroundColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            i7Var.setBackgroundColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, 0);
        }
        b8Var.v.setVisibility((b8Var.h && b8Var.f27033s.h() == 0) ? 0 : 8);
        b8Var.E0();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        MessageObject messageObject;
        boolean z10;
        b8 b8Var = this.f26657n;
        if (b8Var.f27032r0) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) o1Var.f5789a;
        if (b8Var.f27018f) {
            messageObject = (MessageObject) this.d.get(i10);
            if (i10 + 1 < this.d.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (b8Var.f27034s0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = b8Var.f27035t0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i10) - 1);
            if ((b8Var.f27035t0.size() - i10) - 2 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            messageObject = (MessageObject) b8Var.f27035t0.get(i10);
            if (i10 + 1 < b8Var.f27035t0.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (messageObject != null) {
            messageObject.setQuery(this.f26655e);
        }
        lh.p1 p1Var = b8Var.s0() ? new lh.p1(2, this, xVar) : null;
        xVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, ((org.telegram.ui.ActionBar.e3) b8Var).resourcesProvider));
        boolean zS0 = b8Var.s0();
        gg.f fVar = (b8Var.s0() || b8Var.f27037v0 || messageObject.getId() <= 0) ? null : new gg.f(this, xVar, messageObject, 20);
        RadialProgress2 radialProgress2 = xVar.D;
        ImageView imageView = xVar.v;
        xVar.f25916w = messageObject;
        if (xVar.f25917x != z10) {
            xVar.invalidate();
        }
        xVar.f25917x = z10;
        imageView.setImageResource(zS0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((zS0 || fVar != null) ? 0 : 8);
        imageView.setOnClickListener(fVar);
        imageView.setOnTouchListener(p1Var);
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90) : null;
        if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = messageObject.getArtworkUrl(true);
            if (TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(artworkUrl);
            }
        }
        xVar.requestLayout();
        xVar.b(false, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f26654c;
        if (i10 == 1) {
            zm zmVar = new zm(context, 9);
            zmVar.setTag(-33024);
            return new lk0(zmVar);
        }
        boolean zCurrentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        return new lk0(new org.telegram.ui.Cells.x(context, zCurrentPlaylistIsGlobalSearch ? 1 : 0, ((org.telegram.ui.ActionBar.e3) this.f26657n).resourcesProvider));
    }
}
