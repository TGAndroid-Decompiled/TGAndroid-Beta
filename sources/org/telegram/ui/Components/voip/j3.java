package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.oi0;

public final class j3 extends FrameLayout {

    public final n1 f33638a;

    public i3 f33639b;

    public int f33640c;
    public final TextView d;

    public final TextView f33641e;

    public int f33642f;

    public j3(Activity activity, n1 n1Var) {
        super(activity);
        this.f33638a = n1Var;
        setWillNotDraw(true);
        i3 i3Var = new i3(activity, n1Var);
        this.f33639b = i3Var;
        addView(i3Var, z5.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, z5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f33641e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, z5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f33639b.f33616a = new oi0(R.raw.bt_to_speaker, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        this.f33639b.f33617b = new oi0(R.raw.bt_to_speaker, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        this.f33639b.f33617b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        i3 i3Var = new i3(getContext(), this.f33638a);
        if (i10 == R.raw.camera_flip2) {
            oi0 oi0Var = new oi0(i10, i0.a.k(i10, ""), i11, i11, true, null);
            i3Var.f33618c = oi0Var;
            oi0Var.f31328r0 = i3Var;
        } else {
            i3Var.f33616a = new oi0(i10, i0.a.k(i10, ""), i11, i11, true, null);
            oi0 oi0Var2 = new oi0(i10, i0.a.k(i10, ""), i11, i11, true, null);
            i3Var.f33617b = oi0Var2;
            oi0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        i3Var.a(i12, z10, false);
        i3Var.setAlpha(0.0f);
        i3Var.setOnBtnClickedListener(this.f33639b.f33625x);
        addView(i3Var, z5.a(53.5f, 53.5f, 1));
        i3 i3Var2 = this.f33639b;
        this.f33639b = i3Var;
        i3Var.animate().alpha(1.0f).setDuration(250L).start();
        i3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new fk0(5, this, i3Var2)).start();
    }

    public final void c(int i10) {
        this.f33639b.f33616a = new oi0(R.raw.speaker_to_bt, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        this.f33639b.f33617b = new oi0(R.raw.speaker_to_bt, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        this.f33639b.f33617b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        int iB;
        CharSequence string;
        TextView textView;
        int visibility;
        TextView textView2;
        boolean z12;
        boolean z13;
        if (this.f33640c == i10 && z10 == this.f33639b.v) {
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int iDp = AndroidUtilities.dp(53.5f);
        int iB2 = m1.j.b(i10);
        String str = "";
        boolean z14 = true;
        if (iB2 != 0) {
            if (iB2 != 1) {
                if (iB2 != 2) {
                    if (iB2 == 3) {
                        int i12 = this.f33640c;
                        if (i12 == 5) {
                            i3 i3Var = this.f33639b;
                            z13 = z10 == i3Var.v;
                            oi0 oi0Var = z10 ? i3Var.f33617b : i3Var.f33616a;
                            oi0Var.f31328r0 = i3Var;
                            oi0Var.f31326q0 = new e3(this, iDp, 1);
                            oi0Var.start();
                            z14 = z13;
                            i11 = 1;
                        } else if (i12 == 2) {
                            b(R.raw.bt_to_speaker, iDp, i10, z10);
                            i11 = 1;
                        } else if (i12 != 4) {
                            a(iDp);
                        }
                    } else if (iB2 == 4) {
                        int i13 = this.f33640c;
                        if (i13 == 4) {
                            i3 i3Var2 = this.f33639b;
                            z13 = z10 == i3Var2.v;
                            oi0 oi0Var2 = z10 ? i3Var2.f33617b : i3Var2.f33616a;
                            oi0Var2.f31328r0 = i3Var2;
                            oi0Var2.f31326q0 = new e3(this, iDp, 0);
                            oi0Var2.start();
                            z14 = z13;
                            i11 = 1;
                        } else if (i13 == 2) {
                            b(R.raw.speaker_to_bt, iDp, i10, z10);
                            i11 = 1;
                        } else if (i13 != 5) {
                            c(iDp);
                        }
                    }
                } else if (this.f33640c != 3) {
                    str = "";
                    i11 = 1;
                    this.f33639b.f33616a = new oi0(R.raw.video_stop, "" + R.raw.video_stop, iDp, iDp, true, null);
                    this.f33639b.f33617b = new oi0(R.raw.video_stop, str + R.raw.video_stop, iDp, iDp, true, null);
                    this.f33639b.f33617b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                    i3 i3Var3 = this.f33639b;
                    i3Var3.f33617b.f31328r0 = i3Var3;
                }
                str = "";
                i11 = 1;
            } else {
                str = "";
                i11 = 1;
                int i14 = this.f33640c;
                if (i14 == 5 || i14 == 4) {
                    b(R.raw.camera_flip2, iDp, i10, z10);
                    z14 = true;
                } else if (i14 != 2) {
                    this.f33639b.f33618c = new oi0(R.raw.camera_flip2, str + R.raw.camera_flip2, iDp, iDp, true, null);
                    i3 i3Var4 = this.f33639b;
                    i3Var4.f33618c.f31328r0 = i3Var4;
                }
            }
            if (!z14) {
                i3 i3Var5 = this.f33639b;
                if (this.f33640c != 0 || z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                i3Var5.a(i10, z10, z12);
            }
            iB = m1.j.b(i10);
            if (iB != 0) {
                if (iB != i11) {
                    string = LocaleController.getString(R.string.VoipFlip);
                } else if (iB != 2) {
                    if (iB != 3) {
                        string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                    } else if (iB != 4) {
                        string = str;
                    } else {
                        string = LocaleController.getString(R.string.VoipSpeaker);
                    }
                } else if (z10) {
                    string = LocaleController.getString(R.string.VoipStartVideo);
                } else {
                    string = LocaleController.getString(R.string.VoipStopVideo);
                }
            } else if (z10) {
                string = LocaleController.getString(R.string.VoipUnmute);
            } else {
                string = LocaleController.getString(R.string.VoipMute);
            }
            setContentDescription(string);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.f33641e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(string);
                textView2.setText(string);
            } else if (textView2.getText().equals(string) || !textView.getText().equals(string)) {
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new fk0(4, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new f11(this, 20)).start();
            }
            this.f33640c = i10;
        }
        str = "";
        i11 = 1;
        if (this.f33640c != 1) {
            this.f33639b.f33616a = new oi0(R.raw.call_mute, str + R.raw.call_mute, iDp, iDp, true, null);
            this.f33639b.f33617b = new oi0(R.raw.call_mute, str + R.raw.call_mute, iDp, iDp, true, null);
            this.f33639b.f33617b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            i3 i3Var6 = this.f33639b;
            i3Var6.f33617b.f31328r0 = i3Var6;
        }
        z14 = false;
        if (!z14) {
            i3 i3Var7 = this.f33639b;
            if (this.f33640c != 0) {
                z12 = false;
            } else {
                z12 = false;
            }
            i3Var7.a(i10, z10, z12);
        }
        iB = m1.j.b(i10);
        if (iB != 0) {
            if (iB != i11) {
                string = LocaleController.getString(R.string.VoipFlip);
            } else if (iB != 2) {
                if (iB != 3) {
                    string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                } else if (iB != 4) {
                    string = str;
                } else {
                    string = LocaleController.getString(R.string.VoipSpeaker);
                }
            } else if (z10) {
                string = LocaleController.getString(R.string.VoipStartVideo);
            } else {
                string = LocaleController.getString(R.string.VoipStopVideo);
            }
        } else if (z10) {
            string = LocaleController.getString(R.string.VoipUnmute);
        } else {
            string = LocaleController.getString(R.string.VoipMute);
        }
        setContentDescription(string);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.f33641e;
        if (visibility != 8) {
            if (textView2.getText().equals(string)) {
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new fk0(4, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new f11(this, 20)).start();
            } else {
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new fk0(4, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new f11(this, 20)).start();
            }
        } else if (textView2.getText().equals(string)) {
            textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new fk0(4, this, string)).start();
            textView2.setText(string);
            textView2.setVisibility(0);
            textView2.setAlpha(0.0f);
            textView2.setTranslationY(AndroidUtilities.dp(5.0f));
            textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new f11(this, 20)).start();
        } else {
            textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new fk0(4, this, string)).start();
            textView2.setText(string);
            textView2.setVisibility(0);
            textView2.setAlpha(0.0f);
            textView2.setTranslationY(AndroidUtilities.dp(5.0f));
            textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new f11(this, 20)).start();
        }
        this.f33640c = i10;
    }

    public void setOnBtnClickedListener(h3 h3Var) {
        this.f33639b.setOnBtnClickedListener(h3Var);
    }
}
