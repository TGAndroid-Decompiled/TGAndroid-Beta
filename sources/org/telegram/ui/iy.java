package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class iy extends org.telegram.ui.Components.hm0 {
    public final Context f38124c;
    public final ly d;

    public iy(ly lyVar, Context context) {
        this.d = lyVar;
        this.f38124c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45915f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        ly lyVar = this.d;
        if (i10 == lyVar.h) {
            return 1;
        }
        if (i10 == lyVar.f39042s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f45915f;
        View view = b1Var.f45912a;
        boolean z10 = true;
        ly lyVar = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    Long l4 = (Long) lyVar.e.get(i10 - lyVar.f39040n);
                    long longValue = l4.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = lyVar.getMessagesController().getUser(l4);
                        if (i10 == lyVar.f39041r - 1) {
                            z10 = false;
                        }
                        f4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = lyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == lyVar.f39041r - 1) {
                        z10 = false;
                    }
                    f4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            Context context = this.f38124c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21115k7, false), mode));
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (lyVar.f39040n == -1) {
                z10 = false;
            }
            q8Var.n(string, zqVar, z10);
            q8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        if (i10 == lyVar.f39042s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = lyVar.f39043w;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            d9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ky kyVar;
        int i11;
        Context context = this.f38124c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout f4Var = new org.telegram.ui.Cells.f4(context, 0, 0, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    f4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    f4Var.addView(imageView, w7.z5.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new ei.p1(5, this, f4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20951b9, false), PorterDuff.Mode.MULTIPLY));
                    kyVar = f4Var;
                } else {
                    ly lyVar = this.d;
                    ky kyVar2 = new ky(lyVar, context);
                    lyVar.f39039f = kyVar2;
                    kyVar = kyVar2;
                }
            } else {
                FrameLayout q8Var = new org.telegram.ui.Cells.q8(context);
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
                kyVar = q8Var;
            }
        } else {
            FrameLayout d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20949b7));
            kyVar = d9Var;
        }
        return new s4.b1(kyVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f45915f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        b1Var.f45912a.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
    }
}
