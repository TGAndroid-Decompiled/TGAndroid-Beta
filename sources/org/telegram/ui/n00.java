package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class n00 extends pg.b {
    public final Context d;
    public final q00 e;

    public n00(q00 q00Var, Context context) {
        this.e = q00Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.P.size();
    }

    @Override
    public final int j(int i10) {
        h00 h00Var = (h00) this.e.P.get(i10);
        if (h00Var == null) {
            return 3;
        }
        return h00Var.f44712a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        q00 q00Var = this.e;
        ArrayList arrayList = q00Var.P;
        h00 h00Var = (h00) arrayList.get(i10);
        if (h00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((h00) arrayList.get(i14)).f44712a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = b1Var.f46345f;
            View view = b1Var.f46342a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(h00Var.d);
                                return;
                            case 7:
                                ((j00) view).e(h00Var.f37707m, z10);
                                return;
                            case 8:
                                yz yzVar = (yz) view;
                                if (yzVar.f43979c != z10) {
                                    yzVar.f43979c = z10;
                                    yzVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                e00 e00Var = (e00) view;
                                q00Var.I = e00Var;
                                e00Var.e(org.telegram.ui.Components.y5.cloneSpans(q00Var.f40678w, -1, e00Var.f36759s.getPaint().getFontMetricsInt(), 0.5f), false);
                                e00 e00Var2 = q00Var.I;
                                if (q00Var.getUserConfig().isPremium()) {
                                    i16 = q00Var.E;
                                }
                                e00Var2.d(i16, false);
                                q00Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                hp0 hp0Var = (hp0) view;
                                hp0Var.setCloseAsLock(!q00Var.getUserConfig().isPremium());
                                if (q00Var.getUserConfig().isPremium()) {
                                    i16 = q00Var.E;
                                }
                                hp0Var.a(i16, false);
                                hp0Var.setOnColorClick(new org.telegram.ui.Components.oy(9, this, hp0Var));
                                return;
                            case 11:
                                f00 f00Var = (f00) view;
                                q00Var.J = f00Var;
                                f00Var.setText(h00Var.d);
                                org.telegram.ui.Cells.t3 t3Var = f00Var.f37157r;
                                t3Var.setText(h00Var.e);
                                t3Var.setOnClickListener(h00Var.f37700c);
                                return;
                            default:
                                return;
                        }
                    }
                    wz wzVar = (wz) view;
                    boolean z12 = h00Var.f37706l;
                    ImageView imageView = wzVar.f43432a;
                    TextView textView = wzVar.f43433b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.k6.f21422q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.f21387o6;
                    }
                    org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.k6.f21405p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.k6.q6;
                    }
                    org.telegram.ui.ActionBar.r6.W(textView, i12, null);
                    int i17 = h00Var.f37705k;
                    CharSequence charSequence = h00Var.d;
                    ImageView imageView2 = wzVar.f43432a;
                    if (!LocaleController.isRTL) {
                        i16 = 1;
                    }
                    if (i17 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i17);
                    }
                    float f7 = 72.0f;
                    if (LocaleController.isRTL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = AndroidUtilities.dp(f7);
                    }
                    textView.setText(charSequence);
                    if (!z10 && i17 != 0) {
                        z11 = true;
                    }
                    Boolean bool = wzVar.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        wzVar.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (wzVar.f43434c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.zr.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    wzVar.d = z10;
                    wzVar.setWillNotDraw(!z10);
                    wzVar.f43434c = i17;
                    return;
                }
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
                String str = h00Var.f37703i;
                if (str != null) {
                    waVar.d(str, h00Var.d, null, z10);
                    return;
                }
                long j10 = h00Var.h;
                if (j10 > 0) {
                    TLRPC.User user = q00Var.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        waVar.d(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = q00Var.getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        string = LocaleController.getString(R.string.Community);
                    } else if (chat.participants_count != 0) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                        } else {
                            string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                        }
                    } else if (!ChatObject.isPublic(chat)) {
                        if (ChatObject.isChannel(chat) && !chat.megagroup) {
                            string = LocaleController.getString(R.string.ChannelPrivate);
                        } else {
                            string = LocaleController.getString(R.string.MegaPrivate);
                        }
                    } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        string = LocaleController.getString(R.string.ChannelPublic);
                    } else {
                        string = LocaleController.getString(R.string.MegaPublic);
                    }
                    waVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (h00Var.f37701f) {
                l4Var.setText(q00.y0(0, h00Var.d, false));
            } else {
                l4Var.setText(h00Var.d);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.wa waVar;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        Context context = this.d;
        q00 q00Var = this.e;
        switch (i10) {
            case 0:
                waVar = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.wa waVar2 = new org.telegram.ui.Cells.wa(context, 6, 0, false);
                waVar2.setSelfAsSavedMessages(true);
                waVar = waVar2;
                break;
            case 2:
                org.telegram.ui.Components.nw0 nw0Var = (org.telegram.ui.Components.nw0) q00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                g6Var = ((org.telegram.ui.ActionBar.o2) q00Var).resourceProvider;
                ?? e3Var = new org.telegram.ui.Cells.e3(this.d, nw0Var, string, false, 12, g6Var);
                q00Var.K = e3Var;
                e3Var.f22320r = false;
                org.telegram.ui.Cells.c3 c3Var = e3Var.f22316b;
                c3Var.getEditText().setEmojiColor(Integer.valueOf(q00Var.getThemedColor(org.telegram.ui.ActionBar.k6.Oh)));
                c3Var.setEmojiViewCacheType(25);
                c3Var.setText(q00Var.f40678w);
                i11 = ((org.telegram.ui.ActionBar.o2) q00Var).currentAccount;
                org.telegram.ui.Components.p5.s(i11, q00Var.f40679x);
                org.telegram.ui.Components.gu editText = c3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.g3());
                editText.addTextChangedListener(new l00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                c3Var.getEditText().setImeOptions(268435462);
                waVar = e3Var;
                break;
            case 3:
                waVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f43432a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.z5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f43433b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                int i17 = 24;
                if (z10) {
                    i13 = 24;
                } else {
                    i13 = 0;
                }
                if (z10) {
                    i17 = 0;
                }
                textView.setPadding(i13, 0, i17, 0);
                if (LocaleController.isRTL) {
                    i16 = 5;
                }
                textView.setGravity(i16);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    f7 = 0.0f;
                } else {
                    f7 = 72.0f;
                }
                if (z11) {
                    f10 = 72.0f;
                } else {
                    f10 = 0.0f;
                }
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                waVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f37415a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                waVar = frameLayout2;
                break;
            case 6:
            default:
                waVar = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.o2) q00Var).currentAccount;
                waVar = new m00(this, this.d, q00Var, i14, q00Var.f40676r.f17862id);
                break;
            case 8:
                waVar = new yz(context);
                break;
            case 9:
                waVar = new e00(q00Var, context);
                break;
            case 10:
                Activity parentActivity = q00Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.o2) q00Var).currentAccount;
                g6Var2 = ((org.telegram.ui.ActionBar.o2) q00Var).resourceProvider;
                waVar = new hp0(2, i15, parentActivity, g6Var2);
                break;
            case 11:
                g6Var3 = ((org.telegram.ui.ActionBar.o2) q00Var).resourceProvider;
                waVar = new f00(context, g6Var3);
                break;
        }
        return new s4.b1(waVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 2 && i10 == 9) {
            q00 q00Var = this.e;
            ((e00) b1Var.f46342a).e(org.telegram.ui.Components.y5.cloneSpans(q00Var.f40678w, -1, q00Var.I.f36759s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        if (b1Var.f46345f == 2) {
            org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) b1Var.f46342a;
            e3Var.f22316b.k(true);
            e3Var.f22316b.d();
        }
    }
}
