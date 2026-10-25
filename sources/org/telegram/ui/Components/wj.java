package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wj extends FrameLayout {
    public final y9 f34456a;
    public final di.l4 f34457b;
    public final org.telegram.ui.ActionBar.b6 f34458c;
    public final zp d;
    public final j9 e;
    public TLRPC.User f34459f;
    public int h;
    public CharSequence f34460n;
    public CharSequence f34461r;
    public TLRPC.User f34462s;
    public String v;
    public String f34463w;
    public final int f34464x;
    public boolean f34465y;

    public wj(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        float f14;
        float f15;
        float f16;
        this.f34464x = UserConfig.selectedAccount;
        this.e = new j9(u6Var);
        y9 y9Var = new y9(context);
        this.f34456a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 14.0f;
        }
        if (z10) {
            f10 = 14.0f;
        } else {
            f10 = 0.0f;
        }
        addView(y9Var, gb1.h(46, 46.0f, i15, f7, 9.0f, f10, 0.0f));
        di.l4 l4Var = new di.l4(context, 4);
        this.f34457b = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        org.telegram.ui.ActionBar.f7.Y(l4Var, org.telegram.ui.ActionBar.y6.f23462j5, u6Var);
        l4Var.setTypeface(AndroidUtilities.bold());
        l4Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l4Var.setGravity(i11 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z11) {
            f11 = 28.0f;
        } else {
            f11 = 72.0f;
        }
        if (z11) {
            f12 = 72.0f;
        } else {
            f12 = 28.0f;
        }
        addView(l4Var, gb1.h(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f34458c = b6Var;
        b6Var.setTextSize(13);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.q5, u6Var);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        b6Var.setGravity(i13 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i17 = i14 | 48;
        if (z12) {
            f13 = 28.0f;
        } else {
            f13 = 72.0f;
        }
        if (z12) {
            f14 = 72.0f;
        } else {
            f14 = 28.0f;
        }
        addView(b6Var, gb1.h(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        zp zpVar = new zp(context, 21, u6Var);
        this.d = zpVar;
        zpVar.b(-1, org.telegram.ui.ActionBar.y6.f23354d6, org.telegram.ui.ActionBar.y6.f23483k7);
        zpVar.setDrawUnchecked(false);
        zpVar.setDrawBackgroundAsArc(3);
        boolean z13 = LocaleController.isRTL;
        int i18 = (z13 ? 5 : 3) | 48;
        if (z13) {
            f15 = 0.0f;
        } else {
            f15 = 44.0f;
        }
        if (z13) {
            f16 = 44.0f;
        } else {
            f16 = 0.0f;
        }
        addView(zpVar, gb1.h(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, vj vjVar, boolean z10) {
        y9 y9Var = this.f34456a;
        di.l4 l4Var = this.f34457b;
        if (user == null && charSequence == null) {
            this.f34461r = null;
            this.f34460n = null;
            l4Var.l("", false);
            this.f34458c.l("", false);
            y9Var.setImageDrawable(null);
        } else {
            this.f34461r = null;
            this.f34460n = charSequence;
            this.f34459f = user;
            this.f34465y = z10;
            setWillNotDraw(!z10);
            j9 j9Var = this.e;
            TLRPC.User user2 = this.f34459f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                j9Var.m(this.f34464x, user2);
                TLRPC.UserStatus userStatus = this.f34459f.status;
            } else {
                CharSequence charSequence2 = this.f34460n;
                if (charSequence2 != null) {
                    j9Var.n(this.h, charSequence2.toString(), null);
                } else {
                    j9Var.n(this.h, "#", null);
                }
            }
            CharSequence charSequence3 = this.f34460n;
            if (charSequence3 != null) {
                this.f34463w = null;
                l4Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f34459f;
                if (user3 != null) {
                    this.f34463w = UserObject.getUserName(user3);
                } else {
                    this.f34463w = "";
                }
                l4Var.l(this.f34463w, false);
            }
            setStatus(this.f34461r);
            TLRPC.User user4 = this.f34459f;
            if (user4 != null) {
                y9Var.f(user4, j9Var);
            } else {
                y9Var.setImageDrawable(j9Var);
            }
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.ip(20, this, vjVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f34465y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f34465y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f34461r = charSequence;
        if (charSequence != null) {
            this.f34458c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f34459f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f34458c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f34462s != this.f34459f && (str = this.v) != null) {
                this.f34458c.l(str, false);
            } else {
                this.f34458c.l("", false);
                Utilities.globalQueue.postRunnable(new uj(this, 0));
            }
        }
    }
}
