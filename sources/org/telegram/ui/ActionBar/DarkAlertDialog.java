package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog;
public class DarkAlertDialog extends AlertDialog {
    public DarkAlertDialog(Context context, int i) {
        super(context, i);
    }

    @Override
    public int getThemedColor(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1849805674:
                if (str.equals("dialogBackground")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -451706526:
                if (str.equals("dialogScrollGlow")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -93324646:
                if (str.equals("dialogButton")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1828201066:
                if (str.equals("dialogTextBlack")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return -14277082;
            case 1:
            case 2:
            case 3:
                return -1;
            default:
                return super.getThemedColor(str);
        }
    }

    public static class Builder extends AlertDialog.Builder {
        public Builder(Context context) {
            super(new DarkAlertDialog(context, 0));
        }
    }
}
